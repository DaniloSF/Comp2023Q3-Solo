grammar CompIsiLang;

programa: 'programa' decl+ block 'fimprog.';

decl: tipo lista_var PF;

block: (cmd PF)+;

tipo: 'INTEGER' | 'REAL';

lista_var: ID ( VIRG ID)*;

cmd: cmdAttr | cmdRead | cmdWrite | cmdIf;

cmdIf:
	'se' AP logicExpr FP 'entao' AC block FC (
		'senao' AC block FC
	)?;

cmdRead: 'leia' AP ID FP;

cmdWrite: 'escreva' AP ( ID | TEXT) FP;

cmdAttr: ID ATTR expr;

expr: termo exprl*;

exprl: op = (SUM | SUB) termo;

termo: fator termol*;

termol: op = (MUL | DIV) fator;

fator: number | ID | AP expr FP;

logicExpr: expr op = OPREL expr;

fragment DIGIT: [0-9];
number: INTEGER | REAL;
REAL: DIGIT+ '.' DIGIT+;
INTEGER: DIGIT+;

TEXT: '"' ([a-z] | [A-Z] | DIGIT | ' ' | '\t' | '!' | '-')* '"';

ATTR: ':=';

SUM: '+';
SUB: '-';
MUL: '*';
DIV: '/';

OPREL: '<' | '>' | '<=' | '>=' | '!=' | '==';

ID: [a-z] ([a-z] | [A-Z] | DIGIT)*;

VIRG: ',';

PF: '.';

AP: '(';
FP: ')';

AC: '{';
FC: '}';

BLANK: (' ' | '\t' | '\n' | '\r') -> skip; 