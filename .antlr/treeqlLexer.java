// Generated from d:\Tez\2019-2020\Chrome Extension\thesis-work\languageformalism\TreeQL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TreeQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOLEAN_LITERAL=2, STRING_LITERAL=3, NUMERIC_LITERAL=4, TRUE=5, 
		FALSE=6, LPAREN=7, RPAREN=8, LBRACE=9, RBRACE=10, LBRACK=11, RBRACK=12, 
		SEMI=13, COMMA=14, DOT=15, AS=16, BOOLEAN=17, BYTE=18, CHAR=19, DOUBLE=20, 
		CONFORMIFEQUAL=21, DERIVEALWAYS=22, DERIVEIFNOTEQUAL=23, TERMINATEIFNOTEQUAL=24, 
		TERMINATE=25, OVERRIDE=26, EVALUATE=27, EXPLODE=28, DROP=29, FLOAT=30, 
		INT=31, JOIN=32, LONG=33, MERGE=34, ON=35, RECOGNIZE=36, SHORT=37, STRING=38, 
		PATH=39, TREE=40, UNION=41, SELECT=42, FROM=43, WHERE=44, ASSIGN=45, GT=46, 
		LT=47, BANG=48, TILDE=49, QUESTION=50, COLON=51, EQUAL=52, LE=53, GE=54, 
		NOTEQUAL=55, AND=56, OR=57, INC=58, DEC=59, ADD=60, SUB=61, DIV=62, MOD=63, 
		STAR=64, VAR_NAME=65, CHARACTER=66, ESCAPE_CHARACTER=67, WS=68, COMMENT=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "BOOLEAN_LITERAL", "STRING_LITERAL", "NUMERIC_LITERAL", "TRUE", 
		"FALSE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "AS", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "CONFORMIFEQUAL", 
		"DERIVEALWAYS", "DERIVEIFNOTEQUAL", "TERMINATEIFNOTEQUAL", "TERMINATE", 
		"OVERRIDE", "EVALUATE", "EXPLODE", "DROP", "FLOAT", "INT", "JOIN", "LONG", 
		"MERGE", "ON", "RECOGNIZE", "SHORT", "STRING", "PATH", "TREE", "UNION", 
		"SELECT", "FROM", "WHERE", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "DIV", "MOD", "STAR", "DIGIT", "E", "EscapeSequence", "HexDigit", 
		"VAR_NAME", "CHARACTER", "ESCAPE_CHARACTER", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", null, null, null, "'true'", "'false'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'as'", "'boolean'", "'byte'", 
		"'char'", "'double'", "'conform if equal'", "'derive always'", "'derive if equal'", 
		"'terminate if not equal'", "'terminate'", "'override'", "'evaluate'", 
		"'explode'", "'drop'", "'float'", "'int'", "'join'", "'long'", "'merge'", 
		"'on'", "'recognize'", "'short'", "'String'", "'Path'", "'Tree'", "'union'", 
		"'select'", "'from'", "'where'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
		"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
		"'+'", "'-'", "'/'", "'%'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "BOOLEAN_LITERAL", "STRING_LITERAL", "NUMERIC_LITERAL", "TRUE", 
		"FALSE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "AS", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "CONFORMIFEQUAL", 
		"DERIVEALWAYS", "DERIVEIFNOTEQUAL", "TERMINATEIFNOTEQUAL", "TERMINATE", 
		"OVERRIDE", "EVALUATE", "EXPLODE", "DROP", "FLOAT", "INT", "JOIN", "LONG", 
		"MERGE", "ON", "RECOGNIZE", "SHORT", "STRING", "PATH", "TREE", "UNION", 
		"SELECT", "FROM", "WHERE", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "DIV", "MOD", "STAR", "VAR_NAME", "CHARACTER", "ESCAPE_CHARACTER", 
		"WS", "COMMENT"
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


	public TreeQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TreeQL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u023e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3\u009d\n\3\3\4\3\4\3\4\7\4\u00a2"+
		"\n\4\f\4\16\4\u00a5\13\4\3\4\3\4\3\5\6\5\u00aa\n\5\r\5\16\5\u00ab\3\5"+
		"\3\5\7\5\u00b0\n\5\f\5\16\5\u00b3\13\5\5\5\u00b5\n\5\3\5\3\5\5\5\u00b9"+
		"\n\5\3\5\6\5\u00bc\n\5\r\5\16\5\u00bd\5\5\u00c0\n\5\3\5\3\5\6\5\u00c4"+
		"\n\5\r\5\16\5\u00c5\3\5\3\5\5\5\u00ca\n\5\3\5\6\5\u00cd\n\5\r\5\16\5\u00ce"+
		"\5\5\u00d1\n\5\5\5\u00d3\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3"+
		":\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3"+
		"D\3D\3D\3D\5D\u020b\nD\3D\5D\u020e\nD\3D\3D\3D\6D\u0213\nD\rD\16D\u0214"+
		"\3D\3D\3D\3D\3D\5D\u021c\nD\3E\3E\3F\3F\7F\u0222\nF\fF\16F\u0225\13F\3"+
		"G\3G\3G\3G\3H\3H\3I\6I\u022e\nI\rI\16I\u022f\3I\3I\3J\3J\3J\3J\7J\u0238"+
		"\nJ\fJ\16J\u023b\13J\3J\3J\2\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008bC\u008dD\u008fE\u0091F\u0093G\3\2\16\6\2\f\f\17"+
		"\17$$^^\4\2--//\4\2GGgg\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\62;"+
		"CHch\5\2C\\aac|\6\2\62;C\\aac|\4\2))^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\2\u024f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u008b\3"+
		"\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2"+
		"\3\u0095\3\2\2\2\5\u009c\3\2\2\2\7\u009e\3\2\2\2\t\u00d2\3\2\2\2\13\u00d4"+
		"\3\2\2\2\r\u00d9\3\2\2\2\17\u00df\3\2\2\2\21\u00e1\3\2\2\2\23\u00e3\3"+
		"\2\2\2\25\u00e5\3\2\2\2\27\u00e7\3\2\2\2\31\u00e9\3\2\2\2\33\u00eb\3\2"+
		"\2\2\35\u00ed\3\2\2\2\37\u00ef\3\2\2\2!\u00f1\3\2\2\2#\u00f4\3\2\2\2%"+
		"\u00fc\3\2\2\2\'\u0101\3\2\2\2)\u0106\3\2\2\2+\u010d\3\2\2\2-\u011e\3"+
		"\2\2\2/\u012c\3\2\2\2\61\u013c\3\2\2\2\63\u0153\3\2\2\2\65\u015d\3\2\2"+
		"\2\67\u0166\3\2\2\29\u016f\3\2\2\2;\u0177\3\2\2\2=\u017c\3\2\2\2?\u0182"+
		"\3\2\2\2A\u0186\3\2\2\2C\u018b\3\2\2\2E\u0190\3\2\2\2G\u0196\3\2\2\2I"+
		"\u0199\3\2\2\2K\u01a3\3\2\2\2M\u01a9\3\2\2\2O\u01b0\3\2\2\2Q\u01b5\3\2"+
		"\2\2S\u01ba\3\2\2\2U\u01c0\3\2\2\2W\u01c7\3\2\2\2Y\u01cc\3\2\2\2[\u01d2"+
		"\3\2\2\2]\u01d4\3\2\2\2_\u01d6\3\2\2\2a\u01d8\3\2\2\2c\u01da\3\2\2\2e"+
		"\u01dc\3\2\2\2g\u01de\3\2\2\2i\u01e0\3\2\2\2k\u01e3\3\2\2\2m\u01e6\3\2"+
		"\2\2o\u01e9\3\2\2\2q\u01ec\3\2\2\2s\u01ef\3\2\2\2u\u01f2\3\2\2\2w\u01f5"+
		"\3\2\2\2y\u01f8\3\2\2\2{\u01fa\3\2\2\2}\u01fc\3\2\2\2\177\u01fe\3\2\2"+
		"\2\u0081\u0200\3\2\2\2\u0083\u0202\3\2\2\2\u0085\u0204\3\2\2\2\u0087\u021b"+
		"\3\2\2\2\u0089\u021d\3\2\2\2\u008b\u021f\3\2\2\2\u008d\u0226\3\2\2\2\u008f"+
		"\u022a\3\2\2\2\u0091\u022d\3\2\2\2\u0093\u0233\3\2\2\2\u0095\u0096\7p"+
		"\2\2\u0096\u0097\7w\2\2\u0097\u0098\7n\2\2\u0098\u0099\7n\2\2\u0099\4"+
		"\3\2\2\2\u009a\u009d\5\13\6\2\u009b\u009d\5\r\7\2\u009c\u009a\3\2\2\2"+
		"\u009c\u009b\3\2\2\2\u009d\6\3\2\2\2\u009e\u00a3\7$\2\2\u009f\u00a2\n"+
		"\2\2\2\u00a0\u00a2\5\u0087D\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2"+
		"\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7\b\3\2\2\2\u00a8"+
		"\u00aa\5\u0083B\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b4\3\2\2\2\u00ad\u00b1\7\60\2\2"+
		"\u00ae\u00b0\5\u0083B\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00bf\3\2\2\2\u00b6"+
		"\u00b8\5\u0085C\2\u00b7\u00b9\t\3\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\5\u0083B\2\u00bb\u00ba\3\2\2"+
		"\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00d3\3\2\2\2\u00c1"+
		"\u00c3\7\60\2\2\u00c2\u00c4\5\u0083B\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00d0\3\2\2\2\u00c7"+
		"\u00c9\5\u0085C\2\u00c8\u00ca\t\3\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00cd\5\u0083B\2\u00cc\u00cb\3\2\2"+
		"\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00a9\3\2\2\2\u00d2\u00c1\3\2\2\2\u00d3\n\3\2\2\2\u00d4\u00d5\7v\2\2"+
		"\u00d5\u00d6\7t\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7g\2\2\u00d8\f\3\2"+
		"\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd"+
		"\7u\2\2\u00dd\u00de\7g\2\2\u00de\16\3\2\2\2\u00df\u00e0\7*\2\2\u00e0\20"+
		"\3\2\2\2\u00e1\u00e2\7+\2\2\u00e2\22\3\2\2\2\u00e3\u00e4\7}\2\2\u00e4"+
		"\24\3\2\2\2\u00e5\u00e6\7\177\2\2\u00e6\26\3\2\2\2\u00e7\u00e8\7]\2\2"+
		"\u00e8\30\3\2\2\2\u00e9\u00ea\7_\2\2\u00ea\32\3\2\2\2\u00eb\u00ec\7=\2"+
		"\2\u00ec\34\3\2\2\2\u00ed\u00ee\7.\2\2\u00ee\36\3\2\2\2\u00ef\u00f0\7"+
		"\60\2\2\u00f0 \3\2\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7u\2\2\u00f3\"\3"+
		"\2\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7q\2\2\u00f7"+
		"\u00f8\7n\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7p\2\2"+
		"\u00fb$\3\2\2\2\u00fc\u00fd\7d\2\2\u00fd\u00fe\7{\2\2\u00fe\u00ff\7v\2"+
		"\2\u00ff\u0100\7g\2\2\u0100&\3\2\2\2\u0101\u0102\7e\2\2\u0102\u0103\7"+
		"j\2\2\u0103\u0104\7c\2\2\u0104\u0105\7t\2\2\u0105(\3\2\2\2\u0106\u0107"+
		"\7f\2\2\u0107\u0108\7q\2\2\u0108\u0109\7w\2\2\u0109\u010a\7d\2\2\u010a"+
		"\u010b\7n\2\2\u010b\u010c\7g\2\2\u010c*\3\2\2\2\u010d\u010e\7e\2\2\u010e"+
		"\u010f\7q\2\2\u010f\u0110\7p\2\2\u0110\u0111\7h\2\2\u0111\u0112\7q\2\2"+
		"\u0112\u0113\7t\2\2\u0113\u0114\7o\2\2\u0114\u0115\7\"\2\2\u0115\u0116"+
		"\7k\2\2\u0116\u0117\7h\2\2\u0117\u0118\7\"\2\2\u0118\u0119\7g\2\2\u0119"+
		"\u011a\7s\2\2\u011a\u011b\7w\2\2\u011b\u011c\7c\2\2\u011c\u011d\7n\2\2"+
		"\u011d,\3\2\2\2\u011e\u011f\7f\2\2\u011f\u0120\7g\2\2\u0120\u0121\7t\2"+
		"\2\u0121\u0122\7k\2\2\u0122\u0123\7x\2\2\u0123\u0124\7g\2\2\u0124\u0125"+
		"\7\"\2\2\u0125\u0126\7c\2\2\u0126\u0127\7n\2\2\u0127\u0128\7y\2\2\u0128"+
		"\u0129\7c\2\2\u0129\u012a\7{\2\2\u012a\u012b\7u\2\2\u012b.\3\2\2\2\u012c"+
		"\u012d\7f\2\2\u012d\u012e\7g\2\2\u012e\u012f\7t\2\2\u012f\u0130\7k\2\2"+
		"\u0130\u0131\7x\2\2\u0131\u0132\7g\2\2\u0132\u0133\7\"\2\2\u0133\u0134"+
		"\7k\2\2\u0134\u0135\7h\2\2\u0135\u0136\7\"\2\2\u0136\u0137\7g\2\2\u0137"+
		"\u0138\7s\2\2\u0138\u0139\7w\2\2\u0139\u013a\7c\2\2\u013a\u013b\7n\2\2"+
		"\u013b\60\3\2\2\2\u013c\u013d\7v\2\2\u013d\u013e\7g\2\2\u013e\u013f\7"+
		"t\2\2\u013f\u0140\7o\2\2\u0140\u0141\7k\2\2\u0141\u0142\7p\2\2\u0142\u0143"+
		"\7c\2\2\u0143\u0144\7v\2\2\u0144\u0145\7g\2\2\u0145\u0146\7\"\2\2\u0146"+
		"\u0147\7k\2\2\u0147\u0148\7h\2\2\u0148\u0149\7\"\2\2\u0149\u014a\7p\2"+
		"\2\u014a\u014b\7q\2\2\u014b\u014c\7v\2\2\u014c\u014d\7\"\2\2\u014d\u014e"+
		"\7g\2\2\u014e\u014f\7s\2\2\u014f\u0150\7w\2\2\u0150\u0151\7c\2\2\u0151"+
		"\u0152\7n\2\2\u0152\62\3\2\2\2\u0153\u0154\7v\2\2\u0154\u0155\7g\2\2\u0155"+
		"\u0156\7t\2\2\u0156\u0157\7o\2\2\u0157\u0158\7k\2\2\u0158\u0159\7p\2\2"+
		"\u0159\u015a\7c\2\2\u015a\u015b\7v\2\2\u015b\u015c\7g\2\2\u015c\64\3\2"+
		"\2\2\u015d\u015e\7q\2\2\u015e\u015f\7x\2\2\u015f\u0160\7g\2\2\u0160\u0161"+
		"\7t\2\2\u0161\u0162\7t\2\2\u0162\u0163\7k\2\2\u0163\u0164\7f\2\2\u0164"+
		"\u0165\7g\2\2\u0165\66\3\2\2\2\u0166\u0167\7g\2\2\u0167\u0168\7x\2\2\u0168"+
		"\u0169\7c\2\2\u0169\u016a\7n\2\2\u016a\u016b\7w\2\2\u016b\u016c\7c\2\2"+
		"\u016c\u016d\7v\2\2\u016d\u016e\7g\2\2\u016e8\3\2\2\2\u016f\u0170\7g\2"+
		"\2\u0170\u0171\7z\2\2\u0171\u0172\7r\2\2\u0172\u0173\7n\2\2\u0173\u0174"+
		"\7q\2\2\u0174\u0175\7f\2\2\u0175\u0176\7g\2\2\u0176:\3\2\2\2\u0177\u0178"+
		"\7f\2\2\u0178\u0179\7t\2\2\u0179\u017a\7q\2\2\u017a\u017b\7r\2\2\u017b"+
		"<\3\2\2\2\u017c\u017d\7h\2\2\u017d\u017e\7n\2\2\u017e\u017f\7q\2\2\u017f"+
		"\u0180\7c\2\2\u0180\u0181\7v\2\2\u0181>\3\2\2\2\u0182\u0183\7k\2\2\u0183"+
		"\u0184\7p\2\2\u0184\u0185\7v\2\2\u0185@\3\2\2\2\u0186\u0187\7l\2\2\u0187"+
		"\u0188\7q\2\2\u0188\u0189\7k\2\2\u0189\u018a\7p\2\2\u018aB\3\2\2\2\u018b"+
		"\u018c\7n\2\2\u018c\u018d\7q\2\2\u018d\u018e\7p\2\2\u018e\u018f\7i\2\2"+
		"\u018fD\3\2\2\2\u0190\u0191\7o\2\2\u0191\u0192\7g\2\2\u0192\u0193\7t\2"+
		"\2\u0193\u0194\7i\2\2\u0194\u0195\7g\2\2\u0195F\3\2\2\2\u0196\u0197\7"+
		"q\2\2\u0197\u0198\7p\2\2\u0198H\3\2\2\2\u0199\u019a\7t\2\2\u019a\u019b"+
		"\7g\2\2\u019b\u019c\7e\2\2\u019c\u019d\7q\2\2\u019d\u019e\7i\2\2\u019e"+
		"\u019f\7p\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7|\2\2\u01a1\u01a2\7g\2\2"+
		"\u01a2J\3\2\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7j\2\2\u01a5\u01a6\7q\2"+
		"\2\u01a6\u01a7\7t\2\2\u01a7\u01a8\7v\2\2\u01a8L\3\2\2\2\u01a9\u01aa\7"+
		"U\2\2\u01aa\u01ab\7v\2\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7k\2\2\u01ad\u01ae"+
		"\7p\2\2\u01ae\u01af\7i\2\2\u01afN\3\2\2\2\u01b0\u01b1\7R\2\2\u01b1\u01b2"+
		"\7c\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7j\2\2\u01b4P\3\2\2\2\u01b5\u01b6"+
		"\7V\2\2\u01b6\u01b7\7t\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7g\2\2\u01b9"+
		"R\3\2\2\2\u01ba\u01bb\7w\2\2\u01bb\u01bc\7p\2\2\u01bc\u01bd\7k\2\2\u01bd"+
		"\u01be\7q\2\2\u01be\u01bf\7p\2\2\u01bfT\3\2\2\2\u01c0\u01c1\7u\2\2\u01c1"+
		"\u01c2\7g\2\2\u01c2\u01c3\7n\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c5\7e\2\2"+
		"\u01c5\u01c6\7v\2\2\u01c6V\3\2\2\2\u01c7\u01c8\7h\2\2\u01c8\u01c9\7t\2"+
		"\2\u01c9\u01ca\7q\2\2\u01ca\u01cb\7o\2\2\u01cbX\3\2\2\2\u01cc\u01cd\7"+
		"y\2\2\u01cd\u01ce\7j\2\2\u01ce\u01cf\7g\2\2\u01cf\u01d0\7t\2\2\u01d0\u01d1"+
		"\7g\2\2\u01d1Z\3\2\2\2\u01d2\u01d3\7?\2\2\u01d3\\\3\2\2\2\u01d4\u01d5"+
		"\7@\2\2\u01d5^\3\2\2\2\u01d6\u01d7\7>\2\2\u01d7`\3\2\2\2\u01d8\u01d9\7"+
		"#\2\2\u01d9b\3\2\2\2\u01da\u01db\7\u0080\2\2\u01dbd\3\2\2\2\u01dc\u01dd"+
		"\7A\2\2\u01ddf\3\2\2\2\u01de\u01df\7<\2\2\u01dfh\3\2\2\2\u01e0\u01e1\7"+
		"?\2\2\u01e1\u01e2\7?\2\2\u01e2j\3\2\2\2\u01e3\u01e4\7>\2\2\u01e4\u01e5"+
		"\7?\2\2\u01e5l\3\2\2\2\u01e6\u01e7\7@\2\2\u01e7\u01e8\7?\2\2\u01e8n\3"+
		"\2\2\2\u01e9\u01ea\7#\2\2\u01ea\u01eb\7?\2\2\u01ebp\3\2\2\2\u01ec\u01ed"+
		"\7(\2\2\u01ed\u01ee\7(\2\2\u01eer\3\2\2\2\u01ef\u01f0\7~\2\2\u01f0\u01f1"+
		"\7~\2\2\u01f1t\3\2\2\2\u01f2\u01f3\7-\2\2\u01f3\u01f4\7-\2\2\u01f4v\3"+
		"\2\2\2\u01f5\u01f6\7/\2\2\u01f6\u01f7\7/\2\2\u01f7x\3\2\2\2\u01f8\u01f9"+
		"\7-\2\2\u01f9z\3\2\2\2\u01fa\u01fb\7/\2\2\u01fb|\3\2\2\2\u01fc\u01fd\7"+
		"\61\2\2\u01fd~\3\2\2\2\u01fe\u01ff\7\'\2\2\u01ff\u0080\3\2\2\2\u0200\u0201"+
		"\7,\2\2\u0201\u0082\3\2\2\2\u0202\u0203\4\62;\2\u0203\u0084\3\2\2\2\u0204"+
		"\u0205\t\4\2\2\u0205\u0086\3\2\2\2\u0206\u0207\7^\2\2\u0207\u021c\t\5"+
		"\2\2\u0208\u020d\7^\2\2\u0209\u020b\t\6\2\2\u020a\u0209\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\t\7\2\2\u020d\u020a\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u021c\t\7\2\2\u0210"+
		"\u0212\7^\2\2\u0211\u0213\7w\2\2\u0212\u0211\3\2\2\2\u0213\u0214\3\2\2"+
		"\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217"+
		"\5\u0089E\2\u0217\u0218\5\u0089E\2\u0218\u0219\5\u0089E\2\u0219\u021a"+
		"\5\u0089E\2\u021a\u021c\3\2\2\2\u021b\u0206\3\2\2\2\u021b\u0208\3\2\2"+
		"\2\u021b\u0210\3\2\2\2\u021c\u0088\3\2\2\2\u021d\u021e\t\b\2\2\u021e\u008a"+
		"\3\2\2\2\u021f\u0223\t\t\2\2\u0220\u0222\t\n\2\2\u0221\u0220\3\2\2\2\u0222"+
		"\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u008c\3\2"+
		"\2\2\u0225\u0223\3\2\2\2\u0226\u0227\7)\2\2\u0227\u0228\n\13\2\2\u0228"+
		"\u0229\7)\2\2\u0229\u008e\3\2\2\2\u022a\u022b\5\u008dG\2\u022b\u0090\3"+
		"\2\2\2\u022c\u022e\t\f\2\2\u022d\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\bI"+
		"\2\2\u0232\u0092\3\2\2\2\u0233\u0234\7\61\2\2\u0234\u0235\7\61\2\2\u0235"+
		"\u0239\3\2\2\2\u0236\u0238\n\r\2\2\u0237\u0236\3\2\2\2\u0238\u023b\3\2"+
		"\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023c\u023d\bJ\2\2\u023d\u0094\3\2\2\2\30\2\u009c\u00a1"+
		"\u00a3\u00ab\u00b1\u00b4\u00b8\u00bd\u00bf\u00c5\u00c9\u00ce\u00d0\u00d2"+
		"\u020a\u020d\u0214\u021b\u0223\u022f\u0239\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}