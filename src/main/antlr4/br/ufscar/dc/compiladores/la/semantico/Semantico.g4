grammar Semantico;

//ANALISADOR LEXICO
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


NUM_INT: ('0'..'9')+; // Inteiros

NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?; //Reais

IDENT: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

WS :   ( ' ' | '\t' | '\r' | '\n') {skip();};

CADEIA: '"' (~('\n'))*? '"';

ERRO_CADEIA: '"' (~('\n'|'"'))*? '\n';

COMENTARIO:   '{' ~('\n'|'\r')*? '}' {skip();};

ERRO_COMENTARIO: '{' ~('\n'|'}')*? '\n';

//OP_RELACIONAL	:	'>' | '>=' | '<' | '<=' | '<>' | '=';
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


//ANALISADOR SINTATICO

programa: declaracoes ALGORITMO corpo FIM_ALGORITMO;

declaracoes: (declaracao_local | declaracao_global)*;

declaracao_local: DECLARE variavel | CONSTANTE IDENT ':' tipo_basico '=' valor_constante | TIPO IDENT ':' registro;

variavel: identificador (',' identificador)* ':' tipo;

identificador: IDENT ('.' IDENT)* ('[' exp_aritmetica ']')*;

tipo: registro | tipo_estendido;

tipo_basico: LITERAL | INTEIRO | REAL | LOGICO;

tipo_estendido: '^'? (tipo_basico | IDENT);

valor_constante: CADEIA | NUM_INT | NUM_REAL | VERDADEIRO | FALSO;    

registro: REGISTRO variavel* FIM_REGISTRO;

declaracao_global: PROCEDIMENTO IDENT '(' parametros? ')' declaracao_local* cmd* FIM_PROCEDIMENTO 
    | FUNCAO IDENT '(' parametros? ')' ':' tipo_estendido declaracao_local* cmd* FIM_FUNCAO;

parametro: VAR? identificador (',' identificador)* ':' tipo_estendido;

parametros: parametro (',' parametro)*;

corpo: declaracao_local* cmd*;


// Comandos
cmd: cmdLeia | cmdEscreva | cmdSe | cmdCaso | cmdPara | cmdEnquanto | cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne;

cmdLeia: LEIA '(' '^'? identificador (',' '^'? identificador)* ')';
cmdEscreva: ESCREVA '(' expressao (',' expressao)* ')';
cmdSe: SE expressao ENTAO cmd* (SENAO cmd*)? FIM_SE;
cmdCaso: CASO exp_aritmetica SEJA selecao (SENAO cmd*)? FIM_CASO;
cmdPara: PARA IDENT '<-' exp_aritmetica ATE exp_aritmetica FACA cmd* FIM_PARA;
cmdEnquanto: ENQUANTO expressao FACA cmd* FIM_ENQUANTO;
cmdFaca: FACA cmd* ATE expressao;
cmdAtribuicao: '^'? identificador '<-' expressao;
cmdChamada: IDENT '(' expressao (',' expressao)* ')';
cmdRetorne: RETORNE expressao;


selecao: item_selecao*;

item_selecao: constantes ':' cmd*;

constantes: numero_intervalo (',' numero_intervalo)*;

numero_intervalo: op_unario? NUM_INT ('..' op_unario? NUM_INT)?;

op_unario: '-';

// Expressões Aritméticas
exp_aritmetica: termo (op1 termo)*;

termo: fator (op2 fator)*;

fator: parcela (op3 parcela)*;

op1: '+' | '-';
op2: '*' | '/';
op3: '%';
 
parcela: op_unario? parcela_unario | parcela_nao_unario;

parcela_unario: '^'? identificador | IDENT '(' expressao (',' expressao)* ')' | NUM_INT | NUM_REAL | '(' expressao ')';

parcela_nao_unario: '&' identificador | CADEIA;


// Expressões relacionais
exp_relacional: exp_aritmetica (op_relacional exp_aritmetica)?;

op_relacional: '=' | '<>' | '>=' | '<=' | '>' | '<';

expressao: termo_logico (op_logico_1 termo_logico)*;

termo_logico: fator_logico (op_logico_2 fator_logico)*;

fator_logico: NAO? parcela_logica;

parcela_logica: ( VERDADEIRO | FALSO ) | exp_relacional;

op_logico_1: OU;

op_logico_2: E;