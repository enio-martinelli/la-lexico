package br.ufscar.dc.compiladores.la.semantico2;

import java.util.ArrayList;
import java.util.List;

import br.ufscar.dc.compiladores.la.semantico2.Semantico2Parser.CmdContext;
import br.ufscar.dc.compiladores.la.semantico2.Semantico2Parser.ExpressaoContext;

public class LaSemantico extends Semantico2BaseVisitor<Void>{
    Escopos escopos = new Escopos();

    @Override 
    public Void visitDeclaracao_global(Semantico2Parser.Declaracao_globalContext ctx){ 
        String identificador = ctx.IDENT().getText();

        List<TabelaDeSimbolos> listaEscopos = escopos.percorrerEscoposAninhados();
        if (listaEscopos.size() > 1) {
            escopos.abandonarEscopo();
        }
        TabelaDeSimbolos escopoGeral = escopos.obterEscopoAtual();

        if(ctx.tipo_estendido() != null){ //funcao -> FUNCAO IDENT '(' parametros? ')' ':' tipo_estendido declaracao_local* cmd* FIM_FUNCAO
            escopos.criarNovoEscopo();
            TabelaDeSimbolos tabelaFuncao = escopos.obterEscopoAtual();

            if(escopoGeral.existe(identificador)){
                LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + identificador + " ja declarado anteriormente\n");
            }
            else{
                TabelaDeSimbolos parametrosFuncao = new TabelaDeSimbolos();
                //System.out.println("identificador da função  =>  "+identificador+"  / retorno  ->  "+ctx.tipo_estendido().getText());
                escopoGeral.adicionar(identificador, TabelaDeSimbolos.TipoLA.FUNCAO, parametrosFuncao, ctx.tipo_estendido().getText());

                for(Semantico2Parser.ParametroContext parametros: ctx.parametros().parametro()){ //popular a tabela de parametros da funcao
                    String tipo =  parametros.tipo_estendido().getText();

                    for(Semantico2Parser.IdentificadorContext ident: parametros.identificador()){
                        String identificadorParametro = ident.getText();

                        if(tabelaFuncao.existe(identificadorParametro)){ //evitar dois paramtros com mesmo nome
                            LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + identificadorParametro + " ja declarado anteriormente");
                        }
                        else{
                            if( adicionarNaTabela(identificadorParametro, tipo, tabelaFuncao)){ //adicionar os parametros nas tabelas da funcao e dos parametros
                                adicionarNaTabela(identificadorParametro, tipo, parametrosFuncao);
                            }else{ //parametro é um registro ou tipo
                                if (escopoGeral.existe(tipo)){
                                    if (tabelaFuncao.existe(identificadorParametro)) { //garantir que o registro ou tipo já tenha sido declarado
                                        LaSemanticoUtils.adicionarErroSemantico(ident.IDENT(0).getSymbol(), "identificador " + identificadorParametro + " ja declarado anteriormente");
                                    } else {
                                        TabelaDeSimbolos atributosRegistro = escopoGeral.getArgumentos(tipo);
                                        tabelaFuncao.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.REGISTRO, atributosRegistro, null);
                                        parametrosFuncao.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.REGISTRO, atributosRegistro, null);
                                    }
                                }else{
                                    LaSemanticoUtils.adicionarErroSemantico(ident.IDENT(0).getSymbol(), "tipo " + tipo + " nao declarado");
                                    tabelaFuncao.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.INVALIDO);
                                    parametrosFuncao.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.INVALIDO);
                                }
                            }
                        }
                    }
                }
            }

        }else{ //procedimento -> PROCEDIMENTO IDENT '(' parametros? ')' declaracao_local* cmd* FIM_PROCEDIMENTO
            escopos.criarNovoEscopo();
            TabelaDeSimbolos tabelaProcedimento = escopos.obterEscopoAtual();

            if(escopoGeral.existe(identificador)){
                LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + identificador + " ja declarado anteriormente");
            }
            else{
                TabelaDeSimbolos parametrosProcedimento = new TabelaDeSimbolos();
                escopoGeral.adicionar(identificador, TabelaDeSimbolos.TipoLA.FUNCAO, parametrosProcedimento, null);

                for(Semantico2Parser.ParametroContext parametros: ctx.parametros().parametro()){ //popular a tabela de parametros do procedimento
                    String tipo =  parametros.tipo_estendido().getText();

                    for(Semantico2Parser.IdentificadorContext ident: parametros.identificador()){
                        String identificadorParametro = ident.getText();

                        if(tabelaProcedimento.existe(identificadorParametro)){ //evitar dois paramtros com mesmo nome
                            LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + identificadorParametro + " ja declarado anteriormente");
                        }
                        else{
                            if(adicionarNaTabela(identificadorParametro, tipo, tabelaProcedimento)){ //adicionar os parametros nas tabelas do procedimento e dos parametros
                                adicionarNaTabela(identificadorParametro, tipo, parametrosProcedimento);                        
                            }else{ //parametro é um registro ou tipo
                                if (escopoGeral.existe(tipo)){
                                    if (tabelaProcedimento.existe(identificadorParametro)) { //garantir que o registro ou tipo já tenha sido declarado
                                        LaSemanticoUtils.adicionarErroSemantico(ident.IDENT(0).getSymbol(), "identificador " + identificadorParametro + " ja declarado anteriormente");
                                    } else {
                                        TabelaDeSimbolos atributosRegistro = escopoGeral.getArgumentos(tipo);
                                        tabelaProcedimento.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.REGISTRO, atributosRegistro, tipo);
                                        parametrosProcedimento.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.REGISTRO, atributosRegistro, tipo);
                                    }
                                }else{
                                    LaSemanticoUtils.adicionarErroSemantico(ident.IDENT(0).getSymbol(), "tipo " + tipo + " nao declarado");
                                    tabelaProcedimento.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.INVALIDO);
                                    parametrosProcedimento.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.INVALIDO);
                                }
                            }
                        }
                    }
                }
            }
        }
        return super.visitDeclaracao_global(ctx);
    }
    

    @Override
    public Void visitDeclaracao_local(Semantico2Parser.Declaracao_localContext ctx) {
        if(ctx.IDENT() != null){
            String identificador = ctx.IDENT().getText();
            TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

            if (ctx.tipo_basico() != null) { // 'constante' IDENT ':' tipo_basico '=' valor_constante
                if (escopoAtual.existe(identificador)) {
                    LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + identificador + " ja declarado anteriormente");
                } else {
                    String tipo_basico = ctx.tipo_basico().getText();
                    switch (tipo_basico) {
                        case "inteiro":
                            escopoAtual.adicionar(identificador, TabelaDeSimbolos.TipoLA.INTEIRO);
                            break;
                        case "literal":
                            escopoAtual.adicionar(identificador, TabelaDeSimbolos.TipoLA.LITERAL);
                            break;
                        case "real":
                            escopoAtual.adicionar(identificador, TabelaDeSimbolos.TipoLA.REAL);
                            break;
                        case "logico":
                            escopoAtual.adicionar(identificador, TabelaDeSimbolos.TipoLA.LOGICO);
                            break;
                    }
                }

            } else { // TIPO IDENT ':' registro (registro)
                if (escopoAtual.existe(identificador)) { //ja tava declarado
                    LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + identificador + " ja declarado anteriormente");
                } else {
                    TabelaDeSimbolos tabelaRegistro = new TabelaDeSimbolos();

                    for (Semantico2Parser.VariavelContext variavel : ctx.registro().variavel()) {
                        for (Semantico2Parser.IdentificadorContext ctxIdentVar : variavel.identificador()) {
                            String identificadorVariavel = ctxIdentVar.getText();
                            String tipo = variavel.tipo().getText();
                            adicionarNaTabela(identificadorVariavel, tipo, tabelaRegistro); //popular a tabela de atributos do registro     
                            escopoAtual.adicionar(identificador, TabelaDeSimbolos.TipoLA.REGISTRO, tabelaRegistro, null); //adicionar o registro com sua tabela de atributos na tabela geral                     
                        }
                    }
                }
            }
        }else{
            if(ctx.variavel().tipo().registro() == null){ //DECLARE variavel
                for (Semantico2Parser.IdentificadorContext ctxIdentVar : ctx.variavel().identificador()) {
                    String identificadorVariavel = "";
                    for (var ident : ctxIdentVar.IDENT())
                        identificadorVariavel += ident.getText();
                    TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

                    if (ctxIdentVar.exp_aritmetica() != null){
                        for (Semantico2Parser.Exp_aritmeticaContext expDim : ctxIdentVar.exp_aritmetica())
                            LaSemanticoUtils.verificarTipo(escopoAtual, expDim);
                    }
                            
                    if (escopoAtual.existe(identificadorVariavel)) {
                        LaSemanticoUtils.adicionarErroSemantico(ctxIdentVar.IDENT(0).getSymbol(), "identificador " + identificadorVariavel + " ja declarado anteriormente");//12
                    } else {
                        String tipo = ctx.variavel().tipo().getText();
                        
                        if(!adicionarNaTabela(identificadorVariavel, tipo, escopoAtual)){ // variavel nao é do tipo 'inteiro' 'real' 'literal' 'logico' ou 'ponteiro', ou seja, é registro ou tipo
                            if(escopoAtual.existe(tipo)){  //verificar se o registro/tipo foi declarado
                                TabelaDeSimbolos.TipoLA tipoVariavel = escopoAtual.verificar(tipo);
                                TabelaDeSimbolos tabelaRegistro = escopoAtual.getArgumentos(ctx.variavel().tipo().getText());
                                escopoAtual.adicionar(identificadorVariavel, tipoVariavel, tabelaRegistro, null); 
                            }else{
                                LaSemanticoUtils.adicionarErroSemantico(ctxIdentVar.IDENT(0).getSymbol(), "tipo " + tipo + " nao declarado");
                                escopoAtual.adicionar(identificadorVariavel, TabelaDeSimbolos.TipoLA.INVALIDO);
                            }
                        }
                    }
                }
            }
            else{ // (tipo)
                ArrayList<String> identificadoresTipo = new ArrayList<>();
                for (Semantico2Parser.IdentificadorContext ctxIdentReg : ctx.variavel().identificador()) {
                    String identificadorName = ctxIdentReg.getText();
                    TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

                    if (escopoAtual.existe(identificadorName)) {
                        LaSemanticoUtils.adicionarErroSemantico(ctxIdentReg.IDENT(0).getSymbol(), "identificador " + identificadorName + " ja declarado anteriormente");
                    } else {
                        TabelaDeSimbolos tabelaTipo = new TabelaDeSimbolos();
                        escopoAtual.adicionar(identificadorName, TabelaDeSimbolos.TipoLA.REGISTRO, tabelaTipo, null); //tipo é armazenado como registro pois têm a mesma estrutura
                        identificadoresTipo.add(identificadorName);
                    }
                }
                for (Semantico2Parser.VariavelContext ctxVarReg : ctx.variavel().tipo().registro().variavel()) {  
                    for (Semantico2Parser.IdentificadorContext ctxVarRegIdent : ctxVarReg.identificador()) {
                        String nomeAtributo = ctxVarRegIdent.getText();
                        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

                        for (String it : identificadoresTipo) {
                            TabelaDeSimbolos registerFields = escopoAtual.getArgumentos(it);

                            if (escopoAtual.existe(nomeAtributo)) {
                                LaSemanticoUtils.adicionarErroSemantico(ctxVarRegIdent.IDENT(0).getSymbol(), "identificador " + nomeAtributo + " ja declarado anteriormente");
                            } else {
                                String tipo = ctxVarReg.tipo().getText();
                            
                                if(!adicionarNaTabela(nomeAtributo, tipo, registerFields)){
                                    if (!escopoAtual.existe(tipo)) {
                                        LaSemanticoUtils.adicionarErroSemantico(ctxVarRegIdent.IDENT(0).getSymbol(), "tipo " + tipo + " nao declarado");
                                        escopoAtual.adicionar(nomeAtributo, TabelaDeSimbolos.TipoLA.INVALIDO);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return super.visitDeclaracao_local(ctx);
    }


    @Override
    public Void visitCmd(Semantico2Parser.CmdContext ctx) {
        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        if (ctx.cmdLeia() != null) {
            for (var ident : ctx.cmdLeia().identificador()) {
                LaSemanticoUtils.verificarTipo(escopoAtual, ident);
            }
        }
        if (ctx.cmdAtribuicao() != null) {    
            //var nomeEsquerda = ctx.cmdAtribuicao().identificador().getText();
            var esquerda = LaSemanticoUtils.verificarTipo(escopoAtual, ctx.cmdAtribuicao().identificador());
            //System.out.println("esquerda("+nomeEsquerda+")->"+esquerda);
            //var nomeDireita = ctx.cmdAtribuicao().expressao().getText();
            var direita = LaSemanticoUtils.verificarTipo(escopoAtual, ctx.cmdAtribuicao().expressao());
            //System.out.println("direita("+nomeDireita+")->"+direita);
            var atribuicao = ctx.cmdAtribuicao().getText().split("<-"); //ponteiros
            if (!LaSemanticoUtils.verificarTipo(esquerda, direita) && !atribuicao[0].contains("^")) { //
                LaSemanticoUtils.adicionarErroSemantico(ctx.cmdAtribuicao().identificador().IDENT(0).getSymbol(),"atribuicao nao compativel para " + ctx.cmdAtribuicao().identificador().getText());
            }
            if (atribuicao[0].contains("^")){
                if((esquerda == TabelaDeSimbolos.TipoLA.PONTEIRO_I && direita != TabelaDeSimbolos.TipoLA.INTEIRO) ||
                (esquerda == TabelaDeSimbolos.TipoLA.PONTEIRO_R && direita != TabelaDeSimbolos.TipoLA.REAL) ||
                (esquerda == TabelaDeSimbolos.TipoLA.PONTEIRO_L && direita != TabelaDeSimbolos.TipoLA.LITERAL) ||
                (esquerda == TabelaDeSimbolos.TipoLA.PONTEIRO_LO && direita != TabelaDeSimbolos.TipoLA.LOGICO)){
                    LaSemanticoUtils.adicionarErroSemantico(ctx.cmdAtribuicao().identificador().IDENT(0).getSymbol(), "atribuicao nao compativel para " + atribuicao[0]);
                }
            }
            if(ctx.cmdChamada() != null){
                String identificador  = ctx.cmdChamada().IDENT().getText();

                if (!escopoAtual.existe(identificador)) { //funcoes ou procedimentos não declarados
                    LaSemanticoUtils.adicionarErroSemantico(ctx.cmdChamada().IDENT().getSymbol(), "identificador " + identificador + " nao declarado");
                } else {
                    ArrayList<TabelaDeSimbolos.TipoLA> parameterTypes = new ArrayList<>();
                    for (ExpressaoContext exp : ctx.cmdChamada().expressao()) {
                        parameterTypes.add(LaSemanticoUtils.verificarTipo(escopoAtual, exp));
                    }
                }
            }
        }
        return super.visitCmd(ctx);
    } 

    @Override
    public Void visitExp_aritmetica(Semantico2Parser.Exp_aritmeticaContext ctx){
        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        LaSemanticoUtils.verificarTipo(escopoAtual, ctx);
        return super.visitExp_aritmetica(ctx);
    }

    @Override
    public Void visitPrograma(Semantico2Parser.ProgramaContext ctx) {
            for (CmdContext ctxCmd : ctx.corpo().cmd()) {
                if (ctxCmd.cmdRetorne() != null) {
                    LaSemanticoUtils.adicionarErroSemantico(ctxCmd.cmdRetorne().getStart(), "comando retorne nao permitido nesse escopo");
                }
            }

        for (var ctxDec : ctx.declaracoes().declaracao_global()) {
            if (ctxDec != null && ctxDec.tipo_estendido() == null) {
                for (CmdContext ctxCmd : ctxDec.cmd()) {
                    if (ctxCmd.cmdRetorne() != null)
                        LaSemanticoUtils.adicionarErroSemantico(ctxCmd.cmdRetorne().getStart(), "comando retorne nao permitido nesse escopo");
                }
            }
        }
        return super.visitPrograma(ctx);
    }
    
    @Override
    public Void visitCorpo(Semantico2Parser.CorpoContext ctx) {
        List<TabelaDeSimbolos> scopes = escopos.percorrerEscoposAninhados();
        if (scopes.size() > 1) {
            escopos.abandonarEscopo();
        }
        return super.visitCorpo(ctx);
    }

    //metodo para axiliar a adicionar um identificador na tabela com o tipo correto
    Boolean adicionarNaTabela(String identificadorVariavel, String tipo, TabelaDeSimbolos tabela){
        switch (tipo) {
            case "inteiro":
                tabela.adicionar(identificadorVariavel, TabelaDeSimbolos.TipoLA.INTEIRO);
                break;
            case "literal":
                tabela.adicionar(identificadorVariavel, TabelaDeSimbolos.TipoLA.LITERAL);
                break;
            case "real":
                tabela.adicionar(identificadorVariavel, TabelaDeSimbolos.TipoLA.REAL);
                break;
            case "logico":
                tabela.adicionar(identificadorVariavel, TabelaDeSimbolos.TipoLA.LOGICO);
                break;
            case "^logico":
                tabela.adicionar(identificadorVariavel, TabelaDeSimbolos.TipoLA.PONTEIRO_LO);
                break;
            case "^real":
                tabela.adicionar(identificadorVariavel, TabelaDeSimbolos.TipoLA.PONTEIRO_R);
                break;
            case "^literal":
                tabela.adicionar(identificadorVariavel, TabelaDeSimbolos.TipoLA.PONTEIRO_L);
                break;
            case "^inteiro":
                tabela.adicionar(identificadorVariavel, TabelaDeSimbolos.TipoLA.PONTEIRO_I);
                break;
            default:
                return false;
        }
        return true;
    }

}
