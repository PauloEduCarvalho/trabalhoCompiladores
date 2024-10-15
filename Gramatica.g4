grammar Gramatica; 

inicio: Letra OpAtr somaSubExp; 
somaSubExp: multDivExpr (OpSom multDivExpr)*;
multDivExpr: finalExpr (OpMul finalExpr)*;
finalExpr: digitExpr | Letra | AP somaSubExp FP;

digitExpr: (Digito)+;
OpSom: '+'|'-';
OpMul: '*'|'/';
OpAtr: '=';
Letra: [a-z];
Digito: [0-9];
AP: '(';
FP: ')';

WS: [ \t\r\n]+ -> skip;