package br.ufscar.dc.compiladores.la.sintatico;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class App {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Uso: java br.ufscar.dc.compiladores.la.sintatico.App entrada.txt saida.txt");
            System.exit(1);
        }

        Boolean erroLexico = false; //Variável de controle para saber se houve erro léxico

        try {
            CharStream cs = CharStreams.fromFileName(args[0]);
            SintaticoLexer lex = new SintaticoLexer(cs);

            // Redirecionar a saída para o arquivo de texto
            FileOutputStream fos = new FileOutputStream(args[1]);
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);

            Token t = null;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String tnome = SintaticoLexer.VOCABULARY.getDisplayName(t.getType());

                switch(tnome){
                    case "ERRO": //mensagem para erro de simbolos nao identificados
                        System.out.println("Linha "+t.getLine()+": "+t.getText()+" - simbolo nao identificado");
                        erroLexico = true;
                        break;
                    case "ERRO_CADEIA": //mensagem para cadeia nao fechada
                        System.out.println("Linha "+t.getLine()+": cadeia literal nao fechada");
                        erroLexico = true;
                        break;
                    case "ERRO_COMENTARIO": //mensagem para comentario nao fechado
                        System.out.println("Linha "+t.getLine()+": comentario nao fechado");
                        erroLexico = true;
                        break;
                    default: //nao houve erro, imprimir token
                        //Descomentar a linha abaixo para testar o t1
                        //System.out.println("<'" + t.getText() + "'," + tnome + ">");
                }

                if(tnome == "ERRO" | tnome == "ERRO_CADEIA" | tnome == "ERRO_COMENTARIO"){break;}
            }

            //Comentar o bloco if abaixo para testar o t1
            if (!erroLexico) {
                lex.reset();
                CommonTokenStream tokens = new CommonTokenStream(lex);
                SintaticoParser parser = new SintaticoParser(tokens);
        
                parser.removeErrorListeners(); // Remove o ErroListener padrão (default)
                MyCustomErrorListener mcel = new MyCustomErrorListener(fos); 
                parser.addErrorListener(mcel); // Adiciona o ErroListener customizado
        
                parser.programa();
            }

            System.out.println("Fim da compilacao"); //Comentar para testar o t1
            // Fechar o arquivo após concluir a análise sintática
            ps.close();
            fos.close();
        } catch (IOException ex) {
            System.out.println("Erro ao ler o arquivo: " + ex.getMessage());
        }

    }
}

