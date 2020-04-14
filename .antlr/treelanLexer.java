// Generated from d:\Tez\2019-2020\Chrome Extension\thesis-work\languageformalism\webql.g_old by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class treelanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, LABEL=12, INTE=13, DECIMAL=14, COMMENT=15, PLUS=16, 
		MINUS=17, TIMES=18, DIV=19, COMMA=20, LPAREN=21, RPAREN=22, EOL=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "LABEL", "INTE", "DECIMAL", "COMMENT", "PLUS", "MINUS", 
		"TIMES", "DIV", "COMMA", "LPAREN", "RPAREN", "EOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ERASE'", "'='", "'EQUALS'", "'A'", "'L'", "'AXT,1'", "'AXT,2'", 
		"'1DNADR'", "'2DNADR'", "'TC'", "'TCR'", null, null, null, null, "'+'", 
		"'-'", "'*'", "'/'", "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"LABEL", "INTE", "DECIMAL", "COMMENT", "PLUS", "MINUS", "TIMES", "DIV", 
		"COMMA", "LPAREN", "RPAREN", "EOL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public treelanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "webql.g_old"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\6\ri\n\r\r\r\16\rj\3\16\6\16n\n\16\r\16\16\16o\3\16\3\16"+
		"\3\16\3\16\5\16v\n\16\3\17\6\17y\n\17\r\17\16\17z\3\17\3\17\6\17\177\n"+
		"\17\r\17\16\17\u0080\5\17\u0083\n\17\3\17\3\17\6\17\u0087\n\17\r\17\16"+
		"\17\u0088\5\17\u008b\n\17\3\20\3\20\7\20\u008f\n\20\f\20\16\20\u0092\13"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\6\30\u00a3\n\30\r\30\16\30\u00a4\3\31\6\31\u00a8\n\31\r\31\16"+
		"\31\u00a9\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\6\n\2"+
		"((,-/;??C\\^^aac|\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\2\u00b5\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\3\63\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rF\3"+
		"\2\2\2\17L\3\2\2\2\21R\3\2\2\2\23Y\3\2\2\2\25`\3\2\2\2\27c\3\2\2\2\31"+
		"h\3\2\2\2\33m\3\2\2\2\35\u008a\3\2\2\2\37\u008c\3\2\2\2!\u0093\3\2\2\2"+
		"#\u0095\3\2\2\2%\u0097\3\2\2\2\'\u0099\3\2\2\2)\u009b\3\2\2\2+\u009d\3"+
		"\2\2\2-\u009f\3\2\2\2/\u00a2\3\2\2\2\61\u00a7\3\2\2\2\63\64\7G\2\2\64"+
		"\65\7T\2\2\65\66\7C\2\2\66\67\7U\2\2\678\7G\2\28\4\3\2\2\29:\7?\2\2:\6"+
		"\3\2\2\2;<\7G\2\2<=\7S\2\2=>\7W\2\2>?\7C\2\2?@\7N\2\2@A\7U\2\2A\b\3\2"+
		"\2\2BC\7C\2\2C\n\3\2\2\2DE\7N\2\2E\f\3\2\2\2FG\7C\2\2GH\7Z\2\2HI\7V\2"+
		"\2IJ\7.\2\2JK\7\63\2\2K\16\3\2\2\2LM\7C\2\2MN\7Z\2\2NO\7V\2\2OP\7.\2\2"+
		"PQ\7\64\2\2Q\20\3\2\2\2RS\7\63\2\2ST\7F\2\2TU\7P\2\2UV\7C\2\2VW\7F\2\2"+
		"WX\7T\2\2X\22\3\2\2\2YZ\7\64\2\2Z[\7F\2\2[\\\7P\2\2\\]\7C\2\2]^\7F\2\2"+
		"^_\7T\2\2_\24\3\2\2\2`a\7V\2\2ab\7E\2\2b\26\3\2\2\2cd\7V\2\2de\7E\2\2"+
		"ef\7T\2\2f\30\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2"+
		"\2k\32\3\2\2\2ln\t\3\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pu\3\2"+
		"\2\2qr\7F\2\2rs\7G\2\2sv\7E\2\2tv\7F\2\2uq\3\2\2\2ut\3\2\2\2v\34\3\2\2"+
		"\2wy\t\3\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0082\3\2\2\2|~"+
		"\7\60\2\2}\177\t\3\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082|\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u008b\3\2\2\2\u0084\u0086\7\60\2\2\u0085\u0087\t\3\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\3\2\2\2\u008ax\3\2\2\2\u008a\u0084\3\2\2\2\u008b\36\3\2\2\2\u008c"+
		"\u0090\7%\2\2\u008d\u008f\n\4\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091 \3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0094\7-\2\2\u0094\"\3\2\2\2\u0095\u0096\7/\2\2\u0096$"+
		"\3\2\2\2\u0097\u0098\7,\2\2\u0098&\3\2\2\2\u0099\u009a\7\61\2\2\u009a"+
		"(\3\2\2\2\u009b\u009c\7.\2\2\u009c*\3\2\2\2\u009d\u009e\7*\2\2\u009e,"+
		"\3\2\2\2\u009f\u00a0\7+\2\2\u00a0.\3\2\2\2\u00a1\u00a3\t\4\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\60\3\2\2\2\u00a6\u00a8\t\5\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2"+
		"\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\62\3\2\2\2\16\2jouz\u0080"+
		"\u0082\u0088\u008a\u0090\u00a4\u00a9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}