grammar TreeQL;

stats
    : COMMENT?
    (definition)* treeQuery EOF
    ;

definition
    : typeType VAR_NAME (ASSIGN assignmentExpr)? ';' 
    ;
assignmentExpr
    :
    STRING_LITERAL
    | booleanLiteral
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
    SELECT treeExpression FROM treeQuery (WHERE selectorCondition)?
    ;
joinQuery
    :
    JOIN treeQuery (COMMA treeQuery (ON selectorCondition)? )+ 
    ;

mergeQuery
    :
    MERGE treeQuery (COMMA treeQuery (ON selectorCondition)? conflictspec? )+
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

expressions
    :
    expression '.' expressions
    | expression
    ;
selectorCondition
    :
    expressions comparisonOperator expressions
    | booleanExpression
    ;

expression
    :
    treeExpression
    | stringExpression
    | numberExpression
    | booleanExpression
    ;

booleanExpression
    :
    booleanLiteral
    ;

treeExpression
    : VAR_NAME (COMMA VAR_NAME)*
    | (STAR | treeElement) (treeElement)*
    ;
treeElement
    :
     abstractTreeName DOT (VAR_NAME | STAR )   
    ;
stringExpression
    :
     STRING_LITERAL
    ;

numberExpression
    :
    NUMERIC_LITERAL
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
   | booleanLiteral
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


booleanLiteral
    : 'true'
    | 'false'
    ;

comparisonOperator
   : '=='
   | '!='  
   | '>'
   | '>='
   | '<'
   | '<='
   | '<>'
   ;


signed_number
 : ( '+' | '-' )? NUMERIC_LITERAL
 ;

//LEXER RULES
STRING_LITERAL
:     
'"' (~["\\\r\n] | EscapeSequence)* '"'
;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

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
ELSE:               'else';
FLOAT:              'float';
FOR:                'for';
IF:                 'if';
INT:                'int';
JOIN:               'join';
LONG:               'long';
MERGE:              'merge';
ON:                 'on';
RECOGNIZE:          'recognize';
SHORT:              'short';
STRING:				'String';
PATH:               'Path';
TREE:				'Tree';
UNION:				'union';
SELECT:				'select';
FROM:               'from';
WHERE:              'where';
ORDERBY:			'orderby';

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
BITAND:             '&';
BITOR:              '|';
CARET:              '^';
MOD:                '%';
STAR:               '*';
ADD_ASSIGN:         '+=';
SUB_ASSIGN:         '-=';
MUL_ASSIGN:         '*=';
DIV_ASSIGN:         '/=';
AND_ASSIGN:         '&=';
OR_ASSIGN:          '|=';
XOR_ASSIGN:         '^=';
MOD_ASSIGN:         '%=';
LSHIFT_ASSIGN:      '<<=';
RSHIFT_ASSIGN:      '>>=';
URSHIFT_ASSIGN:     '>>>=';

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