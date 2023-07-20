lexer grammar LaLexer;

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


NUM_INT	: ('0'..'9')+;

NUM_REAL	: ('0'..'9')+ ('.' ('0'..'9')+)?;

IDENT : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

WS  :   ( ' ' | '\t' | '\r' | '\n') {skip();};

CADEIA 	: '"' (~('\n'))*? '"';

ERRO_CADEIA : '"' (~('\n'|'"'))*? '\n';

COMENTARIO :   '{' ~('\n'|'\r')*? '}' {skip();};

ERRO_COMENTARIO: '{' ~('\n'|'}')*? '\n';

//OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '=';
MAIOR: '>';
MAIORIGUAL: '>=';
MENOR: '<';
MENORIGUAL: '<=';
DIFERENTE: '<>';
IGUAL: '=';

//OP_ARIT	:	'+' | '-' | '*' | '/';
SOMA: '+';
SUBTRACAO: '-';
MULTIPLICACAO: '*';
DIVICAO: '/';
MOD: '%';

DELIM	:	':';

ABREPAR :	'(';

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