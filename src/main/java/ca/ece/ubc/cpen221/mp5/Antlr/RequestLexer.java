// Generated from Request.g4 by ANTLR 4.7.1

    package ca.ece.ubc.cpen221.mp5.Antlr;
    import java.util.*;
    import ca.ece.ubc.cpen221.mp5.Database.YelpDataBase;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RequestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, OR=3, AND=4, NUM=5, GT=6, GTE=7, LT=8, LTE=9, EQ=10, 
		PRICE=11, RATING=12, NAME=13, CATEGORY=14, IN=15, WS=16, ANYTOKEN=17, 
		WORD=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LPAREN", "RPAREN", "OR", "AND", "NUM", "GT", "GTE", "LT", "LTE", "EQ", 
		"PRICE", "RATING", "NAME", "CATEGORY", "IN", "WS", "ANYTOKEN", "WORD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'||'", "'&&'", null, "'>'", "'>='", "'<'", "'<='", 
		"'='", "'price'", "'rating'", "'name'", "'category'", "'in'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAREN", "RPAREN", "OR", "AND", "NUM", "GT", "GTE", "LT", "LTE", 
		"EQ", "PRICE", "RATING", "NAME", "CATEGORY", "IN", "WS", "ANYTOKEN", "WORD"
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


	public RequestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Request.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\6\6\63\n\6\r\6"+
		"\16\6\64\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\6\21b\n\21"+
		"\r\21\16\21c\3\21\3\21\3\22\3\22\3\23\6\23k\n\23\r\23\16\23l\2\2\24\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\3\2\5\3\2\62;\5\2\13\f\17\17\"\"\4\2C\\c|\2p\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t.\3\2\2\2\13\62\3\2\2\2\r\66\3"+
		"\2\2\2\178\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25@\3\2\2\2\27B\3\2\2\2\31"+
		"H\3\2\2\2\33O\3\2\2\2\35T\3\2\2\2\37]\3\2\2\2!a\3\2\2\2#g\3\2\2\2%j\3"+
		"\2\2\2\'(\7*\2\2(\4\3\2\2\2)*\7+\2\2*\6\3\2\2\2+,\7~\2\2,-\7~\2\2-\b\3"+
		"\2\2\2./\7(\2\2/\60\7(\2\2\60\n\3\2\2\2\61\63\t\2\2\2\62\61\3\2\2\2\63"+
		"\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\f\3\2\2\2\66\67\7@\2\2\67\16"+
		"\3\2\2\289\7@\2\29:\7?\2\2:\20\3\2\2\2;<\7>\2\2<\22\3\2\2\2=>\7>\2\2>"+
		"?\7?\2\2?\24\3\2\2\2@A\7?\2\2A\26\3\2\2\2BC\7r\2\2CD\7t\2\2DE\7k\2\2E"+
		"F\7e\2\2FG\7g\2\2G\30\3\2\2\2HI\7t\2\2IJ\7c\2\2JK\7v\2\2KL\7k\2\2LM\7"+
		"p\2\2MN\7i\2\2N\32\3\2\2\2OP\7p\2\2PQ\7c\2\2QR\7o\2\2RS\7g\2\2S\34\3\2"+
		"\2\2TU\7e\2\2UV\7c\2\2VW\7v\2\2WX\7g\2\2XY\7i\2\2YZ\7q\2\2Z[\7t\2\2[\\"+
		"\7{\2\2\\\36\3\2\2\2]^\7k\2\2^_\7p\2\2_ \3\2\2\2`b\t\3\2\2a`\3\2\2\2b"+
		"c\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\b\21\2\2f\"\3\2\2\2gh\13\2\2"+
		"\2h$\3\2\2\2ik\t\4\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m&\3\2\2"+
		"\2\6\2\64cl\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}