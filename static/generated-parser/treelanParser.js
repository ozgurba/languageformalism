// Generated from treelan.g4 by ANTLR 4.5.1
// jshint ignore: start
var antlr4 = require('antlr4/index');
var treelanListener = require('./treelanListener').treelanListener;
var grammarFileName = "treelan.g4";

var serializedATN = ["\u0003\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd",
    "\u0003[\u00b7\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004",
    "\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0003",
    "\u0002\u0003\u0002\u0006\u0002#\n\u0002\r\u0002\u000e\u0002$\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003+\n\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u00042\n\u0004",
    "\f\u0004\u000e\u00045\u000b\u0004\u0003\u0005\u0003\u0005\u0003\u0005",
    "\u0003\u0006\u0003\u0006\u0007\u0006<\n\u0006\f\u0006\u000e\u0006?\u000b",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003",
    "\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007J\n\u0007\u0003",
    "\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005",
    "\u0007R\n\u0007\u0003\b\u0003\b\u0003\b\u0003\b\u0003\t\u0003\t\u0003",
    "\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0005\tb",
    "\n\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t",
    "\u0003\t\u0003\t\u0003\t\u0005\to\n\t\u0003\t\u0003\t\u0003\t\u0003",
    "\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0007",
    "\t}\n\t\f\t\u000e\t\u0080\u000b\t\u0003\n\u0003\n\u0003\n\u0003\n\u0003",
    "\n\u0005\n\u0087\n\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n",
    "\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0005\n\u0094\n\n\u0003\u000b",
    "\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b",
    "\u009c\n\u000b\u0003\f\u0003\f\u0003\f\u0007\f\u00a1\n\f\f\f\u000e\f",
    "\u00a4\u000b\f\u0003\r\u0003\r\u0005\r\u00a8\n\r\u0003\r\u0003\r\u0007",
    "\r\u00ac\n\r\f\r\u000e\r\u00af\u000b\r\u0003\u000e\u0003\u000e\u0003",
    "\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0002\u0003\u0010",
    "\u0011\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a",
    "\u001c\u001e\u0002\u0007\u0003\u0002GH\u0003\u0002EF\u0003\u0002\',",
    "\t\u0002\u0003\u0004\b\b\f\f\u000e\u000e\u0011\u0011\u0014\u0014\u0018",
    "\u0018\u0007\u0002\u0013\u0013\u0016\u0016\u001a\u001a\u001c\u001c\"",
    "\"\u00c4\u0002\"\u0003\u0002\u0002\u0002\u0004&\u0003\u0002\u0002\u0002",
    "\u0006.\u0003\u0002\u0002\u0002\b6\u0003\u0002\u0002\u0002\n9\u0003",
    "\u0002\u0002\u0002\fQ\u0003\u0002\u0002\u0002\u000eS\u0003\u0002\u0002",
    "\u0002\u0010n\u0003\u0002\u0002\u0002\u0012\u0093\u0003\u0002\u0002",
    "\u0002\u0014\u009b\u0003\u0002\u0002\u0002\u0016\u009d\u0003\u0002\u0002",
    "\u0002\u0018\u00a7\u0003\u0002\u0002\u0002\u001a\u00b0\u0003\u0002\u0002",
    "\u0002\u001c\u00b2\u0003\u0002\u0002\u0002\u001e\u00b4\u0003\u0002\u0002",
    "\u0002 #\u0005\u0004\u0003\u0002!#\u0005\f\u0007\u0002\" \u0003\u0002",
    "\u0002\u0002\"!\u0003\u0002\u0002\u0002#$\u0003\u0002\u0002\u0002$\"",
    "\u0003\u0002\u0002\u0002$%\u0003\u0002\u0002\u0002%\u0003\u0003\u0002",
    "\u0002\u0002&\'\u0005\u0018\r\u0002\'*\u0007[\u0002\u0002()\u00076\u0002",
    "\u0002)+\u0005\u0010\t\u0002*(\u0003\u0002\u0002\u0002*+\u0003\u0002",
    "\u0002\u0002+,\u0003\u0002\u0002\u0002,-\u00073\u0002\u0002-\u0005\u0003",
    "\u0002\u0002\u0002.3\u0005\b\u0005\u0002/0\u00074\u0002\u000202\u0005",
    "\b\u0005\u00021/\u0003\u0002\u0002\u000225\u0003\u0002\u0002\u00023",
    "1\u0003\u0002\u0002\u000234\u0003\u0002\u0002\u00024\u0007\u0003\u0002",
    "\u0002\u000253\u0003\u0002\u0002\u000267\u0005\u0018\r\u000278\u0007",
    "[\u0002\u00028\t\u0003\u0002\u0002\u00029=\u0007/\u0002\u0002:<\u0005",
    "\f\u0007\u0002;:\u0003\u0002\u0002\u0002<?\u0003\u0002\u0002\u0002=",
    ";\u0003\u0002\u0002\u0002=>\u0003\u0002\u0002\u0002>@\u0003\u0002\u0002",
    "\u0002?=\u0003\u0002\u0002\u0002@A\u00070\u0002\u0002A\u000b\u0003\u0002",
    "\u0002\u0002BR\u0005\n\u0006\u0002CR\u0005\u0004\u0003\u0002DE\u0007",
    "\u0010\u0002\u0002EF\u0005\u000e\b\u0002FI\u0005\f\u0007\u0002GH\u0007",
    "\r\u0002\u0002HJ\u0005\f\u0007\u0002IG\u0003\u0002\u0002\u0002IJ\u0003",
    "\u0002\u0002\u0002JR\u0003\u0002\u0002\u0002KL\u0005\u0010\t\u0002L",
    "M\u00073\u0002\u0002MR\u0003\u0002\u0002\u0002NO\u0005\u0004\u0003\u0002",
    "OP\u00073\u0002\u0002PR\u0003\u0002\u0002\u0002QB\u0003\u0002\u0002",
    "\u0002QC\u0003\u0002\u0002\u0002QD\u0003\u0002\u0002\u0002QK\u0003\u0002",
    "\u0002\u0002QN\u0003\u0002\u0002\u0002R\r\u0003\u0002\u0002\u0002ST",
    "\u0007-\u0002\u0002TU\u0005\u0010\t\u0002UV\u0007.\u0002\u0002V\u000f",
    "\u0003\u0002\u0002\u0002WX\b\t\u0001\u0002XY\u0007F\u0002\u0002Yo\u0005",
    "\u0010\t\nZ[\u00079\u0002\u0002[o\u0005\u0010\t\t\\o\u0005\u0014\u000b",
    "\u0002]o\u0005\u0012\n\u0002^_\u0007[\u0002\u0002_a\u0007-\u0002\u0002",
    "`b\u0005\u0016\f\u0002a`\u0003\u0002\u0002\u0002ab\u0003\u0002\u0002",
    "\u0002bc\u0003\u0002\u0002\u0002co\u0007.\u0002\u0002de\u0007[\u0002",
    "\u0002ef\u00071\u0002\u0002fg\u0005\u0010\t\u0002gh\u00072\u0002\u0002",
    "ho\u0003\u0002\u0002\u0002io\u0007[\u0002\u0002jk\u0007-\u0002\u0002",
    "kl\u0005\u0010\t\u0002lm\u0007.\u0002\u0002mo\u0003\u0002\u0002\u0002",
    "nW\u0003\u0002\u0002\u0002nZ\u0003\u0002\u0002\u0002n\\\u0003\u0002",
    "\u0002\u0002n]\u0003\u0002\u0002\u0002n^\u0003\u0002\u0002\u0002nd\u0003",
    "\u0002\u0002\u0002ni\u0003\u0002\u0002\u0002nj\u0003\u0002\u0002\u0002",
    "o~\u0003\u0002\u0002\u0002pq\f\b\u0002\u0002qr\t\u0002\u0002\u0002r",
    "}\u0005\u0010\t\tst\f\u0007\u0002\u0002tu\t\u0003\u0002\u0002u}\u0005",
    "\u0010\t\bvw\f\u0006\u0002\u0002wx\u00076\u0002\u0002x}\u0005\u0010",
    "\t\u0007yz\f\u0005\u0002\u0002z{\u0007=\u0002\u0002{}\u0005\u0010\t",
    "\u0006|p\u0003\u0002\u0002\u0002|s\u0003\u0002\u0002\u0002|v\u0003\u0002",
    "\u0002\u0002|y\u0003\u0002\u0002\u0002}\u0080\u0003\u0002\u0002\u0002",
    "~|\u0003\u0002\u0002\u0002~\u007f\u0003\u0002\u0002\u0002\u007f\u0011",
    "\u0003\u0002\u0002\u0002\u0080~\u0003\u0002\u0002\u0002\u0081\u0082",
    "\u0007!\u0002\u0002\u0082\u0083\u0007-\u0002\u0002\u0083\u0084\u0005",
    "\u0010\t\u0002\u0084\u0086\u00074\u0002\u0002\u0085\u0087\u0005\u0010",
    "\t\u0002\u0086\u0085\u0003\u0002\u0002\u0002\u0086\u0087\u0003\u0002",
    "\u0002\u0002\u0087\u0088\u0003\u0002\u0002\u0002\u0088\u0089\u0007.",
    "\u0002\u0002\u0089\u0094\u0003\u0002\u0002\u0002\u008a\u008b\u0007\u0012",
    "\u0002\u0002\u008b\u008c\u0007-\u0002\u0002\u008c\u008d\u0005\u0010",
    "\t\u0002\u008d\u008e\u00074\u0002\u0002\u008e\u008f\u0005\u0010\t\u0002",
    "\u008f\u0090\u00074\u0002\u0002\u0090\u0091\u0005\u0010\t\u0002\u0091",
    "\u0092\u0007.\u0002\u0002\u0092\u0094\u0003\u0002\u0002\u0002\u0093",
    "\u0081\u0003\u0002\u0002\u0002\u0093\u008a\u0003\u0002\u0002\u0002\u0094",
    "\u0013\u0003\u0002\u0002\u0002\u0095\u0096\u0007-\u0002\u0002\u0096",
    "\u0097\u0005\u0010\t\u0002\u0097\u0098\u0007.\u0002\u0002\u0098\u009c",
    "\u0003\u0002\u0002\u0002\u0099\u009c\u0005\u001a\u000e\u0002\u009a\u009c",
    "\u0007[\u0002\u0002\u009b\u0095\u0003\u0002\u0002\u0002\u009b\u0099",
    "\u0003\u0002\u0002\u0002\u009b\u009a\u0003\u0002\u0002\u0002\u009c\u0015",
    "\u0003\u0002\u0002\u0002\u009d\u00a2\u0005\u0010\t\u0002\u009e\u009f",
    "\u00074\u0002\u0002\u009f\u00a1\u0005\u0010\t\u0002\u00a0\u009e\u0003",
    "\u0002\u0002\u0002\u00a1\u00a4\u0003\u0002\u0002\u0002\u00a2\u00a0\u0003",
    "\u0002\u0002\u0002\u00a2\u00a3\u0003\u0002\u0002\u0002\u00a3\u0017\u0003",
    "\u0002\u0002\u0002\u00a4\u00a2\u0003\u0002\u0002\u0002\u00a5\u00a8\u0005",
    "\u001e\u0010\u0002\u00a6\u00a8\u0005\u001c\u000f\u0002\u00a7\u00a5\u0003",
    "\u0002\u0002\u0002\u00a7\u00a6\u0003\u0002\u0002\u0002\u00a8\u00ad\u0003",
    "\u0002\u0002\u0002\u00a9\u00aa\u00071\u0002\u0002\u00aa\u00ac\u0007",
    "2\u0002\u0002\u00ab\u00a9\u0003\u0002\u0002\u0002\u00ac\u00af\u0003",
    "\u0002\u0002\u0002\u00ad\u00ab\u0003\u0002\u0002\u0002\u00ad\u00ae\u0003",
    "\u0002\u0002\u0002\u00ae\u0019\u0003\u0002\u0002\u0002\u00af\u00ad\u0003",
    "\u0002\u0002\u0002\u00b0\u00b1\t\u0004\u0002\u0002\u00b1\u001b\u0003",
    "\u0002\u0002\u0002\u00b2\u00b3\t\u0005\u0002\u0002\u00b3\u001d\u0003",
    "\u0002\u0002\u0002\u00b4\u00b5\t\u0006\u0002\u0002\u00b5\u001f\u0003",
    "\u0002\u0002\u0002\u0013\"$*3=IQan|~\u0086\u0093\u009b\u00a2\u00a7\u00ad"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'boolean'", "'byte'", "'break'", "'case'", "'catch'", 
                     "'char'", "'continue'", "'default'", "'do'", "'double'", 
                     "'else'", "'float'", "'for'", "'if'", "'int'", "'join'", 
                     "'list'", "'long'", "'new'", "'node'", "'return'", 
                     "'short'", "'switch'", "'String'", "'while'", "'Tree'", 
                     "'throw'", "'try'", "'void'", "'union'", "'select'", 
                     "'set'", "'group'", "'aggregate'", "'rename'", "'reorder'", 
                     null, null, null, null, null, "'null'", "'('", "')'", 
                     "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
                     "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", 
                     "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
                     "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
                     "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
                     "'<<='", "'>>='", "'>>>='" ];

var symbolicNames = [ null, "BOOLEAN", "BYTE", "BREAK", "CASE", "CATCH", 
                      "CHAR", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
                      "FLOAT", "FOR", "IF", "INT", "JOIN", "LIST", "LONG", 
                      "NEW", "NODE", "RETURN", "SHORT", "SWITCH", "STRING", 
                      "WHILE", "TREE", "THROW", "TRY", "VOID", "UNION", 
                      "SELECT", "SET", "GROUP", "AGGREGATE", "RENAME", "REORDER", 
                      "DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", 
                      "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", 
                      "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
                      "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", 
                      "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
                      "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
                      "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
                      "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
                      "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
                      "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
                      "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER" ];

var ruleNames =  [ "stats", "varDecl", "formalParameters", "formalParameter", 
                   "block", "stat", "parExpr", "expr", "builtinfunction", 
                   "primary", "exprList", "typeType", "literal", "primitiveType", 
                   "complexType" ];

function treelanParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

treelanParser.prototype = Object.create(antlr4.Parser.prototype);
treelanParser.prototype.constructor = treelanParser;

Object.defineProperty(treelanParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

treelanParser.EOF = antlr4.Token.EOF;
treelanParser.BOOLEAN = 1;
treelanParser.BYTE = 2;
treelanParser.BREAK = 3;
treelanParser.CASE = 4;
treelanParser.CATCH = 5;
treelanParser.CHAR = 6;
treelanParser.CONTINUE = 7;
treelanParser.DEFAULT = 8;
treelanParser.DO = 9;
treelanParser.DOUBLE = 10;
treelanParser.ELSE = 11;
treelanParser.FLOAT = 12;
treelanParser.FOR = 13;
treelanParser.IF = 14;
treelanParser.INT = 15;
treelanParser.JOIN = 16;
treelanParser.LIST = 17;
treelanParser.LONG = 18;
treelanParser.NEW = 19;
treelanParser.NODE = 20;
treelanParser.RETURN = 21;
treelanParser.SHORT = 22;
treelanParser.SWITCH = 23;
treelanParser.STRING = 24;
treelanParser.WHILE = 25;
treelanParser.TREE = 26;
treelanParser.THROW = 27;
treelanParser.TRY = 28;
treelanParser.VOID = 29;
treelanParser.UNION = 30;
treelanParser.SELECT = 31;
treelanParser.SET = 32;
treelanParser.GROUP = 33;
treelanParser.AGGREGATE = 34;
treelanParser.RENAME = 35;
treelanParser.REORDER = 36;
treelanParser.DECIMAL_LITERAL = 37;
treelanParser.FLOAT_LITERAL = 38;
treelanParser.BOOL_LITERAL = 39;
treelanParser.CHAR_LITERAL = 40;
treelanParser.STRING_LITERAL = 41;
treelanParser.NULL_LITERAL = 42;
treelanParser.LPAREN = 43;
treelanParser.RPAREN = 44;
treelanParser.LBRACE = 45;
treelanParser.RBRACE = 46;
treelanParser.LBRACK = 47;
treelanParser.RBRACK = 48;
treelanParser.SEMI = 49;
treelanParser.COMMA = 50;
treelanParser.DOT = 51;
treelanParser.ASSIGN = 52;
treelanParser.GT = 53;
treelanParser.LT = 54;
treelanParser.BANG = 55;
treelanParser.TILDE = 56;
treelanParser.QUESTION = 57;
treelanParser.COLON = 58;
treelanParser.EQUAL = 59;
treelanParser.LE = 60;
treelanParser.GE = 61;
treelanParser.NOTEQUAL = 62;
treelanParser.AND = 63;
treelanParser.OR = 64;
treelanParser.INC = 65;
treelanParser.DEC = 66;
treelanParser.ADD = 67;
treelanParser.SUB = 68;
treelanParser.MUL = 69;
treelanParser.DIV = 70;
treelanParser.BITAND = 71;
treelanParser.BITOR = 72;
treelanParser.CARET = 73;
treelanParser.MOD = 74;
treelanParser.ADD_ASSIGN = 75;
treelanParser.SUB_ASSIGN = 76;
treelanParser.MUL_ASSIGN = 77;
treelanParser.DIV_ASSIGN = 78;
treelanParser.AND_ASSIGN = 79;
treelanParser.OR_ASSIGN = 80;
treelanParser.XOR_ASSIGN = 81;
treelanParser.MOD_ASSIGN = 82;
treelanParser.LSHIFT_ASSIGN = 83;
treelanParser.RSHIFT_ASSIGN = 84;
treelanParser.URSHIFT_ASSIGN = 85;
treelanParser.WS = 86;
treelanParser.COMMENT = 87;
treelanParser.LINE_COMMENT = 88;
treelanParser.IDENTIFIER = 89;

treelanParser.RULE_stats = 0;
treelanParser.RULE_varDecl = 1;
treelanParser.RULE_formalParameters = 2;
treelanParser.RULE_formalParameter = 3;
treelanParser.RULE_block = 4;
treelanParser.RULE_stat = 5;
treelanParser.RULE_parExpr = 6;
treelanParser.RULE_expr = 7;
treelanParser.RULE_builtinfunction = 8;
treelanParser.RULE_primary = 9;
treelanParser.RULE_exprList = 10;
treelanParser.RULE_typeType = 11;
treelanParser.RULE_literal = 12;
treelanParser.RULE_primitiveType = 13;
treelanParser.RULE_complexType = 14;

function StatsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_stats;
    return this;
}

StatsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatsContext.prototype.constructor = StatsContext;

StatsContext.prototype.varDecl = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(VarDeclContext);
    } else {
        return this.getTypedRuleContext(VarDeclContext,i);
    }
};

StatsContext.prototype.stat = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StatContext);
    } else {
        return this.getTypedRuleContext(StatContext,i);
    }
};

StatsContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterStats(this);
	}
};

StatsContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitStats(this);
	}
};




treelanParser.StatsContext = StatsContext;

treelanParser.prototype.stats = function() {

    var localctx = new StatsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, treelanParser.RULE_stats);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 32; 
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
            this.state = 32;
            this._errHandler.sync(this);
            var la_ = this._interp.adaptivePredict(this._input,0,this._ctx);
            switch(la_) {
            case 1:
                this.state = 30;
                this.varDecl();
                break;

            case 2:
                this.state = 31;
                this.stat();
                break;

            }
            this.state = 34; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << treelanParser.BOOLEAN) | (1 << treelanParser.BYTE) | (1 << treelanParser.CHAR) | (1 << treelanParser.DOUBLE) | (1 << treelanParser.FLOAT) | (1 << treelanParser.IF) | (1 << treelanParser.INT) | (1 << treelanParser.JOIN) | (1 << treelanParser.LIST) | (1 << treelanParser.LONG) | (1 << treelanParser.NODE) | (1 << treelanParser.SHORT) | (1 << treelanParser.STRING) | (1 << treelanParser.TREE) | (1 << treelanParser.SELECT))) !== 0) || ((((_la - 32)) & ~0x1f) == 0 && ((1 << (_la - 32)) & ((1 << (treelanParser.SET - 32)) | (1 << (treelanParser.DECIMAL_LITERAL - 32)) | (1 << (treelanParser.FLOAT_LITERAL - 32)) | (1 << (treelanParser.BOOL_LITERAL - 32)) | (1 << (treelanParser.CHAR_LITERAL - 32)) | (1 << (treelanParser.STRING_LITERAL - 32)) | (1 << (treelanParser.NULL_LITERAL - 32)) | (1 << (treelanParser.LPAREN - 32)) | (1 << (treelanParser.LBRACE - 32)) | (1 << (treelanParser.BANG - 32)))) !== 0) || _la===treelanParser.SUB || _la===treelanParser.IDENTIFIER);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function VarDeclContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_varDecl;
    return this;
}

VarDeclContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
VarDeclContext.prototype.constructor = VarDeclContext;

VarDeclContext.prototype.typeType = function() {
    return this.getTypedRuleContext(TypeTypeContext,0);
};

VarDeclContext.prototype.IDENTIFIER = function() {
    return this.getToken(treelanParser.IDENTIFIER, 0);
};

VarDeclContext.prototype.ASSIGN = function() {
    return this.getToken(treelanParser.ASSIGN, 0);
};

VarDeclContext.prototype.expr = function() {
    return this.getTypedRuleContext(ExprContext,0);
};

VarDeclContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterVarDecl(this);
	}
};

VarDeclContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitVarDecl(this);
	}
};




treelanParser.VarDeclContext = VarDeclContext;

treelanParser.prototype.varDecl = function() {

    var localctx = new VarDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, treelanParser.RULE_varDecl);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 36;
        this.typeType();
        this.state = 37;
        this.match(treelanParser.IDENTIFIER);
        this.state = 40;
        _la = this._input.LA(1);
        if(_la===treelanParser.ASSIGN) {
            this.state = 38;
            this.match(treelanParser.ASSIGN);
            this.state = 39;
            this.expr(0);
        }

        this.state = 42;
        this.match(treelanParser.SEMI);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function FormalParametersContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_formalParameters;
    return this;
}

FormalParametersContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FormalParametersContext.prototype.constructor = FormalParametersContext;

FormalParametersContext.prototype.formalParameter = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(FormalParameterContext);
    } else {
        return this.getTypedRuleContext(FormalParameterContext,i);
    }
};

FormalParametersContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterFormalParameters(this);
	}
};

FormalParametersContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitFormalParameters(this);
	}
};




treelanParser.FormalParametersContext = FormalParametersContext;

treelanParser.prototype.formalParameters = function() {

    var localctx = new FormalParametersContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, treelanParser.RULE_formalParameters);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 44;
        this.formalParameter();
        this.state = 49;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===treelanParser.COMMA) {
            this.state = 45;
            this.match(treelanParser.COMMA);
            this.state = 46;
            this.formalParameter();
            this.state = 51;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function FormalParameterContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_formalParameter;
    return this;
}

FormalParameterContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FormalParameterContext.prototype.constructor = FormalParameterContext;

FormalParameterContext.prototype.typeType = function() {
    return this.getTypedRuleContext(TypeTypeContext,0);
};

FormalParameterContext.prototype.IDENTIFIER = function() {
    return this.getToken(treelanParser.IDENTIFIER, 0);
};

FormalParameterContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterFormalParameter(this);
	}
};

FormalParameterContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitFormalParameter(this);
	}
};




treelanParser.FormalParameterContext = FormalParameterContext;

treelanParser.prototype.formalParameter = function() {

    var localctx = new FormalParameterContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, treelanParser.RULE_formalParameter);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 52;
        this.typeType();
        this.state = 53;
        this.match(treelanParser.IDENTIFIER);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function BlockContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_block;
    return this;
}

BlockContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
BlockContext.prototype.constructor = BlockContext;

BlockContext.prototype.stat = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StatContext);
    } else {
        return this.getTypedRuleContext(StatContext,i);
    }
};

BlockContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterBlock(this);
	}
};

BlockContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitBlock(this);
	}
};




treelanParser.BlockContext = BlockContext;

treelanParser.prototype.block = function() {

    var localctx = new BlockContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, treelanParser.RULE_block);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 55;
        this.match(treelanParser.LBRACE);
        this.state = 59;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << treelanParser.BOOLEAN) | (1 << treelanParser.BYTE) | (1 << treelanParser.CHAR) | (1 << treelanParser.DOUBLE) | (1 << treelanParser.FLOAT) | (1 << treelanParser.IF) | (1 << treelanParser.INT) | (1 << treelanParser.JOIN) | (1 << treelanParser.LIST) | (1 << treelanParser.LONG) | (1 << treelanParser.NODE) | (1 << treelanParser.SHORT) | (1 << treelanParser.STRING) | (1 << treelanParser.TREE) | (1 << treelanParser.SELECT))) !== 0) || ((((_la - 32)) & ~0x1f) == 0 && ((1 << (_la - 32)) & ((1 << (treelanParser.SET - 32)) | (1 << (treelanParser.DECIMAL_LITERAL - 32)) | (1 << (treelanParser.FLOAT_LITERAL - 32)) | (1 << (treelanParser.BOOL_LITERAL - 32)) | (1 << (treelanParser.CHAR_LITERAL - 32)) | (1 << (treelanParser.STRING_LITERAL - 32)) | (1 << (treelanParser.NULL_LITERAL - 32)) | (1 << (treelanParser.LPAREN - 32)) | (1 << (treelanParser.LBRACE - 32)) | (1 << (treelanParser.BANG - 32)))) !== 0) || _la===treelanParser.SUB || _la===treelanParser.IDENTIFIER) {
            this.state = 56;
            this.stat();
            this.state = 61;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 62;
        this.match(treelanParser.RBRACE);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function StatContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_stat;
    return this;
}

StatContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatContext.prototype.constructor = StatContext;

StatContext.prototype.block = function() {
    return this.getTypedRuleContext(BlockContext,0);
};

StatContext.prototype.varDecl = function() {
    return this.getTypedRuleContext(VarDeclContext,0);
};

StatContext.prototype.IF = function() {
    return this.getToken(treelanParser.IF, 0);
};

StatContext.prototype.parExpr = function() {
    return this.getTypedRuleContext(ParExprContext,0);
};

StatContext.prototype.stat = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StatContext);
    } else {
        return this.getTypedRuleContext(StatContext,i);
    }
};

StatContext.prototype.ELSE = function() {
    return this.getToken(treelanParser.ELSE, 0);
};

StatContext.prototype.expr = function() {
    return this.getTypedRuleContext(ExprContext,0);
};

StatContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterStat(this);
	}
};

StatContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitStat(this);
	}
};




treelanParser.StatContext = StatContext;

treelanParser.prototype.stat = function() {

    var localctx = new StatContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, treelanParser.RULE_stat);
    try {
        this.state = 79;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,6,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 64;
            this.block();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 65;
            this.varDecl();
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 66;
            this.match(treelanParser.IF);
            this.state = 67;
            this.parExpr();
            this.state = 68;
            this.stat();
            this.state = 71;
            this._errHandler.sync(this);
            var la_ = this._interp.adaptivePredict(this._input,5,this._ctx);
            if(la_===1) {
                this.state = 69;
                this.match(treelanParser.ELSE);
                this.state = 70;
                this.stat();

            }
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 73;
            this.expr(0);
            this.state = 74;
            this.match(treelanParser.SEMI);
            break;

        case 5:
            this.enterOuterAlt(localctx, 5);
            this.state = 76;
            this.varDecl();
            this.state = 77;
            this.match(treelanParser.SEMI);
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ParExprContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_parExpr;
    return this;
}

ParExprContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ParExprContext.prototype.constructor = ParExprContext;

ParExprContext.prototype.expr = function() {
    return this.getTypedRuleContext(ExprContext,0);
};

ParExprContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterParExpr(this);
	}
};

ParExprContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitParExpr(this);
	}
};




treelanParser.ParExprContext = ParExprContext;

treelanParser.prototype.parExpr = function() {

    var localctx = new ParExprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, treelanParser.RULE_parExpr);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 81;
        this.match(treelanParser.LPAREN);
        this.state = 82;
        this.expr(0);
        this.state = 83;
        this.match(treelanParser.RPAREN);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ExprContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_expr;
    return this;
}

ExprContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExprContext.prototype.constructor = ExprContext;

ExprContext.prototype.SUB = function() {
    return this.getToken(treelanParser.SUB, 0);
};

ExprContext.prototype.expr = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExprContext);
    } else {
        return this.getTypedRuleContext(ExprContext,i);
    }
};

ExprContext.prototype.BANG = function() {
    return this.getToken(treelanParser.BANG, 0);
};

ExprContext.prototype.primary = function() {
    return this.getTypedRuleContext(PrimaryContext,0);
};

ExprContext.prototype.builtinfunction = function() {
    return this.getTypedRuleContext(BuiltinfunctionContext,0);
};

ExprContext.prototype.IDENTIFIER = function() {
    return this.getToken(treelanParser.IDENTIFIER, 0);
};

ExprContext.prototype.exprList = function() {
    return this.getTypedRuleContext(ExprListContext,0);
};

ExprContext.prototype.LPAREN = function() {
    return this.getToken(treelanParser.LPAREN, 0);
};

ExprContext.prototype.RPAREN = function() {
    return this.getToken(treelanParser.RPAREN, 0);
};

ExprContext.prototype.MUL = function() {
    return this.getToken(treelanParser.MUL, 0);
};

ExprContext.prototype.DIV = function() {
    return this.getToken(treelanParser.DIV, 0);
};

ExprContext.prototype.ADD = function() {
    return this.getToken(treelanParser.ADD, 0);
};

ExprContext.prototype.ASSIGN = function() {
    return this.getToken(treelanParser.ASSIGN, 0);
};

ExprContext.prototype.EQUAL = function() {
    return this.getToken(treelanParser.EQUAL, 0);
};

ExprContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterExpr(this);
	}
};

ExprContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitExpr(this);
	}
};



treelanParser.prototype.expr = function(_p) {
	if(_p===undefined) {
	    _p = 0;
	}
    var _parentctx = this._ctx;
    var _parentState = this.state;
    var localctx = new ExprContext(this, this._ctx, _parentState);
    var _prevctx = localctx;
    var _startState = 14;
    this.enterRecursionRule(localctx, 14, treelanParser.RULE_expr, _p);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 108;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,8,this._ctx);
        switch(la_) {
        case 1:
            this.state = 86;
            this.match(treelanParser.SUB);
            this.state = 87;
            this.expr(8);
            break;

        case 2:
            this.state = 88;
            this.match(treelanParser.BANG);
            this.state = 89;
            this.expr(7);
            break;

        case 3:
            this.state = 90;
            this.primary();
            break;

        case 4:
            this.state = 91;
            this.builtinfunction();
            break;

        case 5:
            this.state = 92;
            this.match(treelanParser.IDENTIFIER);
            this.state = 93;
            this.match(treelanParser.LPAREN);
            this.state = 95;
            _la = this._input.LA(1);
            if(_la===treelanParser.JOIN || _la===treelanParser.SELECT || ((((_la - 37)) & ~0x1f) == 0 && ((1 << (_la - 37)) & ((1 << (treelanParser.DECIMAL_LITERAL - 37)) | (1 << (treelanParser.FLOAT_LITERAL - 37)) | (1 << (treelanParser.BOOL_LITERAL - 37)) | (1 << (treelanParser.CHAR_LITERAL - 37)) | (1 << (treelanParser.STRING_LITERAL - 37)) | (1 << (treelanParser.NULL_LITERAL - 37)) | (1 << (treelanParser.LPAREN - 37)) | (1 << (treelanParser.BANG - 37)) | (1 << (treelanParser.SUB - 37)))) !== 0) || _la===treelanParser.IDENTIFIER) {
                this.state = 94;
                this.exprList();
            }

            this.state = 97;
            this.match(treelanParser.RPAREN);
            break;

        case 6:
            this.state = 98;
            this.match(treelanParser.IDENTIFIER);
            this.state = 99;
            this.match(treelanParser.LBRACK);
            this.state = 100;
            this.expr(0);
            this.state = 101;
            this.match(treelanParser.RBRACK);
            break;

        case 7:
            this.state = 103;
            this.match(treelanParser.IDENTIFIER);
            break;

        case 8:
            this.state = 104;
            this.match(treelanParser.LPAREN);
            this.state = 105;
            this.expr(0);
            this.state = 106;
            this.match(treelanParser.RPAREN);
            break;

        }
        this._ctx.stop = this._input.LT(-1);
        this.state = 124;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,10,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                this.state = 122;
                this._errHandler.sync(this);
                var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
                switch(la_) {
                case 1:
                    localctx = new ExprContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, treelanParser.RULE_expr);
                    this.state = 110;
                    if (!( this.precpred(this._ctx, 6))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 6)");
                    }
                    this.state = 111;
                    _la = this._input.LA(1);
                    if(!(_la===treelanParser.MUL || _la===treelanParser.DIV)) {
                    this._errHandler.recoverInline(this);
                    }
                    else {
                        this.consume();
                    }
                    this.state = 112;
                    this.expr(7);
                    break;

                case 2:
                    localctx = new ExprContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, treelanParser.RULE_expr);
                    this.state = 113;
                    if (!( this.precpred(this._ctx, 5))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 5)");
                    }
                    this.state = 114;
                    _la = this._input.LA(1);
                    if(!(_la===treelanParser.ADD || _la===treelanParser.SUB)) {
                    this._errHandler.recoverInline(this);
                    }
                    else {
                        this.consume();
                    }
                    this.state = 115;
                    this.expr(6);
                    break;

                case 3:
                    localctx = new ExprContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, treelanParser.RULE_expr);
                    this.state = 116;
                    if (!( this.precpred(this._ctx, 4))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
                    }
                    this.state = 117;
                    this.match(treelanParser.ASSIGN);
                    this.state = 118;
                    this.expr(5);
                    break;

                case 4:
                    localctx = new ExprContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, treelanParser.RULE_expr);
                    this.state = 119;
                    if (!( this.precpred(this._ctx, 3))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
                    }
                    this.state = 120;
                    this.match(treelanParser.EQUAL);
                    this.state = 121;
                    this.expr(4);
                    break;

                } 
            }
            this.state = 126;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,10,this._ctx);
        }

    } catch( error) {
        if(error instanceof antlr4.error.RecognitionException) {
	        localctx.exception = error;
	        this._errHandler.reportError(this, error);
	        this._errHandler.recover(this, error);
	    } else {
	    	throw error;
	    }
    } finally {
        this.unrollRecursionContexts(_parentctx)
    }
    return localctx;
};

function BuiltinfunctionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_builtinfunction;
    return this;
}

BuiltinfunctionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
BuiltinfunctionContext.prototype.constructor = BuiltinfunctionContext;

BuiltinfunctionContext.prototype.SELECT = function() {
    return this.getToken(treelanParser.SELECT, 0);
};

BuiltinfunctionContext.prototype.expr = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExprContext);
    } else {
        return this.getTypedRuleContext(ExprContext,i);
    }
};

BuiltinfunctionContext.prototype.JOIN = function() {
    return this.getToken(treelanParser.JOIN, 0);
};

BuiltinfunctionContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterBuiltinfunction(this);
	}
};

BuiltinfunctionContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitBuiltinfunction(this);
	}
};




treelanParser.BuiltinfunctionContext = BuiltinfunctionContext;

treelanParser.prototype.builtinfunction = function() {

    var localctx = new BuiltinfunctionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, treelanParser.RULE_builtinfunction);
    var _la = 0; // Token type
    try {
        this.state = 145;
        switch(this._input.LA(1)) {
        case treelanParser.SELECT:
            this.enterOuterAlt(localctx, 1);
            this.state = 127;
            this.match(treelanParser.SELECT);
            this.state = 128;
            this.match(treelanParser.LPAREN);
            this.state = 129;
            this.expr(0);
            this.state = 130;
            this.match(treelanParser.COMMA);
            this.state = 132;
            _la = this._input.LA(1);
            if(_la===treelanParser.JOIN || _la===treelanParser.SELECT || ((((_la - 37)) & ~0x1f) == 0 && ((1 << (_la - 37)) & ((1 << (treelanParser.DECIMAL_LITERAL - 37)) | (1 << (treelanParser.FLOAT_LITERAL - 37)) | (1 << (treelanParser.BOOL_LITERAL - 37)) | (1 << (treelanParser.CHAR_LITERAL - 37)) | (1 << (treelanParser.STRING_LITERAL - 37)) | (1 << (treelanParser.NULL_LITERAL - 37)) | (1 << (treelanParser.LPAREN - 37)) | (1 << (treelanParser.BANG - 37)) | (1 << (treelanParser.SUB - 37)))) !== 0) || _la===treelanParser.IDENTIFIER) {
                this.state = 131;
                this.expr(0);
            }

            this.state = 134;
            this.match(treelanParser.RPAREN);
            break;
        case treelanParser.JOIN:
            this.enterOuterAlt(localctx, 2);
            this.state = 136;
            this.match(treelanParser.JOIN);
            this.state = 137;
            this.match(treelanParser.LPAREN);
            this.state = 138;
            this.expr(0);
            this.state = 139;
            this.match(treelanParser.COMMA);
            this.state = 140;
            this.expr(0);
            this.state = 141;
            this.match(treelanParser.COMMA);
            this.state = 142;
            this.expr(0);
            this.state = 143;
            this.match(treelanParser.RPAREN);
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function PrimaryContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_primary;
    return this;
}

PrimaryContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PrimaryContext.prototype.constructor = PrimaryContext;

PrimaryContext.prototype.LPAREN = function() {
    return this.getToken(treelanParser.LPAREN, 0);
};

PrimaryContext.prototype.expr = function() {
    return this.getTypedRuleContext(ExprContext,0);
};

PrimaryContext.prototype.RPAREN = function() {
    return this.getToken(treelanParser.RPAREN, 0);
};

PrimaryContext.prototype.literal = function() {
    return this.getTypedRuleContext(LiteralContext,0);
};

PrimaryContext.prototype.IDENTIFIER = function() {
    return this.getToken(treelanParser.IDENTIFIER, 0);
};

PrimaryContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterPrimary(this);
	}
};

PrimaryContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitPrimary(this);
	}
};




treelanParser.PrimaryContext = PrimaryContext;

treelanParser.prototype.primary = function() {

    var localctx = new PrimaryContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, treelanParser.RULE_primary);
    try {
        this.state = 153;
        switch(this._input.LA(1)) {
        case treelanParser.LPAREN:
            this.enterOuterAlt(localctx, 1);
            this.state = 147;
            this.match(treelanParser.LPAREN);
            this.state = 148;
            this.expr(0);
            this.state = 149;
            this.match(treelanParser.RPAREN);
            break;
        case treelanParser.DECIMAL_LITERAL:
        case treelanParser.FLOAT_LITERAL:
        case treelanParser.BOOL_LITERAL:
        case treelanParser.CHAR_LITERAL:
        case treelanParser.STRING_LITERAL:
        case treelanParser.NULL_LITERAL:
            this.enterOuterAlt(localctx, 2);
            this.state = 151;
            this.literal();
            break;
        case treelanParser.IDENTIFIER:
            this.enterOuterAlt(localctx, 3);
            this.state = 152;
            this.match(treelanParser.IDENTIFIER);
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ExprListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_exprList;
    return this;
}

ExprListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExprListContext.prototype.constructor = ExprListContext;

ExprListContext.prototype.expr = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExprContext);
    } else {
        return this.getTypedRuleContext(ExprContext,i);
    }
};

ExprListContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterExprList(this);
	}
};

ExprListContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitExprList(this);
	}
};




treelanParser.ExprListContext = ExprListContext;

treelanParser.prototype.exprList = function() {

    var localctx = new ExprListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, treelanParser.RULE_exprList);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 155;
        this.expr(0);
        this.state = 160;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===treelanParser.COMMA) {
            this.state = 156;
            this.match(treelanParser.COMMA);
            this.state = 157;
            this.expr(0);
            this.state = 162;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function TypeTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_typeType;
    return this;
}

TypeTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TypeTypeContext.prototype.constructor = TypeTypeContext;

TypeTypeContext.prototype.complexType = function() {
    return this.getTypedRuleContext(ComplexTypeContext,0);
};

TypeTypeContext.prototype.primitiveType = function() {
    return this.getTypedRuleContext(PrimitiveTypeContext,0);
};

TypeTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterTypeType(this);
	}
};

TypeTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitTypeType(this);
	}
};




treelanParser.TypeTypeContext = TypeTypeContext;

treelanParser.prototype.typeType = function() {

    var localctx = new TypeTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 22, treelanParser.RULE_typeType);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 165;
        switch(this._input.LA(1)) {
        case treelanParser.LIST:
        case treelanParser.NODE:
        case treelanParser.STRING:
        case treelanParser.TREE:
        case treelanParser.SET:
            this.state = 163;
            this.complexType();
            break;
        case treelanParser.BOOLEAN:
        case treelanParser.BYTE:
        case treelanParser.CHAR:
        case treelanParser.DOUBLE:
        case treelanParser.FLOAT:
        case treelanParser.INT:
        case treelanParser.LONG:
        case treelanParser.SHORT:
            this.state = 164;
            this.primitiveType();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
        this.state = 171;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===treelanParser.LBRACK) {
            this.state = 167;
            this.match(treelanParser.LBRACK);
            this.state = 168;
            this.match(treelanParser.RBRACK);
            this.state = 173;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function LiteralContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_literal;
    return this;
}

LiteralContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
LiteralContext.prototype.constructor = LiteralContext;

LiteralContext.prototype.DECIMAL_LITERAL = function() {
    return this.getToken(treelanParser.DECIMAL_LITERAL, 0);
};

LiteralContext.prototype.FLOAT_LITERAL = function() {
    return this.getToken(treelanParser.FLOAT_LITERAL, 0);
};

LiteralContext.prototype.CHAR_LITERAL = function() {
    return this.getToken(treelanParser.CHAR_LITERAL, 0);
};

LiteralContext.prototype.STRING_LITERAL = function() {
    return this.getToken(treelanParser.STRING_LITERAL, 0);
};

LiteralContext.prototype.BOOL_LITERAL = function() {
    return this.getToken(treelanParser.BOOL_LITERAL, 0);
};

LiteralContext.prototype.NULL_LITERAL = function() {
    return this.getToken(treelanParser.NULL_LITERAL, 0);
};

LiteralContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterLiteral(this);
	}
};

LiteralContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitLiteral(this);
	}
};




treelanParser.LiteralContext = LiteralContext;

treelanParser.prototype.literal = function() {

    var localctx = new LiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, treelanParser.RULE_literal);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 174;
        _la = this._input.LA(1);
        if(!(((((_la - 37)) & ~0x1f) == 0 && ((1 << (_la - 37)) & ((1 << (treelanParser.DECIMAL_LITERAL - 37)) | (1 << (treelanParser.FLOAT_LITERAL - 37)) | (1 << (treelanParser.BOOL_LITERAL - 37)) | (1 << (treelanParser.CHAR_LITERAL - 37)) | (1 << (treelanParser.STRING_LITERAL - 37)) | (1 << (treelanParser.NULL_LITERAL - 37)))) !== 0))) {
        this._errHandler.recoverInline(this);
        }
        else {
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function PrimitiveTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_primitiveType;
    return this;
}

PrimitiveTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PrimitiveTypeContext.prototype.constructor = PrimitiveTypeContext;

PrimitiveTypeContext.prototype.BOOLEAN = function() {
    return this.getToken(treelanParser.BOOLEAN, 0);
};

PrimitiveTypeContext.prototype.CHAR = function() {
    return this.getToken(treelanParser.CHAR, 0);
};

PrimitiveTypeContext.prototype.BYTE = function() {
    return this.getToken(treelanParser.BYTE, 0);
};

PrimitiveTypeContext.prototype.SHORT = function() {
    return this.getToken(treelanParser.SHORT, 0);
};

PrimitiveTypeContext.prototype.INT = function() {
    return this.getToken(treelanParser.INT, 0);
};

PrimitiveTypeContext.prototype.LONG = function() {
    return this.getToken(treelanParser.LONG, 0);
};

PrimitiveTypeContext.prototype.FLOAT = function() {
    return this.getToken(treelanParser.FLOAT, 0);
};

PrimitiveTypeContext.prototype.DOUBLE = function() {
    return this.getToken(treelanParser.DOUBLE, 0);
};

PrimitiveTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterPrimitiveType(this);
	}
};

PrimitiveTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitPrimitiveType(this);
	}
};




treelanParser.PrimitiveTypeContext = PrimitiveTypeContext;

treelanParser.prototype.primitiveType = function() {

    var localctx = new PrimitiveTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 26, treelanParser.RULE_primitiveType);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 176;
        _la = this._input.LA(1);
        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << treelanParser.BOOLEAN) | (1 << treelanParser.BYTE) | (1 << treelanParser.CHAR) | (1 << treelanParser.DOUBLE) | (1 << treelanParser.FLOAT) | (1 << treelanParser.INT) | (1 << treelanParser.LONG) | (1 << treelanParser.SHORT))) !== 0))) {
        this._errHandler.recoverInline(this);
        }
        else {
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ComplexTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_complexType;
    return this;
}

ComplexTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ComplexTypeContext.prototype.constructor = ComplexTypeContext;

ComplexTypeContext.prototype.LIST = function() {
    return this.getToken(treelanParser.LIST, 0);
};

ComplexTypeContext.prototype.TREE = function() {
    return this.getToken(treelanParser.TREE, 0);
};

ComplexTypeContext.prototype.NODE = function() {
    return this.getToken(treelanParser.NODE, 0);
};

ComplexTypeContext.prototype.SET = function() {
    return this.getToken(treelanParser.SET, 0);
};

ComplexTypeContext.prototype.STRING = function() {
    return this.getToken(treelanParser.STRING, 0);
};

ComplexTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterComplexType(this);
	}
};

ComplexTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitComplexType(this);
	}
};




treelanParser.ComplexTypeContext = ComplexTypeContext;

treelanParser.prototype.complexType = function() {

    var localctx = new ComplexTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 28, treelanParser.RULE_complexType);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 178;
        _la = this._input.LA(1);
        if(!(((((_la - 17)) & ~0x1f) == 0 && ((1 << (_la - 17)) & ((1 << (treelanParser.LIST - 17)) | (1 << (treelanParser.NODE - 17)) | (1 << (treelanParser.STRING - 17)) | (1 << (treelanParser.TREE - 17)) | (1 << (treelanParser.SET - 17)))) !== 0))) {
        this._errHandler.recoverInline(this);
        }
        else {
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


treelanParser.prototype.sempred = function(localctx, ruleIndex, predIndex) {
	switch(ruleIndex) {
	case 7:
			return this.expr_sempred(localctx, predIndex);
    default:
        throw "No predicate with index:" + ruleIndex;
   }
};

treelanParser.prototype.expr_sempred = function(localctx, predIndex) {
	switch(predIndex) {
		case 0:
			return this.precpred(this._ctx, 6);
		case 1:
			return this.precpred(this._ctx, 5);
		case 2:
			return this.precpred(this._ctx, 4);
		case 3:
			return this.precpred(this._ctx, 3);
		default:
			throw "No predicate with index:" + predIndex;
	}
};


exports.treelanParser = treelanParser;