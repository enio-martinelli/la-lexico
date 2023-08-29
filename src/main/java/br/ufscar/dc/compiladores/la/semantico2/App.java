package br.ufscar.dc.compiladores.la.semantico2;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.la.semantico2.Semantico2Parser.ProgramaContext;

public class App {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Uso: java br.ufscar.dc.compiladores.la.semantico.App entrada.txt saida.txt");
            System.exit(1);
        }

        Boolean erroLexico = false; //Variável de controle para saber se houve erro léxico

        try {
            CharStream cs = CharStreams.fromFileName(args[0]);
            Semantico2Lexer lex = new Semantico2Lexer(cs);

            // Redirecionar a saída para o arquivo de texto
            FileOutputStream fos = new FileOutputStream(args[1]);
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);

            Token t = null;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String tnome = Semantico2Lexer.VOCABULARY.getDisplayName(t.getType());

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
                Semantico2Parser parser = new Semantico2Parser(tokens);
        
                parser.removeErrorListeners(); // Remove o ErroListener padrão (default)
                MyCustomErrorListener mcel = new MyCustomErrorListener(fos); 
                parser.addErrorListener(mcel); // Adiciona o ErroListener customizado
        
                parser.programa();
            }

            //Análise semântica (comentar para testar outros trabalhos)
            lex.reset();
            CommonTokenStream tokens = new CommonTokenStream(lex);
            Semantico2Parser parser = new Semantico2Parser(tokens);

            parser.removeErrorListeners(); //Necessário para correção automática do t3
            
            ProgramaContext arvore = parser.programa();
            LaSemantico la = new LaSemantico();

            la.visitPrograma(arvore);
            //if(LaSemanticoUtils.errosSemanticos.isEmpty()) System.out.println("Nao achou erro semantico");
            LaSemanticoUtils.errosSemanticos.forEach((s) -> System.out.println(s));

            System.out.println("Fim da compilacao"); //Comentar para testar o t1
            // Fechar o arquivo após concluir a análise semantica
            ps.close();
            fos.close();
        } catch (IOException ex) {
            System.out.println("Erro ao ler o arquivo: " + ex.getMessage());
        }

    }
}

