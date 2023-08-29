package br.ufscar.dc.compiladores.la.semantico2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaGeradorC extends Semantico2BaseVisitor<Void>{
    StringBuilder saida;
    Escopos escopos;

    public LaGeradorC() {
        saida = new StringBuilder();
        this.escopos = new Escopos();
    }

    @Override
    public Void visitPrograma(Semantico2Parser.ProgramaContext ctx){
        saida.append("#include <stdio.h>\n#include <stdlib.h>\n\n");

        ctx.declaracoes().declaracao_local().forEach(dec -> visitDeclaracao_local(dec));
        ctx.declaracoes().declaracao_global().forEach(dec -> visitDeclaracao_global(dec));

        saida.append("int main(){\n");

        ctx.corpo().declaracao_local().forEach(decl -> visitDeclaracao_local(decl));
        ctx.corpo().cmd().forEach(cmd -> visitCmd(cmd));
        saida.append("  return 0;\n}\n");   
        return null;
    }

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
        TabelaDeSimbolos parametros = new TabelaDeSimbolos();

        if(ctx.tipo_estendido() != null){ //funcao -> FUNCAO IDENT '(' parametros? ')' ':' tipo_estendido declaracao_local* cmd* FIM_FUNCAO
            TabelaDeSimbolos.TipoLA retorno = LaSemanticoUtils.retornaTipo(ctx.tipo_estendido().getText());
            escopoGeral.adicionar(identificador, TabelaDeSimbolos.TipoLA.FUNCAO, parametros, ctx.tipo_estendido().getText());
            saida.append(tipoC(retorno)+" "+identificador+"(");
        }else{ //procedimento -> PROCEDIMENTO IDENT '(' parametros? ')' declaracao_local* cmd* FIM_PROCEDIMENTO
            escopoGeral.adicionar(identificador, TabelaDeSimbolos.TipoLA.FUNCAO, parametros, null);
            saida.append("void "+identificador+"(");
        }
        boolean primeiroParam = true;

        for(Semantico2Parser.ParametroContext param: ctx.parametros().parametro()){ //popular a tabela de parametros da funcao
            String nomeTipo =  param.tipo_estendido().getText();
            TabelaDeSimbolos.TipoLA tipo =  LaSemanticoUtils.retornaTipo(nomeTipo);

            for(Semantico2Parser.IdentificadorContext ident: param.identificador()){
                String identificadorParametro = ident.getText();

                if(!primeiroParam) saida.append(",");

                if(tipo!=TabelaDeSimbolos.TipoLA.REGISTRO){ //adicionar os parametros nas tabelas da funcao e dos parametros
                    tabela.adicionar(identificadorParametro,tipo);
                    parametros.adicionar(identificadorParametro,tipo); //adicionar os parametros nas tabelas da funcao e dos parametros
                    if(tipo==TabelaDeSimbolos.TipoLA.LITERAL){
                        saida.append("  char* "+identificadorParametro+" ");
                    }else{
                        saida.append("  "+tipoC(tipo)+" "+identificadorParametro+" ");
                    }
                }else if (escopoGeral.existe(nomeTipo)){  
                    TabelaDeSimbolos atributosRegistro = escopoGeral.getArgumentos(nomeTipo);
                    tabela.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.REGISTRO, atributosRegistro, null);
                    parametros.adicionar(identificadorParametro, TabelaDeSimbolos.TipoLA.REGISTRO, atributosRegistro, null);
                }
                primeiroParam = false;    
            }
        }
        saida.append("){\n");
        ctx.cmd().forEach(cmd->visitCmd(cmd));
        saida.append("}\n");
        return null;
    }

    @Override
    public Void visitDeclaracao_local(Semantico2Parser.Declaracao_localContext ctx) {
        if(ctx.IDENT() != null){
            String identificador = ctx.IDENT().getText();
            TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

            if (ctx.tipo_basico() != null) { // 'constante' IDENT ':' tipo_basico '=' valor_constante
                saida.append("#define "+identificador+" "+ctx.valor_constante().getText()+"\n\n");
                String tipo_basico = ctx.tipo_basico().getText();
                TabelaDeSimbolos.TipoLA tipola = LaSemanticoUtils.retornaTipo(tipo_basico);
                escopoAtual.adicionar(identificador,tipola);

            }else{ // TIPO IDENT ':' registro (registro)
                
                TabelaDeSimbolos tabelaRegistro = new TabelaDeSimbolos();
                saida.append("typedef struct{\n");
                for (Semantico2Parser.VariavelContext variavel : ctx.registro().variavel()) {
                    for (Semantico2Parser.IdentificadorContext ctxIdentVar : variavel.identificador()) {
                        String identificadorVariavel = ctxIdentVar.getText();
                        String nomeTipo = variavel.tipo().getText();
                        TabelaDeSimbolos.TipoLA tipo = LaSemanticoUtils.retornaTipo(nomeTipo);
                        tabelaRegistro.adicionar(identificadorVariavel,tipo); //popular a tabela de atributos do registro
                        if(tipo==TabelaDeSimbolos.TipoLA.LITERAL){
                            saida.append("  char* "+identificadorVariavel+"[80];\n");
                        }else{ 
                            saida.append("  "+tipoC(tipo)+" "+identificadorVariavel+";\n"); 
                        }   
                        escopoAtual.adicionar(identificador, TabelaDeSimbolos.TipoLA.REGISTRO, tabelaRegistro, null); //adicionar o registro com sua tabela de atributos na tabela geral                     
                    }
                }
                saida.append("      }"+identificador+";\n");
            }
        }else{
            if(ctx.variavel().tipo().registro() == null){ //DECLARE variavel
                for (Semantico2Parser.IdentificadorContext ctxIdentVar : ctx.variavel().identificador()) {
                    String identificadorVariavel = ctxIdentVar.getText();
                    String identificadorVariavelReduzido = "";
                    for (var ident : ctxIdentVar.IDENT())
                        identificadorVariavelReduzido += ident.getText();
                    TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();      
                    String nomeTipo = ctx.variavel().tipo().getText();
                    TabelaDeSimbolos.TipoLA tipo = LaSemanticoUtils.retornaTipo(nomeTipo);
                    
                    if(tipo != TabelaDeSimbolos.TipoLA.REGISTRO){ 
                        if(tipo==TabelaDeSimbolos.TipoLA.LITERAL){
                            saida.append("  char* "+identificadorVariavel+"[80];\n");
                        }else{ 
                            saida.append("  "+tipoC(tipo)+" "+identificadorVariavel+";\n"); 
                        } 
                        escopoAtual.adicionar(identificadorVariavelReduzido,tipo);
                    }else{
                        TabelaDeSimbolos.TipoLA tipoVariavel = escopoAtual.verificar(nomeTipo);
                        TabelaDeSimbolos tabelaRegistro = escopoAtual.getArgumentos(ctx.variavel().tipo().getText());
                        escopoAtual.adicionar(identificadorVariavelReduzido, tipoVariavel, tabelaRegistro, null); 
                        saida.append("      "+nomeTipo+" "+ctxIdentVar.getText()+";\n");
                    }
                    
                }
            }
            else{ // (tipo)
                saida.append("  struct{\n");
                ArrayList<String> identificadoresTipo = new ArrayList<>();
                for (Semantico2Parser.IdentificadorContext ctxIdentReg : ctx.variavel().identificador()) {
                    String nomeIdentificador = ctxIdentReg.getText();
                    TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
                    TabelaDeSimbolos tabelaTipo = new TabelaDeSimbolos();
                    escopoAtual.adicionar(nomeIdentificador, TabelaDeSimbolos.TipoLA.REGISTRO, tabelaTipo, null); //tipo é armazenado como registro pois têm a mesma estrutura
                    identificadoresTipo.add(nomeIdentificador);
                }
                for (Semantico2Parser.VariavelContext ctxVarReg : ctx.variavel().tipo().registro().variavel()) {  
                    for (Semantico2Parser.IdentificadorContext ctxVarRegIdent : ctxVarReg.identificador()) {
                        boolean b = false;
                        String nomeAtributo = ctxVarRegIdent.getText();
                        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

                        for (String it : identificadoresTipo) {
                            TabelaDeSimbolos tabelaArgumentos = escopoAtual.getArgumentos(it);
                            String nomeTipo = ctxVarReg.tipo().getText();
                            TabelaDeSimbolos.TipoLA tipo = LaSemanticoUtils.retornaTipo(nomeTipo);
                            if(!b){
                                if(tipo==TabelaDeSimbolos.TipoLA.LITERAL){
                                    saida.append("  char* "+nomeAtributo+"[80];\n");
                                }else{ 
                                    saida.append("  "+tipoC(tipo)+" "+nomeAtributo+";\n"); 
                                }
                                tabelaArgumentos.adicionar(nomeAtributo,tipo);
                            }
                            b = true;
                        }
                    }
                }
                saida.append("  }");
                for(String it: identificadoresTipo) saida.append(it);
                saida.append(";\n");
            }
        }
        return null;
    }

    @Override
    public Void visitCmd(Semantico2Parser.CmdContext ctx) {
        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        if(ctx.cmdChamada() != null){
            saida.append("  "+ctx.getText()+";\n");
            
        }
        if (ctx.cmdAtribuicao() != null) {  
            Semantico2Parser.IdentificadorContext identificador =  ctx.cmdAtribuicao().identificador();
            //var nomeEsquerda = ctx.cmdAtribuicao().identificador().getText();
            var esquerda = LaSemanticoUtils.verificarTipo(escopoAtual, identificador);
            //System.out.println("esquerda("+nomeEsquerda+")->"+esquerda);
            var nomeDireita = ctx.cmdAtribuicao().expressao().getText();
            //var direita = LaSemanticoUtils.verificarTipo(escopoAtual, ctx.cmdAtribuicao().expressao());
            //System.out.println("direita("+nomeDireita+")->"+direita);
            var atribuicao = ctx.cmdAtribuicao().getText().split("<-"); //ponteiros
            
            if (atribuicao[0].contains("^")){
                saida.append("*");
            }
            if(esquerda == TabelaDeSimbolos.TipoLA.LITERAL){
                saida.append("strcpy("+identificador.getText()+","+nomeDireita+");\n");
            }else{  
                saida.append("  "+identificador.getText()+" = "+nomeDireita+";\n");
            }
        }
        if (ctx.cmdLeia() != null) {
            for (var ident : ctx.cmdLeia().identificador()) {
                //LaSemanticoUtils.verificarTipo(escopoAtual, ident);
                TabelaDeSimbolos.TipoLA tipo = escopoAtual.verificar(ident.getText());
                if(tipo != TabelaDeSimbolos.TipoLA.LITERAL){
                    saida.append("  scanf(\"%"+tipoC_abreviado(tipo)+"\", &"+ident.getText()+");\n");
                }else{
                    saida.append("  gets("+"  "+ident.getText()+");\n");
                }
            }
        }
        if(ctx.cmdEscreva() != null){
            for(Semantico2Parser.ExpressaoContext exp : ctx.cmdEscreva().expressao()){
                String tipoC = tipoC_abreviado(LaSemanticoUtils.verificarTipo(escopoAtual,exp));
                if(escopoAtual.existe(exp.getText())){
                    TabelaDeSimbolos.TipoLA tipo = escopoAtual.verificar(exp.getText());
                    tipoC = tipoC_abreviado(tipo);
                }
                saida.append("  printf(\"%"+tipoC+"\", "+exp.getText()+");\n");
            }
        }
        if(ctx.cmdRetorne() != null){
            saida.append("  return ");
            visitExpressao(ctx.cmdRetorne().expressao());
            saida.append(";\n");
        }
        if(ctx.cmdSe() != null){
            saida.append("if(");
            visitExpressao(ctx.cmdSe().expressao());
            saida.append("){\n");
            for(Semantico2Parser.CmdContext cmd : ctx.cmdSe().cmdIf){
                visitCmd(cmd);
            }
            saida.append("}\n");
            if(ctx.getText().contains("senao")){
                saida.append("else {\n");
                for(Semantico2Parser.CmdContext cmd : ctx.cmdSe().cmdElse) {
                    visitCmd(cmd);
                }
                saida.append("}\n");
            }
        }
        if(ctx.cmdCaso() != null){
            saida.append("switch(");
            visit(ctx.cmdCaso().exp_aritmetica());
            saida.append("){\n");
            visit(ctx.cmdCaso().selecao());
            if(ctx.cmdCaso().getText().contains("senao")){
                saida.append("  default:\n");
                ctx.cmdCaso().cmd().forEach(cmd -> visitCmd(cmd));
                saida.append("  }\n");
            }
        }
        if(ctx.cmdPara() != null){
            String ident = ctx.cmdPara().IDENT().getText();
            saida.append("for("+ident+" = ");
            visitExp_aritmetica((ctx.cmdPara().exp_aritmetica(0)));
            saida.append("; "+ident+"<= ");
            visitExp_aritmetica((ctx.cmdPara().exp_aritmetica(1)));
            saida.append("; "+ident+"++){\n");
            ctx.cmdPara().cmd().forEach(cmd -> visitCmd(cmd));
            saida.append("}\n");
        }
        if(ctx.cmdEnquanto() != null){
            saida.append("while(");
            visitExpressao(ctx.cmdEnquanto().expressao());
            saida.append("){\n");
            ctx.cmdEnquanto().cmd().forEach(var->visitCmd(var));
            saida.append("}\n");
        }
        if(ctx.cmdFaca() != null){
            saida.append("do{\n");
            ctx.cmdFaca().cmd().forEach(var->visitCmd(var));
            saida.append("} while(");
            visitExpressao(ctx.cmdFaca().expressao());
            saida.append(");\n");
        }
        return null;
    } 

    @Override
    public Void visitCorpo(Semantico2Parser.CorpoContext ctx) {
        List<TabelaDeSimbolos> scopes = escopos.percorrerEscoposAninhados();
        if (scopes.size() > 1) {
            escopos.abandonarEscopo();
        }
        return super.visitCorpo(ctx);
    }

    @Override
    public Void visitExpressao(Semantico2Parser.ExpressaoContext ctx){
        if(ctx.termo_logico() != null){
            visitTermo_logico(ctx.termo_logico(0));

            for(int i = 1; i < ctx.termo_logico().size(); i++){
                Semantico2Parser.Termo_logicoContext termo = ctx.termo_logico(i);
                saida.append(" || ");
                visitTermo_logico(termo);
            }
        }
        return null;
    }

    @Override
    public Void visitTermo_logico(Semantico2Parser.Termo_logicoContext ctx){
        visitFator_logico(ctx.fator_logico(0));

        for(int i = 1; i < ctx.fator_logico().size(); i++){
            Semantico2Parser.Fator_logicoContext fator = ctx.fator_logico(i);
            saida.append(" && ");
            visitFator_logico(fator);
        }   
        return null;
    }

    @Override
    public Void visitFator_logico(Semantico2Parser.Fator_logicoContext ctx){
        if(ctx.getText().startsWith("nao")){
            saida.append("!");
        }
        visitParcela_logica(ctx.parcela_logica());  
        return null;
    }

    @Override
    public Void visitParcela_logica(Semantico2Parser.Parcela_logicaContext ctx){
        if(ctx.exp_relacional() != null){
            visitExp_relacional(ctx.exp_relacional());
        } else{
            if(ctx.getText() == "verdadeiro"){
                saida.append("true");
            } else {
                saida.append("false");
            }
        }
        return null;
    }

    @Override
    public Void visitExp_relacional(Semantico2Parser.Exp_relacionalContext ctx){
        visitExp_aritmetica(ctx.exp_aritmetica(0));
        for(int i = 1; i < ctx.exp_aritmetica().size(); i++){
            Semantico2Parser.Exp_aritmeticaContext termo = ctx.exp_aritmetica(i);
            if(ctx.op_relacional().getText().equals("=")){
                saida.append(" == ");
            } else{
                saida.append(ctx.op_relacional().getText());
            }
            visitExp_aritmetica(termo);
        }
        return null;
    }

    @Override
    public Void visitExp_aritmetica(Semantico2Parser.Exp_aritmeticaContext ctx){
        visitTermo(ctx.termo(0));

        for(int i = 1; i < ctx.termo().size(); i++){
            Semantico2Parser.TermoContext termo = ctx.termo(i);
            saida.append(ctx.op1(i-1).getText());
            visitTermo(termo);
        }
        return null;
    }

    @Override
    public Void visitTermo(Semantico2Parser.TermoContext ctx) {
       visitFator(ctx.fator(0));

        for(int i = 1; i < ctx.fator().size(); i++){
            Semantico2Parser.FatorContext fator = ctx.fator(i);
            saida.append(ctx.op2(i-1).getText());
            visitFator(fator);
        }
        return null;
    }

    @Override
    public Void visitFator(Semantico2Parser.FatorContext ctx) {
        visitParcela(ctx.parcela(0));

        for(int i = 1; i < ctx.parcela().size(); i++){
            Semantico2Parser.ParcelaContext parcela = ctx.parcela(i);
            saida.append(ctx.op3(i-1).getText());
            visitParcela(parcela);
        }
        return null;
    }

    @Override
    public Void visitParcela(Semantico2Parser.ParcelaContext ctx) {
        if(ctx.parcela_unario() != null){
            if(ctx.op_unario() != null){
                saida.append(ctx.op_unario().getText());
            }
            visitParcela_unario(ctx.parcela_unario());
        } else{
            visitParcela_nao_unario(ctx.parcela_nao_unario());
        }
        return null;
    }

    @Override
    public Void visitParcela_unario(Semantico2Parser.Parcela_unarioContext ctx) {
        if(ctx.IDENT() != null){
            saida.append(ctx.IDENT().getText());
            saida.append("(");
            for(int i = 0; i < ctx.expressao().size(); i++){
                visitExpressao(ctx.expressao(i));
                if(i < ctx.expressao().size()-1){
                    saida.append(", ");
                }
            }
        } else if(ctx.ABREPAR() != null){
            saida.append("(");
            ctx.expressao().forEach(exp->visitExpressao(exp));
            saida.append(")");
        }
        else {
            saida.append(ctx.getText());
        }
        
        return null;
    }

    @Override
    public Void visitParcela_nao_unario(Semantico2Parser.Parcela_nao_unarioContext ctx) {
        saida.append(ctx.getText());
        return null;
    }

    @Override
    public Void visitSelecao(Semantico2Parser.SelecaoContext ctx) {
        ctx.item_selecao().forEach(var -> visitItem_selecao(var));
        return null;
    }
    @Override
    public Void visitItem_selecao(Semantico2Parser.Item_selecaoContext ctx) {
        ArrayList<String> intervalo = new ArrayList<>(Arrays.asList(ctx.constantes().getText().split("\\.\\.")));
        String primeiro = intervalo.size() > 0 ? intervalo.get(0) : ctx.constantes().getText();
        String ultimo = intervalo.size() > 1 ? intervalo.get(1) : intervalo.get(0);
        for(int i = Integer.parseInt(primeiro); i <= Integer.parseInt(ultimo); i++){
            saida.append("case " + i + ":\n");
            ctx.cmd().forEach(var -> visitCmd(var));
            saida.append("break;\n");
        }
        return null;
    }

    /*
     * métodos auxiliares
     */

    public static String tipoC(TabelaDeSimbolos.TipoLA tipo){
        switch(tipo){
            case INTEIRO:
                return "int";
            case REAL:
                return "float";
            case LITERAL:
                return "char";
            case LOGICO:
                return "boolean";
            case PONTEIRO_I:
                return "int*";
            case PONTEIRO_R:
                return "float*";
            case PONTEIRO_L:
                return "char*";
            case PONTEIRO_LO:
                return "boolean*";
            default:
                return null;
        }
    }

     public static String tipoC_abreviado(TabelaDeSimbolos.TipoLA tipo){
        switch(tipo) {
            case INTEIRO: 
                return "d";
            case REAL: 
                return "f";
            case LITERAL:
                return "s";
            default:
                return null;
        }
    }
}