grammar Sintatico;

//Palavras chave
DECLARE: 'declare';
ALGORITMO: 'algoritmo';
INTEIRO: 'inteiro';
REAL: 'real';
TIPO: 'tipo';
VAR: 'var';
LEIA: 'leia';
ESCREVA: 'escreva';
SE: 'se';
ENTAO: 'entao';
SENAO: 'senao';
FIM_SE: 'fim_se';
ENQUANTO: 'enquanto';
FIM_ENQUANTO: 'fim_enquanto';
FIM_ALGORITMO: 'fim_algoritmo';
E: 'e';
OU: 'ou';
LITERAL: 'literal';
NAO: 'nao';
LOGICO: 'logico';
CASO: 'caso';
FIM_CASO: 'fim_caso';
SEJA: 'seja';
PARA: 'para';
FIM_PARA: 'fim_para';
FACA: 'faca';
ATE: 'ate';
REGISTRO: 'registro';
FIM_REGISTRO: 'fim_registro';
PROCEDIMENTO: 'procedimento';
FIM_PROCEDIMENTO: 'fim_procedimento';
RETORNE: 'retorne';
FUNCAO: 'funcao';
FIM_FUNCAO: 'fim_funcao';
CONSTANTE: 'constante';
FALSO: 'falso';
VERDADEIRO: 'verdadeiro';


NUM_INT: ('0'..'9')+;

NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;

IDENT: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

WS :   ( ' ' | '\t' | '\r' | '\n') {skip();};

CADEIA: '"' (~('\n'))*? '"';

ERRO_CADEIA: '"' (~('\n'|'"'))*? '\n';

COMENTARIO:   '{' ~('\n'|'\r')*? '}' {skip();};

ERRO_COMENTARIO: '{' ~('\n'|'}')*? '\n';

//OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '=';
MAIOR: '>';
MAIORIGUAL: '>=';
MENOR: '<';
MENORIGUAL: '<=';
DIFERENTE: '<>';
IGUAL: '=';

//OP_ARIT	:	'+' | '-' | '*' | '/' | '%';
SOMA: '+';
SUBTRACAO: '-';
MULTIPLICACAO: '*';
DIVICAO: '/';
MOD: '%';

DELIM:	':';

ABREPAR:	'(';

FECHAPAR:	')';

ABRECAHVE: '[';

FECHACHAVE: ']';

VIRGULA	:	',';

ATRIBUICAO: '<-';

ENDERECO: '&';

INTERVALO: '..';

PONTO: '.';

PONTEIRO: '^';

ERRO: .;



// Regra de definição do espaço do algorítmo, que se inicia após as declarações de variáveis.
programa
    : declaracoes 'algoritmo' corpo 'fim_algoritmo'
    ;

// Regra de definição dos diferentes tipos de declarações de variáveis e funções.
declaracoes
    : (declaracao_variaveis | declaracao_funcoes)*
    ;

// Regra de declaração de variáveis.
declaracao_variaveis
    : 'declare' variavel 
    | 'constante' IDENT ':' tipo_basico '=' valor_constante 
    | 'tipo' IDENT ':' registro
    ;
variavel
    : identificador (',' identificador)* ':' tipo
    ;

// Regra de declaração de um vetor.
identificador
    : IDENT ('.' IDENT)* ('[' exp_aritmetica ']')*
    ;

// Regra de declaração de variáveis "complexas", como "estruturas" e "ponteiros".
tipo
    : registro 
    | tipo_variavel
    ;

// Regra de declaração dos tipos básicos de variáveis.
tipo_basico
    : LITERAL
    | INTEIRO 
    | REAL 
    | LOGICO
    ;

// Regra de declaração de um ponteiro.
tipo_variavel
    : '^'? (tipo_basico | IDENT)
    ;

// Regra de declaração de valores constantes.
valor_constante
    : CADEIA 
    | NUM_INT 
    | NUM_REAL 
    | VERDADEIRO 
    | FALSO
    ;    

// Regra de declaração de "estrutura de dados".
registro
    : 'registro' variavel* 'fim_registro'
    ;

// Regra de declaração de parâmetros de uma função.
parametro
    : 'var'? identificador (',' identificador)* ':' tipo_variavel
    ;

parametros
    : parametro (',' parametro)*
    ;

// Regra de declaração de funções e procedimentos.
declaracao_funcoes
    : 'procedimento' IDENT '(' parametros? ')' declaracao_variaveis* cmd* 'fim_procedimento' 
    | 'funcao' IDENT '(' parametros? ')' ':' tipo_variavel declaracao_variaveis* cmd* 'fim_funcao'
    ;

// Regra de definição do corpo de uma função ou procedimento.
corpo
    : declaracao_variaveis* cmd*
    ;

// Regras de definições de comandos da linguagem.
cmd
    : cmdLeia 
    | cmdEscreva 
    | cmdSe 
    | cmdCaso 
    | cmdPara 
    | cmdEnquanto 
    | cmdFaca 
    | cmdAtribuicao 
    | cmdChamada 
    | cmdRetorne
    ;
cmdLeia
    : 'leia' '(' '^'? identificador (',' '^'? identificador)* ')'
    ;
cmdEscreva
    : 'escreva' '(' expressao (',' expressao)* ')'
    ;
cmdSe
    : 'se' expressao 'entao' cmd* ('senao' cmd*)? 'fim_se'
    ;
cmdCaso
    : 'caso' exp_aritmetica 'seja' selecao ('senao' cmd*)? 'fim_caso'
    ;
cmdPara
    : 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' cmd* 'fim_para'
    ;
cmdEnquanto
    : 'enquanto' expressao 'faca' cmd* 'fim_enquanto'
    ;
cmdFaca
    : 'faca' cmd* 'ate' expressao
    ;
cmdAtribuicao
    : '^'? identificador '<-' expressao
    ;
cmdChamada
    : IDENT '(' expressao (',' expressao)* ')'
    ;
cmdRetorne
    : 'retorne' expressao
    ;

// Regras auxiliares para definição de seleção do valor para o comando "Caso".
selecao
    : item_selecao*
    ;
item_selecao
    : constantes ':' cmd*
    ;
constantes
    : numero_intervalo (',' numero_intervalo)*
    ;
numero_intervalo
    : op_unario? NUM_INT ('..' op_unario? NUM_INT)?
    ;

// Regra para definir se o número da regra do comando "Caso" é negativo.
op_unario
    : '-'
    ;

// Regras de definição de operações aritméticas, separadas em grupo para definir a ordem de prioridades das operações.
exp_aritmetica
    : termo (op1 termo)*
    ;
termo
    : fator (op2 fator)*
    ;
fator
    : parcela (op3 parcela)*
    ;
op1
    : '+' | '-'
    ;
op2
    : '*' | '/'
    ;
op3
    : '%'
    ;

// Regras de definição de expressões aritméticas, com variáveis, ou números constantes. 
parcela
    : op_unario? parcela_unario | parcela_nao_unario
    ;
parcela_unario
    : '^'? identificador
	| IDENT '(' expressao (',' expressao)* ')'
	| NUM_INT
	| NUM_REAL
	| '(' expressao ')'
    ;

// Regra de definição de recuperação do valor de um endereço da variável.
parcela_nao_unario
    : '&' identificador | CADEIA
    ;

// Regras de definição de expressões relacionais.
exp_relacional
    : exp_aritmetica (op_relacional exp_aritmetica)?
    ;
op_relacional
    : '=' | '<>' | '>=' | '<=' | '>' | '<'
    ;
expressao
    : termo_logico (op_logico_1 termo_logico)*
    ;
termo_logico
    : fator_logico (op_logico_2 fator_logico)*
    ;
fator_logico
    : 'nao'? parcela_logica
    ;
parcela_logica
    : ( 'verdadeiro' | 'falso' )
	| exp_relacional
    ;
op_logico_1
    : 'ou'
    ;
op_logico_2
    : 'e'
    ;