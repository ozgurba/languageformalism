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
		NOTEQUAL=55, AND=56, OR=57, INC=58, DEC=59, ADD=60, SUB=61, NEGATION=62, 
		DIV=63, MOD=64, STAR=65, VAR_NAME=66, CHARACTER=67, ESCAPE_CHARACTER=68, 
		WS=69, COMMENT=70;
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
		"SUB", "NEGATION", "DIV", "MOD", "STAR", "DIGIT", "E", "EscapeSequence", 
		"HexDigit", "VAR_NAME", "CHARACTER", "ESCAPE_CHARACTER", "WS", "COMMENT"
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
		"'+'", null, null, "'/'", "'%'", "'*'"
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
		"SUB", "NEGATION", "DIV", "MOD", "STAR", "VAR_NAME", "CHARACTER", "ESCAPE_CHARACTER", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u0242\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3\u009f\n\3\3\4\3\4\3\4"+
		"\7\4\u00a4\n\4\f\4\16\4\u00a7\13\4\3\4\3\4\3\5\6\5\u00ac\n\5\r\5\16\5"+
		"\u00ad\3\5\3\5\7\5\u00b2\n\5\f\5\16\5\u00b5\13\5\5\5\u00b7\n\5\3\5\3\5"+
		"\5\5\u00bb\n\5\3\5\6\5\u00be\n\5\r\5\16\5\u00bf\5\5\u00c2\n\5\3\5\3\5"+
		"\6\5\u00c6\n\5\r\5\16\5\u00c7\3\5\3\5\5\5\u00cc\n\5\3\5\6\5\u00cf\n\5"+
		"\r\5\16\5\u00d0\5\5\u00d3\n\5\5\5\u00d5\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\5E\u020f\nE\3E\5E\u0212\nE\3E\3E\3E\6"+
		"E\u0217\nE\rE\16E\u0218\3E\3E\3E\3E\3E\5E\u0220\nE\3F\3F\3G\3G\7G\u0226"+
		"\nG\fG\16G\u0229\13G\3H\3H\3H\3H\3I\3I\3J\6J\u0232\nJ\rJ\16J\u0233\3J"+
		"\3J\3K\3K\3K\3K\7K\u023c\nK\fK\16K\u023f\13K\3K\3K\2\2L\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085\2\u0087\2\u0089\2\u008b\2\u008dD\u008fE\u0091"+
		"F\u0093G\u0095H\3\2\16\6\2\f\f\17\17$$^^\4\2--//\4\2GGgg\n\2$$))^^ddh"+
		"hppttvv\3\2\62\65\3\2\629\5\2\62;CHch\5\2C\\aac|\6\2\62;C\\aac|\4\2))"+
		"^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0253\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\5\u009e"+
		"\3\2\2\2\7\u00a0\3\2\2\2\t\u00d4\3\2\2\2\13\u00d6\3\2\2\2\r\u00db\3\2"+
		"\2\2\17\u00e1\3\2\2\2\21\u00e3\3\2\2\2\23\u00e5\3\2\2\2\25\u00e7\3\2\2"+
		"\2\27\u00e9\3\2\2\2\31\u00eb\3\2\2\2\33\u00ed\3\2\2\2\35\u00ef\3\2\2\2"+
		"\37\u00f1\3\2\2\2!\u00f3\3\2\2\2#\u00f6\3\2\2\2%\u00fe\3\2\2\2\'\u0103"+
		"\3\2\2\2)\u0108\3\2\2\2+\u010f\3\2\2\2-\u0120\3\2\2\2/\u012e\3\2\2\2\61"+
		"\u013e\3\2\2\2\63\u0155\3\2\2\2\65\u015f\3\2\2\2\67\u0168\3\2\2\29\u0171"+
		"\3\2\2\2;\u0179\3\2\2\2=\u017e\3\2\2\2?\u0184\3\2\2\2A\u0188\3\2\2\2C"+
		"\u018d\3\2\2\2E\u0192\3\2\2\2G\u0198\3\2\2\2I\u019b\3\2\2\2K\u01a5\3\2"+
		"\2\2M\u01ab\3\2\2\2O\u01b2\3\2\2\2Q\u01b7\3\2\2\2S\u01bc\3\2\2\2U\u01c2"+
		"\3\2\2\2W\u01c9\3\2\2\2Y\u01ce\3\2\2\2[\u01d4\3\2\2\2]\u01d6\3\2\2\2_"+
		"\u01d8\3\2\2\2a\u01da\3\2\2\2c\u01dc\3\2\2\2e\u01de\3\2\2\2g\u01e0\3\2"+
		"\2\2i\u01e2\3\2\2\2k\u01e5\3\2\2\2m\u01e8\3\2\2\2o\u01eb\3\2\2\2q\u01ee"+
		"\3\2\2\2s\u01f1\3\2\2\2u\u01f4\3\2\2\2w\u01f7\3\2\2\2y\u01fa\3\2\2\2{"+
		"\u01fc\3\2\2\2}\u01fe\3\2\2\2\177\u0200\3\2\2\2\u0081\u0202\3\2\2\2\u0083"+
		"\u0204\3\2\2\2\u0085\u0206\3\2\2\2\u0087\u0208\3\2\2\2\u0089\u021f\3\2"+
		"\2\2\u008b\u0221\3\2\2\2\u008d\u0223\3\2\2\2\u008f\u022a\3\2\2\2\u0091"+
		"\u022e\3\2\2\2\u0093\u0231\3\2\2\2\u0095\u0237\3\2\2\2\u0097\u0098\7p"+
		"\2\2\u0098\u0099\7w\2\2\u0099\u009a\7n\2\2\u009a\u009b\7n\2\2\u009b\4"+
		"\3\2\2\2\u009c\u009f\5\13\6\2\u009d\u009f\5\r\7\2\u009e\u009c\3\2\2\2"+
		"\u009e\u009d\3\2\2\2\u009f\6\3\2\2\2\u00a0\u00a5\7$\2\2\u00a1\u00a4\n"+
		"\2\2\2\u00a2\u00a4\5\u0089E\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7$\2\2\u00a9\b\3\2\2\2\u00aa"+
		"\u00ac\5\u0085C\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b6\3\2\2\2\u00af\u00b3\7\60\2\2"+
		"\u00b0\u00b2\5\u0085C\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00af\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00c1\3\2\2\2\u00b8"+
		"\u00ba\5\u0087D\2\u00b9\u00bb\t\3\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00be\5\u0085C\2\u00bd\u00bc\3\2\2"+
		"\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00d5\3\2\2\2\u00c3"+
		"\u00c5\7\60\2\2\u00c4\u00c6\5\u0085C\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d2\3\2\2\2\u00c9"+
		"\u00cb\5\u0087D\2\u00ca\u00cc\t\3\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf\5\u0085C\2\u00ce\u00cd\3\2\2"+
		"\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00ab\3\2\2\2\u00d4\u00c3\3\2\2\2\u00d5\n\3\2\2\2\u00d6\u00d7\7v\2\2"+
		"\u00d7\u00d8\7t\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7g\2\2\u00da\f\3\2"+
		"\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7n\2\2\u00de\u00df"+
		"\7u\2\2\u00df\u00e0\7g\2\2\u00e0\16\3\2\2\2\u00e1\u00e2\7*\2\2\u00e2\20"+
		"\3\2\2\2\u00e3\u00e4\7+\2\2\u00e4\22\3\2\2\2\u00e5\u00e6\7}\2\2\u00e6"+
		"\24\3\2\2\2\u00e7\u00e8\7\177\2\2\u00e8\26\3\2\2\2\u00e9\u00ea\7]\2\2"+
		"\u00ea\30\3\2\2\2\u00eb\u00ec\7_\2\2\u00ec\32\3\2\2\2\u00ed\u00ee\7=\2"+
		"\2\u00ee\34\3\2\2\2\u00ef\u00f0\7.\2\2\u00f0\36\3\2\2\2\u00f1\u00f2\7"+
		"\60\2\2\u00f2 \3\2\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7u\2\2\u00f5\"\3"+
		"\2\2\2\u00f6\u00f7\7d\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7q\2\2\u00f9"+
		"\u00fa\7n\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7p\2\2"+
		"\u00fd$\3\2\2\2\u00fe\u00ff\7d\2\2\u00ff\u0100\7{\2\2\u0100\u0101\7v\2"+
		"\2\u0101\u0102\7g\2\2\u0102&\3\2\2\2\u0103\u0104\7e\2\2\u0104\u0105\7"+
		"j\2\2\u0105\u0106\7c\2\2\u0106\u0107\7t\2\2\u0107(\3\2\2\2\u0108\u0109"+
		"\7f\2\2\u0109\u010a\7q\2\2\u010a\u010b\7w\2\2\u010b\u010c\7d\2\2\u010c"+
		"\u010d\7n\2\2\u010d\u010e\7g\2\2\u010e*\3\2\2\2\u010f\u0110\7e\2\2\u0110"+
		"\u0111\7q\2\2\u0111\u0112\7p\2\2\u0112\u0113\7h\2\2\u0113\u0114\7q\2\2"+
		"\u0114\u0115\7t\2\2\u0115\u0116\7o\2\2\u0116\u0117\7\"\2\2\u0117\u0118"+
		"\7k\2\2\u0118\u0119\7h\2\2\u0119\u011a\7\"\2\2\u011a\u011b\7g\2\2\u011b"+
		"\u011c\7s\2\2\u011c\u011d\7w\2\2\u011d\u011e\7c\2\2\u011e\u011f\7n\2\2"+
		"\u011f,\3\2\2\2\u0120\u0121\7f\2\2\u0121\u0122\7g\2\2\u0122\u0123\7t\2"+
		"\2\u0123\u0124\7k\2\2\u0124\u0125\7x\2\2\u0125\u0126\7g\2\2\u0126\u0127"+
		"\7\"\2\2\u0127\u0128\7c\2\2\u0128\u0129\7n\2\2\u0129\u012a\7y\2\2\u012a"+
		"\u012b\7c\2\2\u012b\u012c\7{\2\2\u012c\u012d\7u\2\2\u012d.\3\2\2\2\u012e"+
		"\u012f\7f\2\2\u012f\u0130\7g\2\2\u0130\u0131\7t\2\2\u0131\u0132\7k\2\2"+
		"\u0132\u0133\7x\2\2\u0133\u0134\7g\2\2\u0134\u0135\7\"\2\2\u0135\u0136"+
		"\7k\2\2\u0136\u0137\7h\2\2\u0137\u0138\7\"\2\2\u0138\u0139\7g\2\2\u0139"+
		"\u013a\7s\2\2\u013a\u013b\7w\2\2\u013b\u013c\7c\2\2\u013c\u013d\7n\2\2"+
		"\u013d\60\3\2\2\2\u013e\u013f\7v\2\2\u013f\u0140\7g\2\2\u0140\u0141\7"+
		"t\2\2\u0141\u0142\7o\2\2\u0142\u0143\7k\2\2\u0143\u0144\7p\2\2\u0144\u0145"+
		"\7c\2\2\u0145\u0146\7v\2\2\u0146\u0147\7g\2\2\u0147\u0148\7\"\2\2\u0148"+
		"\u0149\7k\2\2\u0149\u014a\7h\2\2\u014a\u014b\7\"\2\2\u014b\u014c\7p\2"+
		"\2\u014c\u014d\7q\2\2\u014d\u014e\7v\2\2\u014e\u014f\7\"\2\2\u014f\u0150"+
		"\7g\2\2\u0150\u0151\7s\2\2\u0151\u0152\7w\2\2\u0152\u0153\7c\2\2\u0153"+
		"\u0154\7n\2\2\u0154\62\3\2\2\2\u0155\u0156\7v\2\2\u0156\u0157\7g\2\2\u0157"+
		"\u0158\7t\2\2\u0158\u0159\7o\2\2\u0159\u015a\7k\2\2\u015a\u015b\7p\2\2"+
		"\u015b\u015c\7c\2\2\u015c\u015d\7v\2\2\u015d\u015e\7g\2\2\u015e\64\3\2"+
		"\2\2\u015f\u0160\7q\2\2\u0160\u0161\7x\2\2\u0161\u0162\7g\2\2\u0162\u0163"+
		"\7t\2\2\u0163\u0164\7t\2\2\u0164\u0165\7k\2\2\u0165\u0166\7f\2\2\u0166"+
		"\u0167\7g\2\2\u0167\66\3\2\2\2\u0168\u0169\7g\2\2\u0169\u016a\7x\2\2\u016a"+
		"\u016b\7c\2\2\u016b\u016c\7n\2\2\u016c\u016d\7w\2\2\u016d\u016e\7c\2\2"+
		"\u016e\u016f\7v\2\2\u016f\u0170\7g\2\2\u01708\3\2\2\2\u0171\u0172\7g\2"+
		"\2\u0172\u0173\7z\2\2\u0173\u0174\7r\2\2\u0174\u0175\7n\2\2\u0175\u0176"+
		"\7q\2\2\u0176\u0177\7f\2\2\u0177\u0178\7g\2\2\u0178:\3\2\2\2\u0179\u017a"+
		"\7f\2\2\u017a\u017b\7t\2\2\u017b\u017c\7q\2\2\u017c\u017d\7r\2\2\u017d"+
		"<\3\2\2\2\u017e\u017f\7h\2\2\u017f\u0180\7n\2\2\u0180\u0181\7q\2\2\u0181"+
		"\u0182\7c\2\2\u0182\u0183\7v\2\2\u0183>\3\2\2\2\u0184\u0185\7k\2\2\u0185"+
		"\u0186\7p\2\2\u0186\u0187\7v\2\2\u0187@\3\2\2\2\u0188\u0189\7l\2\2\u0189"+
		"\u018a\7q\2\2\u018a\u018b\7k\2\2\u018b\u018c\7p\2\2\u018cB\3\2\2\2\u018d"+
		"\u018e\7n\2\2\u018e\u018f\7q\2\2\u018f\u0190\7p\2\2\u0190\u0191\7i\2\2"+
		"\u0191D\3\2\2\2\u0192\u0193\7o\2\2\u0193\u0194\7g\2\2\u0194\u0195\7t\2"+
		"\2\u0195\u0196\7i\2\2\u0196\u0197\7g\2\2\u0197F\3\2\2\2\u0198\u0199\7"+
		"q\2\2\u0199\u019a\7p\2\2\u019aH\3\2\2\2\u019b\u019c\7t\2\2\u019c\u019d"+
		"\7g\2\2\u019d\u019e\7e\2\2\u019e\u019f\7q\2\2\u019f\u01a0\7i\2\2\u01a0"+
		"\u01a1\7p\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7|\2\2\u01a3\u01a4\7g\2\2"+
		"\u01a4J\3\2\2\2\u01a5\u01a6\7u\2\2\u01a6\u01a7\7j\2\2\u01a7\u01a8\7q\2"+
		"\2\u01a8\u01a9\7t\2\2\u01a9\u01aa\7v\2\2\u01aaL\3\2\2\2\u01ab\u01ac\7"+
		"U\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7k\2\2\u01af\u01b0"+
		"\7p\2\2\u01b0\u01b1\7i\2\2\u01b1N\3\2\2\2\u01b2\u01b3\7R\2\2\u01b3\u01b4"+
		"\7c\2\2\u01b4\u01b5\7v\2\2\u01b5\u01b6\7j\2\2\u01b6P\3\2\2\2\u01b7\u01b8"+
		"\7V\2\2\u01b8\u01b9\7t\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7g\2\2\u01bb"+
		"R\3\2\2\2\u01bc\u01bd\7w\2\2\u01bd\u01be\7p\2\2\u01be\u01bf\7k\2\2\u01bf"+
		"\u01c0\7q\2\2\u01c0\u01c1\7p\2\2\u01c1T\3\2\2\2\u01c2\u01c3\7u\2\2\u01c3"+
		"\u01c4\7g\2\2\u01c4\u01c5\7n\2\2\u01c5\u01c6\7g\2\2\u01c6\u01c7\7e\2\2"+
		"\u01c7\u01c8\7v\2\2\u01c8V\3\2\2\2\u01c9\u01ca\7h\2\2\u01ca\u01cb\7t\2"+
		"\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7o\2\2\u01cdX\3\2\2\2\u01ce\u01cf\7"+
		"y\2\2\u01cf\u01d0\7j\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7t\2\2\u01d2\u01d3"+
		"\7g\2\2\u01d3Z\3\2\2\2\u01d4\u01d5\7?\2\2\u01d5\\\3\2\2\2\u01d6\u01d7"+
		"\7@\2\2\u01d7^\3\2\2\2\u01d8\u01d9\7>\2\2\u01d9`\3\2\2\2\u01da\u01db\7"+
		"#\2\2\u01dbb\3\2\2\2\u01dc\u01dd\7\u0080\2\2\u01ddd\3\2\2\2\u01de\u01df"+
		"\7A\2\2\u01dff\3\2\2\2\u01e0\u01e1\7<\2\2\u01e1h\3\2\2\2\u01e2\u01e3\7"+
		"?\2\2\u01e3\u01e4\7?\2\2\u01e4j\3\2\2\2\u01e5\u01e6\7>\2\2\u01e6\u01e7"+
		"\7?\2\2\u01e7l\3\2\2\2\u01e8\u01e9\7@\2\2\u01e9\u01ea\7?\2\2\u01ean\3"+
		"\2\2\2\u01eb\u01ec\7#\2\2\u01ec\u01ed\7?\2\2\u01edp\3\2\2\2\u01ee\u01ef"+
		"\7(\2\2\u01ef\u01f0\7(\2\2\u01f0r\3\2\2\2\u01f1\u01f2\7~\2\2\u01f2\u01f3"+
		"\7~\2\2\u01f3t\3\2\2\2\u01f4\u01f5\7-\2\2\u01f5\u01f6\7-\2\2\u01f6v\3"+
		"\2\2\2\u01f7\u01f8\7/\2\2\u01f8\u01f9\7/\2\2\u01f9x\3\2\2\2\u01fa\u01fb"+
		"\7-\2\2\u01fbz\3\2\2\2\u01fc\u01fd\7/\2\2\u01fd|\3\2\2\2\u01fe\u01ff\7"+
		"/\2\2\u01ff~\3\2\2\2\u0200\u0201\7\61\2\2\u0201\u0080\3\2\2\2\u0202\u0203"+
		"\7\'\2\2\u0203\u0082\3\2\2\2\u0204\u0205\7,\2\2\u0205\u0084\3\2\2\2\u0206"+
		"\u0207\4\62;\2\u0207\u0086\3\2\2\2\u0208\u0209\t\4\2\2\u0209\u0088\3\2"+
		"\2\2\u020a\u020b\7^\2\2\u020b\u0220\t\5\2\2\u020c\u0211\7^\2\2\u020d\u020f"+
		"\t\6\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0212\t\7\2\2\u0211\u020e\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0220\t\7\2\2\u0214\u0216\7^\2\2\u0215\u0217\7w\2\2\u0216\u0215"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021b\5\u008bF\2\u021b\u021c\5\u008bF\2\u021c\u021d"+
		"\5\u008bF\2\u021d\u021e\5\u008bF\2\u021e\u0220\3\2\2\2\u021f\u020a\3\2"+
		"\2\2\u021f\u020c\3\2\2\2\u021f\u0214\3\2\2\2\u0220\u008a\3\2\2\2\u0221"+
		"\u0222\t\b\2\2\u0222\u008c\3\2\2\2\u0223\u0227\t\t\2\2\u0224\u0226\t\n"+
		"\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u008e\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\7)"+
		"\2\2\u022b\u022c\n\13\2\2\u022c\u022d\7)\2\2\u022d\u0090\3\2\2\2\u022e"+
		"\u022f\5\u008fH\2\u022f\u0092\3\2\2\2\u0230\u0232\t\f\2\2\u0231\u0230"+
		"\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0236\bJ\2\2\u0236\u0094\3\2\2\2\u0237\u0238\7\61"+
		"\2\2\u0238\u0239\7\61\2\2\u0239\u023d\3\2\2\2\u023a\u023c\n\r\2\2\u023b"+
		"\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\bK\2\2\u0241"+
		"\u0096\3\2\2\2\30\2\u009e\u00a3\u00a5\u00ad\u00b3\u00b6\u00ba\u00bf\u00c1"+
		"\u00c7\u00cb\u00d0\u00d2\u00d4\u020e\u0211\u0218\u021f\u0227\u0233\u023d"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}