grammar treelan;

// inspired from source: http://media.pragprog.com/titles/tpantlr2/code/examples/Cymbol.g4
/** Simple statically-typed programming language with functions and variables
 *  taken from "Language Implementation Patterns" book.
 */

stats:   (functionDecl|stat)+ ;

varDecl
    :   typeType IDENTIFIER (ASSIGN expr)? ';'
    ;

functionDecl  //void main() {...} will be the executable main block
    :   typeType IDENTIFIER '(' formalParameters? ')' block // "void f(int x) {...}"
    ;
    
formalParameters
    :   formalParameter (',' formalParameter)*
    ;
formalParameter
    :   typeType qualifiedName
    ;

block:  '{' stat* '}' ;   // possibly empty statement block
stat:   block
    |   varDecl
    |   IF parExpr stat (ELSE stat)?
    |   WHILE parExpr stat
    |   expr ';'          // func call
    | varDecl ';'
    ;
    
parExpr
    : '(' expr ')'
    ;

expr:   primary
    |   builtinfunction
	|	qualifiedName '(' exprList? ')'    // func call like f(), f(x), f(1,2)
    |   qualifiedName '[' expr ']'         // array index like a[i], a[i][j]
    |   SUB expr                // unary minus
    |   BANG expr                // boolean not
    |   expr (MUL|DIV) expr
    |   expr (ADD|SUB) expr
    |   expr ASSIGN expr // assignment
    |   expr EQUAL expr          // equality comparison (lowest priority op)
    |   qualifiedName                      // variable reference
    |   LPAREN expr RPAREN
    ;

builtinfunction
    :   SELECT '(' qualifiedName (',' expr)? ')' //select(TREE,<boolean-expression>)
    |   JOIN '(' qualifiedName ',' qualifiedName (',' expr)? ')' //join(TREE,TREE,<boolean-expression>)
    |   MERGE '(' qualifiedName ',' qualifiedName (',' conflictspec)? (',' expr)? ')' //merge(TREE,TREE,conflictspec,<merger-condition>)
    |   PATH '(' qualifiedName ',' qualifiedName ')' //path (TREE,NODE)
    |   RECOGNIZE '(' NODE ',' qualifiedName ')' //recognize (NODE,ext-rule-set)
    |   EXPLODE '(' qualifiedName (',' expr)? ')' //explode (TREE,string-expression)
    |   DROP '(' qualifiedName ',' qualifiedName ')' //drop (TREE, NODE)
    //<boolean-expression>, ext-rule-set, <tree-expression> bunları da tanımlamak gerekir mi?
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
primary
    : LPAREN expr RPAREN
    | literal
    | qualifiedName
;
qualifiedName
    : IDENTIFIER ('.' IDENTIFIER)*
    ;
exprList : expr (',' expr)* ;   // arg list

typeType
    : (complexType | primitiveType) ('[' ']')*
    ;
    
literal
    : DECIMAL_LITERAL
    | FLOAT_LITERAL
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
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
    | VOID
    ;

complexType
	:	LIST
	|	TREE
    |   NODE
	|	SET
	|	STRING
	;	

//    lexer grammar KnowExtLexer;
// Keywords
BOOLEAN:            'boolean';
BYTE:               'byte';
BREAK:				'break';
CASE:               'case';
CATCH: 				'catch';
CHAR:               'char';
CONTINUE:			'continue';
CONFORMIFEQUAL:     'conformifequal';
DERIVEALWAYS:       'derivealways';
DERIVEIFNOTEQUAL:   'deriveifequal';
TERMINATEIFNOTEQUAL:'terminateifnotequal';    
TERMINATE:          'terminate';
OVERRIDE:           'override';
EVALUATE:           'evaluate';
EXPLODE:            'explode';
DEFAULT:			'default';
DO:					'do';
DOUBLE:             'double';
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
NEW:				'new';
NODE:               'node';
RECOGNIZE:          'recognize';
RETURN:             'return';
SHORT:              'short';
SWITCH:             'switch';
STRING:				'String';
PATH:               'Path';
WHILE: 				'while';
TREE:				'Tree';
THROW:				'throw';
TRY: 				'try';
VOID: 				'void';
UNION:				'union';
SELECT:				'select';
SET:				'set';
GROUP:				'group';
AGGREGATE:			'aggregate';
RENAME:				'rename';
REORDER:			'reorder';

// Literals

DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;                  
FLOAT_LITERAL:      (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
             |       Digits (ExponentPart [fFdD]? | [fFdD])
             ;
BOOL_LITERAL:       'true'
            |       'false'
            ;
CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';
STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';
NULL_LITERAL:       'null';

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

// Whitespace and comments
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

// Identifiers

IDENTIFIER: Letter LetterOrDigit*;

// Fragment rules

fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    ;
    
    fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9]
    ;
fragment Letter
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;
