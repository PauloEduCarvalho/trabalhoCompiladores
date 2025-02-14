grammar CPP;

/*
 Regras Léxicas
*/
DEC         : 'DECLARACOES';
ALG         : 'ALGORITMO';

// Palavras-chave
TIPO        : 'int' | 'real' | 'bool' | 'letra' | 'palavra';
ENTRADA     : 'entrada';
SAIDA       : 'saida';
SE          : 'se';
SENAO       : 'senão';
ENQUANTO    : 'enquanto';
FAZER       : 'faça';
RETORNAR    : 'retornar';
OU          : 'ou';
E           : 'e';

// Operadores
OP_ARIT     : '+' | '-' | '*' | '/';
OP_COND     : '>' | '<' | '==' | '!=';
OP_ATR      : '=';

// Outros símbolos
COLON       : ':';
PIPE        : '|';
VIRGULA     : ',';
LPAREN      : '(';
RPAREN      : ')';
LCHAVE      : '{';
RCHAVE      : '}';
PONTO_VIRGULA : ';';

// Literais
INT         : DIGITO+ ;
REAL        : DIGITO+ '.' DIGITO+ ;
BOOL        : 'verdadeiro' | 'falso' ;
PALAVRA     : '"' (~'"')* '"' ;

// Identificadores
ID          : LETRA (DIGITO | LETRA)* ;

// Fragmentos
fragment DIGITO : [0-9];
fragment LETRA : [a-zA-Z];

// Ignorar espaços em branco e novas linhas
WS          : [ \t\r\n]+ -> skip;

/*
 Regras Sintáticas
*/

// Programa principal
programa
    : funcao+ EOF #NInicio;

// Definição de função
funcao
    : ID PIPE parametros PIPE LCHAVE comando* RCHAVE #NPrincipal;

// Parâmetros de função
parametros
    : (tipo ID (VIRGULA tipo ID)*)? ;

// Comandos gerais
comando
    : atribuicao
    | condicional
    | enquanto
    | retorno
    | chamadaFuncao PONTO_VIRGULA
    | expressao PONTO_VIRGULA
    | criacao ;

// Comando de atribuição
atribuicao
    : ID OP_ATR expressao PONTO_VIRGULA #NAtribuicao;

criacao
    : TIPO ID OP_ATR fator PONTO_VIRGULA #NCriacao;

// Comando de retorno
retorno
    : RETORNAR expressao PONTO_VIRGULA ;

// Estruturas de controle (agora "faça" é obrigatório!)
condicional
    : SE PIPE condicao PIPE FAZER LCHAVE comando* RCHAVE 
      (SENAO SE PIPE condicao PIPE FAZER LCHAVE comando* RCHAVE)* 
      (SENAO FAZER LCHAVE comando* RCHAVE)? ;

// Estrutura de repetição (também exige "faça")
enquanto
    : ENQUANTO PIPE condicao PIPE FAZER LCHAVE comando* RCHAVE ;

// Operadores lógicos
operadorLogico
    : OU
    | E ;    

// Condições e expressões
condicao
    : expressao (operadorComparacao expressao | operadorLogico expressao)* ;

// Expressões e termos
expressao
    : termo ((OP_ARIT) termo)* #NExpressao;

termo
    : fator ((OP_ARIT) fator)* ;

fator
    : INT
    | REAL
    | BOOL
    | PALAVRA
    | ID
    | LPAREN expressao RPAREN
    | chamadaFuncao ;

// Chamadas de função
chamadaFuncao
    : ID PIPE argumentos PIPE ;

// Argumentos de funções
argumentos
    : expressao (VIRGULA expressao)* #NArgumentos;

// Tipos e operadores
tipo
    : TIPO ;

operadorComparacao
    : OP_COND ;
