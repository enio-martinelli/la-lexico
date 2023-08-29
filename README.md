# Construção de Compiladores T5
## Implementação de parte de um gerador de código para a linguagem LA (Linguagem Algorítmica) desenvolvida pelo prof. Jander, no âmbito do DC/UFSCar

## Informações do Aluno
- Nome: Enio Martinelli
- RA: 790891

## Compilação do Projeto
Para compilar o projeto, é necessário ter o Maven instalado. Em seguida, execute o seguinte comando na raiz do projeto:  
```
mvn package
```  
Isso criará um arquivo JAR executável na pasta `target` com as dependências necessárias.

ATENÇÃO! Certifique-se de ter o compilador de linguagem C `gcc` instalado e configurado em sua máquina. 

## Execução do Programa
Após a compilação, para executar o programa, utilize o seguinte comando:  
```
java -jar target/la-semantico2-1.0-SNAPSHOT-jar-with-dependencies.jar [arquivo_de_entrada.txt] [arquivo_de_saida.txt]
```  

## Testes Automáticos (fonte: [https://github.com/dlucredio/compiladores-corretor-automatico](https://github.com/dlucredio/compiladores-corretor-automatico))
Para executar os testes automáticos do compilador, siga os passos abaixo:

1. Certifique-se de ter o compilador GCC instalado no seu sistema.

2. Compile o projeto utilizando o Maven, conforme descrito na seção anterior.

3. Utilize o seguinte comando para executar os testes:  
   ```
   java -jar teste/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar "java -jar [caminho_completo_para_o_executável.jar]" gcc teste/temp teste/casos-de-teste "790891" "t5"
   ```  
   
Substitua `[caminho_completo_para_o_executável.jar]` pelo caminho completo para o arquivo JAR gerado na etapa de compilação.  
Isso executará os testes automáticos no compilador com os casos de teste fornecidos e exibirá os resultados.  
Dúvidas sobre a execução dos testes automáticos acesse o link do repositório da disciplina indicado acima.







