package br.ufscar.dc.compiladores.la.semantico2;

import java.util.ArrayList;
import java.util.List;


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
        escopos.criarNovoEscopo();
        TabelaDeSimbolos tabela = escopos.obterEscopoAtual();

        if(escopoGeral.existe(identificador)){
            LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + identificador + " ja declarado anteriormente\n");
        }
        else{
            TabelaDeSimbolos parametros = new TabelaDeSimbolos();
            if(ctx.tipo_estendido() != null){
                escopoGeral.adicionar(identificador, TabelaDeSimbolos.TipoLA.FUNCAO, parametros, ctx.tipo_estendido().getText());//funcao -> FUNCAO IDENT '(' parametros? ')' ':' tipo_estendido declaracao_local* cmd* FIM_FUNCAO
            }else{
                escopoGeral.adicionar(identificador, TabelaDeSimbolos.TipoLA.FUNCAO, parametros, null); //procedimento -> PROCEDIMENTO IDENT '(' parametros? ')' declaracao_local* cmd* FIM_PROCEDIMENTO
            }

            for(Semantico2Parser.ParametroContext param: ctx.parametros().parametro()){ //popular a tabela de parametros da funcao
                String nomeTipo = param.tipo_estendido().getText();
                TabelaDeSimbolos.TipoLA tipo =  LaSemanticoUtils.retornaTipo(nomeTipo);

                for(Semantico2Parser.IdentificadorContext ident: param.identificador()){
                    String identificadorParametro = ident.getText();

                    if(tabela.existe(identificadorParametro)){ //evitar dois paramtros com mesmo nome
                        LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + identificadorParametro + " ja declarado anteriormente");
                    }
                    else{
                        if(tipo!=TabelaDeSimbolos.TipoLA.REGISTRO){ 
                            tabela.adicionar(identificadorParametro,tipo);
                            parametros.adicionar(identificadorParametro,tipo); //adicionar os parametros nas tabelas da funcao e dos parametros
                        }else{ //parametro é um registro ou tipo
                            if (escopoGeral.existe(nomeTipo)){
                                if (tabela.existe(identificadorParametro)) { //garantir que o registro ou tipo já tenha sido declarado
                                    LaSemanticoUtils.adicionarErroSemantico(ident.IDENT(0).getSymbol(), "identificador " + identificadorParametro + " ja declarado anteriormente");
                                } else {
                                    TabelaDeSimbolos atributosRegistro = escopoGeral.getArgumentos(nomeTipo);
                                    tabela.adicionar(identificadorParametro, tipo, atributosRegistro, null);
                                    parametros.adicionar(identificadorParametro, tipo, atributosRegistro, null);
                                }
                            }else{
                                LaSemanticoUtils.adicionarErroSemantico(ident.IDENT(0).getSymbol(), "tipo " + nomeTipo + " nao declarado");
                                tabela.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.INVALIDO);
                                parametros.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.INVALIDO);
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
            if (escopoAtual.existe(identificador)) {
                    LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + identificador + " ja declarado anteriormente");
            }else{
                if(ctx.tipo_basico() != null){ // 'constante' IDENT ':' tipo_basico '=' valor_constante
                        String tipo_basico = ctx.tipo_basico().getText();
                        TabelaDeSimbolos.TipoLA tipola = LaSemanticoUtils.retornaTipo(tipo_basico);
                        escopoAtual.adicionar(identificador,tipola);
                }else{ // TIPO IDENT ':' registro (registro)
                    TabelaDeSimbolos tabelaRegistro = new TabelaDeSimbolos();
                    for (Semantico2Parser.VariavelContext variavel : ctx.registro().variavel()) {
                        for (Semantico2Parser.IdentificadorContext ctxIdentVar : variavel.identificador()) {
                            String identificadorVariavel = ctxIdentVar.getText();
                            String nomeTipo = variavel.tipo().getText();
                            TabelaDeSimbolos.TipoLA tipo = LaSemanticoUtils.retornaTipo(nomeTipo);
                            tabelaRegistro.adicionar(identificadorVariavel,tipo); //popular a tabela de atributos do registro     
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
                            
                    if (escopoAtual.existe(identificadorVariavel)) {
                        LaSemanticoUtils.adicionarErroSemantico(ctxIdentVar.IDENT(0).getSymbol(), "identificador " + identificadorVariavel + " ja declarado anteriormente");//12
                    } else {
                        String nomeTipo = ctx.variavel().tipo().getText();
                        TabelaDeSimbolos.TipoLA tipo = LaSemanticoUtils.retornaTipo(nomeTipo);
                        
                        if(tipo==TabelaDeSimbolos.TipoLA.REGISTRO){ 
                            if(escopoAtual.existe(nomeTipo)){  //verificar se o registro/tipo foi declarado
                                //TabelaDeSimbolos.TipoLA tipoVariavel = escopoAtual.verificar(nomeTipo);
                                TabelaDeSimbolos tabelaRegistro = escopoAtual.getArgumentos(ctx.variavel().tipo().getText());
                                escopoAtual.adicionar(identificadorVariavel, TabelaDeSimbolos.TipoLA.REGISTRO, tabelaRegistro, null); 
                            }else{
                                LaSemanticoUtils.adicionarErroSemantico(ctxIdentVar.IDENT(0).getSymbol(), "tipo " + tipo + " nao declarado");
                                escopoAtual.adicionar(identificadorVariavel, TabelaDeSimbolos.TipoLA.INVALIDO);
                            }
                        }else escopoAtual.adicionar(identificadorVariavel,tipo);
                    }
                }
            }
            else{ // (tipo)
                ArrayList<String> identificadoresTipo = new ArrayList<>();
                for (Semantico2Parser.IdentificadorContext ctxIdentReg : ctx.variavel().identificador()) {
                    String nomeIdentificador = ctxIdentReg.getText();
                    TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

                    if (escopoAtual.existe(nomeIdentificador)) {
                        LaSemanticoUtils.adicionarErroSemantico(ctxIdentReg.IDENT(0).getSymbol(), "identificador " + nomeIdentificador + " ja declarado anteriormente");
                    } else {
                        TabelaDeSimbolos tabelaTipo = new TabelaDeSimbolos();
                        escopoAtual.adicionar(nomeIdentificador, TabelaDeSimbolos.TipoLA.REGISTRO, tabelaTipo, null); //tipo é armazenado como registro pois têm a mesma estrutura
                        identificadoresTipo.add(nomeIdentificador);
                    }
                }
                for (Semantico2Parser.VariavelContext ctxVarReg : ctx.variavel().tipo().registro().variavel()) {  
                    for (Semantico2Parser.IdentificadorContext ctxVarRegIdent : ctxVarReg.identificador()) {
                        String nomeAtributo = ctxVarRegIdent.getText();
                        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
                        if (escopoAtual.existe(nomeAtributo)) {
                                LaSemanticoUtils.adicionarErroSemantico(ctxVarRegIdent.IDENT(0).getSymbol(), "identificador " + nomeAtributo + " ja declarado anteriormente");
                        } else {
                            for (String it : identificadoresTipo) {
                                TabelaDeSimbolos tabelaArgumentos = escopoAtual.getArgumentos(it);
                                String nomeTipo = ctxVarReg.tipo().getText();
                                TabelaDeSimbolos.TipoLA tipo = LaSemanticoUtils.retornaTipo(nomeTipo);
                                if(tipo==TabelaDeSimbolos.TipoLA.REGISTRO){
                                    if (!escopoAtual.existe(nomeTipo)) {
                                        LaSemanticoUtils.adicionarErroSemantico(ctxVarRegIdent.IDENT(0).getSymbol(), "tipo " + tipo + " nao declarado");
                                        escopoAtual.adicionar(nomeAtributo, TabelaDeSimbolos.TipoLA.INVALIDO);
                                    }
                                }else tabelaArgumentos.adicionar(nomeAtributo,tipo);
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
            TabelaDeSimbolos.TipoLA esquerda = LaSemanticoUtils.verificarTipo(escopoAtual, ctx.cmdAtribuicao().identificador());
            //System.out.println("esquerda("+nomeEsquerda+")->"+esquerda);
            //var nomeDireita = ctx.cmdAtribuicao().expressao().getText();
            TabelaDeSimbolos.TipoLA direita = LaSemanticoUtils.verificarTipo(escopoAtual, ctx.cmdAtribuicao().expressao());
            //System.out.println("direita("+nomeDireita+")->"+direita);
            var atribuicao = ctx.cmdAtribuicao().getText().split("<-"); //ponteiros
            if (!LaSemanticoUtils.verificarTipo(esquerda, direita) && !atribuicao[0].contains("^")) { //
                LaSemanticoUtils.adicionarErroSemantico(ctx.cmdAtribuicao().identificador().IDENT(0).getSymbol(),"atribuicao nao compativel para " + ctx.cmdAtribuicao().identificador().getText());
            }
            if (atribuicao[0].contains("^")){
                if(esquerda != direita){
                    LaSemanticoUtils.adicionarErroSemantico(ctx.cmdAtribuicao().identificador().IDENT(0).getSymbol(), "atribuicao nao compativel para " + atribuicao[0]);
                }
            }
        }
        if(ctx.cmdChamada() != null){
            String identificador  = ctx.cmdChamada().IDENT().getText();

            if (!escopoAtual.existe(identificador)) { //funcoes ou procedimentos não declarados
                LaSemanticoUtils.adicionarErroSemantico(ctx.cmdChamada().IDENT().getSymbol(), "identificador " + identificador + " nao declarado");
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
        for (Semantico2Parser.CmdContext ctxCmd : ctx.corpo().cmd()) {
            if (ctxCmd.cmdRetorne() != null) {
                LaSemanticoUtils.adicionarErroSemantico(ctxCmd.cmdRetorne().getStart(), "comando retorne nao permitido nesse escopo");
            }
        }

        for (Semantico2Parser.Declaracao_globalContext ctxDec : ctx.declaracoes().declaracao_global()) {
            if (ctxDec != null && ctxDec.tipo_estendido() == null) {
                for (Semantico2Parser.CmdContext ctxCmd : ctxDec.cmd()) {
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

}
