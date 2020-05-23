// Generated from TreeQL.g4 by ANTLR 4.5.1
// jshint ignore: start
var antlr4 = require('antlr4/index');
var TreeQLListener = require('./TreeQLListener').TreeQLListener;
var grammarFileName = "TreeQL.g4";

var serializedATN = ["\u0003\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd",
    "\u0003G\u0111\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004",
    "\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004",
    "\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t",
    "\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004",
    "\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t",
    "\u001b\u0004\u001c\t\u001c\u0004\u001d\t\u001d\u0004\u001e\t\u001e\u0003",
    "\u0002\u0005\u0002>\n\u0002\u0003\u0002\u0007\u0002A\n\u0002\f\u0002",
    "\u000e\u0002D\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003M\n\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004T",
    "\n\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005",
    "\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005_\n\u0005",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0005\u0006g\n\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007",
    "\u0003\u0007\u0003\u0007\u0005\u0007o\n\u0007\u0006\u0007q\n\u0007\r",
    "\u0007\u000e\u0007r\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b",
    "\u0005\b{\n\b\u0003\b\u0005\b~\n\b\u0006\b\u0080\n\b\r\b\u000e\b\u0081",
    "\u0003\t\u0003\t\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003\n\u0003",
    "\n\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u0090\n\u000b\u0003",
    "\f\u0003\f\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0005\u000e\u0098",
    "\n\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0007\u000f",
    "\u009e\n\u000f\f\u000f\u000e\u000f\u00a1\u000b\u000f\u0003\u0010\u0005",
    "\u0010\u00a4\n\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011",
    "\u0003\u0011\u0003\u0011\u0005\u0011\u00ac\n\u0011\u0003\u0011\u0003",
    "\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u00b2\n\u0011\u0003\u0012",
    "\u0003\u0012\u0005\u0012\u00b6\n\u0012\u0003\u0012\u0003\u0012\u0007",
    "\u0012\u00ba\n\u0012\f\u0012\u000e\u0012\u00bd\u000b\u0012\u0003\u0013",
    "\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u00c4\n",
    "\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u00c9\n\u0013",
    "\u0005\u0013\u00cb\n\u0013\u0003\u0014\u0003\u0014\u0005\u0014\u00cf",
    "\n\u0014\u0003\u0014\u0003\u0014\u0007\u0014\u00d3\n\u0014\f\u0014\u000e",
    "\u0014\u00d6\u000b\u0014\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016",
    "\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018",
    "\u0003\u0018\u0003\u0018\u0005\u0018\u00e4\n\u0018\u0003\u0019\u0003",
    "\u0019\u0003\u0019\u0003\u0019\u0007\u0019\u00ea\n\u0019\f\u0019\u000e",
    "\u0019\u00ed\u000b\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019",
    "\u0005\u0019\u00f3\n\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003",
    "\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0007\u001b\u00fd",
    "\n\u001b\f\u001b\u000e\u001b\u0100\u000b\u001b\u0003\u001b\u0003\u001b",
    "\u0003\u001b\u0003\u001b\u0005\u001b\u0106\n\u001b\u0003\u001c\u0003",
    "\u001c\u0003\u001d\u0003\u001d\u0003\u001e\u0005\u001e\u010d\n\u001e",
    "\u0003\u001e\u0003\u001e\u0003\u001e\u0002\u0002\u001f\u0002\u0004\u0006",
    "\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*",
    ",.02468:\u0002\t\u0003\u0002\u0017\u001d\u0003\u0002BC\u0006\u0002\u0013",
    "\u0016 !##\'\'\u0004\u0002((**\u0006\u0002\u0010\u0010016;>B\u0004\u0002",
    "22??\u0003\u0002>?\u011c\u0002=\u0003\u0002\u0002\u0002\u0004H\u0003",
    "\u0002\u0002\u0002\u0006S\u0003\u0002\u0002\u0002\b^\u0003\u0002\u0002",
    "\u0002\n`\u0003\u0002\u0002\u0002\fh\u0003\u0002\u0002\u0002\u000et",
    "\u0003\u0002\u0002\u0002\u0010\u0083\u0003\u0002\u0002\u0002\u0012\u0085",
    "\u0003\u0002\u0002\u0002\u0014\u008c\u0003\u0002\u0002\u0002\u0016\u0091",
    "\u0003\u0002\u0002\u0002\u0018\u0093\u0003\u0002\u0002\u0002\u001a\u0097",
    "\u0003\u0002\u0002\u0002\u001c\u0099\u0003\u0002\u0002\u0002\u001e\u00a3",
    "\u0003\u0002\u0002\u0002 \u00b1\u0003\u0002\u0002\u0002\"\u00b5\u0003",
    "\u0002\u0002\u0002$\u00ca\u0003\u0002\u0002\u0002&\u00ce\u0003\u0002",
    "\u0002\u0002(\u00d7\u0003\u0002\u0002\u0002*\u00d9\u0003\u0002\u0002",
    "\u0002,\u00db\u0003\u0002\u0002\u0002.\u00e3\u0003\u0002\u0002\u0002",
    "0\u00f2\u0003\u0002\u0002\u00022\u00f4\u0003\u0002\u0002\u00024\u0105",
    "\u0003\u0002\u0002\u00026\u0107\u0003\u0002\u0002\u00028\u0109\u0003",
    "\u0002\u0002\u0002:\u010c\u0003\u0002\u0002\u0002<>\u0007G\u0002\u0002",
    "=<\u0003\u0002\u0002\u0002=>\u0003\u0002\u0002\u0002>B\u0003\u0002\u0002",
    "\u0002?A\u0005\u0004\u0003\u0002@?\u0003\u0002\u0002\u0002AD\u0003\u0002",
    "\u0002\u0002B@\u0003\u0002\u0002\u0002BC\u0003\u0002\u0002\u0002CE\u0003",
    "\u0002\u0002\u0002DB\u0003\u0002\u0002\u0002EF\u0005\b\u0005\u0002F",
    "G\u0007\u0002\u0002\u0003G\u0003\u0003\u0002\u0002\u0002HI\u0005&\u0014",
    "\u0002IL\u0007C\u0002\u0002JK\u0007/\u0002\u0002KM\u0005\u0006\u0004",
    "\u0002LJ\u0003\u0002\u0002\u0002LM\u0003\u0002\u0002\u0002MN\u0003\u0002",
    "\u0002\u0002NO\u0007\u000f\u0002\u0002O\u0005\u0003\u0002\u0002\u0002",
    "PT\u0005\u001a\u000e\u0002QT\u0005:\u001e\u0002RT\u0005,\u0017\u0002",
    "SP\u0003\u0002\u0002\u0002SQ\u0003\u0002\u0002\u0002SR\u0003\u0002\u0002",
    "\u0002T\u0007\u0003\u0002\u0002\u0002U_\u0005\n\u0006\u0002V_\u0005",
    "\f\u0007\u0002W_\u0005\u000e\b\u0002X_\u0005\u0012\n\u0002YZ\u0007\t",
    "\u0002\u0002Z[\u0005\b\u0005\u0002[\\\u0007\n\u0002\u0002\\_\u0003\u0002",
    "\u0002\u0002]_\u0005\u0014\u000b\u0002^U\u0003\u0002\u0002\u0002^V\u0003",
    "\u0002\u0002\u0002^W\u0003\u0002\u0002\u0002^X\u0003\u0002\u0002\u0002",
    "^Y\u0003\u0002\u0002\u0002^]\u0003\u0002\u0002\u0002_\t\u0003\u0002",
    "\u0002\u0002`a\u0007,\u0002\u0002ab\u0005\"\u0012\u0002bc\u0007-\u0002",
    "\u0002cf\u0005\b\u0005\u0002de\u0007.\u0002\u0002eg\u0005\u0018\r\u0002",
    "fd\u0003\u0002\u0002\u0002fg\u0003\u0002\u0002\u0002g\u000b\u0003\u0002",
    "\u0002\u0002hi\u0007\"\u0002\u0002ip\u0005\b\u0005\u0002jk\u0007\u0010",
    "\u0002\u0002kn\u0005\b\u0005\u0002lm\u0007%\u0002\u0002mo\u0005\u0018",
    "\r\u0002nl\u0003\u0002\u0002\u0002no\u0003\u0002\u0002\u0002oq\u0003",
    "\u0002\u0002\u0002pj\u0003\u0002\u0002\u0002qr\u0003\u0002\u0002\u0002",
    "rp\u0003\u0002\u0002\u0002rs\u0003\u0002\u0002\u0002s\r\u0003\u0002",
    "\u0002\u0002tu\u0007$\u0002\u0002u\u007f\u0005\b\u0005\u0002vw\u0007",
    "\u0010\u0002\u0002wz\u0005\b\u0005\u0002xy\u0007%\u0002\u0002y{\u0005",
    "\u0018\r\u0002zx\u0003\u0002\u0002\u0002z{\u0003\u0002\u0002\u0002{",
    "}\u0003\u0002\u0002\u0002|~\u0005\u0010\t\u0002}|\u0003\u0002\u0002",
    "\u0002}~\u0003\u0002\u0002\u0002~\u0080\u0003\u0002\u0002\u0002\u007f",
    "v\u0003\u0002\u0002\u0002\u0080\u0081\u0003\u0002\u0002\u0002\u0081",
    "\u007f\u0003\u0002\u0002\u0002\u0081\u0082\u0003\u0002\u0002\u0002\u0082",
    "\u000f\u0003\u0002\u0002\u0002\u0083\u0084\t\u0002\u0002\u0002\u0084",
    "\u0011\u0003\u0002\u0002\u0002\u0085\u0086\u0007\u001e\u0002\u0002\u0086",
    "\u0087\u0007\t\u0002\u0002\u0087\u0088\u0005\"\u0012\u0002\u0088\u0089",
    "\u0007\u0010\u0002\u0002\u0089\u008a\u0005\u001a\u000e\u0002\u008a\u008b",
    "\u0007\n\u0002\u0002\u008b\u0013\u0003\u0002\u0002\u0002\u008c\u008f",
    "\u0005\u0016\f\u0002\u008d\u008e\u0007\u0012\u0002\u0002\u008e\u0090",
    "\u0007C\u0002\u0002\u008f\u008d\u0003\u0002\u0002\u0002\u008f\u0090",
    "\u0003\u0002\u0002\u0002\u0090\u0015\u0003\u0002\u0002\u0002\u0091\u0092",
    "\u0007C\u0002\u0002\u0092\u0017\u0003\u0002\u0002\u0002\u0093\u0094",
    "\u0005\u001c\u000f\u0002\u0094\u0019\u0003\u0002\u0002\u0002\u0095\u0098",
    "\u0005\"\u0012\u0002\u0096\u0098\u0005\u001c\u000f\u0002\u0097\u0095",
    "\u0003\u0002\u0002\u0002\u0097\u0096\u0003\u0002\u0002\u0002\u0098\u001b",
    "\u0003\u0002\u0002\u0002\u0099\u009f\u0005\u001e\u0010\u0002\u009a\u009b",
    "\u00056\u001c\u0002\u009b\u009c\u0005\u001e\u0010\u0002\u009c\u009e",
    "\u0003\u0002\u0002\u0002\u009d\u009a\u0003\u0002\u0002\u0002\u009e\u00a1",
    "\u0003\u0002\u0002\u0002\u009f\u009d\u0003\u0002\u0002\u0002\u009f\u00a0",
    "\u0003\u0002\u0002\u0002\u00a0\u001d\u0003\u0002\u0002\u0002\u00a1\u009f",
    "\u0003\u0002\u0002\u0002\u00a2\u00a4\u00058\u001d\u0002\u00a3\u00a2",
    "\u0003\u0002\u0002\u0002\u00a3\u00a4\u0003\u0002\u0002\u0002\u00a4\u00a5",
    "\u0003\u0002\u0002\u0002\u00a5\u00a6\u0005 \u0011\u0002\u00a6\u001f",
    "\u0003\u0002\u0002\u0002\u00a7\u00b2\u0007\u0004\u0002\u0002\u00a8\u00b2",
    "\u0007\u0005\u0002\u0002\u00a9\u00b2\u0005:\u001e\u0002\u00aa\u00ac",
    "\u0007C\u0002\u0002\u00ab\u00aa\u0003\u0002\u0002\u0002\u00ab\u00ac",
    "\u0003\u0002\u0002\u0002\u00ac\u00ad\u0003\u0002\u0002\u0002\u00ad\u00ae",
    "\u0007\t\u0002\u0002\u00ae\u00af\u0005\u001a\u000e\u0002\u00af\u00b0",
    "\u0007\n\u0002\u0002\u00b0\u00b2\u0003\u0002\u0002\u0002\u00b1\u00a7",
    "\u0003\u0002\u0002\u0002\u00b1\u00a8\u0003\u0002\u0002\u0002\u00b1\u00a9",
    "\u0003\u0002\u0002\u0002\u00b1\u00ab\u0003\u0002\u0002\u0002\u00b2!",
    "\u0003\u0002\u0002\u0002\u00b3\u00b6\u0007B\u0002\u0002\u00b4\u00b6",
    "\u0005$\u0013\u0002\u00b5\u00b3\u0003\u0002\u0002\u0002\u00b5\u00b4",
    "\u0003\u0002\u0002\u0002\u00b6\u00bb\u0003\u0002\u0002\u0002\u00b7\u00b8",
    "\u0007\u0010\u0002\u0002\u00b8\u00ba\u0005$\u0013\u0002\u00b9\u00b7",
    "\u0003\u0002\u0002\u0002\u00ba\u00bd\u0003\u0002\u0002\u0002\u00bb\u00b9",
    "\u0003\u0002\u0002\u0002\u00bb\u00bc\u0003\u0002\u0002\u0002\u00bc#",
    "\u0003\u0002\u0002\u0002\u00bd\u00bb\u0003\u0002\u0002\u0002\u00be\u00bf",
    "\u0005\u0016\f\u0002\u00bf\u00c0\u0007\u0011\u0002\u0002\u00c0\u00c3",
    "\t\u0003\u0002\u0002\u00c1\u00c2\u0007\u0012\u0002\u0002\u00c2\u00c4",
    "\u0007C\u0002\u0002\u00c3\u00c1\u0003\u0002\u0002\u0002\u00c3\u00c4",
    "\u0003\u0002\u0002\u0002\u00c4\u00cb\u0003\u0002\u0002\u0002\u00c5\u00c8",
    "\u0007C\u0002\u0002\u00c6\u00c7\u0007\u0012\u0002\u0002\u00c7\u00c9",
    "\u0007C\u0002\u0002\u00c8\u00c6\u0003\u0002\u0002\u0002\u00c8\u00c9",
    "\u0003\u0002\u0002\u0002\u00c9\u00cb\u0003\u0002\u0002\u0002\u00ca\u00be",
    "\u0003\u0002\u0002\u0002\u00ca\u00c5\u0003\u0002\u0002\u0002\u00cb%",
    "\u0003\u0002\u0002\u0002\u00cc\u00cf\u0005*\u0016\u0002\u00cd\u00cf",
    "\u0005(\u0015\u0002\u00ce\u00cc\u0003\u0002\u0002\u0002\u00ce\u00cd",
    "\u0003\u0002\u0002\u0002\u00cf\u00d4\u0003\u0002\u0002\u0002\u00d0\u00d1",
    "\u0007\r\u0002\u0002\u00d1\u00d3\u0007\u000e\u0002\u0002\u00d2\u00d0",
    "\u0003\u0002\u0002\u0002\u00d3\u00d6\u0003\u0002\u0002\u0002\u00d4\u00d2",
    "\u0003\u0002\u0002\u0002\u00d4\u00d5\u0003\u0002\u0002\u0002\u00d5\'",
    "\u0003\u0002\u0002\u0002\u00d6\u00d4\u0003\u0002\u0002\u0002\u00d7\u00d8",
    "\t\u0004\u0002\u0002\u00d8)\u0003\u0002\u0002\u0002\u00d9\u00da\t\u0005",
    "\u0002\u0002\u00da+\u0003\u0002\u0002\u0002\u00db\u00dc\u0005.\u0018",
    "\u0002\u00dc-\u0003\u0002\u0002\u0002\u00dd\u00e4\u0007\u0005\u0002",
    "\u0002\u00de\u00e4\u0005:\u001e\u0002\u00df\u00e4\u00050\u0019\u0002",
    "\u00e0\u00e4\u00054\u001b\u0002\u00e1\u00e4\u0007\u0004\u0002\u0002",
    "\u00e2\u00e4\u0007\u0003\u0002\u0002\u00e3\u00dd\u0003\u0002\u0002\u0002",
    "\u00e3\u00de\u0003\u0002\u0002\u0002\u00e3\u00df\u0003\u0002\u0002\u0002",
    "\u00e3\u00e0\u0003\u0002\u0002\u0002\u00e3\u00e1\u0003\u0002\u0002\u0002",
    "\u00e3\u00e2\u0003\u0002\u0002\u0002\u00e4/\u0003\u0002\u0002\u0002",
    "\u00e5\u00e6\u0007\u000b\u0002\u0002\u00e6\u00eb\u00052\u001a\u0002",
    "\u00e7\u00e8\u0007\u0010\u0002\u0002\u00e8\u00ea\u00052\u001a\u0002",
    "\u00e9\u00e7\u0003\u0002\u0002\u0002\u00ea\u00ed\u0003\u0002\u0002\u0002",
    "\u00eb\u00e9\u0003\u0002\u0002\u0002\u00eb\u00ec\u0003\u0002\u0002\u0002",
    "\u00ec\u00ee\u0003\u0002\u0002\u0002\u00ed\u00eb\u0003\u0002\u0002\u0002",
    "\u00ee\u00ef\u0007\f\u0002\u0002\u00ef\u00f3\u0003\u0002\u0002\u0002",
    "\u00f0\u00f1\u0007\u000b\u0002\u0002\u00f1\u00f3\u0007\f\u0002\u0002",
    "\u00f2\u00e5\u0003\u0002\u0002\u0002\u00f2\u00f0\u0003\u0002\u0002\u0002",
    "\u00f31\u0003\u0002\u0002\u0002\u00f4\u00f5\u0007\u0005\u0002\u0002",
    "\u00f5\u00f6\u00075\u0002\u0002\u00f6\u00f7\u0005.\u0018\u0002\u00f7",
    "3\u0003\u0002\u0002\u0002\u00f8\u00f9\u0007\r\u0002\u0002\u00f9\u00fe",
    "\u0005.\u0018\u0002\u00fa\u00fb\u0007\u0010\u0002\u0002\u00fb\u00fd",
    "\u0005.\u0018\u0002\u00fc\u00fa\u0003\u0002\u0002\u0002\u00fd\u0100",
    "\u0003\u0002\u0002\u0002\u00fe\u00fc\u0003\u0002\u0002\u0002\u00fe\u00ff",
    "\u0003\u0002\u0002\u0002\u00ff\u0101\u0003\u0002\u0002\u0002\u0100\u00fe",
    "\u0003\u0002\u0002\u0002\u0101\u0102\u0007\u000e\u0002\u0002\u0102\u0106",
    "\u0003\u0002\u0002\u0002\u0103\u0104\u0007\r\u0002\u0002\u0104\u0106",
    "\u0007\u000e\u0002\u0002\u0105\u00f8\u0003\u0002\u0002\u0002\u0105\u0103",
    "\u0003\u0002\u0002\u0002\u01065\u0003\u0002\u0002\u0002\u0107\u0108",
    "\t\u0006\u0002\u0002\u01087\u0003\u0002\u0002\u0002\u0109\u010a\t\u0007",
    "\u0002\u0002\u010a9\u0003\u0002\u0002\u0002\u010b\u010d\t\b\u0002\u0002",
    "\u010c\u010b\u0003\u0002\u0002\u0002\u010c\u010d\u0003\u0002\u0002\u0002",
    "\u010d\u010e\u0003\u0002\u0002\u0002\u010e\u010f\u0007\u0006\u0002\u0002",
    "\u010f;\u0003\u0002\u0002\u0002 =BLS^fnrz}\u0081\u008f\u0097\u009f\u00a3",
    "\u00ab\u00b1\u00b5\u00bb\u00c3\u00c8\u00ca\u00ce\u00d4\u00e3\u00eb\u00f2",
    "\u00fe\u0105\u010c"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'null'", null, null, null, "'true'", "'false'", 
                     "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
                     "'.'", "'as'", "'boolean'", "'byte'", "'char'", "'double'", 
                     "'conform if equal'", "'derive always'", "'derive if equal'", 
                     "'terminate if not equal'", "'terminate'", "'override'", 
                     "'evaluate'", "'explode'", "'drop'", "'float'", "'int'", 
                     "'join'", "'long'", "'merge'", "'on'", "'recognize'", 
                     "'short'", "'String'", "'Path'", "'Tree'", "'union'", 
                     "'select'", "'from'", "'where'", "'='", "'>'", "'<'", 
                     "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
                     "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
                     "'/'", "'%'", "'*'" ];

var symbolicNames = [ null, null, "BOOLEAN_LITERAL", "STRING_LITERAL", "NUMERIC_LITERAL", 
                      "TRUE", "FALSE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
                      "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "AS", 
                      "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "CONFORMIFEQUAL", 
                      "DERIVEALWAYS", "DERIVEIFNOTEQUAL", "TERMINATEIFNOTEQUAL", 
                      "TERMINATE", "OVERRIDE", "EVALUATE", "EXPLODE", "DROP", 
                      "FLOAT", "INT", "JOIN", "LONG", "MERGE", "ON", "RECOGNIZE", 
                      "SHORT", "STRING", "PATH", "TREE", "UNION", "SELECT", 
                      "FROM", "WHERE", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
                      "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
                      "AND", "OR", "INC", "DEC", "ADD", "SUBORNEGATION", 
                      "DIV", "MOD", "STAR", "VAR_NAME", "CHARACTER", "ESCAPE_CHARACTER", 
                      "WS", "COMMENT" ];

var ruleNames =  [ "stats", "definition", "assignmentExpr", "treeQuery", 
                   "selectQuery", "joinQuery", "mergeQuery", "conflictspec", 
                   "explodeQuery", "rangeVariableDeclaration", "abstractTreeName", 
                   "selectExpression", "expression", "arithmeticLogicExpression", 
                   "binaryOperand", "unaryOperand", "treeExpression", "treeElement", 
                   "typeType", "primitiveType", "complexType", "json", "json_value", 
                   "obj", "pair", "arr", "binaryOperator", "unaryOperator", 
                   "signed_number" ];

function TreeQLParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

TreeQLParser.prototype = Object.create(antlr4.Parser.prototype);
TreeQLParser.prototype.constructor = TreeQLParser;

Object.defineProperty(TreeQLParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

TreeQLParser.EOF = antlr4.Token.EOF;
TreeQLParser.T__0 = 1;
TreeQLParser.BOOLEAN_LITERAL = 2;
TreeQLParser.STRING_LITERAL = 3;
TreeQLParser.NUMERIC_LITERAL = 4;
TreeQLParser.TRUE = 5;
TreeQLParser.FALSE = 6;
TreeQLParser.LPAREN = 7;
TreeQLParser.RPAREN = 8;
TreeQLParser.LBRACE = 9;
TreeQLParser.RBRACE = 10;
TreeQLParser.LBRACK = 11;
TreeQLParser.RBRACK = 12;
TreeQLParser.SEMI = 13;
TreeQLParser.COMMA = 14;
TreeQLParser.DOT = 15;
TreeQLParser.AS = 16;
TreeQLParser.BOOLEAN = 17;
TreeQLParser.BYTE = 18;
TreeQLParser.CHAR = 19;
TreeQLParser.DOUBLE = 20;
TreeQLParser.CONFORMIFEQUAL = 21;
TreeQLParser.DERIVEALWAYS = 22;
TreeQLParser.DERIVEIFNOTEQUAL = 23;
TreeQLParser.TERMINATEIFNOTEQUAL = 24;
TreeQLParser.TERMINATE = 25;
TreeQLParser.OVERRIDE = 26;
TreeQLParser.EVALUATE = 27;
TreeQLParser.EXPLODE = 28;
TreeQLParser.DROP = 29;
TreeQLParser.FLOAT = 30;
TreeQLParser.INT = 31;
TreeQLParser.JOIN = 32;
TreeQLParser.LONG = 33;
TreeQLParser.MERGE = 34;
TreeQLParser.ON = 35;
TreeQLParser.RECOGNIZE = 36;
TreeQLParser.SHORT = 37;
TreeQLParser.STRING = 38;
TreeQLParser.PATH = 39;
TreeQLParser.TREE = 40;
TreeQLParser.UNION = 41;
TreeQLParser.SELECT = 42;
TreeQLParser.FROM = 43;
TreeQLParser.WHERE = 44;
TreeQLParser.ASSIGN = 45;
TreeQLParser.GT = 46;
TreeQLParser.LT = 47;
TreeQLParser.BANG = 48;
TreeQLParser.TILDE = 49;
TreeQLParser.QUESTION = 50;
TreeQLParser.COLON = 51;
TreeQLParser.EQUAL = 52;
TreeQLParser.LE = 53;
TreeQLParser.GE = 54;
TreeQLParser.NOTEQUAL = 55;
TreeQLParser.AND = 56;
TreeQLParser.OR = 57;
TreeQLParser.INC = 58;
TreeQLParser.DEC = 59;
TreeQLParser.ADD = 60;
TreeQLParser.SUBORNEGATION = 61;
TreeQLParser.DIV = 62;
TreeQLParser.MOD = 63;
TreeQLParser.STAR = 64;
TreeQLParser.VAR_NAME = 65;
TreeQLParser.CHARACTER = 66;
TreeQLParser.ESCAPE_CHARACTER = 67;
TreeQLParser.WS = 68;
TreeQLParser.COMMENT = 69;

TreeQLParser.RULE_stats = 0;
TreeQLParser.RULE_definition = 1;
TreeQLParser.RULE_assignmentExpr = 2;
TreeQLParser.RULE_treeQuery = 3;
TreeQLParser.RULE_selectQuery = 4;
TreeQLParser.RULE_joinQuery = 5;
TreeQLParser.RULE_mergeQuery = 6;
TreeQLParser.RULE_conflictspec = 7;
TreeQLParser.RULE_explodeQuery = 8;
TreeQLParser.RULE_rangeVariableDeclaration = 9;
TreeQLParser.RULE_abstractTreeName = 10;
TreeQLParser.RULE_selectExpression = 11;
TreeQLParser.RULE_expression = 12;
TreeQLParser.RULE_arithmeticLogicExpression = 13;
TreeQLParser.RULE_binaryOperand = 14;
TreeQLParser.RULE_unaryOperand = 15;
TreeQLParser.RULE_treeExpression = 16;
TreeQLParser.RULE_treeElement = 17;
TreeQLParser.RULE_typeType = 18;
TreeQLParser.RULE_primitiveType = 19;
TreeQLParser.RULE_complexType = 20;
TreeQLParser.RULE_json = 21;
TreeQLParser.RULE_json_value = 22;
TreeQLParser.RULE_obj = 23;
TreeQLParser.RULE_pair = 24;
TreeQLParser.RULE_arr = 25;
TreeQLParser.RULE_binaryOperator = 26;
TreeQLParser.RULE_unaryOperator = 27;
TreeQLParser.RULE_signed_number = 28;

function StatsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_stats;
    return this;
}

StatsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatsContext.prototype.constructor = StatsContext;

StatsContext.prototype.treeQuery = function() {
    return this.getTypedRuleContext(TreeQueryContext,0);
};

StatsContext.prototype.EOF = function() {
    return this.getToken(TreeQLParser.EOF, 0);
};

StatsContext.prototype.COMMENT = function() {
    return this.getToken(TreeQLParser.COMMENT, 0);
};

StatsContext.prototype.definition = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(DefinitionContext);
    } else {
        return this.getTypedRuleContext(DefinitionContext,i);
    }
};

StatsContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterStats(this);
	}
};

StatsContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitStats(this);
	}
};




TreeQLParser.StatsContext = StatsContext;

TreeQLParser.prototype.stats = function() {

    var localctx = new StatsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, TreeQLParser.RULE_stats);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 59;
        _la = this._input.LA(1);
        if(_la===TreeQLParser.COMMENT) {
            this.state = 58;
            this.match(TreeQLParser.COMMENT);
        }

        this.state = 64;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(((((_la - 17)) & ~0x1f) == 0 && ((1 << (_la - 17)) & ((1 << (TreeQLParser.BOOLEAN - 17)) | (1 << (TreeQLParser.BYTE - 17)) | (1 << (TreeQLParser.CHAR - 17)) | (1 << (TreeQLParser.DOUBLE - 17)) | (1 << (TreeQLParser.FLOAT - 17)) | (1 << (TreeQLParser.INT - 17)) | (1 << (TreeQLParser.LONG - 17)) | (1 << (TreeQLParser.SHORT - 17)) | (1 << (TreeQLParser.STRING - 17)) | (1 << (TreeQLParser.TREE - 17)))) !== 0)) {
            this.state = 61;
            this.definition();
            this.state = 66;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 67;
        this.treeQuery();
        this.state = 68;
        this.match(TreeQLParser.EOF);
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

function DefinitionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_definition;
    return this;
}

DefinitionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
DefinitionContext.prototype.constructor = DefinitionContext;

DefinitionContext.prototype.typeType = function() {
    return this.getTypedRuleContext(TypeTypeContext,0);
};

DefinitionContext.prototype.VAR_NAME = function() {
    return this.getToken(TreeQLParser.VAR_NAME, 0);
};

DefinitionContext.prototype.ASSIGN = function() {
    return this.getToken(TreeQLParser.ASSIGN, 0);
};

DefinitionContext.prototype.assignmentExpr = function() {
    return this.getTypedRuleContext(AssignmentExprContext,0);
};

DefinitionContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterDefinition(this);
	}
};

DefinitionContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitDefinition(this);
	}
};




TreeQLParser.DefinitionContext = DefinitionContext;

TreeQLParser.prototype.definition = function() {

    var localctx = new DefinitionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, TreeQLParser.RULE_definition);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 70;
        this.typeType();
        this.state = 71;
        this.match(TreeQLParser.VAR_NAME);
        this.state = 74;
        _la = this._input.LA(1);
        if(_la===TreeQLParser.ASSIGN) {
            this.state = 72;
            this.match(TreeQLParser.ASSIGN);
            this.state = 73;
            this.assignmentExpr();
        }

        this.state = 76;
        this.match(TreeQLParser.SEMI);
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

function AssignmentExprContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_assignmentExpr;
    return this;
}

AssignmentExprContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
AssignmentExprContext.prototype.constructor = AssignmentExprContext;

AssignmentExprContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};

AssignmentExprContext.prototype.signed_number = function() {
    return this.getTypedRuleContext(Signed_numberContext,0);
};

AssignmentExprContext.prototype.json = function() {
    return this.getTypedRuleContext(JsonContext,0);
};

AssignmentExprContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterAssignmentExpr(this);
	}
};

AssignmentExprContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitAssignmentExpr(this);
	}
};




TreeQLParser.AssignmentExprContext = AssignmentExprContext;

TreeQLParser.prototype.assignmentExpr = function() {

    var localctx = new AssignmentExprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, TreeQLParser.RULE_assignmentExpr);
    try {
        this.state = 81;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,3,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 78;
            this.expression();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 79;
            this.signed_number();
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 80;
            this.json();
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

function TreeQueryContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_treeQuery;
    return this;
}

TreeQueryContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TreeQueryContext.prototype.constructor = TreeQueryContext;

TreeQueryContext.prototype.selectQuery = function() {
    return this.getTypedRuleContext(SelectQueryContext,0);
};

TreeQueryContext.prototype.joinQuery = function() {
    return this.getTypedRuleContext(JoinQueryContext,0);
};

TreeQueryContext.prototype.mergeQuery = function() {
    return this.getTypedRuleContext(MergeQueryContext,0);
};

TreeQueryContext.prototype.explodeQuery = function() {
    return this.getTypedRuleContext(ExplodeQueryContext,0);
};

TreeQueryContext.prototype.LPAREN = function() {
    return this.getToken(TreeQLParser.LPAREN, 0);
};

TreeQueryContext.prototype.treeQuery = function() {
    return this.getTypedRuleContext(TreeQueryContext,0);
};

TreeQueryContext.prototype.RPAREN = function() {
    return this.getToken(TreeQLParser.RPAREN, 0);
};

TreeQueryContext.prototype.rangeVariableDeclaration = function() {
    return this.getTypedRuleContext(RangeVariableDeclarationContext,0);
};

TreeQueryContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterTreeQuery(this);
	}
};

TreeQueryContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitTreeQuery(this);
	}
};




TreeQLParser.TreeQueryContext = TreeQueryContext;

TreeQLParser.prototype.treeQuery = function() {

    var localctx = new TreeQueryContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, TreeQLParser.RULE_treeQuery);
    try {
        this.state = 92;
        switch(this._input.LA(1)) {
        case TreeQLParser.SELECT:
            this.enterOuterAlt(localctx, 1);
            this.state = 83;
            this.selectQuery();
            break;
        case TreeQLParser.JOIN:
            this.enterOuterAlt(localctx, 2);
            this.state = 84;
            this.joinQuery();
            break;
        case TreeQLParser.MERGE:
            this.enterOuterAlt(localctx, 3);
            this.state = 85;
            this.mergeQuery();
            break;
        case TreeQLParser.EXPLODE:
            this.enterOuterAlt(localctx, 4);
            this.state = 86;
            this.explodeQuery();
            break;
        case TreeQLParser.LPAREN:
            this.enterOuterAlt(localctx, 5);
            this.state = 87;
            this.match(TreeQLParser.LPAREN);
            this.state = 88;
            this.treeQuery();
            this.state = 89;
            this.match(TreeQLParser.RPAREN);
            break;
        case TreeQLParser.VAR_NAME:
            this.enterOuterAlt(localctx, 6);
            this.state = 91;
            this.rangeVariableDeclaration();
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

function SelectQueryContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_selectQuery;
    return this;
}

SelectQueryContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SelectQueryContext.prototype.constructor = SelectQueryContext;

SelectQueryContext.prototype.SELECT = function() {
    return this.getToken(TreeQLParser.SELECT, 0);
};

SelectQueryContext.prototype.treeExpression = function() {
    return this.getTypedRuleContext(TreeExpressionContext,0);
};

SelectQueryContext.prototype.FROM = function() {
    return this.getToken(TreeQLParser.FROM, 0);
};

SelectQueryContext.prototype.treeQuery = function() {
    return this.getTypedRuleContext(TreeQueryContext,0);
};

SelectQueryContext.prototype.WHERE = function() {
    return this.getToken(TreeQLParser.WHERE, 0);
};

SelectQueryContext.prototype.selectExpression = function() {
    return this.getTypedRuleContext(SelectExpressionContext,0);
};

SelectQueryContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterSelectQuery(this);
	}
};

SelectQueryContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitSelectQuery(this);
	}
};




TreeQLParser.SelectQueryContext = SelectQueryContext;

TreeQLParser.prototype.selectQuery = function() {

    var localctx = new SelectQueryContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, TreeQLParser.RULE_selectQuery);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 94;
        this.match(TreeQLParser.SELECT);
        this.state = 95;
        this.treeExpression();
        this.state = 96;
        this.match(TreeQLParser.FROM);
        this.state = 97;
        this.treeQuery();
        this.state = 100;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,5,this._ctx);
        if(la_===1) {
            this.state = 98;
            this.match(TreeQLParser.WHERE);
            this.state = 99;
            this.selectExpression();

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

function JoinQueryContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_joinQuery;
    return this;
}

JoinQueryContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
JoinQueryContext.prototype.constructor = JoinQueryContext;

JoinQueryContext.prototype.JOIN = function() {
    return this.getToken(TreeQLParser.JOIN, 0);
};

JoinQueryContext.prototype.treeQuery = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(TreeQueryContext);
    } else {
        return this.getTypedRuleContext(TreeQueryContext,i);
    }
};

JoinQueryContext.prototype.COMMA = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(TreeQLParser.COMMA);
    } else {
        return this.getToken(TreeQLParser.COMMA, i);
    }
};


JoinQueryContext.prototype.ON = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(TreeQLParser.ON);
    } else {
        return this.getToken(TreeQLParser.ON, i);
    }
};


JoinQueryContext.prototype.selectExpression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(SelectExpressionContext);
    } else {
        return this.getTypedRuleContext(SelectExpressionContext,i);
    }
};

JoinQueryContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterJoinQuery(this);
	}
};

JoinQueryContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitJoinQuery(this);
	}
};




TreeQLParser.JoinQueryContext = JoinQueryContext;

TreeQLParser.prototype.joinQuery = function() {

    var localctx = new JoinQueryContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, TreeQLParser.RULE_joinQuery);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 102;
        this.match(TreeQLParser.JOIN);
        this.state = 103;
        this.treeQuery();
        this.state = 110; 
        this._errHandler.sync(this);
        var _alt = 1;
        do {
        	switch (_alt) {
        	case 1:
        		this.state = 104;
        		this.match(TreeQLParser.COMMA);
        		this.state = 105;
        		this.treeQuery();
        		this.state = 108;
        		this._errHandler.sync(this);
        		var la_ = this._interp.adaptivePredict(this._input,6,this._ctx);
        		if(la_===1) {
        		    this.state = 106;
        		    this.match(TreeQLParser.ON);
        		    this.state = 107;
        		    this.selectExpression();

        		}
        		break;
        	default:
        		throw new antlr4.error.NoViableAltException(this);
        	}
        	this.state = 112; 
        	this._errHandler.sync(this);
        	_alt = this._interp.adaptivePredict(this._input,7, this._ctx);
        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
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

function MergeQueryContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_mergeQuery;
    return this;
}

MergeQueryContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
MergeQueryContext.prototype.constructor = MergeQueryContext;

MergeQueryContext.prototype.MERGE = function() {
    return this.getToken(TreeQLParser.MERGE, 0);
};

MergeQueryContext.prototype.treeQuery = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(TreeQueryContext);
    } else {
        return this.getTypedRuleContext(TreeQueryContext,i);
    }
};

MergeQueryContext.prototype.COMMA = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(TreeQLParser.COMMA);
    } else {
        return this.getToken(TreeQLParser.COMMA, i);
    }
};


MergeQueryContext.prototype.ON = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(TreeQLParser.ON);
    } else {
        return this.getToken(TreeQLParser.ON, i);
    }
};


MergeQueryContext.prototype.selectExpression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(SelectExpressionContext);
    } else {
        return this.getTypedRuleContext(SelectExpressionContext,i);
    }
};

MergeQueryContext.prototype.conflictspec = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ConflictspecContext);
    } else {
        return this.getTypedRuleContext(ConflictspecContext,i);
    }
};

MergeQueryContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterMergeQuery(this);
	}
};

MergeQueryContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitMergeQuery(this);
	}
};




TreeQLParser.MergeQueryContext = MergeQueryContext;

TreeQLParser.prototype.mergeQuery = function() {

    var localctx = new MergeQueryContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, TreeQLParser.RULE_mergeQuery);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 114;
        this.match(TreeQLParser.MERGE);
        this.state = 115;
        this.treeQuery();
        this.state = 125; 
        this._errHandler.sync(this);
        var _alt = 1;
        do {
        	switch (_alt) {
        	case 1:
        		this.state = 116;
        		this.match(TreeQLParser.COMMA);
        		this.state = 117;
        		this.treeQuery();
        		this.state = 120;
        		this._errHandler.sync(this);
        		var la_ = this._interp.adaptivePredict(this._input,8,this._ctx);
        		if(la_===1) {
        		    this.state = 118;
        		    this.match(TreeQLParser.ON);
        		    this.state = 119;
        		    this.selectExpression();

        		}
        		this.state = 123;
        		this._errHandler.sync(this);
        		var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
        		if(la_===1) {
        		    this.state = 122;
        		    this.conflictspec();

        		}
        		break;
        	default:
        		throw new antlr4.error.NoViableAltException(this);
        	}
        	this.state = 127; 
        	this._errHandler.sync(this);
        	_alt = this._interp.adaptivePredict(this._input,10, this._ctx);
        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
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
    this.ruleIndex = TreeQLParser.RULE_conflictspec;
    return this;
}

ConflictspecContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ConflictspecContext.prototype.constructor = ConflictspecContext;

ConflictspecContext.prototype.CONFORMIFEQUAL = function() {
    return this.getToken(TreeQLParser.CONFORMIFEQUAL, 0);
};

ConflictspecContext.prototype.DERIVEALWAYS = function() {
    return this.getToken(TreeQLParser.DERIVEALWAYS, 0);
};

ConflictspecContext.prototype.DERIVEIFNOTEQUAL = function() {
    return this.getToken(TreeQLParser.DERIVEIFNOTEQUAL, 0);
};

ConflictspecContext.prototype.TERMINATEIFNOTEQUAL = function() {
    return this.getToken(TreeQLParser.TERMINATEIFNOTEQUAL, 0);
};

ConflictspecContext.prototype.TERMINATE = function() {
    return this.getToken(TreeQLParser.TERMINATE, 0);
};

ConflictspecContext.prototype.OVERRIDE = function() {
    return this.getToken(TreeQLParser.OVERRIDE, 0);
};

ConflictspecContext.prototype.EVALUATE = function() {
    return this.getToken(TreeQLParser.EVALUATE, 0);
};

ConflictspecContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterConflictspec(this);
	}
};

ConflictspecContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitConflictspec(this);
	}
};




TreeQLParser.ConflictspecContext = ConflictspecContext;

TreeQLParser.prototype.conflictspec = function() {

    var localctx = new ConflictspecContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, TreeQLParser.RULE_conflictspec);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 129;
        _la = this._input.LA(1);
        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << TreeQLParser.CONFORMIFEQUAL) | (1 << TreeQLParser.DERIVEALWAYS) | (1 << TreeQLParser.DERIVEIFNOTEQUAL) | (1 << TreeQLParser.TERMINATEIFNOTEQUAL) | (1 << TreeQLParser.TERMINATE) | (1 << TreeQLParser.OVERRIDE) | (1 << TreeQLParser.EVALUATE))) !== 0))) {
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

function ExplodeQueryContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_explodeQuery;
    return this;
}

ExplodeQueryContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExplodeQueryContext.prototype.constructor = ExplodeQueryContext;

ExplodeQueryContext.prototype.EXPLODE = function() {
    return this.getToken(TreeQLParser.EXPLODE, 0);
};

ExplodeQueryContext.prototype.LPAREN = function() {
    return this.getToken(TreeQLParser.LPAREN, 0);
};

ExplodeQueryContext.prototype.treeExpression = function() {
    return this.getTypedRuleContext(TreeExpressionContext,0);
};

ExplodeQueryContext.prototype.COMMA = function() {
    return this.getToken(TreeQLParser.COMMA, 0);
};

ExplodeQueryContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};

ExplodeQueryContext.prototype.RPAREN = function() {
    return this.getToken(TreeQLParser.RPAREN, 0);
};

ExplodeQueryContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterExplodeQuery(this);
	}
};

ExplodeQueryContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitExplodeQuery(this);
	}
};




TreeQLParser.ExplodeQueryContext = ExplodeQueryContext;

TreeQLParser.prototype.explodeQuery = function() {

    var localctx = new ExplodeQueryContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, TreeQLParser.RULE_explodeQuery);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 131;
        this.match(TreeQLParser.EXPLODE);
        this.state = 132;
        this.match(TreeQLParser.LPAREN);
        this.state = 133;
        this.treeExpression();
        this.state = 134;
        this.match(TreeQLParser.COMMA);
        this.state = 135;
        this.expression();
        this.state = 136;
        this.match(TreeQLParser.RPAREN);
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

function RangeVariableDeclarationContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_rangeVariableDeclaration;
    return this;
}

RangeVariableDeclarationContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
RangeVariableDeclarationContext.prototype.constructor = RangeVariableDeclarationContext;

RangeVariableDeclarationContext.prototype.abstractTreeName = function() {
    return this.getTypedRuleContext(AbstractTreeNameContext,0);
};

RangeVariableDeclarationContext.prototype.AS = function() {
    return this.getToken(TreeQLParser.AS, 0);
};

RangeVariableDeclarationContext.prototype.VAR_NAME = function() {
    return this.getToken(TreeQLParser.VAR_NAME, 0);
};

RangeVariableDeclarationContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterRangeVariableDeclaration(this);
	}
};

RangeVariableDeclarationContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitRangeVariableDeclaration(this);
	}
};




TreeQLParser.RangeVariableDeclarationContext = RangeVariableDeclarationContext;

TreeQLParser.prototype.rangeVariableDeclaration = function() {

    var localctx = new RangeVariableDeclarationContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, TreeQLParser.RULE_rangeVariableDeclaration);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 138;
        this.abstractTreeName();
        this.state = 141;
        _la = this._input.LA(1);
        if(_la===TreeQLParser.AS) {
            this.state = 139;
            this.match(TreeQLParser.AS);
            this.state = 140;
            this.match(TreeQLParser.VAR_NAME);
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

function AbstractTreeNameContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_abstractTreeName;
    return this;
}

AbstractTreeNameContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
AbstractTreeNameContext.prototype.constructor = AbstractTreeNameContext;

AbstractTreeNameContext.prototype.VAR_NAME = function() {
    return this.getToken(TreeQLParser.VAR_NAME, 0);
};

AbstractTreeNameContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterAbstractTreeName(this);
	}
};

AbstractTreeNameContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitAbstractTreeName(this);
	}
};




TreeQLParser.AbstractTreeNameContext = AbstractTreeNameContext;

TreeQLParser.prototype.abstractTreeName = function() {

    var localctx = new AbstractTreeNameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, TreeQLParser.RULE_abstractTreeName);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 143;
        this.match(TreeQLParser.VAR_NAME);
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

function SelectExpressionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_selectExpression;
    return this;
}

SelectExpressionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SelectExpressionContext.prototype.constructor = SelectExpressionContext;

SelectExpressionContext.prototype.arithmeticLogicExpression = function() {
    return this.getTypedRuleContext(ArithmeticLogicExpressionContext,0);
};

SelectExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterSelectExpression(this);
	}
};

SelectExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitSelectExpression(this);
	}
};




TreeQLParser.SelectExpressionContext = SelectExpressionContext;

TreeQLParser.prototype.selectExpression = function() {

    var localctx = new SelectExpressionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 22, TreeQLParser.RULE_selectExpression);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 145;
        this.arithmeticLogicExpression();
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

function ExpressionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_expression;
    return this;
}

ExpressionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExpressionContext.prototype.constructor = ExpressionContext;

ExpressionContext.prototype.treeExpression = function() {
    return this.getTypedRuleContext(TreeExpressionContext,0);
};

ExpressionContext.prototype.arithmeticLogicExpression = function() {
    return this.getTypedRuleContext(ArithmeticLogicExpressionContext,0);
};

ExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterExpression(this);
	}
};

ExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitExpression(this);
	}
};




TreeQLParser.ExpressionContext = ExpressionContext;

TreeQLParser.prototype.expression = function() {

    var localctx = new ExpressionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, TreeQLParser.RULE_expression);
    try {
        this.state = 149;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,12,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 147;
            this.treeExpression();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 148;
            this.arithmeticLogicExpression();
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

function ArithmeticLogicExpressionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_arithmeticLogicExpression;
    return this;
}

ArithmeticLogicExpressionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ArithmeticLogicExpressionContext.prototype.constructor = ArithmeticLogicExpressionContext;

ArithmeticLogicExpressionContext.prototype.binaryOperand = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(BinaryOperandContext);
    } else {
        return this.getTypedRuleContext(BinaryOperandContext,i);
    }
};

ArithmeticLogicExpressionContext.prototype.binaryOperator = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(BinaryOperatorContext);
    } else {
        return this.getTypedRuleContext(BinaryOperatorContext,i);
    }
};

ArithmeticLogicExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterArithmeticLogicExpression(this);
	}
};

ArithmeticLogicExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitArithmeticLogicExpression(this);
	}
};




TreeQLParser.ArithmeticLogicExpressionContext = ArithmeticLogicExpressionContext;

TreeQLParser.prototype.arithmeticLogicExpression = function() {

    var localctx = new ArithmeticLogicExpressionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 26, TreeQLParser.RULE_arithmeticLogicExpression);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 151;
        this.binaryOperand();
        this.state = 157;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,13,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                this.state = 152;
                this.binaryOperator();
                this.state = 153;
                this.binaryOperand(); 
            }
            this.state = 159;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,13,this._ctx);
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

function BinaryOperandContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_binaryOperand;
    return this;
}

BinaryOperandContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
BinaryOperandContext.prototype.constructor = BinaryOperandContext;

BinaryOperandContext.prototype.unaryOperand = function() {
    return this.getTypedRuleContext(UnaryOperandContext,0);
};

BinaryOperandContext.prototype.unaryOperator = function() {
    return this.getTypedRuleContext(UnaryOperatorContext,0);
};

BinaryOperandContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterBinaryOperand(this);
	}
};

BinaryOperandContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitBinaryOperand(this);
	}
};




TreeQLParser.BinaryOperandContext = BinaryOperandContext;

TreeQLParser.prototype.binaryOperand = function() {

    var localctx = new BinaryOperandContext(this, this._ctx, this.state);
    this.enterRule(localctx, 28, TreeQLParser.RULE_binaryOperand);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 161;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,14,this._ctx);
        if(la_===1) {
            this.state = 160;
            this.unaryOperator();

        }
        this.state = 163;
        this.unaryOperand();
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

function UnaryOperandContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_unaryOperand;
    return this;
}

UnaryOperandContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
UnaryOperandContext.prototype.constructor = UnaryOperandContext;

UnaryOperandContext.prototype.BOOLEAN_LITERAL = function() {
    return this.getToken(TreeQLParser.BOOLEAN_LITERAL, 0);
};

UnaryOperandContext.prototype.STRING_LITERAL = function() {
    return this.getToken(TreeQLParser.STRING_LITERAL, 0);
};

UnaryOperandContext.prototype.signed_number = function() {
    return this.getTypedRuleContext(Signed_numberContext,0);
};

UnaryOperandContext.prototype.LPAREN = function() {
    return this.getToken(TreeQLParser.LPAREN, 0);
};

UnaryOperandContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};

UnaryOperandContext.prototype.RPAREN = function() {
    return this.getToken(TreeQLParser.RPAREN, 0);
};

UnaryOperandContext.prototype.VAR_NAME = function() {
    return this.getToken(TreeQLParser.VAR_NAME, 0);
};

UnaryOperandContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterUnaryOperand(this);
	}
};

UnaryOperandContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitUnaryOperand(this);
	}
};




TreeQLParser.UnaryOperandContext = UnaryOperandContext;

TreeQLParser.prototype.unaryOperand = function() {

    var localctx = new UnaryOperandContext(this, this._ctx, this.state);
    this.enterRule(localctx, 30, TreeQLParser.RULE_unaryOperand);
    var _la = 0; // Token type
    try {
        this.state = 175;
        switch(this._input.LA(1)) {
        case TreeQLParser.BOOLEAN_LITERAL:
            this.enterOuterAlt(localctx, 1);
            this.state = 165;
            this.match(TreeQLParser.BOOLEAN_LITERAL);
            break;
        case TreeQLParser.STRING_LITERAL:
            this.enterOuterAlt(localctx, 2);
            this.state = 166;
            this.match(TreeQLParser.STRING_LITERAL);
            break;
        case TreeQLParser.NUMERIC_LITERAL:
        case TreeQLParser.ADD:
        case TreeQLParser.SUBORNEGATION:
            this.enterOuterAlt(localctx, 3);
            this.state = 167;
            this.signed_number();
            break;
        case TreeQLParser.LPAREN:
        case TreeQLParser.VAR_NAME:
            this.enterOuterAlt(localctx, 4);
            this.state = 169;
            _la = this._input.LA(1);
            if(_la===TreeQLParser.VAR_NAME) {
                this.state = 168;
                this.match(TreeQLParser.VAR_NAME);
            }

            this.state = 171;
            this.match(TreeQLParser.LPAREN);
            this.state = 172;
            this.expression();
            this.state = 173;
            this.match(TreeQLParser.RPAREN);
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

function TreeExpressionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_treeExpression;
    return this;
}

TreeExpressionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TreeExpressionContext.prototype.constructor = TreeExpressionContext;

TreeExpressionContext.prototype.STAR = function() {
    return this.getToken(TreeQLParser.STAR, 0);
};

TreeExpressionContext.prototype.treeElement = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(TreeElementContext);
    } else {
        return this.getTypedRuleContext(TreeElementContext,i);
    }
};

TreeExpressionContext.prototype.COMMA = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(TreeQLParser.COMMA);
    } else {
        return this.getToken(TreeQLParser.COMMA, i);
    }
};


TreeExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterTreeExpression(this);
	}
};

TreeExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitTreeExpression(this);
	}
};




TreeQLParser.TreeExpressionContext = TreeExpressionContext;

TreeQLParser.prototype.treeExpression = function() {

    var localctx = new TreeExpressionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 32, TreeQLParser.RULE_treeExpression);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 179;
        switch(this._input.LA(1)) {
        case TreeQLParser.STAR:
            this.state = 177;
            this.match(TreeQLParser.STAR);
            break;
        case TreeQLParser.VAR_NAME:
            this.state = 178;
            this.treeElement();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
        this.state = 185;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,18,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                this.state = 181;
                this.match(TreeQLParser.COMMA);
                this.state = 182;
                this.treeElement(); 
            }
            this.state = 187;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,18,this._ctx);
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

function TreeElementContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_treeElement;
    return this;
}

TreeElementContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TreeElementContext.prototype.constructor = TreeElementContext;

TreeElementContext.prototype.abstractTreeName = function() {
    return this.getTypedRuleContext(AbstractTreeNameContext,0);
};

TreeElementContext.prototype.DOT = function() {
    return this.getToken(TreeQLParser.DOT, 0);
};

TreeElementContext.prototype.VAR_NAME = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(TreeQLParser.VAR_NAME);
    } else {
        return this.getToken(TreeQLParser.VAR_NAME, i);
    }
};


TreeElementContext.prototype.STAR = function() {
    return this.getToken(TreeQLParser.STAR, 0);
};

TreeElementContext.prototype.AS = function() {
    return this.getToken(TreeQLParser.AS, 0);
};

TreeElementContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterTreeElement(this);
	}
};

TreeElementContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitTreeElement(this);
	}
};




TreeQLParser.TreeElementContext = TreeElementContext;

TreeQLParser.prototype.treeElement = function() {

    var localctx = new TreeElementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 34, TreeQLParser.RULE_treeElement);
    var _la = 0; // Token type
    try {
        this.state = 200;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,21,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 188;
            this.abstractTreeName();
            this.state = 189;
            this.match(TreeQLParser.DOT);
            this.state = 190;
            _la = this._input.LA(1);
            if(!(_la===TreeQLParser.STAR || _la===TreeQLParser.VAR_NAME)) {
            this._errHandler.recoverInline(this);
            }
            else {
                this.consume();
            }
            this.state = 193;
            _la = this._input.LA(1);
            if(_la===TreeQLParser.AS) {
                this.state = 191;
                this.match(TreeQLParser.AS);
                this.state = 192;
                this.match(TreeQLParser.VAR_NAME);
            }

            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 195;
            this.match(TreeQLParser.VAR_NAME);
            this.state = 198;
            _la = this._input.LA(1);
            if(_la===TreeQLParser.AS) {
                this.state = 196;
                this.match(TreeQLParser.AS);
                this.state = 197;
                this.match(TreeQLParser.VAR_NAME);
            }

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

function TypeTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_typeType;
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
    if(listener instanceof TreeQLListener ) {
        listener.enterTypeType(this);
	}
};

TypeTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitTypeType(this);
	}
};




TreeQLParser.TypeTypeContext = TypeTypeContext;

TreeQLParser.prototype.typeType = function() {

    var localctx = new TypeTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 36, TreeQLParser.RULE_typeType);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 204;
        switch(this._input.LA(1)) {
        case TreeQLParser.STRING:
        case TreeQLParser.TREE:
            this.state = 202;
            this.complexType();
            break;
        case TreeQLParser.BOOLEAN:
        case TreeQLParser.BYTE:
        case TreeQLParser.CHAR:
        case TreeQLParser.DOUBLE:
        case TreeQLParser.FLOAT:
        case TreeQLParser.INT:
        case TreeQLParser.LONG:
        case TreeQLParser.SHORT:
            this.state = 203;
            this.primitiveType();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
        this.state = 210;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===TreeQLParser.LBRACK) {
            this.state = 206;
            this.match(TreeQLParser.LBRACK);
            this.state = 207;
            this.match(TreeQLParser.RBRACK);
            this.state = 212;
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

function PrimitiveTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_primitiveType;
    return this;
}

PrimitiveTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PrimitiveTypeContext.prototype.constructor = PrimitiveTypeContext;

PrimitiveTypeContext.prototype.BOOLEAN = function() {
    return this.getToken(TreeQLParser.BOOLEAN, 0);
};

PrimitiveTypeContext.prototype.CHAR = function() {
    return this.getToken(TreeQLParser.CHAR, 0);
};

PrimitiveTypeContext.prototype.BYTE = function() {
    return this.getToken(TreeQLParser.BYTE, 0);
};

PrimitiveTypeContext.prototype.SHORT = function() {
    return this.getToken(TreeQLParser.SHORT, 0);
};

PrimitiveTypeContext.prototype.INT = function() {
    return this.getToken(TreeQLParser.INT, 0);
};

PrimitiveTypeContext.prototype.LONG = function() {
    return this.getToken(TreeQLParser.LONG, 0);
};

PrimitiveTypeContext.prototype.FLOAT = function() {
    return this.getToken(TreeQLParser.FLOAT, 0);
};

PrimitiveTypeContext.prototype.DOUBLE = function() {
    return this.getToken(TreeQLParser.DOUBLE, 0);
};

PrimitiveTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterPrimitiveType(this);
	}
};

PrimitiveTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitPrimitiveType(this);
	}
};




TreeQLParser.PrimitiveTypeContext = PrimitiveTypeContext;

TreeQLParser.prototype.primitiveType = function() {

    var localctx = new PrimitiveTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 38, TreeQLParser.RULE_primitiveType);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 213;
        _la = this._input.LA(1);
        if(!(((((_la - 17)) & ~0x1f) == 0 && ((1 << (_la - 17)) & ((1 << (TreeQLParser.BOOLEAN - 17)) | (1 << (TreeQLParser.BYTE - 17)) | (1 << (TreeQLParser.CHAR - 17)) | (1 << (TreeQLParser.DOUBLE - 17)) | (1 << (TreeQLParser.FLOAT - 17)) | (1 << (TreeQLParser.INT - 17)) | (1 << (TreeQLParser.LONG - 17)) | (1 << (TreeQLParser.SHORT - 17)))) !== 0))) {
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
    this.ruleIndex = TreeQLParser.RULE_complexType;
    return this;
}

ComplexTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ComplexTypeContext.prototype.constructor = ComplexTypeContext;

ComplexTypeContext.prototype.TREE = function() {
    return this.getToken(TreeQLParser.TREE, 0);
};

ComplexTypeContext.prototype.STRING = function() {
    return this.getToken(TreeQLParser.STRING, 0);
};

ComplexTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterComplexType(this);
	}
};

ComplexTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitComplexType(this);
	}
};




TreeQLParser.ComplexTypeContext = ComplexTypeContext;

TreeQLParser.prototype.complexType = function() {

    var localctx = new ComplexTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 40, TreeQLParser.RULE_complexType);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 215;
        _la = this._input.LA(1);
        if(!(_la===TreeQLParser.STRING || _la===TreeQLParser.TREE)) {
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

function JsonContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_json;
    return this;
}

JsonContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
JsonContext.prototype.constructor = JsonContext;

JsonContext.prototype.json_value = function() {
    return this.getTypedRuleContext(Json_valueContext,0);
};

JsonContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterJson(this);
	}
};

JsonContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitJson(this);
	}
};




TreeQLParser.JsonContext = JsonContext;

TreeQLParser.prototype.json = function() {

    var localctx = new JsonContext(this, this._ctx, this.state);
    this.enterRule(localctx, 42, TreeQLParser.RULE_json);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 217;
        this.json_value();
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

function Json_valueContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_json_value;
    return this;
}

Json_valueContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Json_valueContext.prototype.constructor = Json_valueContext;

Json_valueContext.prototype.STRING_LITERAL = function() {
    return this.getToken(TreeQLParser.STRING_LITERAL, 0);
};

Json_valueContext.prototype.signed_number = function() {
    return this.getTypedRuleContext(Signed_numberContext,0);
};

Json_valueContext.prototype.obj = function() {
    return this.getTypedRuleContext(ObjContext,0);
};

Json_valueContext.prototype.arr = function() {
    return this.getTypedRuleContext(ArrContext,0);
};

Json_valueContext.prototype.BOOLEAN_LITERAL = function() {
    return this.getToken(TreeQLParser.BOOLEAN_LITERAL, 0);
};

Json_valueContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterJson_value(this);
	}
};

Json_valueContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitJson_value(this);
	}
};




TreeQLParser.Json_valueContext = Json_valueContext;

TreeQLParser.prototype.json_value = function() {

    var localctx = new Json_valueContext(this, this._ctx, this.state);
    this.enterRule(localctx, 44, TreeQLParser.RULE_json_value);
    try {
        this.state = 225;
        switch(this._input.LA(1)) {
        case TreeQLParser.STRING_LITERAL:
            this.enterOuterAlt(localctx, 1);
            this.state = 219;
            this.match(TreeQLParser.STRING_LITERAL);
            break;
        case TreeQLParser.NUMERIC_LITERAL:
        case TreeQLParser.ADD:
        case TreeQLParser.SUBORNEGATION:
            this.enterOuterAlt(localctx, 2);
            this.state = 220;
            this.signed_number();
            break;
        case TreeQLParser.LBRACE:
            this.enterOuterAlt(localctx, 3);
            this.state = 221;
            this.obj();
            break;
        case TreeQLParser.LBRACK:
            this.enterOuterAlt(localctx, 4);
            this.state = 222;
            this.arr();
            break;
        case TreeQLParser.BOOLEAN_LITERAL:
            this.enterOuterAlt(localctx, 5);
            this.state = 223;
            this.match(TreeQLParser.BOOLEAN_LITERAL);
            break;
        case TreeQLParser.T__0:
            this.enterOuterAlt(localctx, 6);
            this.state = 224;
            this.match(TreeQLParser.T__0);
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

function ObjContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_obj;
    return this;
}

ObjContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ObjContext.prototype.constructor = ObjContext;

ObjContext.prototype.pair = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(PairContext);
    } else {
        return this.getTypedRuleContext(PairContext,i);
    }
};

ObjContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterObj(this);
	}
};

ObjContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitObj(this);
	}
};




TreeQLParser.ObjContext = ObjContext;

TreeQLParser.prototype.obj = function() {

    var localctx = new ObjContext(this, this._ctx, this.state);
    this.enterRule(localctx, 46, TreeQLParser.RULE_obj);
    var _la = 0; // Token type
    try {
        this.state = 240;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,26,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 227;
            this.match(TreeQLParser.LBRACE);
            this.state = 228;
            this.pair();
            this.state = 233;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===TreeQLParser.COMMA) {
                this.state = 229;
                this.match(TreeQLParser.COMMA);
                this.state = 230;
                this.pair();
                this.state = 235;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            this.state = 236;
            this.match(TreeQLParser.RBRACE);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 238;
            this.match(TreeQLParser.LBRACE);
            this.state = 239;
            this.match(TreeQLParser.RBRACE);
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

function PairContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_pair;
    return this;
}

PairContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PairContext.prototype.constructor = PairContext;

PairContext.prototype.STRING_LITERAL = function() {
    return this.getToken(TreeQLParser.STRING_LITERAL, 0);
};

PairContext.prototype.json_value = function() {
    return this.getTypedRuleContext(Json_valueContext,0);
};

PairContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterPair(this);
	}
};

PairContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitPair(this);
	}
};




TreeQLParser.PairContext = PairContext;

TreeQLParser.prototype.pair = function() {

    var localctx = new PairContext(this, this._ctx, this.state);
    this.enterRule(localctx, 48, TreeQLParser.RULE_pair);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 242;
        this.match(TreeQLParser.STRING_LITERAL);
        this.state = 243;
        this.match(TreeQLParser.COLON);
        this.state = 244;
        this.json_value();
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

function ArrContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_arr;
    return this;
}

ArrContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ArrContext.prototype.constructor = ArrContext;

ArrContext.prototype.json_value = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(Json_valueContext);
    } else {
        return this.getTypedRuleContext(Json_valueContext,i);
    }
};

ArrContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterArr(this);
	}
};

ArrContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitArr(this);
	}
};




TreeQLParser.ArrContext = ArrContext;

TreeQLParser.prototype.arr = function() {

    var localctx = new ArrContext(this, this._ctx, this.state);
    this.enterRule(localctx, 50, TreeQLParser.RULE_arr);
    var _la = 0; // Token type
    try {
        this.state = 259;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,28,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 246;
            this.match(TreeQLParser.LBRACK);
            this.state = 247;
            this.json_value();
            this.state = 252;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===TreeQLParser.COMMA) {
                this.state = 248;
                this.match(TreeQLParser.COMMA);
                this.state = 249;
                this.json_value();
                this.state = 254;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            this.state = 255;
            this.match(TreeQLParser.RBRACK);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 257;
            this.match(TreeQLParser.LBRACK);
            this.state = 258;
            this.match(TreeQLParser.RBRACK);
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

function BinaryOperatorContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_binaryOperator;
    return this;
}

BinaryOperatorContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
BinaryOperatorContext.prototype.constructor = BinaryOperatorContext;

BinaryOperatorContext.prototype.ADD = function() {
    return this.getToken(TreeQLParser.ADD, 0);
};

BinaryOperatorContext.prototype.SUBORNEGATION = function() {
    return this.getToken(TreeQLParser.SUBORNEGATION, 0);
};

BinaryOperatorContext.prototype.DIV = function() {
    return this.getToken(TreeQLParser.DIV, 0);
};

BinaryOperatorContext.prototype.MOD = function() {
    return this.getToken(TreeQLParser.MOD, 0);
};

BinaryOperatorContext.prototype.STAR = function() {
    return this.getToken(TreeQLParser.STAR, 0);
};

BinaryOperatorContext.prototype.AND = function() {
    return this.getToken(TreeQLParser.AND, 0);
};

BinaryOperatorContext.prototype.OR = function() {
    return this.getToken(TreeQLParser.OR, 0);
};

BinaryOperatorContext.prototype.EQUAL = function() {
    return this.getToken(TreeQLParser.EQUAL, 0);
};

BinaryOperatorContext.prototype.NOTEQUAL = function() {
    return this.getToken(TreeQLParser.NOTEQUAL, 0);
};

BinaryOperatorContext.prototype.GT = function() {
    return this.getToken(TreeQLParser.GT, 0);
};

BinaryOperatorContext.prototype.GE = function() {
    return this.getToken(TreeQLParser.GE, 0);
};

BinaryOperatorContext.prototype.LT = function() {
    return this.getToken(TreeQLParser.LT, 0);
};

BinaryOperatorContext.prototype.LE = function() {
    return this.getToken(TreeQLParser.LE, 0);
};

BinaryOperatorContext.prototype.COMMA = function() {
    return this.getToken(TreeQLParser.COMMA, 0);
};

BinaryOperatorContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterBinaryOperator(this);
	}
};

BinaryOperatorContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitBinaryOperator(this);
	}
};




TreeQLParser.BinaryOperatorContext = BinaryOperatorContext;

TreeQLParser.prototype.binaryOperator = function() {

    var localctx = new BinaryOperatorContext(this, this._ctx, this.state);
    this.enterRule(localctx, 52, TreeQLParser.RULE_binaryOperator);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 261;
        _la = this._input.LA(1);
        if(!(_la===TreeQLParser.COMMA || ((((_la - 46)) & ~0x1f) == 0 && ((1 << (_la - 46)) & ((1 << (TreeQLParser.GT - 46)) | (1 << (TreeQLParser.LT - 46)) | (1 << (TreeQLParser.EQUAL - 46)) | (1 << (TreeQLParser.LE - 46)) | (1 << (TreeQLParser.GE - 46)) | (1 << (TreeQLParser.NOTEQUAL - 46)) | (1 << (TreeQLParser.AND - 46)) | (1 << (TreeQLParser.OR - 46)) | (1 << (TreeQLParser.ADD - 46)) | (1 << (TreeQLParser.SUBORNEGATION - 46)) | (1 << (TreeQLParser.DIV - 46)) | (1 << (TreeQLParser.MOD - 46)) | (1 << (TreeQLParser.STAR - 46)))) !== 0))) {
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

function UnaryOperatorContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_unaryOperator;
    return this;
}

UnaryOperatorContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
UnaryOperatorContext.prototype.constructor = UnaryOperatorContext;

UnaryOperatorContext.prototype.SUBORNEGATION = function() {
    return this.getToken(TreeQLParser.SUBORNEGATION, 0);
};

UnaryOperatorContext.prototype.BANG = function() {
    return this.getToken(TreeQLParser.BANG, 0);
};

UnaryOperatorContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterUnaryOperator(this);
	}
};

UnaryOperatorContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitUnaryOperator(this);
	}
};




TreeQLParser.UnaryOperatorContext = UnaryOperatorContext;

TreeQLParser.prototype.unaryOperator = function() {

    var localctx = new UnaryOperatorContext(this, this._ctx, this.state);
    this.enterRule(localctx, 54, TreeQLParser.RULE_unaryOperator);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 263;
        _la = this._input.LA(1);
        if(!(_la===TreeQLParser.BANG || _la===TreeQLParser.SUBORNEGATION)) {
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

function Signed_numberContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TreeQLParser.RULE_signed_number;
    return this;
}

Signed_numberContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Signed_numberContext.prototype.constructor = Signed_numberContext;

Signed_numberContext.prototype.NUMERIC_LITERAL = function() {
    return this.getToken(TreeQLParser.NUMERIC_LITERAL, 0);
};

Signed_numberContext.prototype.ADD = function() {
    return this.getToken(TreeQLParser.ADD, 0);
};

Signed_numberContext.prototype.SUBORNEGATION = function() {
    return this.getToken(TreeQLParser.SUBORNEGATION, 0);
};

Signed_numberContext.prototype.enterRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.enterSigned_number(this);
	}
};

Signed_numberContext.prototype.exitRule = function(listener) {
    if(listener instanceof TreeQLListener ) {
        listener.exitSigned_number(this);
	}
};




TreeQLParser.Signed_numberContext = Signed_numberContext;

TreeQLParser.prototype.signed_number = function() {

    var localctx = new Signed_numberContext(this, this._ctx, this.state);
    this.enterRule(localctx, 56, TreeQLParser.RULE_signed_number);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 266;
        _la = this._input.LA(1);
        if(_la===TreeQLParser.ADD || _la===TreeQLParser.SUBORNEGATION) {
            this.state = 265;
            _la = this._input.LA(1);
            if(!(_la===TreeQLParser.ADD || _la===TreeQLParser.SUBORNEGATION)) {
            this._errHandler.recoverInline(this);
            }
            else {
                this.consume();
            }
        }

        this.state = 268;
        this.match(TreeQLParser.NUMERIC_LITERAL);
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


exports.TreeQLParser = TreeQLParser;
