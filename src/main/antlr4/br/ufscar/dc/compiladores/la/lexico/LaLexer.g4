lexer grammar LaLexer;

PALAVRA_CHAVE 
	:	'declare' | 'algoritmo' | 'inteiro' | 'real' | 'tipo' | 'var' | 'leia' | 'escreva' | 'se' | 'entao' 
	| 'senao' | 'fim_se' | 'enquanto' | 'fim_enquanto' | 'fim_algoritmo' | 'e' | 'ou' | 'literal' | 'nao' 
	| 'logico' | 'caso' | 'fim_caso' | 'seja' | 'para' | 'fim_para' | 'faca' | 'ate' | 'registro' | 'fim_registro' 
	| 'procedimento' | 'fim_procedimento' | 'retorne' | 'funcao' | 'fim_funcao' | 'constante'| 'logico' | 'falso'
	| 'verdadeiro'
	; 
NUMINT	: ('+'|'-')?('0'..'9')+
	;
NUMREAL	: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?
	;
VARIAVEL : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	 ;
CADEIA 	: '\'' ( ESC_SEQ | ~('\''|'\\') )* '\''
	;
fragment
ESC_SEQ	: '\\\'';
COMENTARIO
    :   '%' ~('\n'|'\r')* '\r'? '\n' {skip();}
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '='
	;
OP_ARIT	:	'+' | '-' | '*' | '/'
	;
DELIM	:	':'
	;
ABREPAR :	'('
	;
FECHAPAR:	')'
	;