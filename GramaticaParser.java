// Generated from Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OpSom=1, OpMul=2, OpAtr=3, Letra=4, Digito=5, AP=6, FP=7, WS=8;
	public static final int
		RULE_inicio = 0, RULE_somaSubExp = 1, RULE_multDivExpr = 2, RULE_finalExpr = 3, 
		RULE_digitExpr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "somaSubExp", "multDivExpr", "finalExpr", "digitExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'='", null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OpSom", "OpMul", "OpAtr", "Letra", "Digito", "AP", "FP", "WS"
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

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public TerminalNode Letra() { return getToken(GramaticaParser.Letra, 0); }
		public TerminalNode OpAtr() { return getToken(GramaticaParser.OpAtr, 0); }
		public SomaSubExpContext somaSubExp() {
			return getRuleContext(SomaSubExpContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(Letra);
			setState(11);
			match(OpAtr);
			setState(12);
			somaSubExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SomaSubExpContext extends ParserRuleContext {
		public List<MultDivExprContext> multDivExpr() {
			return getRuleContexts(MultDivExprContext.class);
		}
		public MultDivExprContext multDivExpr(int i) {
			return getRuleContext(MultDivExprContext.class,i);
		}
		public List<TerminalNode> OpSom() { return getTokens(GramaticaParser.OpSom); }
		public TerminalNode OpSom(int i) {
			return getToken(GramaticaParser.OpSom, i);
		}
		public SomaSubExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_somaSubExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSomaSubExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSomaSubExp(this);
		}
	}

	public final SomaSubExpContext somaSubExp() throws RecognitionException {
		SomaSubExpContext _localctx = new SomaSubExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_somaSubExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			multDivExpr();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpSom) {
				{
				{
				setState(15);
				match(OpSom);
				setState(16);
				multDivExpr();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultDivExprContext extends ParserRuleContext {
		public List<FinalExprContext> finalExpr() {
			return getRuleContexts(FinalExprContext.class);
		}
		public FinalExprContext finalExpr(int i) {
			return getRuleContext(FinalExprContext.class,i);
		}
		public List<TerminalNode> OpMul() { return getTokens(GramaticaParser.OpMul); }
		public TerminalNode OpMul(int i) {
			return getToken(GramaticaParser.OpMul, i);
		}
		public MultDivExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMultDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMultDivExpr(this);
		}
	}

	public final MultDivExprContext multDivExpr() throws RecognitionException {
		MultDivExprContext _localctx = new MultDivExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multDivExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			finalExpr();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpMul) {
				{
				{
				setState(23);
				match(OpMul);
				setState(24);
				finalExpr();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinalExprContext extends ParserRuleContext {
		public DigitExprContext digitExpr() {
			return getRuleContext(DigitExprContext.class,0);
		}
		public TerminalNode Letra() { return getToken(GramaticaParser.Letra, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public SomaSubExpContext somaSubExp() {
			return getRuleContext(SomaSubExpContext.class,0);
		}
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public FinalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFinalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFinalExpr(this);
		}
	}

	public final FinalExprContext finalExpr() throws RecognitionException {
		FinalExprContext _localctx = new FinalExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_finalExpr);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Digito:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				digitExpr();
				}
				break;
			case Letra:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(Letra);
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(AP);
				setState(33);
				somaSubExp();
				setState(34);
				match(FP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DigitExprContext extends ParserRuleContext {
		public List<TerminalNode> Digito() { return getTokens(GramaticaParser.Digito); }
		public TerminalNode Digito(int i) {
			return getToken(GramaticaParser.Digito, i);
		}
		public DigitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDigitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDigitExpr(this);
		}
	}

	public final DigitExprContext digitExpr() throws RecognitionException {
		DigitExprContext _localctx = new DigitExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_digitExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				match(Digito);
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Digito );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b,\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u0012\b\u0001\n\u0001\f\u0001\u0015\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u001a\b\u0002\n\u0002\f\u0002\u001d"+
		"\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003%\b\u0003\u0001\u0004\u0004\u0004(\b\u0004\u000b\u0004"+
		"\f\u0004)\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0000+\u0000\n\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000"+
		"\u0000\u0004\u0016\u0001\u0000\u0000\u0000\u0006$\u0001\u0000\u0000\u0000"+
		"\b\'\u0001\u0000\u0000\u0000\n\u000b\u0005\u0004\u0000\u0000\u000b\f\u0005"+
		"\u0003\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r\u0001\u0001\u0000\u0000"+
		"\u0000\u000e\u0013\u0003\u0004\u0002\u0000\u000f\u0010\u0005\u0001\u0000"+
		"\u0000\u0010\u0012\u0003\u0004\u0002\u0000\u0011\u000f\u0001\u0000\u0000"+
		"\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0003\u0001\u0000\u0000"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u001b\u0003\u0006\u0003"+
		"\u0000\u0017\u0018\u0005\u0002\u0000\u0000\u0018\u001a\u0003\u0006\u0003"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000"+
		"\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001e%\u0003\b\u0004\u0000\u001f%\u0005\u0004\u0000\u0000 !\u0005"+
		"\u0006\u0000\u0000!\"\u0003\u0002\u0001\u0000\"#\u0005\u0007\u0000\u0000"+
		"#%\u0001\u0000\u0000\u0000$\u001e\u0001\u0000\u0000\u0000$\u001f\u0001"+
		"\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000%\u0007\u0001\u0000\u0000"+
		"\u0000&(\u0005\u0005\u0000\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\t\u0001"+
		"\u0000\u0000\u0000\u0004\u0013\u001b$)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}