grammar TreeQL;
// Sorular
// 1. treename ile attribute name'ler ayrılmalı mıdır?
//
stats
    : COMMENT?
    (definition)* treeQuery EOF
    ;

definition
    : typeType VAR_NAME (ASSIGN assignmentExpr)? ';' 
    ;
assignmentExpr
    : expression
    | signed_number
    | json
    ;
treeQuery
    :
    selectQuery
    | joinQuery
    | mergeQuery
    | explodeQuery
    | LPAREN treeQuery RPAREN
    | rangeVariableDeclaration
    ;
selectQuery
    :
    SELECT treeExpression FROM treeQuery (WHERE selectExpression)?
    ;
joinQuery
    :
    JOIN treeQuery (COMMA treeQuery (ON selectExpression)? )+ 
    ;
mergeQuery
    :
    MERGE treeQuery (COMMA treeQuery (ON selectExpression)? conflictspec? )+
    ;
conflictspec
    : CONFORMIFEQUAL
    |   DERIVEALWAYS
    |   DERIVEIFNOTEQUAL
    |   TERMINATEIFNOTEQUAL
    |   TERMINATE
    |   OVERRIDE
    |   EVALUATE
;
explodeQuery
    :
    EXPLODE LPAREN treeExpression COMMA expression RPAREN
    ;

rangeVariableDeclaration
    :
    abstractTreeName (AS VAR_NAME)?
    ;
abstractTreeName
    :
    VAR_NAME
    ;
selectExpression
    :
    booleanExpression
    ;
expression
    :
    treeExpression
    | booleanExpression
;
booleanExpression
    :
    booleanOperand booleanOperator booleanOperand    
    ;

booleanOperand
: comparisonOperand comparisonOperator comparisonOperand
;
comparisonOperand
    :
    mathOperand mathOperator mathOperand
    ;
mathOperand
    : BOOLEAN_LITERAL
    | STRING_LITERAL
    | NUMERIC_LITERAL
    | LPAREN expression RPAREN 
    ;
treeExpression
    : 
    (STAR | treeElement) (COMMA treeElement)*
    ;
treeElement
    : 
    abstractTreeName DOT (VAR_NAME | STAR ) (AS VAR_NAME)?  
    | VAR_NAME (AS VAR_NAME)?
    ;
typeType
    : (complexType | primitiveType) ('[' ']')*
    ;
    
primitiveType
    : BOOLEAN
    | CHAR
    | BYTE
    | SHORT
    | INT
    | LONG
    | FLOAT
    | DOUBLE
    ;

complexType
	: TREE
	| STRING
	;	
json
    :
     json_value   
    ;
json_value
   : STRING_LITERAL
   | NUMBER
   | obj
   | arr
   | BOOLEAN_LITERAL
   | 'null'
   ;
obj
   : '{' pair (',' pair)* '}'
   | '{' '}'
   ;
pair
   : STRING_LITERAL ':' json_value
   ;
arr
   : '[' json_value (',' json_value)* ']'
   | '[' ']'
   ;

NUMBER
   : '-'? INTEGER ('.' [0-9] +)? EXP?
   ;


fragment INTEGER
   : '0' | [1-9] [0-9]*
   ;
// no leading zeros

fragment EXP
   : [Ee] [+\-]? INT
   ;

mathOperator
    :
    ADD
    | SUB
    | DIV
    | MOD
    | STAR
    ;

booleanOperator
    :
    AND
    | OR
    | BANG
    ;

comparisonOperator
   : EQUAL
   | NOTEQUAL  
   | GT
   | GE
   | LT  
   | LE
   ;


signed_number
 : ( '+' | '-' )? NUMERIC_LITERAL
 ;

//LEXER RULES
BOOLEAN_LITERAL
    : TRUE
    | FALSE
    ;

STRING_LITERAL
:     
'"' (~["\\\r\n] | EscapeSequence)* '"'
;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;
//
TRUE:               'true';
FALSE:              'false';
// Separators
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';

//    lexer grammar KnowExtLexer;
// Keywords
AS:                 'as';
BOOLEAN:            'boolean';
BYTE:               'byte';
CHAR:               'char';
DOUBLE:             'double';
CONFORMIFEQUAL:     'conform if equal';
DERIVEALWAYS:       'derive always';
DERIVEIFNOTEQUAL:   'derive if equal';
TERMINATEIFNOTEQUAL:'terminate if not equal';    
TERMINATE:          'terminate';
OVERRIDE:           'override';
EVALUATE:           'evaluate';
EXPLODE:            'explode';
DROP:               'drop';
FLOAT:              'float';
INT:                'int';
JOIN:               'join';
LONG:               'long';
MERGE:              'merge';
ON:                 'on';
RECOGNIZE:          'recognize';
SHORT:              'short';
STRING:             'String';
PATH:               'Path';
TREE:               'Tree';
UNION:              'union';
SELECT:             'select';
FROM:               'from';
WHERE:              'where';

// Operators
ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
BANG:               '!';
TILDE:              '~';
QUESTION:           '?';
COLON:              ':';
EQUAL:              '==';
LE:                 '<=';
GE:                 '>=';
NOTEQUAL:           '!=';
AND:                '&&';
OR:                 '||';
INC:                '++';
DEC:                '--';
ADD:                '+';
SUB:                '-';
DIV:                '/';
MOD:                '%';
STAR:               '*';

fragment
DIGIT
    : '0'..'9'
    ;
fragment E : [eE];
fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;
VAR_NAME
   : ('a' .. 'z' | 'A' .. 'Z' | '_') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;

CHARACTER
   : '\'' (~ ('\'' | '\\')) '\''
   ;

ESCAPE_CHARACTER
   : CHARACTER
   ;
// Whitespace and comments

WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);