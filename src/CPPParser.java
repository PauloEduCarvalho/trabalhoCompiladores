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
		RULE_atribuicao = 4, RULE_criacao = 5, RULE_retorno = 6, RULE_condicional = 7, 
		RULE_enquanto = 8, RULE_operadorLogico = 9, RULE_condicao = 10, RULE_expressao = 11, 
		RULE_termo = 12, RULE_fator = 13, RULE_chamadaFuncao = 14, RULE_argumentos = 15, 
		RULE_tipo = 16, RULE_operadorComparacao = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "funcao", "parametros", "comando", "atribuicao", "criacao", 
			"retorno", "condicional", "enquanto", "operadorLogico", "condicao", "expressao", 
			"termo", "fator", "chamadaFuncao", "argumentos", "tipo", "operadorComparacao"
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
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	 
		public ProgramaContext() { }
		public void copyFrom(ProgramaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NInicioContext extends ProgramaContext {
		public TerminalNode EOF() { return getToken(CPPParser.EOF, 0); }
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public NInicioContext(ProgramaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterNInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitNInicio(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			_localctx = new NInicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				funcao();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(41);
			match(EOF);
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
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	 
		public FuncaoContext() { }
		public void copyFrom(FuncaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NPrincipalContext extends FuncaoContext {
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
		public NPrincipalContext(FuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterNPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitNPrincipal(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcao);
		int _la;
		try {
			_localctx = new NPrincipalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(ID);
			setState(44);
			match(PIPE);
			setState(45);
			parametros();
			setState(46);
			match(PIPE);
			setState(47);
			match(LCHAVE);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 520619336L) != 0)) {
				{
				{
				setState(48);
				comando();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(56);
				tipo();
				setState(57);
				match(ID);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(58);
					match(VIRGULA);
					setState(59);
					tipo();
					setState(60);
					match(ID);
					}
					}
					setState(66);
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
		public CriacaoContext criacao() {
			return getRuleContext(CriacaoContext.class,0);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				condicional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				enquanto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				retorno();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				chamadaFuncao();
				setState(74);
				match(PONTO_VIRGULA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				expressao();
				setState(77);
				match(PONTO_VIRGULA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				criacao();
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
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NAtribuicaoContext extends AtribuicaoContext {
		public TerminalNode ID() { return getToken(CPPParser.ID, 0); }
		public TerminalNode OP_ATR() { return getToken(CPPParser.OP_ATR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(CPPParser.PONTO_VIRGULA, 0); }
		public NAtribuicaoContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitNAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuicao);
		try {
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(83);
			match(OP_ATR);
			setState(84);
			expressao();
			setState(85);
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
	public static class CriacaoContext extends ParserRuleContext {
		public CriacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criacao; }
	 
		public CriacaoContext() { }
		public void copyFrom(CriacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NCriacaoContext extends CriacaoContext {
		public TerminalNode TIPO() { return getToken(CPPParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(CPPParser.ID, 0); }
		public TerminalNode OP_ATR() { return getToken(CPPParser.OP_ATR, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(CPPParser.PONTO_VIRGULA, 0); }
		public NCriacaoContext(CriacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterNCriacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitNCriacao(this);
		}
	}

	public final CriacaoContext criacao() throws RecognitionException {
		CriacaoContext _localctx = new CriacaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_criacao);
		try {
			_localctx = new NCriacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(TIPO);
			setState(88);
			match(ID);
			setState(89);
			match(OP_ATR);
			setState(90);
			fator();
			setState(91);
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
		enterRule(_localctx, 12, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(RETORNAR);
			setState(94);
			expressao();
			setState(95);
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
		enterRule(_localctx, 14, RULE_condicional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SE);
			setState(98);
			match(PIPE);
			setState(99);
			condicao();
			setState(100);
			match(PIPE);
			setState(101);
			match(FAZER);
			setState(102);
			match(LCHAVE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 520619336L) != 0)) {
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
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
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
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 520619336L) != 0)) {
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
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(130);
				match(SENAO);
				setState(131);
				match(FAZER);
				setState(132);
				match(LCHAVE);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 520619336L) != 0)) {
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
		enterRule(_localctx, 16, RULE_enquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ENQUANTO);
			setState(143);
			match(PIPE);
			setState(144);
			condicao();
			setState(145);
			match(PIPE);
			setState(146);
			match(FAZER);
			setState(147);
			match(LCHAVE);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 520619336L) != 0)) {
				{
				{
				setState(148);
				comando();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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
	public static class OperadorLogicoContext extends ParserRuleContext {
		public TerminalNode OU() { return getToken(CPPParser.OU, 0); }
		public TerminalNode E() { return getToken(CPPParser.E, 0); }
		public OperadorLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterOperadorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitOperadorLogico(this);
		}
	}

	public final OperadorLogicoContext operadorLogico() throws RecognitionException {
		OperadorLogicoContext _localctx = new OperadorLogicoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operadorLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==OU || _la==E) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class CondicaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<OperadorComparacaoContext> operadorComparacao() {
			return getRuleContexts(OperadorComparacaoContext.class);
		}
		public OperadorComparacaoContext operadorComparacao(int i) {
			return getRuleContext(OperadorComparacaoContext.class,i);
		}
		public List<OperadorLogicoContext> operadorLogico() {
			return getRuleContexts(OperadorLogicoContext.class);
		}
		public OperadorLogicoContext operadorLogico(int i) {
			return getRuleContext(OperadorLogicoContext.class,i);
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
		enterRule(_localctx, 20, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			expressao();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22528L) != 0)) {
				{
				setState(165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_COND:
					{
					setState(159);
					operadorComparacao();
					setState(160);
					expressao();
					}
					break;
				case OU:
				case E:
					{
					setState(162);
					operadorLogico();
					setState(163);
					expressao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(169);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NExpressaoContext extends ExpressaoContext {
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
		public NExpressaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterNExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitNExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressao);
		int _la;
		try {
			_localctx = new NExpressaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			termo();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT) {
				{
				{
				{
				setState(171);
				match(OP_ARIT);
				}
				setState(172);
				termo();
				}
				}
				setState(177);
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
		enterRule(_localctx, 24, RULE_termo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			fator();
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(179);
					match(OP_ARIT);
					}
					setState(180);
					fator();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 26, RULE_fator);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(PALAVRA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				match(LPAREN);
				setState(192);
				expressao();
				setState(193);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
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
		enterRule(_localctx, 28, RULE_chamadaFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			setState(199);
			match(PIPE);
			setState(200);
			argumentos();
			setState(201);
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
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	 
		public ArgumentosContext() { }
		public void copyFrom(ArgumentosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NArgumentosContext extends ArgumentosContext {
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
		public NArgumentosContext(ArgumentosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterNArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitNArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argumentos);
		int _la;
		try {
			_localctx = new NArgumentosContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			expressao();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(204);
				match(VIRGULA);
				setState(205);
				expressao();
				}
				}
				setState(210);
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
		enterRule(_localctx, 32, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		enterRule(_localctx, 34, RULE_operadorComparacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		"\u0004\u0001\u001d\u00d8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0004"+
		"\u0000&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"2\b\u0001\n\u0001\f\u00015\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"?\b\u0002\n\u0002\f\u0002B\t\u0002\u0003\u0002D\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007i\b\u0007\n\u0007"+
		"\f\u0007l\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007w\b"+
		"\u0007\n\u0007\f\u0007z\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007~\b"+
		"\u0007\n\u0007\f\u0007\u0081\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u0087\b\u0007\n\u0007\f\u0007\u008a\t\u0007\u0001"+
		"\u0007\u0003\u0007\u008d\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0096\b\b\n\b\f\b\u0099\t\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00a6\b\n\n\n\f\n\u00a9\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00ae\b\u000b\n\u000b\f\u000b\u00b1\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00b6\b\f\n\f\f\f\u00b9\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c5"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00cf\b\u000f\n\u000f\f\u000f"+
		"\u00d2\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"\u0000\u0001\u0001\u0000\u000b\f\u00e0"+
		"\u0000%\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004C"+
		"\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\bR\u0001\u0000"+
		"\u0000\u0000\nW\u0001\u0000\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000e"+
		"a\u0001\u0000\u0000\u0000\u0010\u008e\u0001\u0000\u0000\u0000\u0012\u009c"+
		"\u0001\u0000\u0000\u0000\u0014\u009e\u0001\u0000\u0000\u0000\u0016\u00aa"+
		"\u0001\u0000\u0000\u0000\u0018\u00b2\u0001\u0000\u0000\u0000\u001a\u00c4"+
		"\u0001\u0000\u0000\u0000\u001c\u00c6\u0001\u0000\u0000\u0000\u001e\u00cb"+
		"\u0001\u0000\u0000\u0000 \u00d3\u0001\u0000\u0000\u0000\"\u00d5\u0001"+
		"\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0005\u0000\u0000\u0001*\u0001"+
		"\u0001\u0000\u0000\u0000+,\u0005\u001c\u0000\u0000,-\u0005\u0011\u0000"+
		"\u0000-.\u0003\u0004\u0002\u0000./\u0005\u0011\u0000\u0000/3\u0005\u0015"+
		"\u0000\u000002\u0003\u0006\u0003\u000010\u0001\u0000\u0000\u000025\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"46\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0005\u0016\u0000"+
		"\u00007\u0003\u0001\u0000\u0000\u000089\u0003 \u0010\u00009@\u0005\u001c"+
		"\u0000\u0000:;\u0005\u0012\u0000\u0000;<\u0003 \u0010\u0000<=\u0005\u001c"+
		"\u0000\u0000=?\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000?B\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000C8\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000D\u0005\u0001\u0000\u0000\u0000EQ\u0003"+
		"\b\u0004\u0000FQ\u0003\u000e\u0007\u0000GQ\u0003\u0010\b\u0000HQ\u0003"+
		"\f\u0006\u0000IJ\u0003\u001c\u000e\u0000JK\u0005\u0017\u0000\u0000KQ\u0001"+
		"\u0000\u0000\u0000LM\u0003\u0016\u000b\u0000MN\u0005\u0017\u0000\u0000"+
		"NQ\u0001\u0000\u0000\u0000OQ\u0003\n\u0005\u0000PE\u0001\u0000\u0000\u0000"+
		"PF\u0001\u0000\u0000\u0000PG\u0001\u0000\u0000\u0000PH\u0001\u0000\u0000"+
		"\u0000PI\u0001\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000RS\u0005\u001c\u0000\u0000"+
		"ST\u0005\u000f\u0000\u0000TU\u0003\u0016\u000b\u0000UV\u0005\u0017\u0000"+
		"\u0000V\t\u0001\u0000\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0005\u001c"+
		"\u0000\u0000YZ\u0005\u000f\u0000\u0000Z[\u0003\u001a\r\u0000[\\\u0005"+
		"\u0017\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0005\n\u0000\u0000"+
		"^_\u0003\u0016\u000b\u0000_`\u0005\u0017\u0000\u0000`\r\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0006\u0000\u0000bc\u0005\u0011\u0000\u0000cd\u0003\u0014"+
		"\n\u0000de\u0005\u0011\u0000\u0000ef\u0005\t\u0000\u0000fj\u0005\u0015"+
		"\u0000\u0000gi\u0003\u0006\u0003\u0000hg\u0001\u0000\u0000\u0000il\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000m\u007f\u0005\u0016"+
		"\u0000\u0000no\u0005\u0007\u0000\u0000op\u0005\u0006\u0000\u0000pq\u0005"+
		"\u0011\u0000\u0000qr\u0003\u0014\n\u0000rs\u0005\u0011\u0000\u0000st\u0005"+
		"\t\u0000\u0000tx\u0005\u0015\u0000\u0000uw\u0003\u0006\u0003\u0000vu\u0001"+
		"\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000{|\u0005\u0016\u0000\u0000|~\u0001\u0000\u0000\u0000}n\u0001\u0000"+
		"\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u008c\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0007\u0000\u0000"+
		"\u0083\u0084\u0005\t\u0000\u0000\u0084\u0088\u0005\u0015\u0000\u0000\u0085"+
		"\u0087\u0003\u0006\u0003\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008b\u008d\u0005\u0016\u0000\u0000\u008c"+
		"\u0082\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u000f\u0001\u0000\u0000\u0000\u008e\u008f\u0005\b\u0000\u0000\u008f\u0090"+
		"\u0005\u0011\u0000\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091\u0092\u0005"+
		"\u0011\u0000\u0000\u0092\u0093\u0005\t\u0000\u0000\u0093\u0097\u0005\u0015"+
		"\u0000\u0000\u0094\u0096\u0003\u0006\u0003\u0000\u0095\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0016"+
		"\u0000\u0000\u009b\u0011\u0001\u0000\u0000\u0000\u009c\u009d\u0007\u0000"+
		"\u0000\u0000\u009d\u0013\u0001\u0000\u0000\u0000\u009e\u00a7\u0003\u0016"+
		"\u000b\u0000\u009f\u00a0\u0003\"\u0011\u0000\u00a0\u00a1\u0003\u0016\u000b"+
		"\u0000\u00a1\u00a6\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u0012\t\u0000"+
		"\u00a3\u00a4\u0003\u0016\u000b\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u0015\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00af\u0003\u0018\f\u0000\u00ab"+
		"\u00ac\u0005\r\u0000\u0000\u00ac\u00ae\u0003\u0018\f\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u0017"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b7"+
		"\u0003\u001a\r\u0000\u00b3\u00b4\u0005\r\u0000\u0000\u00b4\u00b6\u0003"+
		"\u001a\r\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u0019\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00c5\u0005\u0018\u0000\u0000\u00bb\u00c5\u0005\u0019"+
		"\u0000\u0000\u00bc\u00c5\u0005\u001a\u0000\u0000\u00bd\u00c5\u0005\u001b"+
		"\u0000\u0000\u00be\u00c5\u0005\u001c\u0000\u0000\u00bf\u00c0\u0005\u0013"+
		"\u0000\u0000\u00c0\u00c1\u0003\u0016\u000b\u0000\u00c1\u00c2\u0005\u0014"+
		"\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003\u001c"+
		"\u000e\u0000\u00c4\u00ba\u0001\u0000\u0000\u0000\u00c4\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c4\u00bc\u0001\u0000\u0000\u0000\u00c4\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c4\u00be\u0001\u0000\u0000\u0000\u00c4\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u001b\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0005\u001c\u0000\u0000\u00c7\u00c8\u0005\u0011"+
		"\u0000\u0000\u00c8\u00c9\u0003\u001e\u000f\u0000\u00c9\u00ca\u0005\u0011"+
		"\u0000\u0000\u00ca\u001d\u0001\u0000\u0000\u0000\u00cb\u00d0\u0003\u0016"+
		"\u000b\u0000\u00cc\u00cd\u0005\u0012\u0000\u0000\u00cd\u00cf\u0003\u0016"+
		"\u000b\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u001f\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0005\u0003\u0000\u0000\u00d4!\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0005\u000e\u0000\u0000\u00d6#\u0001\u0000\u0000\u0000"+
		"\u0011\'3@CPjx\u007f\u0088\u008c\u0097\u00a5\u00a7\u00af\u00b7\u00c4\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}