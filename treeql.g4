grammar treeql;

stats
    :
    definition* treeQuery
    ;
definition
    : typeType VAR_NAME ';' 
    ;
treeQuery
    :
    selectQuery
    | joinQuery
    | mergeQuery
    | explodeQuery
    LPAREN treeQuery RPAREN
    | rangeVariableDeclaration
    ;
selectQuery
    :
    SELECT treeExpression FROM treeQuery (WHERE selectorCondition)?
    ;
joinQuery
    :
    JOIN treeQuery ',' treeQuery ON selectorCondition 
    ;

mergeQuery
    :
    MERGE treeQuery ',' treeQuery conflictspec?
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
    EXPLODE treeQuery
    ;

rangeVariableDeclaration
    :
    abstractTreeName (AS ALIAS)+
    ;
abstractTreeName
    :
    VAR_NAME
    ;

ALIAS
    :
    VAR_NAME
    ;

expressions
    :
    expressions '.' expressions
    | expression
    ;
selectorCondition
    :
    booleanExpression
    ;

expression
    :
    treeExpression
    | stringExpression
    ;

booleanExpression
    :
    treeExpression '==' booleanLiteral
    treeExpression comparisonOperator (treeExpression | stringExpression | numberExpression)
    ;

treeExpression
    :
    '*'
    | VAR_NAME
    | abstractTreeName '.' VAR_NAME
    ;

stringExpression
    :
    ;

numberExpression
    :
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
	:	LIST
	|	TREE
    |   NODE
	|	STRING
	;	


booleanLiteral
    : 'true'
    | 'false'
    ;

comparisonOperator
   : '='
   | '>'
   | '>='
   | '<'
   | '<='
   | '<>'
   ;

stringLiteral
   : ('\'' (~ ('\\' | '"'))* '\'')
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
CONFORMIFEQUAL:     'conformifequal';
DERIVEALWAYS:       'derivealways';
DERIVEIFNOTEQUAL:   'deriveifequal';
TERMINATEIFNOTEQUAL:'terminateifnotequal';    
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
LIST:				'list';
LONG:               'long';
MERGE:              'merge';
NODE:               'node';
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
MUL:                '*';
DIV:                '/';
BITAND:             '&';
BITOR:              '|';
CARET:              '^';
MOD:                '%';

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

VAR_NAME
   : ('a' .. 'z' | 'A' .. 'Z' | '_') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;

CHARACTER
   : '\'' (~ ('\'' | '\\')) '\''
   ;

ESCAPE_CHARACTER
   : CHARACTER
   ;
WS
    : (' '
    | '\t'
    | '\n'
    | '\r')+ ->skip
    ;
