// Generated from ChordLabels.g4 by ANTLR 4.2.2
package com.harmoneye.music.chord.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChordLabelsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, NATURAL=5, MODIFIER=6, FLAT=7, SHARP=8, 
		INTERVAL=9, SHORTHAND=10, MISSING=11, NO_CHORD=12, SEPARATOR=13, TIME=14, 
		WS_SEP=15, COMMENT=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'('", "'/'", "NATURAL", "MODIFIER", "'b'", "'#'", "INTERVAL", 
		"SHORTHAND", "'*'", "'N'", "':'", "TIME", "WS_SEP", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "NATURAL", "MODIFIER", "FLAT", "SHARP", 
		"INTERVAL", "SHORTHAND", "MISSING", "NO_CHORD", "SEPARATOR", "TIME", "WS_SEP", 
		"COMMENT", "WS"
	};


	public ChordLabelsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ChordLabels.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15: return COMMENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return getCharPositionInLine()==0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7\62\n\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\5\n;\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\6\17\u0082\n\17\r\17\16\17\u0083\3\17\3\17\6\17"+
		"\u0088\n\17\r\17\16\17\u0089\5\17\u008c\n\17\3\20\3\20\3\21\3\21\3\21"+
		"\7\21\u0093\n\21\f\21\16\21\u0096\13\21\3\21\3\21\3\22\6\22\u009b\n\22"+
		"\r\22\16\22\u009c\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\7\3\2\63;\3\2\62"+
		"\65\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\u00b4\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2"+
		"\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\65"+
		"\3\2\2\2\23:\3\2\2\2\25x\3\2\2\2\27z\3\2\2\2\31|\3\2\2\2\33~\3\2\2\2\35"+
		"\u0081\3\2\2\2\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u009a\3\2\2\2%&\7+\2\2"+
		"&\4\3\2\2\2\'(\7.\2\2(\6\3\2\2\2)*\7*\2\2*\b\3\2\2\2+,\7\61\2\2,\n\3\2"+
		"\2\2-.\4CI\2.\f\3\2\2\2/\62\5\17\b\2\60\62\5\21\t\2\61/\3\2\2\2\61\60"+
		"\3\2\2\2\62\16\3\2\2\2\63\64\7d\2\2\64\20\3\2\2\2\65\66\7%\2\2\66\22\3"+
		"\2\2\2\67;\t\2\2\289\7\63\2\29;\t\3\2\2:\67\3\2\2\2:8\3\2\2\2;\24\3\2"+
		"\2\2<=\7o\2\2=>\7c\2\2>y\7l\2\2?@\7o\2\2@A\7k\2\2Ay\7p\2\2BC\7f\2\2CD"+
		"\7k\2\2Dy\7o\2\2EF\7c\2\2FG\7w\2\2Gy\7i\2\2HI\7o\2\2IJ\7c\2\2JK\7l\2\2"+
		"Ky\79\2\2LM\7o\2\2MN\7k\2\2NO\7p\2\2Oy\79\2\2PQ\7f\2\2QR\7k\2\2RS\7o\2"+
		"\2Sy\79\2\2TU\7j\2\2UV\7f\2\2VW\7k\2\2WX\7o\2\2Xy\79\2\2YZ\7o\2\2Z[\7"+
		"k\2\2[\\\7p\2\2\\]\7o\2\2]^\7c\2\2^_\7l\2\2_y\79\2\2`a\7o\2\2ab\7c\2\2"+
		"bc\7l\2\2cy\78\2\2de\7o\2\2ef\7k\2\2fg\7p\2\2gy\78\2\2hi\7o\2\2ij\7c\2"+
		"\2jk\7l\2\2ky\7;\2\2lm\7o\2\2mn\7k\2\2no\7p\2\2oy\7;\2\2pq\7u\2\2qr\7"+
		"w\2\2rs\7u\2\2sy\7\66\2\2tu\7u\2\2uv\7w\2\2vw\7u\2\2wy\7\64\2\2x<\3\2"+
		"\2\2x?\3\2\2\2xB\3\2\2\2xE\3\2\2\2xH\3\2\2\2xL\3\2\2\2xP\3\2\2\2xT\3\2"+
		"\2\2xY\3\2\2\2x`\3\2\2\2xd\3\2\2\2xh\3\2\2\2xl\3\2\2\2xp\3\2\2\2xt\3\2"+
		"\2\2y\26\3\2\2\2z{\7,\2\2{\30\3\2\2\2|}\7P\2\2}\32\3\2\2\2~\177\7<\2\2"+
		"\177\34\3\2\2\2\u0080\u0082\t\4\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u008b\3\2\2\2\u0085"+
		"\u0087\7\60\2\2\u0086\u0088\t\4\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0085\3\2\2\2\u008b\u008c\3\2\2\2\u008c\36\3\2\2\2\u008d\u008e\t\5\2"+
		"\2\u008e \3\2\2\2\u008f\u0090\6\21\2\2\u0090\u0094\7%\2\2\u0091\u0093"+
		"\n\6\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\b\21"+
		"\2\2\u0098\"\3\2\2\2\u0099\u009b\t\6\2\2\u009a\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\b\22\2\2\u009f$\3\2\2\2\13\2\61:x\u0083\u0089\u008b\u0094\u009c"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}