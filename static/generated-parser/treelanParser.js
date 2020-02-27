// Generated from treelan.g4 by ANTLR 4.5.1
// jshint ignore: start
var antlr4 = require('antlr4/index');
var treelanListener = require('./treelanListener').treelanListener;
var grammarFileName = "treelan.g4";

var serializedATN = ["\u0003\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd",
    "\u0003g\u0104\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004",
    "\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004",
    "\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0003\u0002\u0003",
    "\u0002\u0006\u0002)\n\u0002\r\u0002\u000e\u0002*\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0005\u00031\n\u0003\u0003\u0003\u0003\u0003",
    "\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u00049\n\u0004",
    "\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005",
    "\u0007\u0005A\n\u0005\f\u0005\u000e\u0005D\u000b\u0005\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0007\u0007K\n\u0007\f\u0007",
    "\u000e\u0007N\u000b\u0007\u0003\u0007\u0003\u0007\u0003\b\u0003\b\u0003",
    "\b\u0003\b\u0003\b\u0003\b\u0003\b\u0005\bY\n\b\u0003\b\u0003\b\u0003",
    "\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0005\be",
    "\n\b\u0003\t\u0003\t\u0003\t\u0003\t\u0003\n\u0003\n\u0003\n\u0003\n",
    "\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0005\nu\n\n\u0003",
    "\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003",
    "\n\u0003\n\u0003\n\u0005\n\u0083\n\n\u0003\n\u0003\n\u0003\n\u0003\n",
    "\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0007",
    "\n\u0091\n\n\f\n\u000e\n\u0094\u000b\n\u0003\u000b\u0003\u000b\u0003",
    "\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u009b\n\u000b\u0003\u000b",
    "\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b",
    "\u0003\u000b\u0003\u000b\u0005\u000b\u00a6\n\u000b\u0003\u000b\u0003",
    "\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003",
    "\u000b\u0003\u000b\u0005\u000b\u00b1\n\u000b\u0003\u000b\u0003\u000b",
    "\u0005\u000b\u00b5\n\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003",
    "\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003",
    "\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003",
    "\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005",
    "\u000b\u00cc\n\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b",
    "\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b",
    "\u00d7\n\u000b\u0003\f\u0003\f\u0003\r\u0003\r\u0003\r\u0003\r\u0003",
    "\r\u0003\r\u0005\r\u00e1\n\r\u0003\u000e\u0003\u000e\u0003\u000e\u0007",
    "\u000e\u00e6\n\u000e\f\u000e\u000e\u000e\u00e9\u000b\u000e\u0003\u000f",
    "\u0003\u000f\u0003\u000f\u0007\u000f\u00ee\n\u000f\f\u000f\u000e\u000f",
    "\u00f1\u000b\u000f\u0003\u0010\u0003\u0010\u0005\u0010\u00f5\n\u0010",
    "\u0003\u0010\u0003\u0010\u0007\u0010\u00f9\n\u0010\f\u0010\u000e\u0010",
    "\u00fc\u000b\u0010\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003",
    "\u0013\u0003\u0013\u0003\u0013\u0002\u0003\u0012\u0014\u0002\u0004\u0006",
    "\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0002",
    "\b\u0003\u0002ST\u0003\u0002QR\u0003\u0002\n\u0010\u0003\u000238\n\u0002",
    "\u0003\u0004\b\b\u0014\u0014\u0017\u0017\u001a\u001a\u001d\u001d##+",
    "+\u0007\u0002\u001c\u001c  %%((..\u011a\u0002(\u0003\u0002\u0002\u0002",
    "\u0004,\u0003\u0002\u0002\u0002\u00064\u0003\u0002\u0002\u0002\b=\u0003",
    "\u0002\u0002\u0002\nE\u0003\u0002\u0002\u0002\fH\u0003\u0002\u0002\u0002",
    "\u000ed\u0003\u0002\u0002\u0002\u0010f\u0003\u0002\u0002\u0002\u0012",
    "\u0082\u0003\u0002\u0002\u0002\u0014\u00d6\u0003\u0002\u0002\u0002\u0016",
    "\u00d8\u0003\u0002\u0002\u0002\u0018\u00e0\u0003\u0002\u0002\u0002\u001a",
    "\u00e2\u0003\u0002\u0002\u0002\u001c\u00ea\u0003\u0002\u0002\u0002\u001e",
    "\u00f4\u0003\u0002\u0002\u0002 \u00fd\u0003\u0002\u0002\u0002\"\u00ff",
    "\u0003\u0002\u0002\u0002$\u0101\u0003\u0002\u0002\u0002&)\u0005\u0006",
    "\u0004\u0002\')\u0005\u000e\b\u0002(&\u0003\u0002\u0002\u0002(\'\u0003",
    "\u0002\u0002\u0002)*\u0003\u0002\u0002\u0002*(\u0003\u0002\u0002\u0002",
    "*+\u0003\u0002\u0002\u0002+\u0003\u0003\u0002\u0002\u0002,-\u0005\u001e",
    "\u0010\u0002-0\u0007g\u0002\u0002./\u0007B\u0002\u0002/1\u0005\u0012",
    "\n\u00020.\u0003\u0002\u0002\u000201\u0003\u0002\u0002\u000212\u0003",
    "\u0002\u0002\u000223\u0007?\u0002\u00023\u0005\u0003\u0002\u0002\u0002",
    "45\u0005\u001e\u0010\u000256\u0007g\u0002\u000268\u00079\u0002\u0002",
    "79\u0005\b\u0005\u000287\u0003\u0002\u0002\u000289\u0003\u0002\u0002",
    "\u00029:\u0003\u0002\u0002\u0002:;\u0007:\u0002\u0002;<\u0005\f\u0007",
    "\u0002<\u0007\u0003\u0002\u0002\u0002=B\u0005\n\u0006\u0002>?\u0007",
    "@\u0002\u0002?A\u0005\n\u0006\u0002@>\u0003\u0002\u0002\u0002AD\u0003",
    "\u0002\u0002\u0002B@\u0003\u0002\u0002\u0002BC\u0003\u0002\u0002\u0002",
    "C\t\u0003\u0002\u0002\u0002DB\u0003\u0002\u0002\u0002EF\u0005\u001e",
    "\u0010\u0002FG\u0005\u001a\u000e\u0002G\u000b\u0003\u0002\u0002\u0002",
    "HL\u0007;\u0002\u0002IK\u0005\u000e\b\u0002JI\u0003\u0002\u0002\u0002",
    "KN\u0003\u0002\u0002\u0002LJ\u0003\u0002\u0002\u0002LM\u0003\u0002\u0002",
    "\u0002MO\u0003\u0002\u0002\u0002NL\u0003\u0002\u0002\u0002OP\u0007<",
    "\u0002\u0002P\r\u0003\u0002\u0002\u0002Qe\u0005\f\u0007\u0002Re\u0005",
    "\u0004\u0003\u0002ST\u0007\u0019\u0002\u0002TU\u0005\u0010\t\u0002U",
    "X\u0005\u000e\b\u0002VW\u0007\u0016\u0002\u0002WY\u0005\u000e\b\u0002",
    "XV\u0003\u0002\u0002\u0002XY\u0003\u0002\u0002\u0002Ye\u0003\u0002\u0002",
    "\u0002Z[\u0007\'\u0002\u0002[\\\u0005\u0010\t\u0002\\]\u0005\u000e\b",
    "\u0002]e\u0003\u0002\u0002\u0002^_\u0005\u0012\n\u0002_`\u0007?\u0002",
    "\u0002`e\u0003\u0002\u0002\u0002ab\u0005\u0004\u0003\u0002bc\u0007?",
    "\u0002\u0002ce\u0003\u0002\u0002\u0002dQ\u0003\u0002\u0002\u0002dR\u0003",
    "\u0002\u0002\u0002dS\u0003\u0002\u0002\u0002dZ\u0003\u0002\u0002\u0002",
    "d^\u0003\u0002\u0002\u0002da\u0003\u0002\u0002\u0002e\u000f\u0003\u0002",
    "\u0002\u0002fg\u00079\u0002\u0002gh\u0005\u0012\n\u0002hi\u0007:\u0002",
    "\u0002i\u0011\u0003\u0002\u0002\u0002jk\b\n\u0001\u0002kl\u0007R\u0002",
    "\u0002l\u0083\u0005\u0012\n\nmn\u0007E\u0002\u0002n\u0083\u0005\u0012",
    "\n\to\u0083\u0005\u0018\r\u0002p\u0083\u0005\u0014\u000b\u0002qr\u0005",
    "\u001a\u000e\u0002rt\u00079\u0002\u0002su\u0005\u001c\u000f\u0002ts",
    "\u0003\u0002\u0002\u0002tu\u0003\u0002\u0002\u0002uv\u0003\u0002\u0002",
    "\u0002vw\u0007:\u0002\u0002w\u0083\u0003\u0002\u0002\u0002xy\u0005\u001a",
    "\u000e\u0002yz\u0007=\u0002\u0002z{\u0005\u0012\n\u0002{|\u0007>\u0002",
    "\u0002|\u0083\u0003\u0002\u0002\u0002}\u0083\u0005\u001a\u000e\u0002",
    "~\u007f\u00079\u0002\u0002\u007f\u0080\u0005\u0012\n\u0002\u0080\u0081",
    "\u0007:\u0002\u0002\u0081\u0083\u0003\u0002\u0002\u0002\u0082j\u0003",
    "\u0002\u0002\u0002\u0082m\u0003\u0002\u0002\u0002\u0082o\u0003\u0002",
    "\u0002\u0002\u0082p\u0003\u0002\u0002\u0002\u0082q\u0003\u0002\u0002",
    "\u0002\u0082x\u0003\u0002\u0002\u0002\u0082}\u0003\u0002\u0002\u0002",
    "\u0082~\u0003\u0002\u0002\u0002\u0083\u0092\u0003\u0002\u0002\u0002",
    "\u0084\u0085\f\b\u0002\u0002\u0085\u0086\t\u0002\u0002\u0002\u0086\u0091",
    "\u0005\u0012\n\t\u0087\u0088\f\u0007\u0002\u0002\u0088\u0089\t\u0003",
    "\u0002\u0002\u0089\u0091\u0005\u0012\n\b\u008a\u008b\f\u0006\u0002\u0002",
    "\u008b\u008c\u0007B\u0002\u0002\u008c\u0091\u0005\u0012\n\u0007\u008d",
    "\u008e\f\u0005\u0002\u0002\u008e\u008f\u0007I\u0002\u0002\u008f\u0091",
    "\u0005\u0012\n\u0006\u0090\u0084\u0003\u0002\u0002\u0002\u0090\u0087",
    "\u0003\u0002\u0002\u0002\u0090\u008a\u0003\u0002\u0002\u0002\u0090\u008d",
    "\u0003\u0002\u0002\u0002\u0091\u0094\u0003\u0002\u0002\u0002\u0092\u0090",
    "\u0003\u0002\u0002\u0002\u0092\u0093\u0003\u0002\u0002\u0002\u0093\u0013",
    "\u0003\u0002\u0002\u0002\u0094\u0092\u0003\u0002\u0002\u0002\u0095\u0096",
    "\u0007-\u0002\u0002\u0096\u0097\u00079\u0002\u0002\u0097\u009a\u0005",
    "\u001a\u000e\u0002\u0098\u0099\u0007@\u0002\u0002\u0099\u009b\u0005",
    "\u0012\n\u0002\u009a\u0098\u0003\u0002\u0002\u0002\u009a\u009b\u0003",
    "\u0002\u0002\u0002\u009b\u009c\u0003\u0002\u0002\u0002\u009c\u009d\u0007",
    ":\u0002\u0002\u009d\u00d7\u0003\u0002\u0002\u0002\u009e\u009f\u0007",
    "\u001b\u0002\u0002\u009f\u00a0\u00079\u0002\u0002\u00a0\u00a1\u0005",
    "\u001a\u000e\u0002\u00a1\u00a2\u0007@\u0002\u0002\u00a2\u00a5\u0005",
    "\u001a\u000e\u0002\u00a3\u00a4\u0007@\u0002\u0002\u00a4\u00a6\u0005",
    "\u0012\n\u0002\u00a5\u00a3\u0003\u0002\u0002\u0002\u00a5\u00a6\u0003",
    "\u0002\u0002\u0002\u00a6\u00a7\u0003\u0002\u0002\u0002\u00a7\u00a8\u0007",
    ":\u0002\u0002\u00a8\u00d7\u0003\u0002\u0002\u0002\u00a9\u00aa\u0007",
    "\u001e\u0002\u0002\u00aa\u00ab\u00079\u0002\u0002\u00ab\u00ac\u0005",
    "\u001a\u000e\u0002\u00ac\u00ad\u0007@\u0002\u0002\u00ad\u00b0\u0005",
    "\u001a\u000e\u0002\u00ae\u00af\u0007@\u0002\u0002\u00af\u00b1\u0005",
    "\u0016\f\u0002\u00b0\u00ae\u0003\u0002\u0002\u0002\u00b0\u00b1\u0003",
    "\u0002\u0002\u0002\u00b1\u00b4\u0003\u0002\u0002\u0002\u00b2\u00b3\u0007",
    "@\u0002\u0002\u00b3\u00b5\u0005\u0012\n\u0002\u00b4\u00b2\u0003\u0002",
    "\u0002\u0002\u00b4\u00b5\u0003\u0002\u0002\u0002\u00b5\u00b6\u0003\u0002",
    "\u0002\u0002\u00b6\u00b7\u0007:\u0002\u0002\u00b7\u00d7\u0003\u0002",
    "\u0002\u0002\u00b8\u00b9\u0007&\u0002\u0002\u00b9\u00ba\u00079\u0002",
    "\u0002\u00ba\u00bb\u0005\u001a\u000e\u0002\u00bb\u00bc\u0007@\u0002",
    "\u0002\u00bc\u00bd\u0005\u001a\u000e\u0002\u00bd\u00be\u0007:\u0002",
    "\u0002\u00be\u00d7\u0003\u0002\u0002\u0002\u00bf\u00c0\u0007!\u0002",
    "\u0002\u00c0\u00c1\u00079\u0002\u0002\u00c1\u00c2\u0007 \u0002\u0002",
    "\u00c2\u00c3\u0007@\u0002\u0002\u00c3\u00c4\u0005\u001a\u000e\u0002",
    "\u00c4\u00c5\u0007:\u0002\u0002\u00c5\u00d7\u0003\u0002\u0002\u0002",
    "\u00c6\u00c7\u0007\u0011\u0002\u0002\u00c7\u00c8\u00079\u0002\u0002",
    "\u00c8\u00cb\u0005\u001a\u000e\u0002\u00c9\u00ca\u0007@\u0002\u0002",
    "\u00ca\u00cc\u0005\u0012\n\u0002\u00cb\u00c9\u0003\u0002\u0002\u0002",
    "\u00cb\u00cc\u0003\u0002\u0002\u0002\u00cc\u00cd\u0003\u0002\u0002\u0002",
    "\u00cd\u00ce\u0007:\u0002\u0002\u00ce\u00d7\u0003\u0002\u0002\u0002",
    "\u00cf\u00d0\u0007\u0015\u0002\u0002\u00d0\u00d1\u00079\u0002\u0002",
    "\u00d1\u00d2\u0005\u001a\u000e\u0002\u00d2\u00d3\u0007@\u0002\u0002",
    "\u00d3\u00d4\u0005\u001a\u000e\u0002\u00d4\u00d5\u0007:\u0002\u0002",
    "\u00d5\u00d7\u0003\u0002\u0002\u0002\u00d6\u0095\u0003\u0002\u0002\u0002",
    "\u00d6\u009e\u0003\u0002\u0002\u0002\u00d6\u00a9\u0003\u0002\u0002\u0002",
    "\u00d6\u00b8\u0003\u0002\u0002\u0002\u00d6\u00bf\u0003\u0002\u0002\u0002",
    "\u00d6\u00c6\u0003\u0002\u0002\u0002\u00d6\u00cf\u0003\u0002\u0002\u0002",
    "\u00d7\u0015\u0003\u0002\u0002\u0002\u00d8\u00d9\t\u0004\u0002\u0002",
    "\u00d9\u0017\u0003\u0002\u0002\u0002\u00da\u00db\u00079\u0002\u0002",
    "\u00db\u00dc\u0005\u0012\n\u0002\u00dc\u00dd\u0007:\u0002\u0002\u00dd",
    "\u00e1\u0003\u0002\u0002\u0002\u00de\u00e1\u0005 \u0011\u0002\u00df",
    "\u00e1\u0005\u001a\u000e\u0002\u00e0\u00da\u0003\u0002\u0002\u0002\u00e0",
    "\u00de\u0003\u0002\u0002\u0002\u00e0\u00df\u0003\u0002\u0002\u0002\u00e1",
    "\u0019\u0003\u0002\u0002\u0002\u00e2\u00e7\u0007g\u0002\u0002\u00e3",
    "\u00e4\u0007A\u0002\u0002\u00e4\u00e6\u0007g\u0002\u0002\u00e5\u00e3",
    "\u0003\u0002\u0002\u0002\u00e6\u00e9\u0003\u0002\u0002\u0002\u00e7\u00e5",
    "\u0003\u0002\u0002\u0002\u00e7\u00e8\u0003\u0002\u0002\u0002\u00e8\u001b",
    "\u0003\u0002\u0002\u0002\u00e9\u00e7\u0003\u0002\u0002\u0002\u00ea\u00ef",
    "\u0005\u0012\n\u0002\u00eb\u00ec\u0007@\u0002\u0002\u00ec\u00ee\u0005",
    "\u0012\n\u0002\u00ed\u00eb\u0003\u0002\u0002\u0002\u00ee\u00f1\u0003",
    "\u0002\u0002\u0002\u00ef\u00ed\u0003\u0002\u0002\u0002\u00ef\u00f0\u0003",
    "\u0002\u0002\u0002\u00f0\u001d\u0003\u0002\u0002\u0002\u00f1\u00ef\u0003",
    "\u0002\u0002\u0002\u00f2\u00f5\u0005$\u0013\u0002\u00f3\u00f5\u0005",
    "\"\u0012\u0002\u00f4\u00f2\u0003\u0002\u0002\u0002\u00f4\u00f3\u0003",
    "\u0002\u0002\u0002\u00f5\u00fa\u0003\u0002\u0002\u0002\u00f6\u00f7\u0007",
    "=\u0002\u0002\u00f7\u00f9\u0007>\u0002\u0002\u00f8\u00f6\u0003\u0002",
    "\u0002\u0002\u00f9\u00fc\u0003\u0002\u0002\u0002\u00fa\u00f8\u0003\u0002",
    "\u0002\u0002\u00fa\u00fb\u0003\u0002\u0002\u0002\u00fb\u001f\u0003\u0002",
    "\u0002\u0002\u00fc\u00fa\u0003\u0002\u0002\u0002\u00fd\u00fe\t\u0005",
    "\u0002\u0002\u00fe!\u0003\u0002\u0002\u0002\u00ff\u0100\t\u0006\u0002",
    "\u0002\u0100#\u0003\u0002\u0002\u0002\u0101\u0102\t\u0007\u0002\u0002",
    "\u0102%\u0003\u0002\u0002\u0002\u0019(*08BLXdt\u0082\u0090\u0092\u009a",
    "\u00a5\u00b0\u00b4\u00cb\u00d6\u00e0\u00e7\u00ef\u00f4\u00fa"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'boolean'", "'byte'", "'break'", "'case'", "'catch'", 
                     "'char'", "'continue'", "'conformifequal'", "'derivealways'", 
                     "'deriveifequal'", "'terminateifnotequal'", "'terminate'", 
                     "'override'", "'evaluate'", "'explode'", "'default'", 
                     "'do'", "'double'", "'drop'", "'else'", "'float'", 
                     "'for'", "'if'", "'int'", "'join'", "'list'", "'long'", 
                     "'merge'", "'new'", "'node'", "'recognize'", "'return'", 
                     "'short'", "'switch'", "'String'", "'Path'", "'while'", 
                     "'Tree'", "'throw'", "'try'", "'void'", "'union'", 
                     "'select'", "'set'", "'group'", "'aggregate'", "'rename'", 
                     "'reorder'", null, null, null, null, null, "'null'", 
                     "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
                     "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
                     "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
                     "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
                     "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
                     "'^='", "'%='", "'<<='", "'>>='", "'>>>='" ];

var symbolicNames = [ null, "BOOLEAN", "BYTE", "BREAK", "CASE", "CATCH", 
                      "CHAR", "CONTINUE", "CONFORMIFEQUAL", "DERIVEALWAYS", 
                      "DERIVEIFNOTEQUAL", "TERMINATEIFNOTEQUAL", "TERMINATE", 
                      "OVERRIDE", "EVALUATE", "EXPLODE", "DEFAULT", "DO", 
                      "DOUBLE", "DROP", "ELSE", "FLOAT", "FOR", "IF", "INT", 
                      "JOIN", "LIST", "LONG", "MERGE", "NEW", "NODE", "RECOGNIZE", 
                      "RETURN", "SHORT", "SWITCH", "STRING", "PATH", "WHILE", 
                      "TREE", "THROW", "TRY", "VOID", "UNION", "SELECT", 
                      "SET", "GROUP", "AGGREGATE", "RENAME", "REORDER", 
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

var ruleNames =  [ "stats", "varDecl", "functionDecl", "formalParameters", 
                   "formalParameter", "block", "stat", "parExpr", "expr", 
                   "builtinfunction", "conflictspec", "primary", "qualifiedName", 
                   "exprList", "typeType", "literal", "primitiveType", "complexType" ];

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
treelanParser.CONFORMIFEQUAL = 8;
treelanParser.DERIVEALWAYS = 9;
treelanParser.DERIVEIFNOTEQUAL = 10;
treelanParser.TERMINATEIFNOTEQUAL = 11;
treelanParser.TERMINATE = 12;
treelanParser.OVERRIDE = 13;
treelanParser.EVALUATE = 14;
treelanParser.EXPLODE = 15;
treelanParser.DEFAULT = 16;
treelanParser.DO = 17;
treelanParser.DOUBLE = 18;
treelanParser.DROP = 19;
treelanParser.ELSE = 20;
treelanParser.FLOAT = 21;
treelanParser.FOR = 22;
treelanParser.IF = 23;
treelanParser.INT = 24;
treelanParser.JOIN = 25;
treelanParser.LIST = 26;
treelanParser.LONG = 27;
treelanParser.MERGE = 28;
treelanParser.NEW = 29;
treelanParser.NODE = 30;
treelanParser.RECOGNIZE = 31;
treelanParser.RETURN = 32;
treelanParser.SHORT = 33;
treelanParser.SWITCH = 34;
treelanParser.STRING = 35;
treelanParser.PATH = 36;
treelanParser.WHILE = 37;
treelanParser.TREE = 38;
treelanParser.THROW = 39;
treelanParser.TRY = 40;
treelanParser.VOID = 41;
treelanParser.UNION = 42;
treelanParser.SELECT = 43;
treelanParser.SET = 44;
treelanParser.GROUP = 45;
treelanParser.AGGREGATE = 46;
treelanParser.RENAME = 47;
treelanParser.REORDER = 48;
treelanParser.DECIMAL_LITERAL = 49;
treelanParser.FLOAT_LITERAL = 50;
treelanParser.BOOL_LITERAL = 51;
treelanParser.CHAR_LITERAL = 52;
treelanParser.STRING_LITERAL = 53;
treelanParser.NULL_LITERAL = 54;
treelanParser.LPAREN = 55;
treelanParser.RPAREN = 56;
treelanParser.LBRACE = 57;
treelanParser.RBRACE = 58;
treelanParser.LBRACK = 59;
treelanParser.RBRACK = 60;
treelanParser.SEMI = 61;
treelanParser.COMMA = 62;
treelanParser.DOT = 63;
treelanParser.ASSIGN = 64;
treelanParser.GT = 65;
treelanParser.LT = 66;
treelanParser.BANG = 67;
treelanParser.TILDE = 68;
treelanParser.QUESTION = 69;
treelanParser.COLON = 70;
treelanParser.EQUAL = 71;
treelanParser.LE = 72;
treelanParser.GE = 73;
treelanParser.NOTEQUAL = 74;
treelanParser.AND = 75;
treelanParser.OR = 76;
treelanParser.INC = 77;
treelanParser.DEC = 78;
treelanParser.ADD = 79;
treelanParser.SUB = 80;
treelanParser.MUL = 81;
treelanParser.DIV = 82;
treelanParser.BITAND = 83;
treelanParser.BITOR = 84;
treelanParser.CARET = 85;
treelanParser.MOD = 86;
treelanParser.ADD_ASSIGN = 87;
treelanParser.SUB_ASSIGN = 88;
treelanParser.MUL_ASSIGN = 89;
treelanParser.DIV_ASSIGN = 90;
treelanParser.AND_ASSIGN = 91;
treelanParser.OR_ASSIGN = 92;
treelanParser.XOR_ASSIGN = 93;
treelanParser.MOD_ASSIGN = 94;
treelanParser.LSHIFT_ASSIGN = 95;
treelanParser.RSHIFT_ASSIGN = 96;
treelanParser.URSHIFT_ASSIGN = 97;
treelanParser.WS = 98;
treelanParser.COMMENT = 99;
treelanParser.LINE_COMMENT = 100;
treelanParser.IDENTIFIER = 101;

treelanParser.RULE_stats = 0;
treelanParser.RULE_varDecl = 1;
treelanParser.RULE_functionDecl = 2;
treelanParser.RULE_formalParameters = 3;
treelanParser.RULE_formalParameter = 4;
treelanParser.RULE_block = 5;
treelanParser.RULE_stat = 6;
treelanParser.RULE_parExpr = 7;
treelanParser.RULE_expr = 8;
treelanParser.RULE_builtinfunction = 9;
treelanParser.RULE_conflictspec = 10;
treelanParser.RULE_primary = 11;
treelanParser.RULE_qualifiedName = 12;
treelanParser.RULE_exprList = 13;
treelanParser.RULE_typeType = 14;
treelanParser.RULE_literal = 15;
treelanParser.RULE_primitiveType = 16;
treelanParser.RULE_complexType = 17;

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

StatsContext.prototype.functionDecl = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(FunctionDeclContext);
    } else {
        return this.getTypedRuleContext(FunctionDeclContext,i);
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
        this.state = 38; 
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
            this.state = 38;
            this._errHandler.sync(this);
            var la_ = this._interp.adaptivePredict(this._input,0,this._ctx);
            switch(la_) {
            case 1:
                this.state = 36;
                this.functionDecl();
                break;

            case 2:
                this.state = 37;
                this.stat();
                break;

            }
            this.state = 40; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << treelanParser.BOOLEAN) | (1 << treelanParser.BYTE) | (1 << treelanParser.CHAR) | (1 << treelanParser.EXPLODE) | (1 << treelanParser.DOUBLE) | (1 << treelanParser.DROP) | (1 << treelanParser.FLOAT) | (1 << treelanParser.IF) | (1 << treelanParser.INT) | (1 << treelanParser.JOIN) | (1 << treelanParser.LIST) | (1 << treelanParser.LONG) | (1 << treelanParser.MERGE) | (1 << treelanParser.NODE) | (1 << treelanParser.RECOGNIZE))) !== 0) || ((((_la - 33)) & ~0x1f) == 0 && ((1 << (_la - 33)) & ((1 << (treelanParser.SHORT - 33)) | (1 << (treelanParser.STRING - 33)) | (1 << (treelanParser.PATH - 33)) | (1 << (treelanParser.WHILE - 33)) | (1 << (treelanParser.TREE - 33)) | (1 << (treelanParser.VOID - 33)) | (1 << (treelanParser.SELECT - 33)) | (1 << (treelanParser.SET - 33)) | (1 << (treelanParser.DECIMAL_LITERAL - 33)) | (1 << (treelanParser.FLOAT_LITERAL - 33)) | (1 << (treelanParser.BOOL_LITERAL - 33)) | (1 << (treelanParser.CHAR_LITERAL - 33)) | (1 << (treelanParser.STRING_LITERAL - 33)) | (1 << (treelanParser.NULL_LITERAL - 33)) | (1 << (treelanParser.LPAREN - 33)) | (1 << (treelanParser.LBRACE - 33)))) !== 0) || _la===treelanParser.BANG || _la===treelanParser.SUB || _la===treelanParser.IDENTIFIER);
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
        this.state = 42;
        this.typeType();
        this.state = 43;
        this.match(treelanParser.IDENTIFIER);
        this.state = 46;
        _la = this._input.LA(1);
        if(_la===treelanParser.ASSIGN) {
            this.state = 44;
            this.match(treelanParser.ASSIGN);
            this.state = 45;
            this.expr(0);
        }

        this.state = 48;
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

function FunctionDeclContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_functionDecl;
    return this;
}

FunctionDeclContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FunctionDeclContext.prototype.constructor = FunctionDeclContext;

FunctionDeclContext.prototype.typeType = function() {
    return this.getTypedRuleContext(TypeTypeContext,0);
};

FunctionDeclContext.prototype.IDENTIFIER = function() {
    return this.getToken(treelanParser.IDENTIFIER, 0);
};

FunctionDeclContext.prototype.block = function() {
    return this.getTypedRuleContext(BlockContext,0);
};

FunctionDeclContext.prototype.formalParameters = function() {
    return this.getTypedRuleContext(FormalParametersContext,0);
};

FunctionDeclContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterFunctionDecl(this);
	}
};

FunctionDeclContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitFunctionDecl(this);
	}
};




treelanParser.FunctionDeclContext = FunctionDeclContext;

treelanParser.prototype.functionDecl = function() {

    var localctx = new FunctionDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, treelanParser.RULE_functionDecl);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 50;
        this.typeType();
        this.state = 51;
        this.match(treelanParser.IDENTIFIER);
        this.state = 52;
        this.match(treelanParser.LPAREN);
        this.state = 54;
        _la = this._input.LA(1);
        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << treelanParser.BOOLEAN) | (1 << treelanParser.BYTE) | (1 << treelanParser.CHAR) | (1 << treelanParser.DOUBLE) | (1 << treelanParser.FLOAT) | (1 << treelanParser.INT) | (1 << treelanParser.LIST) | (1 << treelanParser.LONG) | (1 << treelanParser.NODE))) !== 0) || ((((_la - 33)) & ~0x1f) == 0 && ((1 << (_la - 33)) & ((1 << (treelanParser.SHORT - 33)) | (1 << (treelanParser.STRING - 33)) | (1 << (treelanParser.TREE - 33)) | (1 << (treelanParser.VOID - 33)) | (1 << (treelanParser.SET - 33)))) !== 0)) {
            this.state = 53;
            this.formalParameters();
        }

        this.state = 56;
        this.match(treelanParser.RPAREN);
        this.state = 57;
        this.block();
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
    this.enterRule(localctx, 6, treelanParser.RULE_formalParameters);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 59;
        this.formalParameter();
        this.state = 64;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===treelanParser.COMMA) {
            this.state = 60;
            this.match(treelanParser.COMMA);
            this.state = 61;
            this.formalParameter();
            this.state = 66;
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

FormalParameterContext.prototype.qualifiedName = function() {
    return this.getTypedRuleContext(QualifiedNameContext,0);
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
    this.enterRule(localctx, 8, treelanParser.RULE_formalParameter);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 67;
        this.typeType();
        this.state = 68;
        this.qualifiedName();
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
    this.enterRule(localctx, 10, treelanParser.RULE_block);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 70;
        this.match(treelanParser.LBRACE);
        this.state = 74;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << treelanParser.BOOLEAN) | (1 << treelanParser.BYTE) | (1 << treelanParser.CHAR) | (1 << treelanParser.EXPLODE) | (1 << treelanParser.DOUBLE) | (1 << treelanParser.DROP) | (1 << treelanParser.FLOAT) | (1 << treelanParser.IF) | (1 << treelanParser.INT) | (1 << treelanParser.JOIN) | (1 << treelanParser.LIST) | (1 << treelanParser.LONG) | (1 << treelanParser.MERGE) | (1 << treelanParser.NODE) | (1 << treelanParser.RECOGNIZE))) !== 0) || ((((_la - 33)) & ~0x1f) == 0 && ((1 << (_la - 33)) & ((1 << (treelanParser.SHORT - 33)) | (1 << (treelanParser.STRING - 33)) | (1 << (treelanParser.PATH - 33)) | (1 << (treelanParser.WHILE - 33)) | (1 << (treelanParser.TREE - 33)) | (1 << (treelanParser.VOID - 33)) | (1 << (treelanParser.SELECT - 33)) | (1 << (treelanParser.SET - 33)) | (1 << (treelanParser.DECIMAL_LITERAL - 33)) | (1 << (treelanParser.FLOAT_LITERAL - 33)) | (1 << (treelanParser.BOOL_LITERAL - 33)) | (1 << (treelanParser.CHAR_LITERAL - 33)) | (1 << (treelanParser.STRING_LITERAL - 33)) | (1 << (treelanParser.NULL_LITERAL - 33)) | (1 << (treelanParser.LPAREN - 33)) | (1 << (treelanParser.LBRACE - 33)))) !== 0) || _la===treelanParser.BANG || _la===treelanParser.SUB || _la===treelanParser.IDENTIFIER) {
            this.state = 71;
            this.stat();
            this.state = 76;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 77;
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

StatContext.prototype.WHILE = function() {
    return this.getToken(treelanParser.WHILE, 0);
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
    this.enterRule(localctx, 12, treelanParser.RULE_stat);
    try {
        this.state = 98;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,7,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 79;
            this.block();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 80;
            this.varDecl();
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 81;
            this.match(treelanParser.IF);
            this.state = 82;
            this.parExpr();
            this.state = 83;
            this.stat();
            this.state = 86;
            this._errHandler.sync(this);
            var la_ = this._interp.adaptivePredict(this._input,6,this._ctx);
            if(la_===1) {
                this.state = 84;
                this.match(treelanParser.ELSE);
                this.state = 85;
                this.stat();

            }
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 88;
            this.match(treelanParser.WHILE);
            this.state = 89;
            this.parExpr();
            this.state = 90;
            this.stat();
            break;

        case 5:
            this.enterOuterAlt(localctx, 5);
            this.state = 92;
            this.expr(0);
            this.state = 93;
            this.match(treelanParser.SEMI);
            break;

        case 6:
            this.enterOuterAlt(localctx, 6);
            this.state = 95;
            this.varDecl();
            this.state = 96;
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
    this.enterRule(localctx, 14, treelanParser.RULE_parExpr);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 100;
        this.match(treelanParser.LPAREN);
        this.state = 101;
        this.expr(0);
        this.state = 102;
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

ExprContext.prototype.qualifiedName = function() {
    return this.getTypedRuleContext(QualifiedNameContext,0);
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
    var _startState = 16;
    this.enterRecursionRule(localctx, 16, treelanParser.RULE_expr, _p);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 128;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
        switch(la_) {
        case 1:
            this.state = 105;
            this.match(treelanParser.SUB);
            this.state = 106;
            this.expr(8);
            break;

        case 2:
            this.state = 107;
            this.match(treelanParser.BANG);
            this.state = 108;
            this.expr(7);
            break;

        case 3:
            this.state = 109;
            this.primary();
            break;

        case 4:
            this.state = 110;
            this.builtinfunction();
            break;

        case 5:
            this.state = 111;
            this.qualifiedName();
            this.state = 112;
            this.match(treelanParser.LPAREN);
            this.state = 114;
            _la = this._input.LA(1);
            if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << treelanParser.EXPLODE) | (1 << treelanParser.DROP) | (1 << treelanParser.JOIN) | (1 << treelanParser.MERGE) | (1 << treelanParser.RECOGNIZE))) !== 0) || ((((_la - 36)) & ~0x1f) == 0 && ((1 << (_la - 36)) & ((1 << (treelanParser.PATH - 36)) | (1 << (treelanParser.SELECT - 36)) | (1 << (treelanParser.DECIMAL_LITERAL - 36)) | (1 << (treelanParser.FLOAT_LITERAL - 36)) | (1 << (treelanParser.BOOL_LITERAL - 36)) | (1 << (treelanParser.CHAR_LITERAL - 36)) | (1 << (treelanParser.STRING_LITERAL - 36)) | (1 << (treelanParser.NULL_LITERAL - 36)) | (1 << (treelanParser.LPAREN - 36)) | (1 << (treelanParser.BANG - 36)))) !== 0) || _la===treelanParser.SUB || _la===treelanParser.IDENTIFIER) {
                this.state = 113;
                this.exprList();
            }

            this.state = 116;
            this.match(treelanParser.RPAREN);
            break;

        case 6:
            this.state = 118;
            this.qualifiedName();
            this.state = 119;
            this.match(treelanParser.LBRACK);
            this.state = 120;
            this.expr(0);
            this.state = 121;
            this.match(treelanParser.RBRACK);
            break;

        case 7:
            this.state = 123;
            this.qualifiedName();
            break;

        case 8:
            this.state = 124;
            this.match(treelanParser.LPAREN);
            this.state = 125;
            this.expr(0);
            this.state = 126;
            this.match(treelanParser.RPAREN);
            break;

        }
        this._ctx.stop = this._input.LT(-1);
        this.state = 144;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,11,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                this.state = 142;
                this._errHandler.sync(this);
                var la_ = this._interp.adaptivePredict(this._input,10,this._ctx);
                switch(la_) {
                case 1:
                    localctx = new ExprContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, treelanParser.RULE_expr);
                    this.state = 130;
                    if (!( this.precpred(this._ctx, 6))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 6)");
                    }
                    this.state = 131;
                    _la = this._input.LA(1);
                    if(!(_la===treelanParser.MUL || _la===treelanParser.DIV)) {
                    this._errHandler.recoverInline(this);
                    }
                    else {
                        this.consume();
                    }
                    this.state = 132;
                    this.expr(7);
                    break;

                case 2:
                    localctx = new ExprContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, treelanParser.RULE_expr);
                    this.state = 133;
                    if (!( this.precpred(this._ctx, 5))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 5)");
                    }
                    this.state = 134;
                    _la = this._input.LA(1);
                    if(!(_la===treelanParser.ADD || _la===treelanParser.SUB)) {
                    this._errHandler.recoverInline(this);
                    }
                    else {
                        this.consume();
                    }
                    this.state = 135;
                    this.expr(6);
                    break;

                case 3:
                    localctx = new ExprContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, treelanParser.RULE_expr);
                    this.state = 136;
                    if (!( this.precpred(this._ctx, 4))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
                    }
                    this.state = 137;
                    this.match(treelanParser.ASSIGN);
                    this.state = 138;
                    this.expr(5);
                    break;

                case 4:
                    localctx = new ExprContext(this, _parentctx, _parentState);
                    this.pushNewRecursionContext(localctx, _startState, treelanParser.RULE_expr);
                    this.state = 139;
                    if (!( this.precpred(this._ctx, 3))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
                    }
                    this.state = 140;
                    this.match(treelanParser.EQUAL);
                    this.state = 141;
                    this.expr(4);
                    break;

                } 
            }
            this.state = 146;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,11,this._ctx);
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

BuiltinfunctionContext.prototype.qualifiedName = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(QualifiedNameContext);
    } else {
        return this.getTypedRuleContext(QualifiedNameContext,i);
    }
};

BuiltinfunctionContext.prototype.expr = function() {
    return this.getTypedRuleContext(ExprContext,0);
};

BuiltinfunctionContext.prototype.JOIN = function() {
    return this.getToken(treelanParser.JOIN, 0);
};

BuiltinfunctionContext.prototype.MERGE = function() {
    return this.getToken(treelanParser.MERGE, 0);
};

BuiltinfunctionContext.prototype.conflictspec = function() {
    return this.getTypedRuleContext(ConflictspecContext,0);
};

BuiltinfunctionContext.prototype.PATH = function() {
    return this.getToken(treelanParser.PATH, 0);
};

BuiltinfunctionContext.prototype.RECOGNIZE = function() {
    return this.getToken(treelanParser.RECOGNIZE, 0);
};

BuiltinfunctionContext.prototype.NODE = function() {
    return this.getToken(treelanParser.NODE, 0);
};

BuiltinfunctionContext.prototype.EXPLODE = function() {
    return this.getToken(treelanParser.EXPLODE, 0);
};

BuiltinfunctionContext.prototype.DROP = function() {
    return this.getToken(treelanParser.DROP, 0);
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
    this.enterRule(localctx, 18, treelanParser.RULE_builtinfunction);
    var _la = 0; // Token type
    try {
        this.state = 212;
        switch(this._input.LA(1)) {
        case treelanParser.SELECT:
            this.enterOuterAlt(localctx, 1);
            this.state = 147;
            this.match(treelanParser.SELECT);
            this.state = 148;
            this.match(treelanParser.LPAREN);
            this.state = 149;
            this.qualifiedName();
            this.state = 152;
            _la = this._input.LA(1);
            if(_la===treelanParser.COMMA) {
                this.state = 150;
                this.match(treelanParser.COMMA);
                this.state = 151;
                this.expr(0);
            }

            this.state = 154;
            this.match(treelanParser.RPAREN);
            break;
        case treelanParser.JOIN:
            this.enterOuterAlt(localctx, 2);
            this.state = 156;
            this.match(treelanParser.JOIN);
            this.state = 157;
            this.match(treelanParser.LPAREN);
            this.state = 158;
            this.qualifiedName();
            this.state = 159;
            this.match(treelanParser.COMMA);
            this.state = 160;
            this.qualifiedName();
            this.state = 163;
            _la = this._input.LA(1);
            if(_la===treelanParser.COMMA) {
                this.state = 161;
                this.match(treelanParser.COMMA);
                this.state = 162;
                this.expr(0);
            }

            this.state = 165;
            this.match(treelanParser.RPAREN);
            break;
        case treelanParser.MERGE:
            this.enterOuterAlt(localctx, 3);
            this.state = 167;
            this.match(treelanParser.MERGE);
            this.state = 168;
            this.match(treelanParser.LPAREN);
            this.state = 169;
            this.qualifiedName();
            this.state = 170;
            this.match(treelanParser.COMMA);
            this.state = 171;
            this.qualifiedName();
            this.state = 174;
            this._errHandler.sync(this);
            var la_ = this._interp.adaptivePredict(this._input,14,this._ctx);
            if(la_===1) {
                this.state = 172;
                this.match(treelanParser.COMMA);
                this.state = 173;
                this.conflictspec();

            }
            this.state = 178;
            _la = this._input.LA(1);
            if(_la===treelanParser.COMMA) {
                this.state = 176;
                this.match(treelanParser.COMMA);
                this.state = 177;
                this.expr(0);
            }

            this.state = 180;
            this.match(treelanParser.RPAREN);
            break;
        case treelanParser.PATH:
            this.enterOuterAlt(localctx, 4);
            this.state = 182;
            this.match(treelanParser.PATH);
            this.state = 183;
            this.match(treelanParser.LPAREN);
            this.state = 184;
            this.qualifiedName();
            this.state = 185;
            this.match(treelanParser.COMMA);
            this.state = 186;
            this.qualifiedName();
            this.state = 187;
            this.match(treelanParser.RPAREN);
            break;
        case treelanParser.RECOGNIZE:
            this.enterOuterAlt(localctx, 5);
            this.state = 189;
            this.match(treelanParser.RECOGNIZE);
            this.state = 190;
            this.match(treelanParser.LPAREN);
            this.state = 191;
            this.match(treelanParser.NODE);
            this.state = 192;
            this.match(treelanParser.COMMA);
            this.state = 193;
            this.qualifiedName();
            this.state = 194;
            this.match(treelanParser.RPAREN);
            break;
        case treelanParser.EXPLODE:
            this.enterOuterAlt(localctx, 6);
            this.state = 196;
            this.match(treelanParser.EXPLODE);
            this.state = 197;
            this.match(treelanParser.LPAREN);
            this.state = 198;
            this.qualifiedName();
            this.state = 201;
            _la = this._input.LA(1);
            if(_la===treelanParser.COMMA) {
                this.state = 199;
                this.match(treelanParser.COMMA);
                this.state = 200;
                this.expr(0);
            }

            this.state = 203;
            this.match(treelanParser.RPAREN);
            break;
        case treelanParser.DROP:
            this.enterOuterAlt(localctx, 7);
            this.state = 205;
            this.match(treelanParser.DROP);
            this.state = 206;
            this.match(treelanParser.LPAREN);
            this.state = 207;
            this.qualifiedName();
            this.state = 208;
            this.match(treelanParser.COMMA);
            this.state = 209;
            this.qualifiedName();
            this.state = 210;
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

function ConflictspecContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_conflictspec;
    return this;
}

ConflictspecContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ConflictspecContext.prototype.constructor = ConflictspecContext;

ConflictspecContext.prototype.CONFORMIFEQUAL = function() {
    return this.getToken(treelanParser.CONFORMIFEQUAL, 0);
};

ConflictspecContext.prototype.DERIVEALWAYS = function() {
    return this.getToken(treelanParser.DERIVEALWAYS, 0);
};

ConflictspecContext.prototype.DERIVEIFNOTEQUAL = function() {
    return this.getToken(treelanParser.DERIVEIFNOTEQUAL, 0);
};

ConflictspecContext.prototype.TERMINATEIFNOTEQUAL = function() {
    return this.getToken(treelanParser.TERMINATEIFNOTEQUAL, 0);
};

ConflictspecContext.prototype.TERMINATE = function() {
    return this.getToken(treelanParser.TERMINATE, 0);
};

ConflictspecContext.prototype.OVERRIDE = function() {
    return this.getToken(treelanParser.OVERRIDE, 0);
};

ConflictspecContext.prototype.EVALUATE = function() {
    return this.getToken(treelanParser.EVALUATE, 0);
};

ConflictspecContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterConflictspec(this);
	}
};

ConflictspecContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitConflictspec(this);
	}
};




treelanParser.ConflictspecContext = ConflictspecContext;

treelanParser.prototype.conflictspec = function() {

    var localctx = new ConflictspecContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, treelanParser.RULE_conflictspec);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 214;
        _la = this._input.LA(1);
        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << treelanParser.CONFORMIFEQUAL) | (1 << treelanParser.DERIVEALWAYS) | (1 << treelanParser.DERIVEIFNOTEQUAL) | (1 << treelanParser.TERMINATEIFNOTEQUAL) | (1 << treelanParser.TERMINATE) | (1 << treelanParser.OVERRIDE) | (1 << treelanParser.EVALUATE))) !== 0))) {
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

PrimaryContext.prototype.qualifiedName = function() {
    return this.getTypedRuleContext(QualifiedNameContext,0);
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
    this.enterRule(localctx, 22, treelanParser.RULE_primary);
    try {
        this.state = 222;
        switch(this._input.LA(1)) {
        case treelanParser.LPAREN:
            this.enterOuterAlt(localctx, 1);
            this.state = 216;
            this.match(treelanParser.LPAREN);
            this.state = 217;
            this.expr(0);
            this.state = 218;
            this.match(treelanParser.RPAREN);
            break;
        case treelanParser.DECIMAL_LITERAL:
        case treelanParser.FLOAT_LITERAL:
        case treelanParser.BOOL_LITERAL:
        case treelanParser.CHAR_LITERAL:
        case treelanParser.STRING_LITERAL:
        case treelanParser.NULL_LITERAL:
            this.enterOuterAlt(localctx, 2);
            this.state = 220;
            this.literal();
            break;
        case treelanParser.IDENTIFIER:
            this.enterOuterAlt(localctx, 3);
            this.state = 221;
            this.qualifiedName();
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

function QualifiedNameContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = treelanParser.RULE_qualifiedName;
    return this;
}

QualifiedNameContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
QualifiedNameContext.prototype.constructor = QualifiedNameContext;

QualifiedNameContext.prototype.IDENTIFIER = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(treelanParser.IDENTIFIER);
    } else {
        return this.getToken(treelanParser.IDENTIFIER, i);
    }
};


QualifiedNameContext.prototype.enterRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.enterQualifiedName(this);
	}
};

QualifiedNameContext.prototype.exitRule = function(listener) {
    if(listener instanceof treelanListener ) {
        listener.exitQualifiedName(this);
	}
};




treelanParser.QualifiedNameContext = QualifiedNameContext;

treelanParser.prototype.qualifiedName = function() {

    var localctx = new QualifiedNameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, treelanParser.RULE_qualifiedName);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 224;
        this.match(treelanParser.IDENTIFIER);
        this.state = 229;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,19,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                this.state = 225;
                this.match(treelanParser.DOT);
                this.state = 226;
                this.match(treelanParser.IDENTIFIER); 
            }
            this.state = 231;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,19,this._ctx);
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
    this.enterRule(localctx, 26, treelanParser.RULE_exprList);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 232;
        this.expr(0);
        this.state = 237;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===treelanParser.COMMA) {
            this.state = 233;
            this.match(treelanParser.COMMA);
            this.state = 234;
            this.expr(0);
            this.state = 239;
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
    this.enterRule(localctx, 28, treelanParser.RULE_typeType);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 242;
        switch(this._input.LA(1)) {
        case treelanParser.LIST:
        case treelanParser.NODE:
        case treelanParser.STRING:
        case treelanParser.TREE:
        case treelanParser.SET:
            this.state = 240;
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
        case treelanParser.VOID:
            this.state = 241;
            this.primitiveType();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
        this.state = 248;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===treelanParser.LBRACK) {
            this.state = 244;
            this.match(treelanParser.LBRACK);
            this.state = 245;
            this.match(treelanParser.RBRACK);
            this.state = 250;
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
    this.enterRule(localctx, 30, treelanParser.RULE_literal);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 251;
        _la = this._input.LA(1);
        if(!(((((_la - 49)) & ~0x1f) == 0 && ((1 << (_la - 49)) & ((1 << (treelanParser.DECIMAL_LITERAL - 49)) | (1 << (treelanParser.FLOAT_LITERAL - 49)) | (1 << (treelanParser.BOOL_LITERAL - 49)) | (1 << (treelanParser.CHAR_LITERAL - 49)) | (1 << (treelanParser.STRING_LITERAL - 49)) | (1 << (treelanParser.NULL_LITERAL - 49)))) !== 0))) {
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

PrimitiveTypeContext.prototype.VOID = function() {
    return this.getToken(treelanParser.VOID, 0);
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
    this.enterRule(localctx, 32, treelanParser.RULE_primitiveType);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 253;
        _la = this._input.LA(1);
        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << treelanParser.BOOLEAN) | (1 << treelanParser.BYTE) | (1 << treelanParser.CHAR) | (1 << treelanParser.DOUBLE) | (1 << treelanParser.FLOAT) | (1 << treelanParser.INT) | (1 << treelanParser.LONG))) !== 0) || _la===treelanParser.SHORT || _la===treelanParser.VOID)) {
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
    this.enterRule(localctx, 34, treelanParser.RULE_complexType);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 255;
        _la = this._input.LA(1);
        if(!(((((_la - 26)) & ~0x1f) == 0 && ((1 << (_la - 26)) & ((1 << (treelanParser.LIST - 26)) | (1 << (treelanParser.NODE - 26)) | (1 << (treelanParser.STRING - 26)) | (1 << (treelanParser.TREE - 26)) | (1 << (treelanParser.SET - 26)))) !== 0))) {
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
	case 8:
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
