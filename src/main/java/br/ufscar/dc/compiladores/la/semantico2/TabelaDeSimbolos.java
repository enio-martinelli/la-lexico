package br.ufscar.dc.compiladores.la.semantico2;

import java.util.ArrayList;
import java.util.HashMap;

public class TabelaDeSimbolos {
    public enum TipoLA {
        INTEIRO,
        REAL,
        LITERAL,
        LOGICO,
        PONTEIRO_LO,
        PONTEIRO_L,
        PONTEIRO_I,
        PONTEIRO_R,
        REGISTRO,
        FUNCAO,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoLA tipo;
        TabelaDeSimbolos argumentos;
        String retorno;
        

        private EntradaTabelaDeSimbolos(String nome, TipoLA tipo) {
            this.nome = nome;
            this.tipo = tipo;
            this.argumentos = null;
            this.retorno = null;
        }

        private EntradaTabelaDeSimbolos(String nome, TipoLA tipo, TabelaDeSimbolos argumentos, String retorno) {
            this.nome = nome;
            this.tipo = tipo;
            this.argumentos = argumentos;
            this.retorno = retorno;
        }
    }
    
    private final HashMap<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoLA tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }

    public void adicionar(String nome, TipoLA tipo, TabelaDeSimbolos argumentos, String retorno){
        if(tipo == TipoLA.REGISTRO){
            tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo, argumentos, null));
        }else if(tipo == TipoLA.FUNCAO){
            tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo, argumentos, retorno));
        }
    }
    
    public boolean existe(String nome) {
        if(nome.contains(".")){ //é registro
            var parametro = tabela;
            String[] reg = nome.split("\\.");

            for(String s : reg){
                if(!parametro.containsKey(s)) return false;
                else if(parametro.get(s).tipo == TipoLA.REGISTRO){ // registro dentro de registro
                    parametro = parametro.get(s).argumentos.tabela;
                }else break;
            }
            return true;
        }else{
            return tabela.containsKey(nome);
        }
    }
    
    public TipoLA verificar(String nome) {
        if(nome.contains(".")){ //é registro
            var parametro = tabela;
            String[] reg = nome.split("\\.");

            for(String s : reg){
                if(!parametro.containsKey(s)) break; 
                else if(parametro.get(s).tipo == TipoLA.REGISTRO){ // registro dentro de registro
                    parametro = parametro.get(s).argumentos.tabela;
                }else 
                    return parametro.get(s).tipo;
            }
            return TipoLA.INVALIDO;
        }else{
            return tabela.get(nome).tipo;
        }
    } 

    public TabelaDeSimbolos getArgumentos(String nome){
        return tabela.get(nome).argumentos;
    }

    public String getRetorno(String nome){
        return tabela.get(nome).retorno;
    }

    public boolean verificarParamentros(ArrayList<TabelaDeSimbolos.TipoLA> tipos){
        int cont = 0;
        
        if(tabela.size() != tipos.size())
            return false;
        for(EntradaTabelaDeSimbolos ets: tabela.values()){
            if(tipos.get(cont) != ets.tipo){
                return false;
            }
            cont++;
        }
        
        return true;
    }
    
}
    
    
