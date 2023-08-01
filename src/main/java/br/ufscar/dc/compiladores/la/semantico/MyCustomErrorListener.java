package br.ufscar.dc.compiladores.la.semantico;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class MyCustomErrorListener implements ANTLRErrorListener {
    //FileOutputStream fos;
    PrintStream ps;
    Boolean erroSintatico = false;
    public MyCustomErrorListener(FileOutputStream fos) {
        //this.fos = fos;   
        this.ps = new PrintStream(fos);
        System.setOut(this.ps);
    }

    @Override
    public void	reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }
    
    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Re
        if(!erroSintatico){
            Token t = (Token) offendingSymbol;

            // Modificação da string "EOF" para conformidade com os casos de testes
            String tText = t.getText();
            if (tText == "<EOF>"){
                tText = "EOF";
            }
    
            System.out.println("Linha "+line+": erro sintatico proximo a "+ tText);
            
            erroSintatico = true;
        }
    }
}
