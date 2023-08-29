package br.ufscar.dc.compiladores.la.semantico2;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.la.semantico2.Semantico2Parser.ExpressaoContext;
import br.ufscar.dc.compiladores.la.semantico2.TabelaDeSimbolos.TipoLA;

public class LaSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>(); //Lista de erros.
    
    // Função para adicionar erros semânticos.
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

     //Validar atribuição de valores
    public static boolean verificarTipo(TabelaDeSimbolos.TipoLA tipo1, TabelaDeSimbolos.TipoLA tipo2) {
        if (tipo1 == tipo2){
            return true;
        }else if ((tipo1 == TabelaDeSimbolos.TipoLA.INTEIRO && tipo2 == TabelaDeSimbolos.TipoLA.REAL) ||
                (tipo2 == TabelaDeSimbolos.TipoLA.INTEIRO && tipo1 == TabelaDeSimbolos.TipoLA.REAL)){
            return true;
        }else if((tipo1 == TabelaDeSimbolos.TipoLA.PONTEIRO_I && tipo2 == TabelaDeSimbolos.TipoLA.INTEIRO) ||
                (tipo1 == TabelaDeSimbolos.TipoLA.PONTEIRO_R && tipo2 == TabelaDeSimbolos.TipoLA.REAL) ||
                (tipo1 == TabelaDeSimbolos.TipoLA.PONTEIRO_L && tipo2 == TabelaDeSimbolos.TipoLA.LITERAL) ||
                (tipo1 == TabelaDeSimbolos.TipoLA.PONTEIRO_LO && tipo2 == TabelaDeSimbolos.TipoLA.LOGICO)){
            return true;
        }else if(tipo1 == TabelaDeSimbolos.TipoLA.INVALIDO || tipo2 == TabelaDeSimbolos.TipoLA.INVALIDO){ //variavel INVALIDA ja foi reportada como algum erro antes, por isso retorna true
            return true;
        }
        return false;
    }

    //recuperar tipo do retorno da funcao
    public static TabelaDeSimbolos.TipoLA retornaTipo(String retorno){
        switch(retorno){
                    case "inteiro":
                        return TabelaDeSimbolos.TipoLA.INTEIRO;
                    case "literal":
                        return TabelaDeSimbolos.TipoLA.LITERAL;
                    case "real":
                        return TabelaDeSimbolos.TipoLA.REAL;
                    case "logico":
                        return TabelaDeSimbolos.TipoLA.LOGICO;
                    case "^logico":
                        return TabelaDeSimbolos.TipoLA.PONTEIRO_LO;
                    case "^real":
                        return TabelaDeSimbolos.TipoLA.PONTEIRO_R;
                    case "^literal":
                        return TabelaDeSimbolos.TipoLA.PONTEIRO_L;
                    case "^inteiro":
                        return TabelaDeSimbolos.TipoLA.PONTEIRO_I;
                    default:
                        return TabelaDeSimbolos.TipoLA.REGISTRO;
                }
    }
  
    //tipo básico.
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.IdentificadorContext ctx){
        String identificador = ctx.getText();
        String reduzido = "";
        int indexColchete = identificador.indexOf('['); //pegar a posição do "["
        reduzido += indexColchete != -1 ? identificador.substring(0, indexColchete) : identificador; //remover tudo que estiver a partir de '['
        if(tabela.existe(reduzido)){
            TipoLA t = tabela.verificar((reduzido));
            switch(t){
                case INTEIRO:
                    return TabelaDeSimbolos.TipoLA.INTEIRO;
                    
                case REAL:
                    return TabelaDeSimbolos.TipoLA.REAL;
                    
                case LITERAL:
                    return TabelaDeSimbolos.TipoLA.LITERAL;
                    
                case LOGICO:
                    return TabelaDeSimbolos.TipoLA.LOGICO;

                case REGISTRO:
                    return TabelaDeSimbolos.TipoLA.REGISTRO;

                case FUNCAO:
                    return TabelaDeSimbolos.TipoLA.FUNCAO;

                case PONTEIRO_LO:
                    return TabelaDeSimbolos.TipoLA.PONTEIRO_LO;

                case PONTEIRO_L:
                    return TabelaDeSimbolos.TipoLA.PONTEIRO_L;

                case PONTEIRO_R:
                    return TabelaDeSimbolos.TipoLA.PONTEIRO_R;

                case PONTEIRO_I:
                    return TabelaDeSimbolos.TipoLA.PONTEIRO_I;
                    
            }
        }else{
            adicionarErroSemantico(ctx.IDENT(0).getSymbol(),"identificador " + reduzido + " nao declarado");
        }
        
        return TabelaDeSimbolos.TipoLA.INVALIDO;
    }

    //expressão aritmética
     public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        for (var te : ctx.termo()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, te);
            if (ret == null) {
                ret = aux;
            } else if (!verificarTipo(ret, aux)) {
                //adicionarErroSemantico(ctx.start, "Expressao " + ctx.getText() + " contem tipos incompativeis");
                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        }
        return ret;
    }

    //termo
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.TermoContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        for (var fa : ctx.fator()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, fa);
            if (ret == null) {
                ret = aux;
            } else if (!verificarTipo(ret, aux)) {
                //adicionarErroSemantico(ctx.start, "Termo " + ctx.getText() + " contem tipos incompativeis");
                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        }
        return ret;
    }

    //fator
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.FatorContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        for (var pa : ctx.parcela()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, pa);
            if (ret == null) {
                ret = aux;
            } else if (!verificarTipo(ret, aux)) {
                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        }
        return ret;
    }

    //parcela
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.ParcelaContext ctx) {

        if (ctx.parcela_unario() != null) {
            return verificarTipo(tabela, ctx.parcela_unario());
        } else {
            return verificarTipo(tabela, ctx.parcela_nao_unario());
        }
    }

    //parcela unária
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.Parcela_unarioContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        if (ctx.NUM_INT() != null) {
            return TabelaDeSimbolos.TipoLA.INTEIRO;
        }
        if (ctx.NUM_REAL() != null) {
            return TabelaDeSimbolos.TipoLA.REAL;
        }
        if (ctx.IDENT() != null) {
            for (var exp : ctx.expressao()) {
                TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, exp);
                if (ret == null) {
                    ret = aux;
                } else if (!verificarTipo(ret, aux)) {
                    ret = TabelaDeSimbolos.TipoLA.INVALIDO;
                }
            }
            if (tabela.existe(ctx.IDENT().getText())) { //recuperar o tipo de retorno da funcao
                ret = retornaTipo(tabela.getRetorno(ctx.IDENT().getText()));
                String funcao = ctx.IDENT().getText();
                TabelaDeSimbolos parametrosFuncao = tabela.getArgumentos(funcao);
                ArrayList<TabelaDeSimbolos.TipoLA> tiposDosParametros = new ArrayList<>();

                for (ExpressaoContext exp : ctx.expressao()) {
                    tiposDosParametros.add(verificarTipo(tabela, exp));
                }

                if (!parametrosFuncao.verificarParamentros(tiposDosParametros)) {
                    adicionarErroSemantico(ctx.IDENT().getSymbol(), "incompatibilidade de parametros na chamada de " + funcao);
                }
            }
        }else if (ctx.expressao() != null) {
            for (var exp : ctx.expressao()) {
                return verificarTipo(tabela, exp);
            }
        }
        if (ctx.identificador() != null) {
            return verificarTipo(tabela, ctx.identificador());
        }
        return ret;
    }

    //parcela não unária
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.Parcela_nao_unarioContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        if (ctx.CADEIA() != null) {
            ret = TabelaDeSimbolos.TipoLA.LITERAL;
        }
        else{
            ret = verificarTipo(tabela, ctx.identificador());
            if (ctx.getText().contains("&")) {
                switch(ret){
                    case LOGICO:
                        return TabelaDeSimbolos.TipoLA.PONTEIRO_LO;
                    case LITERAL:
                        return TabelaDeSimbolos.TipoLA.PONTEIRO_L;
                    case REAL:
                        return TabelaDeSimbolos.TipoLA.PONTEIRO_R;
                    case INTEIRO:
                        return TabelaDeSimbolos.TipoLA.PONTEIRO_I;
                }
            }
        }
        return ret;
    }

    //expressão relacional
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.Exp_relacionalContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;
        if (ctx.exp_aritmetica().size() == 1){
            for (var ea : ctx.exp_aritmetica()) {
                TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, ea);
                if (ret == null) {
                    ret = aux;
                } else if (!verificarTipo(ret, aux)) {
                    ret = TabelaDeSimbolos.TipoLA.INVALIDO;
                }
            } 
        }else{
            for (var ea : ctx.exp_aritmetica()) {
                verificarTipo(tabela, ea);
            }
            return TabelaDeSimbolos.TipoLA.LOGICO;
        }
        return ret;
    }

     //expressão
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.ExpressaoContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;
        for (var tl : ctx.termo_logico()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, tl);
            if (ret == null) {
                ret = aux;
            } else if (!verificarTipo(ret, aux)) {
                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        }
        return ret;
    }

    //termo lógico
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.Termo_logicoContext ctx){
        TabelaDeSimbolos.TipoLA ret = null;
        for (var fL : ctx.fator_logico()){
            TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, fL);
            if (ret == null) {
                ret = aux;
            } else if (!verificarTipo(ret, aux)) {
                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        }
        return ret;
    }

    //fator lógico
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.Fator_logicoContext ctx) {
        return verificarTipo(tabela, ctx.parcela_logica());
    }

    //parcela lógica
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, Semantico2Parser.Parcela_logicaContext ctx) {
        if (ctx.exp_relacional() != null) {
            return verificarTipo(tabela, ctx.exp_relacional());
        } else {
            return TabelaDeSimbolos.TipoLA.LOGICO;
        }
    }
    
}