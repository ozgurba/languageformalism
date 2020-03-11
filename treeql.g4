grammar treeql;

statements
    :
    definition+
    | treeQuery
    ;
definition
    : typeType VARNAME ';'
    ;
treeQuery
    :
    selectQuery
    | joinQuery
    | mergeQuery
    | explodeQuery
    LPAREN treeQuery RPAREN
    ;
selectQuery
    :
    SELECT treeExpression FROM treeQuery WHERE selectorCondition
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

expressions
    :
    expressions '.' expressions
    | expression
    ;
selectorCondition
    :
    booleanExpression
    ;
booleanExpression
    :
    expression '==' expression
    ;
    expression
    :
    treeExpression
    | stringExpression
    ;

treeExpression
    :
    ;
stringExpression
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

numericLiteral
    : numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative
    ;

numericLiteralUnsigned
    : INTEGER
    | DECIMAL
    | DOUBLE
    ;

numericLiteralPositive
    : INTEGER_POSITIVE
    | DECIMAL_POSITIVE
    | DOUBLE_POSITIVE
    ;

numericLiteralNegative
    : INTEGER_NEGATIVE
    | DECIMAL_NEGATIVE
    | DOUBLE_NEGATIVE
    ;

booleanLiteral
    : 'true'
    | 'false'
    ;
string
    : STRING_LITERAL1
    | STRING_LITERAL2
    /* | STRING_LITERAL_LONG('0'..'9') | STRING_LITERAL_LONG('0'..'9')*/
    ;
INTEGER
    : DIGIT+
    ;

DECIMAL
    : DIGIT+ '.' DIGIT*
    | '.' DIGIT+
    ;

DOUBLE
    : DIGIT+ '.' DIGIT* EXPONENT
    | '.' DIGIT+ EXPONENT
    | DIGIT+ EXPONENT
    ;

INTEGER_POSITIVE
    : '+' INTEGER
    ;

DECIMAL_POSITIVE
    : '+' DECIMAL
    ;

DOUBLE_POSITIVE
    : '+' DOUBLE
    ;

INTEGER_NEGATIVE
    : '-' INTEGER
    ;

DECIMAL_NEGATIVE
    : '-' DECIMAL
    ;

DOUBLE_NEGATIVE
    : '-' DOUBLE
    ;

EXPONENT
    : ('e'|'E') ('+'|'-')? DIGIT+
    ;
STRING_LITERAL1
    : '\'' ( ~('\u0027' | '\u005C' | '\u000A' | '\u000D') | ECHAR )* '\''
    ;

STRING_LITERAL2
    : '"'  ( ~('\u0022' | '\u005C' | '\u000A' | '\u000D') | ECHAR )* '"'
    ;

STRING_LITERAL_LONG1
    : '\'\'\'' ( ( '\'' | '\'\'' )? (~('\'' | '\\') | ECHAR ) )* '\'\'\''
    ;

STRING_LITERAL_LONG2
    : '"""' ( ( '"' | '""' )? ( ~('\'' | '\\') | ECHAR ) )* '"""'
    ;

ECHAR
    : '\\' ('t' | 'b' | 'n' | 'r' | 'f' | '"' | '\'')
    ;

NIL
    : '(' WS* ')'
    ;

ANON
    : '[' WS* ']'
    ;

PN_CHARS_U
    : PN_CHARS_BASE | '_'
    ;

VARNAME
    : ( PN_CHARS_U | DIGIT ) ( PN_CHARS_U | DIGIT | '\u00B7' | ('\u0300'..'\u036F') | ('\u203F'..'\u2040') )*
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
BOOLEAN:            'boolean';
BYTE:               'byte';
CHAR:               'char';
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
ALIAS:				'as';
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
PN_CHARS
    : PN_CHARS_U
    | '-'
    | DIGIT
    /*| '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'*/
    ;

PN_PREFIX
    : PN_CHARS_BASE ((PN_CHARS|'.')* PN_CHARS)?
    ;

PN_LOCAL
    : ( PN_CHARS_U | DIGIT ) ((PN_CHARS|'.')* PN_CHARS)?
    ;

    fragment
PN_CHARS_BASE
    : 'A'..'Z'
    | 'a'..'z'
    | '\u00C0'..'\u00D6'
    | '\u00D8'..'\u00F6'
    | '\u00F8'..'\u02FF'
    | '\u0370'..'\u037D'
    | '\u037F'..'\u1FFF'
    | '\u200C'..'\u200D'
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;

fragment
DIGIT
    : '0'..'9'
    ;

WS
    : (' '
    | '\t'
    | '\n'
    | '\r')+ ->skip
    ;
