package br.ufscar.dc.compiladores.la.semantico;

public class LaSemantico extends SemanticoBaseVisitor<Void>{
    Escopos escopos = new Escopos();

    @Override
    public Void visitDeclaracao_local(SemanticoParser.Declaracao_localContext ctx) {
        
        for (var ctxIdent : ctx.variavel().identificador()) {
            var identificador = ctxIdent.IDENT(0).getText();
            var escopoAtual = escopos.obterEscopoAtual();

            if (escopoAtual.existe(identificador)) { //identificador já existe
                LaSemanticoUtils.adicionarErroSemantico(ctxIdent.IDENT(0).getSymbol(), "identificador " + identificador + " ja declarado anteriormente");
            } else {
                var tipo = ctx.variavel().tipo().getText();
                switch (tipo) {
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
                    default: 
                        if (!escopoAtual.existe(tipo)){ //tipo não existe
                            LaSemanticoUtils.adicionarErroSemantico(ctxIdent.IDENT(0).getSymbol(), "tipo " + tipo + " nao declarado");
                            escopoAtual.adicionar(identificador, TabelaDeSimbolos.TipoLA.INVALIDO);
                        }
                        break;
                }
            }
        }
        return super.visitDeclaracao_local(ctx);
    }


    @Override
    public Void visitCmd(SemanticoParser.CmdContext ctx) {
        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        if (ctx.cmdLeia() != null) {
            for (var ident : ctx.cmdLeia().identificador()) {
                LaSemanticoUtils.verificarTipo(escopoAtual, ident);
            }
        }
        if (ctx.cmdAtribuicao() != null) {    
            var esquerda = LaSemanticoUtils.verificarTipo(escopoAtual, ctx.cmdAtribuicao().identificador());
            //System.out.println("esquerda"+esquerda);
            var direita = LaSemanticoUtils.verificarTipo(escopoAtual, ctx.cmdAtribuicao().expressao());
            //System.out.println("direita"+direita);
            var atribuition = ctx.cmdAtribuicao().getText().split("<-"); //ponteiros
            if (!LaSemanticoUtils.verificarTipo(esquerda, direita) && !atribuition[0].contains("^")) { //
                LaSemanticoUtils.adicionarErroSemantico(ctx.cmdAtribuicao().identificador().IDENT(0).getSymbol(),"atribuicao nao compativel para " + ctx.cmdAtribuicao().identificador().getText());
            }
        }
        return super.visitCmd(ctx);
    } 

    @Override
    public Void visitExp_aritmetica(SemanticoParser.Exp_aritmeticaContext ctx){
        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        LaSemanticoUtils.verificarTipo(escopoAtual, ctx);
        return super.visitExp_aritmetica(ctx);
    }

}
