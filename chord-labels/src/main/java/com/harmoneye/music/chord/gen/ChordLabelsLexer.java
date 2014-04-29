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
		INTERVAL=9, SHORTHAND=10, MISSING=11, NO_CHORD=12, SEPARATOR=13, COMMENT=14, 
		WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'('", "'/'", "NATURAL", "MODIFIER", "'b'", "'#'", "INTERVAL", 
		"SHORTHAND", "'*'", "'N'", "':'", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "NATURAL", "MODIFIER", "FLAT", "SHARP", 
		"INTERVAL", "SHORTHAND", "MISSING", "NO_CHORD", "SEPARATOR", "COMMENT", 
		"WS"
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
		case 13: return COMMENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return getCharPositionInLine()==1;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7.\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\5\n\67\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13s\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\7\17~\n\17\f\17\16\17\u0081\13\17\3\17\3\17\3\20\6\20\u0086\n\20\r"+
		"\20\16\20\u0087\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\6\3\2\63;\3\2\62\65\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\u009d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2"+
		"\r-\3\2\2\2\17/\3\2\2\2\21\61\3\2\2\2\23\66\3\2\2\2\25r\3\2\2\2\27t\3"+
		"\2\2\2\31v\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37\u0085\3\2\2\2!\"\7+\2\2"+
		"\"\4\3\2\2\2#$\7.\2\2$\6\3\2\2\2%&\7*\2\2&\b\3\2\2\2\'(\7\61\2\2(\n\3"+
		"\2\2\2)*\4CI\2*\f\3\2\2\2+.\5\17\b\2,.\5\21\t\2-+\3\2\2\2-,\3\2\2\2.\16"+
		"\3\2\2\2/\60\7d\2\2\60\20\3\2\2\2\61\62\7%\2\2\62\22\3\2\2\2\63\67\t\2"+
		"\2\2\64\65\7\63\2\2\65\67\t\3\2\2\66\63\3\2\2\2\66\64\3\2\2\2\67\24\3"+
		"\2\2\289\7o\2\29:\7c\2\2:s\7l\2\2;<\7o\2\2<=\7k\2\2=s\7p\2\2>?\7f\2\2"+
		"?@\7k\2\2@s\7o\2\2AB\7c\2\2BC\7w\2\2Cs\7i\2\2DE\7o\2\2EF\7c\2\2FG\7l\2"+
		"\2Gs\79\2\2HI\7o\2\2IJ\7k\2\2JK\7p\2\2Ks\79\2\2Ls\79\2\2MN\7f\2\2NO\7"+
		"k\2\2OP\7o\2\2Ps\79\2\2QR\7j\2\2RS\7f\2\2ST\7k\2\2TU\7o\2\2Us\79\2\2V"+
		"W\7o\2\2WX\7k\2\2XY\7p\2\2YZ\7o\2\2Z[\7c\2\2[\\\7l\2\2\\s\79\2\2]^\7o"+
		"\2\2^_\7c\2\2_`\7l\2\2`s\78\2\2ab\7o\2\2bc\7k\2\2cd\7p\2\2ds\78\2\2es"+
		"\7;\2\2fg\7o\2\2gh\7c\2\2hi\7l\2\2is\7;\2\2jk\7o\2\2kl\7k\2\2lm\7p\2\2"+
		"ms\7;\2\2no\7u\2\2op\7w\2\2pq\7u\2\2qs\7\66\2\2r8\3\2\2\2r;\3\2\2\2r>"+
		"\3\2\2\2rA\3\2\2\2rD\3\2\2\2rH\3\2\2\2rL\3\2\2\2rM\3\2\2\2rQ\3\2\2\2r"+
		"V\3\2\2\2r]\3\2\2\2ra\3\2\2\2re\3\2\2\2rf\3\2\2\2rj\3\2\2\2rn\3\2\2\2"+
		"s\26\3\2\2\2tu\7,\2\2u\30\3\2\2\2vw\7P\2\2w\32\3\2\2\2xy\7<\2\2y\34\3"+
		"\2\2\2z{\6\17\2\2{\177\7%\2\2|~\n\4\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\b\17\2\2\u0083\36\3\2\2\2\u0084\u0086\t\5\2\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\b\20\2\2\u008a \3\2\2\2\b\2-\66r\177\u0087\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}