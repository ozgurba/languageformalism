// Generated from d:\Tez\2019-2020\Chrome Extension\thesis-work\languageformalism/KnowExtLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KnowExtLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BYTE=2, BREAK=3, CASE=4, CATCH=5, CHAR=6, CONTINUE=7, DEFAULT=8, 
		DO=9, DOUBLE=10, ELSE=11, FLOAT=12, FOR=13, IF=14, INT=15, LIST=16, LONG=17, 
		NEW=18, RETURN=19, SHORT=20, SWITCH=21, STRING=22, WHILE=23, TREE=24, 
		THROW=25, TRY=26, VOID=27, UNION=28, SELECT=29, SET=30, PROJECT=31, PRODUCT=32, 
		GROUP=33, AGGREGATE=34, RENAME=35, REORDER=36, DECIMAL_LITERAL=37, FLOAT_LITERAL=38, 
		BOOL_LITERAL=39, CHAR_LITERAL=40, STRING_LITERAL=41, NULL_LITERAL=42, 
		LPAREN=43, RPAREN=44, LBRACE=45, RBRACE=46, LBRACK=47, RBRACK=48, SEMI=49, 
		COMMA=50, DOT=51, ASSIGN=52, GT=53, LT=54, BANG=55, TILDE=56, QUESTION=57, 
		COLON=58, EQUAL=59, LE=60, GE=61, NOTEQUAL=62, AND=63, OR=64, INC=65, 
		DEC=66, ADD=67, SUB=68, MUL=69, DIV=70, BITAND=71, BITOR=72, CARET=73, 
		MOD=74, ADD_ASSIGN=75, SUB_ASSIGN=76, MUL_ASSIGN=77, DIV_ASSIGN=78, AND_ASSIGN=79, 
		OR_ASSIGN=80, XOR_ASSIGN=81, MOD_ASSIGN=82, LSHIFT_ASSIGN=83, RSHIFT_ASSIGN=84, 
		URSHIFT_ASSIGN=85, WS=86, COMMENT=87, LINE_COMMENT=88, IDENTIFIER=89;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN", "BYTE", "BREAK", "CASE", "CATCH", "CHAR", "CONTINUE", "DEFAULT", 
		"DO", "DOUBLE", "ELSE", "FLOAT", "FOR", "IF", "INT", "LIST", "LONG", "NEW", 
		"RETURN", "SHORT", "SWITCH", "STRING", "WHILE", "TREE", "THROW", "TRY", 
		"VOID", "UNION", "SELECT", "SET", "PROJECT", "PRODUCT", "GROUP", "AGGREGATE", 
		"RENAME", "REORDER", "DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", 
		"ExponentPart", "EscapeSequence", "Digits", "LetterOrDigit", "Letter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'byte'", "'break'", "'case'", "'catch'", "'char'", 
		"'continue'", "'default'", "'do'", "'double'", "'else'", "'float'", "'for'", 
		"'if'", "'int'", "'list'", "'long'", "'new'", "'return'", "'short'", "'switch'", 
		"'String'", "'while'", "'Tree'", "'throw'", "'try'", "'void'", "'union'", 
		"'select'", "'set'", "'project'", "'product'", "'group'", "'aggregate'", 
		"'rename'", "'reorder'", null, null, null, null, null, "'null'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
		"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
		"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
		"'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "BYTE", "BREAK", "CASE", "CATCH", "CHAR", "CONTINUE", 
		"DEFAULT", "DO", "DOUBLE", "ELSE", "FLOAT", "FOR", "IF", "INT", "LIST", 
		"LONG", "NEW", "RETURN", "SHORT", "SWITCH", "STRING", "WHILE", "TREE", 
		"THROW", "TRY", "VOID", "UNION", "SELECT", "SET", "PROJECT", "PRODUCT", 
		"GROUP", "AGGREGATE", "RENAME", "REORDER", "DECIMAL_LITERAL", "FLOAT_LITERAL", 
		"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
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


	public KnowExtLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KnowExtLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u029c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\5&\u019a\n&\3&\6&\u019d\n&\r&\16&\u019e\3&\5&\u01a2"+
		"\n&\5&\u01a4\n&\3&\5&\u01a7\n&\3\'\3\'\3\'\5\'\u01ac\n\'\3\'\3\'\5\'\u01b0"+
		"\n\'\3\'\5\'\u01b3\n\'\3\'\5\'\u01b6\n\'\3\'\3\'\3\'\5\'\u01bb\n\'\3\'"+
		"\5\'\u01be\n\'\5\'\u01c0\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01cb\n(\3"+
		")\3)\3)\5)\u01d0\n)\3)\3)\3*\3*\3*\7*\u01d7\n*\f*\16*\u01da\13*\3*\3*"+
		"\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3"+
		"C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3M\3"+
		"M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3"+
		"T\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\6W\u0251\nW\rW\16W\u0252\3W\3W\3X\3X\3"+
		"X\3X\7X\u025b\nX\fX\16X\u025e\13X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\7Y\u0269"+
		"\nY\fY\16Y\u026c\13Y\3Y\3Y\3Z\3Z\7Z\u0272\nZ\fZ\16Z\u0275\13Z\3[\3[\5"+
		"[\u0279\n[\3[\3[\3\\\3\\\3\\\3\\\5\\\u0281\n\\\3\\\5\\\u0284\n\\\3\\\5"+
		"\\\u0287\n\\\3]\3]\7]\u028b\n]\f]\16]\u028e\13]\3]\5]\u0291\n]\3^\3^\5"+
		"^\u0295\n^\3_\3_\3_\3_\5_\u029b\n_\3\u025c\2`\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd"+
		"\2\3\2\24\3\2\63;\4\2NNnn\6\2FFHHffhh\6\2\f\f\17\17))^^\6\2\f\f\17\17"+
		"$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\4\2--//\n\2$$))^^ddhhpp"+
		"ttvv\3\2\62\65\3\2\629\3\2\62;\4\2\62;aa\6\2&&C\\aac|\4\2\2\u0081\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\2\u02b3\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\3\u00bf"+
		"\3\2\2\2\5\u00c7\3\2\2\2\7\u00cc\3\2\2\2\t\u00d2\3\2\2\2\13\u00d7\3\2"+
		"\2\2\r\u00dd\3\2\2\2\17\u00e2\3\2\2\2\21\u00eb\3\2\2\2\23\u00f3\3\2\2"+
		"\2\25\u00f6\3\2\2\2\27\u00fd\3\2\2\2\31\u0102\3\2\2\2\33\u0108\3\2\2\2"+
		"\35\u010c\3\2\2\2\37\u010f\3\2\2\2!\u0113\3\2\2\2#\u0118\3\2\2\2%\u011d"+
		"\3\2\2\2\'\u0121\3\2\2\2)\u0128\3\2\2\2+\u012e\3\2\2\2-\u0135\3\2\2\2"+
		"/\u013c\3\2\2\2\61\u0142\3\2\2\2\63\u0147\3\2\2\2\65\u014d\3\2\2\2\67"+
		"\u0151\3\2\2\29\u0156\3\2\2\2;\u015c\3\2\2\2=\u0163\3\2\2\2?\u0167\3\2"+
		"\2\2A\u016f\3\2\2\2C\u0177\3\2\2\2E\u017d\3\2\2\2G\u0187\3\2\2\2I\u018e"+
		"\3\2\2\2K\u01a3\3\2\2\2M\u01bf\3\2\2\2O\u01ca\3\2\2\2Q\u01cc\3\2\2\2S"+
		"\u01d3\3\2\2\2U\u01dd\3\2\2\2W\u01e2\3\2\2\2Y\u01e4\3\2\2\2[\u01e6\3\2"+
		"\2\2]\u01e8\3\2\2\2_\u01ea\3\2\2\2a\u01ec\3\2\2\2c\u01ee\3\2\2\2e\u01f0"+
		"\3\2\2\2g\u01f2\3\2\2\2i\u01f4\3\2\2\2k\u01f6\3\2\2\2m\u01f8\3\2\2\2o"+
		"\u01fa\3\2\2\2q\u01fc\3\2\2\2s\u01fe\3\2\2\2u\u0200\3\2\2\2w\u0202\3\2"+
		"\2\2y\u0205\3\2\2\2{\u0208\3\2\2\2}\u020b\3\2\2\2\177\u020e\3\2\2\2\u0081"+
		"\u0211\3\2\2\2\u0083\u0214\3\2\2\2\u0085\u0217\3\2\2\2\u0087\u021a\3\2"+
		"\2\2\u0089\u021c\3\2\2\2\u008b\u021e\3\2\2\2\u008d\u0220\3\2\2\2\u008f"+
		"\u0222\3\2\2\2\u0091\u0224\3\2\2\2\u0093\u0226\3\2\2\2\u0095\u0228\3\2"+
		"\2\2\u0097\u022a\3\2\2\2\u0099\u022d\3\2\2\2\u009b\u0230\3\2\2\2\u009d"+
		"\u0233\3\2\2\2\u009f\u0236\3\2\2\2\u00a1\u0239\3\2\2\2\u00a3\u023c\3\2"+
		"\2\2\u00a5\u023f\3\2\2\2\u00a7\u0242\3\2\2\2\u00a9\u0246\3\2\2\2\u00ab"+
		"\u024a\3\2\2\2\u00ad\u0250\3\2\2\2\u00af\u0256\3\2\2\2\u00b1\u0264\3\2"+
		"\2\2\u00b3\u026f\3\2\2\2\u00b5\u0276\3\2\2\2\u00b7\u0286\3\2\2\2\u00b9"+
		"\u0288\3\2\2\2\u00bb\u0294\3\2\2\2\u00bd\u029a\3\2\2\2\u00bf\u00c0\7d"+
		"\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7p\2\2\u00c6\4\3\2\2\2\u00c7\u00c8"+
		"\7d\2\2\u00c8\u00c9\7{\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\6\3\2\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7g\2\2\u00cf"+
		"\u00d0\7c\2\2\u00d0\u00d1\7m\2\2\u00d1\b\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6\n\3\2\2\2\u00d7"+
		"\u00d8\7e\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7e\2\2"+
		"\u00db\u00dc\7j\2\2\u00dc\f\3\2\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7j"+
		"\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7t\2\2\u00e1\16\3\2\2\2\u00e2\u00e3"+
		"\7e\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7v\2\2\u00e6"+
		"\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea\20\3\2\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7"+
		"h\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2"+
		"\7v\2\2\u00f2\22\3\2\2\2\u00f3\u00f4\7f\2\2\u00f4\u00f5\7q\2\2\u00f5\24"+
		"\3\2\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7w\2\2\u00f9"+
		"\u00fa\7d\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7g\2\2\u00fc\26\3\2\2\2\u00fd"+
		"\u00fe\7g\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7u\2\2\u0100\u0101\7g\2\2"+
		"\u0101\30\3\2\2\2\u0102\u0103\7h\2\2\u0103\u0104\7n\2\2\u0104\u0105\7"+
		"q\2\2\u0105\u0106\7c\2\2\u0106\u0107\7v\2\2\u0107\32\3\2\2\2\u0108\u0109"+
		"\7h\2\2\u0109\u010a\7q\2\2\u010a\u010b\7t\2\2\u010b\34\3\2\2\2\u010c\u010d"+
		"\7k\2\2\u010d\u010e\7h\2\2\u010e\36\3\2\2\2\u010f\u0110\7k\2\2\u0110\u0111"+
		"\7p\2\2\u0111\u0112\7v\2\2\u0112 \3\2\2\2\u0113\u0114\7n\2\2\u0114\u0115"+
		"\7k\2\2\u0115\u0116\7u\2\2\u0116\u0117\7v\2\2\u0117\"\3\2\2\2\u0118\u0119"+
		"\7n\2\2\u0119\u011a\7q\2\2\u011a\u011b\7p\2\2\u011b\u011c\7i\2\2\u011c"+
		"$\3\2\2\2\u011d\u011e\7p\2\2\u011e\u011f\7g\2\2\u011f\u0120\7y\2\2\u0120"+
		"&\3\2\2\2\u0121\u0122\7t\2\2\u0122\u0123\7g\2\2\u0123\u0124\7v\2\2\u0124"+
		"\u0125\7w\2\2\u0125\u0126\7t\2\2\u0126\u0127\7p\2\2\u0127(\3\2\2\2\u0128"+
		"\u0129\7u\2\2\u0129\u012a\7j\2\2\u012a\u012b\7q\2\2\u012b\u012c\7t\2\2"+
		"\u012c\u012d\7v\2\2\u012d*\3\2\2\2\u012e\u012f\7u\2\2\u012f\u0130\7y\2"+
		"\2\u0130\u0131\7k\2\2\u0131\u0132\7v\2\2\u0132\u0133\7e\2\2\u0133\u0134"+
		"\7j\2\2\u0134,\3\2\2\2\u0135\u0136\7U\2\2\u0136\u0137\7v\2\2\u0137\u0138"+
		"\7t\2\2\u0138\u0139\7k\2\2\u0139\u013a\7p\2\2\u013a\u013b\7i\2\2\u013b"+
		".\3\2\2\2\u013c\u013d\7y\2\2\u013d\u013e\7j\2\2\u013e\u013f\7k\2\2\u013f"+
		"\u0140\7n\2\2\u0140\u0141\7g\2\2\u0141\60\3\2\2\2\u0142\u0143\7V\2\2\u0143"+
		"\u0144\7t\2\2\u0144\u0145\7g\2\2\u0145\u0146\7g\2\2\u0146\62\3\2\2\2\u0147"+
		"\u0148\7v\2\2\u0148\u0149\7j\2\2\u0149\u014a\7t\2\2\u014a\u014b\7q\2\2"+
		"\u014b\u014c\7y\2\2\u014c\64\3\2\2\2\u014d\u014e\7v\2\2\u014e\u014f\7"+
		"t\2\2\u014f\u0150\7{\2\2\u0150\66\3\2\2\2\u0151\u0152\7x\2\2\u0152\u0153"+
		"\7q\2\2\u0153\u0154\7k\2\2\u0154\u0155\7f\2\2\u01558\3\2\2\2\u0156\u0157"+
		"\7w\2\2\u0157\u0158\7p\2\2\u0158\u0159\7k\2\2\u0159\u015a\7q\2\2\u015a"+
		"\u015b\7p\2\2\u015b:\3\2\2\2\u015c\u015d\7u\2\2\u015d\u015e\7g\2\2\u015e"+
		"\u015f\7n\2\2\u015f\u0160\7g\2\2\u0160\u0161\7e\2\2\u0161\u0162\7v\2\2"+
		"\u0162<\3\2\2\2\u0163\u0164\7u\2\2\u0164\u0165\7g\2\2\u0165\u0166\7v\2"+
		"\2\u0166>\3\2\2\2\u0167\u0168\7r\2\2\u0168\u0169\7t\2\2\u0169\u016a\7"+
		"q\2\2\u016a\u016b\7l\2\2\u016b\u016c\7g\2\2\u016c\u016d\7e\2\2\u016d\u016e"+
		"\7v\2\2\u016e@\3\2\2\2\u016f\u0170\7r\2\2\u0170\u0171\7t\2\2\u0171\u0172"+
		"\7q\2\2\u0172\u0173\7f\2\2\u0173\u0174\7w\2\2\u0174\u0175\7e\2\2\u0175"+
		"\u0176\7v\2\2\u0176B\3\2\2\2\u0177\u0178\7i\2\2\u0178\u0179\7t\2\2\u0179"+
		"\u017a\7q\2\2\u017a\u017b\7w\2\2\u017b\u017c\7r\2\2\u017cD\3\2\2\2\u017d"+
		"\u017e\7c\2\2\u017e\u017f\7i\2\2\u017f\u0180\7i\2\2\u0180\u0181\7t\2\2"+
		"\u0181\u0182\7g\2\2\u0182\u0183\7i\2\2\u0183\u0184\7c\2\2\u0184\u0185"+
		"\7v\2\2\u0185\u0186\7g\2\2\u0186F\3\2\2\2\u0187\u0188\7t\2\2\u0188\u0189"+
		"\7g\2\2\u0189\u018a\7p\2\2\u018a\u018b\7c\2\2\u018b\u018c\7o\2\2\u018c"+
		"\u018d\7g\2\2\u018dH\3\2\2\2\u018e\u018f\7t\2\2\u018f\u0190\7g\2\2\u0190"+
		"\u0191\7q\2\2\u0191\u0192\7t\2\2\u0192\u0193\7f\2\2\u0193\u0194\7g\2\2"+
		"\u0194\u0195\7t\2\2\u0195J\3\2\2\2\u0196\u01a4\7\62\2\2\u0197\u01a1\t"+
		"\2\2\2\u0198\u019a\5\u00b9]\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2"+
		"\u019a\u01a2\3\2\2\2\u019b\u019d\7a\2\2\u019c\u019b\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a2\5\u00b9]\2\u01a1\u0199\3\2\2\2\u01a1\u019c\3\2\2\2\u01a2\u01a4"+
		"\3\2\2\2\u01a3\u0196\3\2\2\2\u01a3\u0197\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u01a7\t\3\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7L\3\2\2\2"+
		"\u01a8\u01a9\5\u00b9]\2\u01a9\u01ab\7\60\2\2\u01aa\u01ac\5\u00b9]\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b0\3\2\2\2\u01ad\u01ae\7\60"+
		"\2\2\u01ae\u01b0\5\u00b9]\2\u01af\u01a8\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b2\3\2\2\2\u01b1\u01b3\5\u00b5[\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b6\t\4\2\2\u01b5\u01b4\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01c0\3\2\2\2\u01b7\u01bd\5\u00b9]\2\u01b8\u01ba"+
		"\5\u00b5[\2\u01b9\u01bb\t\4\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2"+
		"\2\u01bb\u01be\3\2\2\2\u01bc\u01be\t\4\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01bc"+
		"\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01af\3\2\2\2\u01bf\u01b7\3\2\2\2\u01c0"+
		"N\3\2\2\2\u01c1\u01c2\7v\2\2\u01c2\u01c3\7t\2\2\u01c3\u01c4\7w\2\2\u01c4"+
		"\u01cb\7g\2\2\u01c5\u01c6\7h\2\2\u01c6\u01c7\7c\2\2\u01c7\u01c8\7n\2\2"+
		"\u01c8\u01c9\7u\2\2\u01c9\u01cb\7g\2\2\u01ca\u01c1\3\2\2\2\u01ca\u01c5"+
		"\3\2\2\2\u01cbP\3\2\2\2\u01cc\u01cf\7)\2\2\u01cd\u01d0\n\5\2\2\u01ce\u01d0"+
		"\5\u00b7\\\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2\2"+
		"\2\u01d1\u01d2\7)\2\2\u01d2R\3\2\2\2\u01d3\u01d8\7$\2\2\u01d4\u01d7\n"+
		"\6\2\2\u01d5\u01d7\5\u00b7\\\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2"+
		"\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db"+
		"\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\7$\2\2\u01dcT\3\2\2\2\u01dd\u01de"+
		"\7p\2\2\u01de\u01df\7w\2\2\u01df\u01e0\7n\2\2\u01e0\u01e1\7n\2\2\u01e1"+
		"V\3\2\2\2\u01e2\u01e3\7*\2\2\u01e3X\3\2\2\2\u01e4\u01e5\7+\2\2\u01e5Z"+
		"\3\2\2\2\u01e6\u01e7\7}\2\2\u01e7\\\3\2\2\2\u01e8\u01e9\7\177\2\2\u01e9"+
		"^\3\2\2\2\u01ea\u01eb\7]\2\2\u01eb`\3\2\2\2\u01ec\u01ed\7_\2\2\u01edb"+
		"\3\2\2\2\u01ee\u01ef\7=\2\2\u01efd\3\2\2\2\u01f0\u01f1\7.\2\2\u01f1f\3"+
		"\2\2\2\u01f2\u01f3\7\60\2\2\u01f3h\3\2\2\2\u01f4\u01f5\7?\2\2\u01f5j\3"+
		"\2\2\2\u01f6\u01f7\7@\2\2\u01f7l\3\2\2\2\u01f8\u01f9\7>\2\2\u01f9n\3\2"+
		"\2\2\u01fa\u01fb\7#\2\2\u01fbp\3\2\2\2\u01fc\u01fd\7\u0080\2\2\u01fdr"+
		"\3\2\2\2\u01fe\u01ff\7A\2\2\u01fft\3\2\2\2\u0200\u0201\7<\2\2\u0201v\3"+
		"\2\2\2\u0202\u0203\7?\2\2\u0203\u0204\7?\2\2\u0204x\3\2\2\2\u0205\u0206"+
		"\7>\2\2\u0206\u0207\7?\2\2\u0207z\3\2\2\2\u0208\u0209\7@\2\2\u0209\u020a"+
		"\7?\2\2\u020a|\3\2\2\2\u020b\u020c\7#\2\2\u020c\u020d\7?\2\2\u020d~\3"+
		"\2\2\2\u020e\u020f\7(\2\2\u020f\u0210\7(\2\2\u0210\u0080\3\2\2\2\u0211"+
		"\u0212\7~\2\2\u0212\u0213\7~\2\2\u0213\u0082\3\2\2\2\u0214\u0215\7-\2"+
		"\2\u0215\u0216\7-\2\2\u0216\u0084\3\2\2\2\u0217\u0218\7/\2\2\u0218\u0219"+
		"\7/\2\2\u0219\u0086\3\2\2\2\u021a\u021b\7-\2\2\u021b\u0088\3\2\2\2\u021c"+
		"\u021d\7/\2\2\u021d\u008a\3\2\2\2\u021e\u021f\7,\2\2\u021f\u008c\3\2\2"+
		"\2\u0220\u0221\7\61\2\2\u0221\u008e\3\2\2\2\u0222\u0223\7(\2\2\u0223\u0090"+
		"\3\2\2\2\u0224\u0225\7~\2\2\u0225\u0092\3\2\2\2\u0226\u0227\7`\2\2\u0227"+
		"\u0094\3\2\2\2\u0228\u0229\7\'\2\2\u0229\u0096\3\2\2\2\u022a\u022b\7-"+
		"\2\2\u022b\u022c\7?\2\2\u022c\u0098\3\2\2\2\u022d\u022e\7/\2\2\u022e\u022f"+
		"\7?\2\2\u022f\u009a\3\2\2\2\u0230\u0231\7,\2\2\u0231\u0232\7?\2\2\u0232"+
		"\u009c\3\2\2\2\u0233\u0234\7\61\2\2\u0234\u0235\7?\2\2\u0235\u009e\3\2"+
		"\2\2\u0236\u0237\7(\2\2\u0237\u0238\7?\2\2\u0238\u00a0\3\2\2\2\u0239\u023a"+
		"\7~\2\2\u023a\u023b\7?\2\2\u023b\u00a2\3\2\2\2\u023c\u023d\7`\2\2\u023d"+
		"\u023e\7?\2\2\u023e\u00a4\3\2\2\2\u023f\u0240\7\'\2\2\u0240\u0241\7?\2"+
		"\2\u0241\u00a6\3\2\2\2\u0242\u0243\7>\2\2\u0243\u0244\7>\2\2\u0244\u0245"+
		"\7?\2\2\u0245\u00a8\3\2\2\2\u0246\u0247\7@\2\2\u0247\u0248\7@\2\2\u0248"+
		"\u0249\7?\2\2\u0249\u00aa\3\2\2\2\u024a\u024b\7@\2\2\u024b\u024c\7@\2"+
		"\2\u024c\u024d\7@\2\2\u024d\u024e\7?\2\2\u024e\u00ac\3\2\2\2\u024f\u0251"+
		"\t\7\2\2\u0250\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\bW\2\2\u0255\u00ae\3\2"+
		"\2\2\u0256\u0257\7\61\2\2\u0257\u0258\7,\2\2\u0258\u025c\3\2\2\2\u0259"+
		"\u025b\13\2\2\2\u025a\u0259\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025d\3"+
		"\2\2\2\u025c\u025a\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f"+
		"\u0260\7,\2\2\u0260\u0261\7\61\2\2\u0261\u0262\3\2\2\2\u0262\u0263\bX"+
		"\2\2\u0263\u00b0\3\2\2\2\u0264\u0265\7\61\2\2\u0265\u0266\7\61\2\2\u0266"+
		"\u026a\3\2\2\2\u0267\u0269\n\b\2\2\u0268\u0267\3\2\2\2\u0269\u026c\3\2"+
		"\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c"+
		"\u026a\3\2\2\2\u026d\u026e\bY\2\2\u026e\u00b2\3\2\2\2\u026f\u0273\5\u00bd"+
		"_\2\u0270\u0272\5\u00bb^\2\u0271\u0270\3\2\2\2\u0272\u0275\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u00b4\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0276\u0278\t\t\2\2\u0277\u0279\t\n\2\2\u0278\u0277\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\5\u00b9]\2\u027b\u00b6"+
		"\3\2\2\2\u027c\u027d\7^\2\2\u027d\u0287\t\13\2\2\u027e\u0283\7^\2\2\u027f"+
		"\u0281\t\f\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u0284\t\r\2\2\u0283\u0280\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0287\t\r\2\2\u0286\u027c\3\2\2\2\u0286\u027e\3\2"+
		"\2\2\u0287\u00b8\3\2\2\2\u0288\u0290\t\16\2\2\u0289\u028b\t\17\2\2\u028a"+
		"\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d\u028f\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0291\t\16\2\2\u0290"+
		"\u028c\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u00ba\3\2\2\2\u0292\u0295\5\u00bd"+
		"_\2\u0293\u0295\t\16\2\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295"+
		"\u00bc\3\2\2\2\u0296\u029b\t\20\2\2\u0297\u029b\n\21\2\2\u0298\u0299\t"+
		"\22\2\2\u0299\u029b\t\23\2\2\u029a\u0296\3\2\2\2\u029a\u0297\3\2\2\2\u029a"+
		"\u0298\3\2\2\2\u029b\u00be\3\2\2\2\37\2\u0199\u019e\u01a1\u01a3\u01a6"+
		"\u01ab\u01af\u01b2\u01b5\u01ba\u01bd\u01bf\u01ca\u01cf\u01d6\u01d8\u0252"+
		"\u025c\u026a\u0273\u0278\u0280\u0283\u0286\u028c\u0290\u0294\u029a\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}