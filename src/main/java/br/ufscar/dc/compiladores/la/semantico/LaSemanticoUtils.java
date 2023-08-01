package br.ufscar.dc.compiladores.la.semantico;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.la.semantico.TabelaDeSimbolos.TipoLA;

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
        }
        return false;
    }
  
    //tipo básico.
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.IdentificadorContext ctx){
        var identificador = ctx.getText();

        if(tabela.existe(identificador)){
            TipoLA t = tabela.verificar((identificador));
            switch(t){
                case INTEIRO:
                    return TabelaDeSimbolos.TipoLA.INTEIRO;
                    
                case REAL:
                    return TabelaDeSimbolos.TipoLA.REAL;
                    
                case LITERAL:
                    return TabelaDeSimbolos.TipoLA.LITERAL;
                    
                case LOGICO:
                    return TabelaDeSimbolos.TipoLA.LOGICO;
                    
            }
        }else{
            adicionarErroSemantico(ctx.IDENT(0).getSymbol(),"identificador " + identificador + " nao declarado");
        }

        return TabelaDeSimbolos.TipoLA.INVALIDO;

    }

    //expressão aritmética
     public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.Exp_aritmeticaContext ctx) {
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
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.TermoContext ctx) {
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
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.FatorContext ctx) {
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
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.ParcelaContext ctx) {

        if (ctx.parcela_unario() != null) {
            return verificarTipo(tabela, ctx.parcela_unario());
        } else {
            return verificarTipo(tabela, ctx.parcela_nao_unario());
        }
    }

    //parcela unária
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.Parcela_unarioContext ctx) {
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
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.Parcela_nao_unarioContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        if (ctx.CADEIA() != null) {
            ret = TabelaDeSimbolos.TipoLA.LITERAL;
        }
        return ret;
    }

    //expressão relacional
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.Exp_relacionalContext ctx) {
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
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.ExpressaoContext ctx) {
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
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.Termo_logicoContext ctx){
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
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.Fator_logicoContext ctx) {
        return verificarTipo(tabela, ctx.parcela_logica());
    }

    //parcela lógica
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, SemanticoParser.Parcela_logicaContext ctx) {
        if (ctx.exp_relacional() != null) {
            return verificarTipo(tabela, ctx.exp_relacional());
        } else {
            return TabelaDeSimbolos.TipoLA.LOGICO;
        }
    }
    
}