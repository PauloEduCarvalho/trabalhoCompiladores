// Generated from CPP.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CPPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEC=1, ALG=2, TIPO=3, ENTRADA=4, SAIDA=5, SE=6, SENAO=7, ENQUANTO=8, FAZER=9, 
		RETORNAR=10, OU=11, E=12, OP_ARIT=13, OP_COND=14, OP_ATR=15, COLON=16, 
		PIPE=17, VIRGULA=18, LPAREN=19, RPAREN=20, LCHAVE=21, RCHAVE=22, PONTO_VIRGULA=23, 
		INT=24, REAL=25, BOOL=26, PALAVRA=27, ID=28, WS=29;
	public static final int
		RULE_programa = 0, RULE_funcao = 1, RULE_parametros = 2, RULE_comando = 3, 
		RULE_atribuicao = 4, RULE_retorno = 5, RULE_condicional = 6, RULE_enquanto = 7, 
		RULE_condicao = 8, RULE_expressao = 9, RULE_termo = 10, RULE_fator = 11, 
		RULE_chamadaFuncao = 12, RULE_argumentos = 13, RULE_tipo = 14, RULE_operadorComparacao = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "funcao", "parametros", "comando", "atribuicao", "retorno", 
			"condicional", "enquanto", "condicao", "expressao", "termo", "fator", 
			"chamadaFuncao", "argumentos", "tipo", "operadorComparacao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARACOES'", "'ALGORITMO'", null, "'entrada'", "'saida'", "'se'", 
			"'sen\\u00E3o'", "'enquanto'", "'fa\\u00E7a'", "'retornar'", "'ou'", 
			"'e'", null, null, "'='", "':'", "'|'", "','", "'('", "')'", "'{'", "'}'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEC", "ALG", "TIPO", "ENTRADA", "SAIDA", "SE", "SENAO", "ENQUANTO", 
			"FAZER", "RETORNAR", "OU", "E", "OP_ARIT", "OP_COND", "OP_ATR", "COLON", 
			"PIPE", "VIRGULA", "LPAREN", "RPAREN", "LCHAVE", "RCHAVE", "PONTO_VIRGULA", 
			"INT", "REAL", "BOOL", "PALAVRA", "ID", "WS"
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
	public String getGrammarFileName() { return "CPP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				funcao();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CPPParser.ID, 0); }
		public List<TerminalNode> PIPE() { return getTokens(CPPParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(CPPParser.PIPE, i);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode LCHAVE() { return getToken(CPPParser.LCHAVE, 0); }
		public TerminalNode RCHAVE() { return getToken(CPPParser.RCHAVE, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(ID);
			setState(38);
			match(PIPE);
			setState(39);
			parametros();
			setState(40);
			match(PIPE);
			setState(41);
			match(LCHAVE);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 520619328L) != 0)) {
				{
				{
				setState(42);
				comando();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(RCHAVE);
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CPPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPParser.ID, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(CPPParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CPPParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(50);
				tipo();
				setState(51);
				match(ID);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(52);
					match(VIRGULA);
					setState(53);
					tipo();
					setState(54);
					match(ID);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(CPPParser.PONTO_VIRGULA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				condicional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				enquanto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				retorno();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				chamadaFuncao();
				setState(68);
				match(PONTO_VIRGULA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				expressao();
				setState(71);
				match(PONTO_VIRGULA);
				}
				break;
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CPPParser.ID, 0); }
		public TerminalNode OP_ATR() { return getToken(CPPParser.OP_ATR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(CPPParser.PONTO_VIRGULA, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(76);
			match(OP_ATR);
			setState(77);
			expressao();
			setState(78);
			match(PONTO_VIRGULA);
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
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNAR() { return getToken(CPPParser.RETORNAR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(CPPParser.PONTO_VIRGULA, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(RETORNAR);
			setState(81);
			expressao();
			setState(82);
			match(PONTO_VIRGULA);
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
	public static class CondicionalContext extends ParserRuleContext {
		public List<TerminalNode> SE() { return getTokens(CPPParser.SE); }
		public TerminalNode SE(int i) {
			return getToken(CPPParser.SE, i);
		}
		public List<TerminalNode> PIPE() { return getTokens(CPPParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(CPPParser.PIPE, i);
		}
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public List<TerminalNode> FAZER() { return getTokens(CPPParser.FAZER); }
		public TerminalNode FAZER(int i) {
			return getToken(CPPParser.FAZER, i);
		}
		public List<TerminalNode> LCHAVE() { return getTokens(CPPParser.LCHAVE); }
		public TerminalNode LCHAVE(int i) {
			return getToken(CPPParser.LCHAVE, i);
		}
		public List<TerminalNode> RCHAVE() { return getTokens(CPPParser.RCHAVE); }
		public TerminalNode RCHAVE(int i) {
			return getToken(CPPParser.RCHAVE, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> SENAO() { return getTokens(CPPParser.SENAO); }
		public TerminalNode SENAO(int i) {
			return getToken(CPPParser.SENAO, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(SE);
			setState(85);
			match(PIPE);
			setState(86);
			condicao();
			setState(87);
			match(PIPE);
			setState(88);
			match(FAZER);
			setState(89);
			match(LCHAVE);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 520619328L) != 0)) {
				{
				{
				setState(90);
				comando();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(RCHAVE);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(97);
				match(SENAO);
				}
				break;
			}
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(100);
				match(SENAO);
				setState(101);
				match(FAZER);
				setState(102);
				match(LCHAVE);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 520619328L) != 0)) {
					{
					{
					setState(103);
					comando();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(RCHAVE);
				}
				break;
			case 2:
				{
				setState(110);
				match(SENAO);
				setState(111);
				match(SE);
				setState(112);
				match(PIPE);
				setState(113);
				condicao();
				setState(114);
				match(PIPE);
				setState(115);
				match(FAZER);
				setState(116);
				match(LCHAVE);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 520619328L) != 0)) {
					{
					{
					setState(117);
					comando();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(RCHAVE);
				}
				break;
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
	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(CPPParser.ENQUANTO, 0); }
		public List<TerminalNode> PIPE() { return getTokens(CPPParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(CPPParser.PIPE, i);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode FAZER() { return getToken(CPPParser.FAZER, 0); }
		public TerminalNode LCHAVE() { return getToken(CPPParser.LCHAVE, 0); }
		public TerminalNode RCHAVE() { return getToken(CPPParser.RCHAVE, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ENQUANTO);
			setState(128);
			match(PIPE);
			setState(129);
			condicao();
			setState(130);
			match(PIPE);
			setState(131);
			match(FAZER);
			setState(132);
			match(LCHAVE);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 520619328L) != 0)) {
				{
				{
				setState(133);
				comando();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(RCHAVE);
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
	public static class CondicaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OperadorComparacaoContext operadorComparacao() {
			return getRuleContext(OperadorComparacaoContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicao);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				expressao();
				setState(142);
				operadorComparacao();
				setState(143);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				expressao();
				}
				break;
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
	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP_ARIT() { return getTokens(CPPParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(CPPParser.OP_ARIT, i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			termo();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT) {
				{
				{
				{
				setState(149);
				match(OP_ARIT);
				}
				setState(150);
				termo();
				}
				}
				setState(155);
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
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> OP_ARIT() { return getTokens(CPPParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(CPPParser.OP_ARIT, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_termo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			fator();
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(157);
					match(OP_ARIT);
					}
					setState(158);
					fator();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CPPParser.INT, 0); }
		public TerminalNode REAL() { return getToken(CPPParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(CPPParser.BOOL, 0); }
		public TerminalNode PALAVRA() { return getToken(CPPParser.PALAVRA, 0); }
		public TerminalNode ID() { return getToken(CPPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CPPParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CPPParser.RPAREN, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fator);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(PALAVRA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(LPAREN);
				setState(170);
				expressao();
				setState(171);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				chamadaFuncao();
				}
				break;
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
	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CPPParser.ID, 0); }
		public List<TerminalNode> PIPE() { return getTokens(CPPParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(CPPParser.PIPE, i);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitChamadaFuncao(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chamadaFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ID);
			setState(177);
			match(PIPE);
			setState(178);
			argumentos();
			setState(179);
			match(PIPE);
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
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(CPPParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CPPParser.VIRGULA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentos);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case INT:
			case REAL:
			case BOOL:
			case PALAVRA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				expressao();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(182);
					match(VIRGULA);
					setState(183);
					expressao();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PIPE:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(CPPParser.TIPO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(TIPO);
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
	public static class OperadorComparacaoContext extends ParserRuleContext {
		public TerminalNode OP_COND() { return getToken(CPPParser.OP_COND, 0); }
		public OperadorComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorComparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterOperadorComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitOperadorComparacao(this);
		}
	}

	public final OperadorComparacaoContext operadorComparacao() throws RecognitionException {
		OperadorComparacaoContext _localctx = new OperadorComparacaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operadorComparacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(OP_COND);
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
		"\u0004\u0001\u001d\u00c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		",\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"9\b\u0002\n\u0002\f\u0002<\t\u0002\u0003\u0002>\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\\\b\u0006\n\u0006\f\u0006_"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006c\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006i\b\u0006\n\u0006\f\u0006l\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006w\b\u0006\n\u0006"+
		"\f\u0006z\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006~\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0087\b\u0007\n\u0007\f\u0007\u008a\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0093\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0098\b\t\n\t\f\t\u009b\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0005\n\u00a0\b\n\n\n\f\n\u00a3\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00af\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00b9\b\r\n\r\f\r\u00bc\t\r"+
		"\u0001\r\u0003\r\u00bf\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000\u00cf\u0000!\u0001"+
		"\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000"+
		"\u0000\u0006I\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000\u0000\nP\u0001"+
		"\u0000\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000"+
		"\u0000\u0000\u0010\u0092\u0001\u0000\u0000\u0000\u0012\u0094\u0001\u0000"+
		"\u0000\u0000\u0014\u009c\u0001\u0000\u0000\u0000\u0016\u00ae\u0001\u0000"+
		"\u0000\u0000\u0018\u00b0\u0001\u0000\u0000\u0000\u001a\u00be\u0001\u0000"+
		"\u0000\u0000\u001c\u00c0\u0001\u0000\u0000\u0000\u001e\u00c2\u0001\u0000"+
		"\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$\u0001\u0001\u0000\u0000\u0000%&\u0005\u001c\u0000\u0000&\'\u0005\u0011"+
		"\u0000\u0000\'(\u0003\u0004\u0002\u0000()\u0005\u0011\u0000\u0000)-\u0005"+
		"\u0015\u0000\u0000*,\u0003\u0006\u0003\u0000+*\u0001\u0000\u0000\u0000"+
		",/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005\u0016"+
		"\u0000\u00001\u0003\u0001\u0000\u0000\u000023\u0003\u001c\u000e\u0000"+
		"3:\u0005\u001c\u0000\u000045\u0005\u0012\u0000\u000056\u0003\u001c\u000e"+
		"\u000067\u0005\u001c\u0000\u000079\u0001\u0000\u0000\u000084\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=2\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0005\u0001\u0000"+
		"\u0000\u0000?J\u0003\b\u0004\u0000@J\u0003\f\u0006\u0000AJ\u0003\u000e"+
		"\u0007\u0000BJ\u0003\n\u0005\u0000CD\u0003\u0018\f\u0000DE\u0005\u0017"+
		"\u0000\u0000EJ\u0001\u0000\u0000\u0000FG\u0003\u0012\t\u0000GH\u0005\u0017"+
		"\u0000\u0000HJ\u0001\u0000\u0000\u0000I?\u0001\u0000\u0000\u0000I@\u0001"+
		"\u0000\u0000\u0000IA\u0001\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000"+
		"IC\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000J\u0007\u0001\u0000"+
		"\u0000\u0000KL\u0005\u001c\u0000\u0000LM\u0005\u000f\u0000\u0000MN\u0003"+
		"\u0012\t\u0000NO\u0005\u0017\u0000\u0000O\t\u0001\u0000\u0000\u0000PQ"+
		"\u0005\n\u0000\u0000QR\u0003\u0012\t\u0000RS\u0005\u0017\u0000\u0000S"+
		"\u000b\u0001\u0000\u0000\u0000TU\u0005\u0006\u0000\u0000UV\u0005\u0011"+
		"\u0000\u0000VW\u0003\u0010\b\u0000WX\u0005\u0011\u0000\u0000XY\u0005\t"+
		"\u0000\u0000Y]\u0005\u0015\u0000\u0000Z\\\u0003\u0006\u0003\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000`b\u0005\u0016\u0000\u0000ac\u0005\u0007\u0000\u0000ba\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000c}\u0001\u0000\u0000\u0000de\u0005"+
		"\u0007\u0000\u0000ef\u0005\t\u0000\u0000fj\u0005\u0015\u0000\u0000gi\u0003"+
		"\u0006\u0003\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000m~\u0005\u0016\u0000\u0000no\u0005\u0007"+
		"\u0000\u0000op\u0005\u0006\u0000\u0000pq\u0005\u0011\u0000\u0000qr\u0003"+
		"\u0010\b\u0000rs\u0005\u0011\u0000\u0000st\u0005\t\u0000\u0000tx\u0005"+
		"\u0015\u0000\u0000uw\u0003\u0006\u0003\u0000vu\u0001\u0000\u0000\u0000"+
		"wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005\u0016"+
		"\u0000\u0000|~\u0001\u0000\u0000\u0000}d\u0001\u0000\u0000\u0000}n\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\r\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005\b\u0000\u0000\u0080\u0081\u0005\u0011\u0000\u0000\u0081"+
		"\u0082\u0003\u0010\b\u0000\u0082\u0083\u0005\u0011\u0000\u0000\u0083\u0084"+
		"\u0005\t\u0000\u0000\u0084\u0088\u0005\u0015\u0000\u0000\u0085\u0087\u0003"+
		"\u0006\u0003\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u0016\u0000\u0000\u008c\u000f\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0003\u0012\t\u0000\u008e\u008f\u0003\u001e"+
		"\u000f\u0000\u008f\u0090\u0003\u0012\t\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0003\u0012\t\u0000\u0092\u008d\u0001\u0000\u0000\u0000"+
		"\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0011\u0001\u0000\u0000\u0000"+
		"\u0094\u0099\u0003\u0014\n\u0000\u0095\u0096\u0005\r\u0000\u0000\u0096"+
		"\u0098\u0003\u0014\n\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009b"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u0013\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009c\u00a1\u0003\u0016\u000b\u0000\u009d\u009e"+
		"\u0005\r\u0000\u0000\u009e\u00a0\u0003\u0016\u000b\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u0015\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00af\u0005"+
		"\u0018\u0000\u0000\u00a5\u00af\u0005\u0019\u0000\u0000\u00a6\u00af\u0005"+
		"\u001a\u0000\u0000\u00a7\u00af\u0005\u001b\u0000\u0000\u00a8\u00af\u0005"+
		"\u001c\u0000\u0000\u00a9\u00aa\u0005\u0013\u0000\u0000\u00aa\u00ab\u0003"+
		"\u0012\t\u0000\u00ab\u00ac\u0005\u0014\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00af\u0003\u0018\f\u0000\u00ae\u00a4\u0001\u0000\u0000"+
		"\u0000\u00ae\u00a5\u0001\u0000\u0000\u0000\u00ae\u00a6\u0001\u0000\u0000"+
		"\u0000\u00ae\u00a7\u0001\u0000\u0000\u0000\u00ae\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ae\u00a9\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u0017\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u001c\u0000"+
		"\u0000\u00b1\u00b2\u0005\u0011\u0000\u0000\u00b2\u00b3\u0003\u001a\r\u0000"+
		"\u00b3\u00b4\u0005\u0011\u0000\u0000\u00b4\u0019\u0001\u0000\u0000\u0000"+
		"\u00b5\u00ba\u0003\u0012\t\u0000\u00b6\u00b7\u0005\u0012\u0000\u0000\u00b7"+
		"\u00b9\u0003\u0012\t\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bc"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bf\u0001\u0000\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00b5"+
		"\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u001b"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0003\u0000\u0000\u00c1\u001d"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u000e\u0000\u0000\u00c3\u001f"+
		"\u0001\u0000\u0000\u0000\u0011#-:=I]bjx}\u0088\u0092\u0099\u00a1\u00ae"+
		"\u00ba\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}