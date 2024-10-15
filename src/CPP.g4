grammar CPP;

/*
 * Lexer Rules
 */
DEC: 'DECLARACOES';
ALG: 'ALGORITMO';

// Palavras-chave
TIPO: 'int' |'real'|'bool'|'letra'|'palavra';
ENTRADA: 'entrada';
SAIDA: 'saida';
SE: 'se';
SENAO: 'senão';
ENQUANTO: 'enquanto';
FAZER: 'faça';
RETORNAR: 'retornar';
OU: 'ou';
E: 'e';

// Operadores
OP_ARIT: '+'|'-'|'*'|'/';
OP_COND: '>'|'<'|'=='|'!=';
OP_ATR: '=';

// Outros símbolos
COLON: ':';
PIPE: '|';
VIRGULA: ',';
LPAREN: '(';
RPAREN: ')';
NUM: DIGITO+('.'DIGITO+)?;
// Literais
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z]; 

// Identificadores (nomes de variáveis e funções)
ID: LETRA(DIGITO | LETRA)*;

// Ignorar espaços em branco e novas linhas
WS: [ \t\r\n]+ -> skip;
