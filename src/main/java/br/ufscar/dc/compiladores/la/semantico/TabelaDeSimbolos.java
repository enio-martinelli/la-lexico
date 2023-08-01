package br.ufscar.dc.compiladores.la.semantico;

import java.util.HashMap;

public class TabelaDeSimbolos {
    public enum TipoLA {
        INTEIRO,
        REAL,
        LITERAL,
        LOGICO,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoLA tipo;
        

        private EntradaTabelaDeSimbolos(String nome, TipoLA tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    private final HashMap<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoLA tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoLA verificar(String nome) {
        return tabela.get(nome).tipo;
    }   
}