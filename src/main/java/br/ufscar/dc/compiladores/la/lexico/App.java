package br.ufscar.dc.compiladores.la.lexico;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class App {

    public static void main(String[] args) {
        /*if (args.length != 2) {
            System.err.println("Uso: java br.ufscar.dc.compiladores.la.lexico.App entrada.txt saida.txt");
            System.exit(1);
        }*/

        try {
            CharStream cs = CharStreams.fromFileName(args[0]);
            LaLexer lex = new LaLexer(cs);

            // Redirecionar a saída para o arquivo de texto
            FileOutputStream fos = new FileOutputStream(args[1]);
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);

            Token t = null;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String tnome = LaLexer.VOCABULARY.getDisplayName(t.getType());

                switch(tnome){
                    case "ERRO": 
                        System.out.println("Linha "+t.getLine()+": "+t.getText()+" - simbolo nao identificado");
                        break;
                    case "ERRO_CADEIA":
                        System.out.println("Linha "+t.getLine()+": cadeia literal nao fechada");
                        break;
                    case "ERRO_COMENTARIO":
                        System.out.println("Linha "+t.getLine()+": comentario nao fechado");
                        break;
                    default:
                        System.out.println("<'" + t.getText() + "'," + tnome + ">");
                }

                if(tnome.equals("ERRO") | tnome.equals("ERRO_CADEIA") | tnome.equals("ERRO_COMENTARIO")){break;}
            }

            // Fechar o arquivo após concluir a análise léxica
            ps.close();
            fos.close();
        } catch (IOException ex) {
            //System.out.println("Erro ao ler o arquivo: " + ex.getMessage());
        }
    }
}

