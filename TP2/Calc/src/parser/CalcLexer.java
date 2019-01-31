// Generated from D:/IMT/A1/UV-Langage_de_programmation/struct_exec/TP2/Calc/src/parser\Calc.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		INTEGER=18, OP=19, IDENTIFIER=20, BOOLEAN=21, WS=22, LINE_COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"INTEGER", "OP", "IDENTIFIER", "BOOLEAN", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'-'", "'!'", "'/'", "'*'", "'+'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "INTEGER", "OP", "IDENTIFIER", "BOOLEAN", 
			"WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\7\23]\n\23\f\23\16\23`\13"+
		"\23\5\23b\n\23\3\24\3\24\3\24\3\24\5\24h\n\24\3\25\3\25\7\25l\n\25\f\25"+
		"\16\25o\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26z\n\26"+
		"\3\27\6\27}\n\27\r\27\16\27~\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0087"+
		"\n\30\f\30\16\30\u008a\13\30\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\3\2\6\5\2,-//\61\61\4\2\62;c|\5\2\13\f\17\17"+
		"\"\"\3\2\f\f\2\u0096\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2"+
		"\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25D\3"+
		"\2\2\2\27F\3\2\2\2\31I\3\2\2\2\33L\3\2\2\2\35O\3\2\2\2\37R\3\2\2\2!U\3"+
		"\2\2\2#W\3\2\2\2%a\3\2\2\2\'g\3\2\2\2)i\3\2\2\2+y\3\2\2\2-|\3\2\2\2/\u0082"+
		"\3\2\2\2\61\62\7*\2\2\62\4\3\2\2\2\63\64\7+\2\2\64\6\3\2\2\2\65\66\7/"+
		"\2\2\66\b\3\2\2\2\678\7#\2\28\n\3\2\2\29:\7\61\2\2:\f\3\2\2\2;<\7,\2\2"+
		"<\16\3\2\2\2=>\7-\2\2>\20\3\2\2\2?@\7>\2\2@\22\3\2\2\2AB\7>\2\2BC\7?\2"+
		"\2C\24\3\2\2\2DE\7@\2\2E\26\3\2\2\2FG\7@\2\2GH\7?\2\2H\30\3\2\2\2IJ\7"+
		"?\2\2JK\7?\2\2K\32\3\2\2\2LM\7#\2\2MN\7?\2\2N\34\3\2\2\2OP\7(\2\2PQ\7"+
		"(\2\2Q\36\3\2\2\2RS\7~\2\2ST\7~\2\2T \3\2\2\2UV\7A\2\2V\"\3\2\2\2WX\7"+
		"<\2\2X$\3\2\2\2Yb\7\62\2\2Z^\4\63;\2[]\4\62;\2\\[\3\2\2\2]`\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aY\3\2\2\2aZ\3\2\2\2b&\3\2\2\2c"+
		"h\t\2\2\2de\7?\2\2eh\7?\2\2fh\7>\2\2gc\3\2\2\2gd\3\2\2\2gf\3\2\2\2h(\3"+
		"\2\2\2im\4c|\2jl\t\3\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n*\3\2"+
		"\2\2om\3\2\2\2pq\7v\2\2qr\7t\2\2rs\7w\2\2sz\7g\2\2tu\7h\2\2uv\7c\2\2v"+
		"w\7n\2\2wx\7u\2\2xz\7g\2\2yp\3\2\2\2yt\3\2\2\2z,\3\2\2\2{}\t\4\2\2|{\3"+
		"\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\b\27\2\2\u0081.\3\2\2\2\u0082\u0083\7\61\2\2\u0083\u0084\7\61\2\2\u0084"+
		"\u0088\3\2\2\2\u0085\u0087\n\5\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7\f\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\30"+
		"\2\2\u008e\60\3\2\2\2\n\2^agmy~\u0088\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}