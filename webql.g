grammar treelan;

prog
   : line+
   ;

line
   : comment_line
   | blank_line
   | instruction_line
   | erase_line
   | assignment_line
   ;

blank_line
   : label? eol
   ;

comment_line
   : ws? comment eol
   ;
   // an instruction "line" can span many lines in the file, and can have comment lines in the middle of it

instruction_line
   : label? ws opcodes (eol comment_line)? argument (eol argument)* eol
   ;
   // erase can be specified with no variable

erase_line
   : variable? ws 'ERASE' (ws? expression)* (ws comment)? eol
   ;
   // assignment with no RHS is legal

assignment_line
   : variable ws? ('=' | 'EQUALS') (ws? expression)* (ws comment)? eol
   ;

opcodes
   : opcode (ws opcode)?
   ;

argument
   : (ws expression)* (ws comment)?
   ;

ws
   : WS
   ;

eol
   : WS? EOL
   ;

comment
   : COMMENT
   ;

label
   : LABEL
   ;

variable
   : LABEL
   | (LPAREN LABEL RPAREN)
   ;

expression
   : multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*
   ;

multiplyingExpression
   : atom ((TIMES | DIV) atom)*
   ;

atom
   : inte
   | decimal
   | variable
   | label
   | register
   ;

inte
   : INTE
   ;

decimal
   : ('+' | '-')? DECIMAL
   ;

register
   : 'A'
   | 'L'
   ;

opcode
   : standard_opcode
   | pseudo_opcode
   | axt_opcode
   ;
   // Address to Index

axt_opcode
   : 'AXT,1'
   | 'AXT,2'
   ;

pseudo_opcode
   : '1DNADR'
   | '2DNADR'
   ;

standard_opcode
   : 'TC' // transfer control   
   | 'TCR' // transfer control
   ;
   //
   // labels can begin with + or -, letters or digits 
   //
   // labels can contain "&" as well as math symbols "+-*/" and "."
   //

LABEL
   : [a-zA-Z0-9_.+\\\-/*=&]+
   ;
INTE
   : [0-9]+ ('DEC' | 'D')
   ;
DECIMAL
   : ([0-9]+ ('.' [0-9]+)?)
   | ('.' [0-9]+)
   ;
COMMENT
   : '#' ~ [\r\n]*
   ;
PLUS
   : '+'
   ;
MINUS
   : '-'
   ;
TIMES
   : '*'
   ;
DIV
   : '/'
   ;
COMMA
   : ','
   ;
LPAREN
   : '('
   ;
RPAREN
   : ')'
   ;
EOL
   : [\r\n]+
   ;
WS
   : [ \t]+
   ;