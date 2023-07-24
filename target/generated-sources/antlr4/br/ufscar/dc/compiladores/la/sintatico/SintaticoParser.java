// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.la.sintatico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SintaticoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECLARE=1, ALGORITMO=2, INTEIRO=3, REAL=4, TIPO=5, VAR=6, LEIA=7, ESCREVA=8, 
		SE=9, ENTAO=10, SENAO=11, FIM_SE=12, ENQUANTO=13, FIM_ENQUANTO=14, FIM_ALGORITMO=15, 
		E=16, OU=17, LITERAL=18, NAO=19, LOGICO=20, CASO=21, FIM_CASO=22, SEJA=23, 
		PARA=24, FIM_PARA=25, FACA=26, ATE=27, REGISTRO=28, FIM_REGISTRO=29, PROCEDIMENTO=30, 
		FIM_PROCEDIMENTO=31, RETORNE=32, FUNCAO=33, FIM_FUNCAO=34, CONSTANTE=35, 
		FALSO=36, VERDADEIRO=37, NUM_INT=38, NUM_REAL=39, IDENT=40, WS=41, CADEIA=42, 
		ERRO_CADEIA=43, COMENTARIO=44, ERRO_COMENTARIO=45, MAIOR=46, MAIORIGUAL=47, 
		MENOR=48, MENORIGUAL=49, DIFERENTE=50, IGUAL=51, SOMA=52, SUBTRACAO=53, 
		MULTIPLICACAO=54, DIVICAO=55, MOD=56, DELIM=57, ABREPAR=58, FECHAPAR=59, 
		ABRECAHVE=60, FECHACHAVE=61, VIRGULA=62, ATRIBUICAO=63, ENDERECO=64, INTERVALO=65, 
		PONTO=66, PONTEIRO=67, ERRO=68;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_declaracao_local = 2, RULE_variavel = 3, 
		RULE_identificador = 4, RULE_tipo = 5, RULE_tipo_basico = 6, RULE_tipo_estendido = 7, 
		RULE_valor_constante = 8, RULE_registro = 9, RULE_declaracao_global = 10, 
		RULE_parametro = 11, RULE_parametros = 12, RULE_corpo = 13, RULE_cmd = 14, 
		RULE_cmdLeia = 15, RULE_cmdEscreva = 16, RULE_cmdSe = 17, RULE_cmdCaso = 18, 
		RULE_cmdPara = 19, RULE_cmdEnquanto = 20, RULE_cmdFaca = 21, RULE_cmdAtribuicao = 22, 
		RULE_cmdChamada = 23, RULE_cmdRetorne = 24, RULE_selecao = 25, RULE_item_selecao = 26, 
		RULE_constantes = 27, RULE_numero_intervalo = 28, RULE_op_unario = 29, 
		RULE_exp_aritmetica = 30, RULE_termo = 31, RULE_fator = 32, RULE_op1 = 33, 
		RULE_op2 = 34, RULE_op3 = 35, RULE_parcela = 36, RULE_parcela_unario = 37, 
		RULE_parcela_nao_unario = 38, RULE_exp_relacional = 39, RULE_op_relacional = 40, 
		RULE_expressao = 41, RULE_termo_logico = 42, RULE_fator_logico = 43, RULE_parcela_logica = 44, 
		RULE_op_logico_1 = 45, RULE_op_logico_2 = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "declaracao_local", "variavel", "identificador", 
			"tipo", "tipo_basico", "tipo_estendido", "valor_constante", "registro", 
			"declaracao_global", "parametro", "parametros", "corpo", "cmd", "cmdLeia", 
			"cmdEscreva", "cmdSe", "cmdCaso", "cmdPara", "cmdEnquanto", "cmdFaca", 
			"cmdAtribuicao", "cmdChamada", "cmdRetorne", "selecao", "item_selecao", 
			"constantes", "numero_intervalo", "op_unario", "exp_aritmetica", "termo", 
			"fator", "op1", "op2", "op3", "parcela", "parcela_unario", "parcela_nao_unario", 
			"exp_relacional", "op_relacional", "expressao", "termo_logico", "fator_logico", 
			"parcela_logica", "op_logico_1", "op_logico_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'declare'", "'algoritmo'", "'inteiro'", "'real'", "'tipo'", "'var'", 
			"'leia'", "'escreva'", "'se'", "'entao'", "'senao'", "'fim_se'", "'enquanto'", 
			"'fim_enquanto'", "'fim_algoritmo'", "'e'", "'ou'", "'literal'", "'nao'", 
			"'logico'", "'caso'", "'fim_caso'", "'seja'", "'para'", "'fim_para'", 
			"'faca'", "'ate'", "'registro'", "'fim_registro'", "'procedimento'", 
			"'fim_procedimento'", "'retorne'", "'funcao'", "'fim_funcao'", "'constante'", 
			"'falso'", "'verdadeiro'", null, null, null, null, null, null, null, 
			null, "'>'", "'>='", "'<'", "'<='", "'<>'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "':'", "'('", "')'", "'['", "']'", "','", "'<-'", "'&'", 
			"'..'", "'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECLARE", "ALGORITMO", "INTEIRO", "REAL", "TIPO", "VAR", "LEIA", 
			"ESCREVA", "SE", "ENTAO", "SENAO", "FIM_SE", "ENQUANTO", "FIM_ENQUANTO", 
			"FIM_ALGORITMO", "E", "OU", "LITERAL", "NAO", "LOGICO", "CASO", "FIM_CASO", 
			"SEJA", "PARA", "FIM_PARA", "FACA", "ATE", "REGISTRO", "FIM_REGISTRO", 
			"PROCEDIMENTO", "FIM_PROCEDIMENTO", "RETORNE", "FUNCAO", "FIM_FUNCAO", 
			"CONSTANTE", "FALSO", "VERDADEIRO", "NUM_INT", "NUM_REAL", "IDENT", "WS", 
			"CADEIA", "ERRO_CADEIA", "COMENTARIO", "ERRO_COMENTARIO", "MAIOR", "MAIORIGUAL", 
			"MENOR", "MENORIGUAL", "DIFERENTE", "IGUAL", "SOMA", "SUBTRACAO", "MULTIPLICACAO", 
			"DIVICAO", "MOD", "DELIM", "ABREPAR", "FECHAPAR", "ABRECAHVE", "FECHACHAVE", 
			"VIRGULA", "ATRIBUICAO", "ENDERECO", "INTERVALO", "PONTO", "PONTEIRO", 
			"ERRO"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SintaticoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(SintaticoParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(SintaticoParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			declaracoes();
			setState(95);
			match(ALGORITMO);
			setState(96);
			corpo();
			setState(97);
			match(FIM_ALGORITMO);
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
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<Declaracao_globalContext> declaracao_global() {
			return getRuleContexts(Declaracao_globalContext.class);
		}
		public Declaracao_globalContext declaracao_global(int i) {
			return getRuleContext(Declaracao_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 44023414818L) != 0) {
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DECLARE:
				case TIPO:
				case CONSTANTE:
					{
					setState(99);
					declaracao_local();
					}
					break;
				case PROCEDIMENTO:
				case FUNCAO:
					{
					setState(100);
					declaracao_global();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(105);
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
	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(SintaticoParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(SintaticoParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(SintaticoParser.IDENT, 0); }
		public TerminalNode DELIM() { return getToken(SintaticoParser.DELIM, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(SintaticoParser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(SintaticoParser.TIPO, 0); }
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_local);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(DECLARE);
				setState(107);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(CONSTANTE);
				setState(109);
				match(IDENT);
				setState(110);
				match(DELIM);
				setState(111);
				tipo_basico();
				setState(112);
				match(IGUAL);
				setState(113);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(TIPO);
				setState(116);
				match(IDENT);
				setState(117);
				match(DELIM);
				setState(118);
				registro();
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
	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIM() { return getToken(SintaticoParser.DELIM, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(SintaticoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(SintaticoParser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			identificador();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(122);
				match(VIRGULA);
				setState(123);
				identificador();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(DELIM);
			setState(130);
			tipo();
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
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(SintaticoParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SintaticoParser.IDENT, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(SintaticoParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(SintaticoParser.PONTO, i);
		}
		public List<TerminalNode> ABRECAHVE() { return getTokens(SintaticoParser.ABRECAHVE); }
		public TerminalNode ABRECAHVE(int i) {
			return getToken(SintaticoParser.ABRECAHVE, i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> FECHACHAVE() { return getTokens(SintaticoParser.FECHACHAVE); }
		public TerminalNode FECHACHAVE(int i) {
			return getToken(SintaticoParser.FECHACHAVE, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDENT);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(133);
				match(PONTO);
				setState(134);
				match(IDENT);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRECAHVE) {
				{
				{
				setState(140);
				match(ABRECAHVE);
				setState(141);
				exp_aritmetica();
				setState(142);
				match(FECHACHAVE);
				}
				}
				setState(148);
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
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				registro();
				}
				break;
			case INTEIRO:
			case REAL:
			case LITERAL:
			case LOGICO:
			case IDENT:
			case PONTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				tipo_estendido();
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
	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(SintaticoParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(SintaticoParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(SintaticoParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(SintaticoParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1310744L) != 0) ) {
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
	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SintaticoParser.IDENT, 0); }
		public TerminalNode PONTEIRO() { return getToken(SintaticoParser.PONTEIRO, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(155);
				match(PONTEIRO);
				}
			}

			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
			case REAL:
			case LITERAL:
			case LOGICO:
				{
				setState(158);
				tipo_basico();
				}
				break;
			case IDENT:
				{
				setState(159);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(SintaticoParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(SintaticoParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(SintaticoParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(SintaticoParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(SintaticoParser.FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 5428838662144L) != 0) ) {
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
	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(SintaticoParser.REGISTRO, 0); }
		public TerminalNode FIM_REGISTRO() { return getToken(SintaticoParser.FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(REGISTRO);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(165);
				variavel();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(FIM_REGISTRO);
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
	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(SintaticoParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(SintaticoParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(SintaticoParser.ABREPAR, 0); }
		public TerminalNode FECHAPAR() { return getToken(SintaticoParser.FECHAPAR, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(SintaticoParser.FIM_PROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(SintaticoParser.FUNCAO, 0); }
		public TerminalNode DELIM() { return getToken(SintaticoParser.DELIM, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(SintaticoParser.FIM_FUNCAO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracao_global);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(PROCEDIMENTO);
				setState(174);
				match(IDENT);
				setState(175);
				match(ABREPAR);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(176);
					parametros();
					}
				}

				setState(179);
				match(FECHAPAR);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 34359738402L) != 0) {
					{
					{
					setState(180);
					declaracao_local();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1152921513231007815L) != 0) {
					{
					{
					setState(186);
					cmd();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(FUNCAO);
				setState(194);
				match(IDENT);
				setState(195);
				match(ABREPAR);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(196);
					parametros();
					}
				}

				setState(199);
				match(FECHAPAR);
				setState(200);
				match(DELIM);
				setState(201);
				tipo_estendido();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 34359738402L) != 0) {
					{
					{
					setState(202);
					declaracao_local();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1152921513231007815L) != 0) {
					{
					{
					setState(208);
					cmd();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(FIM_FUNCAO);
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
	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIM() { return getToken(SintaticoParser.DELIM, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(SintaticoParser.VAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(SintaticoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(SintaticoParser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(218);
				match(VAR);
				}
			}

			setState(221);
			identificador();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(222);
				match(VIRGULA);
				setState(223);
				identificador();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(DELIM);
			setState(230);
			tipo_estendido();
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
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(SintaticoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(SintaticoParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			parametro();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(233);
				match(VIRGULA);
				setState(234);
				parametro();
				}
				}
				setState(239);
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
	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 34359738402L) != 0) {
				{
				{
				setState(240);
				declaracao_local();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1152921513231007815L) != 0) {
				{
				{
				setState(246);
				cmd();
				}
				}
				setState(251);
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
	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmd);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(260);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(261);
				cmdRetorne();
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
	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(SintaticoParser.LEIA, 0); }
		public TerminalNode ABREPAR() { return getToken(SintaticoParser.ABREPAR, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(SintaticoParser.FECHAPAR, 0); }
		public List<TerminalNode> PONTEIRO() { return getTokens(SintaticoParser.PONTEIRO); }
		public TerminalNode PONTEIRO(int i) {
			return getToken(SintaticoParser.PONTEIRO, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(SintaticoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(SintaticoParser.VIRGULA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCmdLeia(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LEIA);
			setState(265);
			match(ABREPAR);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(266);
				match(PONTEIRO);
				}
			}

			setState(269);
			identificador();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(270);
				match(VIRGULA);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(271);
					match(PONTEIRO);
					}
				}

				setState(274);
				identificador();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(FECHAPAR);
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
	public static class CmdEscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(SintaticoParser.ESCREVA, 0); }
		public TerminalNode ABREPAR() { return getToken(SintaticoParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(SintaticoParser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(SintaticoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(SintaticoParser.VIRGULA, i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCmdEscreva(this);
		}
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ESCREVA);
			setState(283);
			match(ABREPAR);
			setState(284);
			expressao();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(285);
				match(VIRGULA);
				setState(286);
				expressao();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(FECHAPAR);
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
	public static class CmdSeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(SintaticoParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(SintaticoParser.ENTAO, 0); }
		public TerminalNode FIM_SE() { return getToken(SintaticoParser.FIM_SE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(SintaticoParser.SENAO, 0); }
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCmdSe(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(SE);
			setState(295);
			expressao();
			setState(296);
			match(ENTAO);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1152921513231007815L) != 0) {
				{
				{
				setState(297);
				cmd();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(303);
				match(SENAO);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1152921513231007815L) != 0) {
					{
					{
					setState(304);
					cmd();
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(312);
			match(FIM_SE);
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
	public static class CmdCasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(SintaticoParser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(SintaticoParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(SintaticoParser.FIM_CASO, 0); }
		public TerminalNode SENAO() { return getToken(SintaticoParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCmdCaso(this);
		}
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(CASO);
			setState(315);
			exp_aritmetica();
			setState(316);
			match(SEJA);
			setState(317);
			selecao();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(318);
				match(SENAO);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1152921513231007815L) != 0) {
					{
					{
					setState(319);
					cmd();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(327);
			match(FIM_CASO);
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
	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(SintaticoParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(SintaticoParser.IDENT, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(SintaticoParser.ATRIBUICAO, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(SintaticoParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(SintaticoParser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(SintaticoParser.FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCmdPara(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(PARA);
			setState(330);
			match(IDENT);
			setState(331);
			match(ATRIBUICAO);
			setState(332);
			exp_aritmetica();
			setState(333);
			match(ATE);
			setState(334);
			exp_aritmetica();
			setState(335);
			match(FACA);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1152921513231007815L) != 0) {
				{
				{
				setState(336);
				cmd();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(FIM_PARA);
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
	public static class CmdEnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(SintaticoParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(SintaticoParser.FACA, 0); }
		public TerminalNode FIM_ENQUANTO() { return getToken(SintaticoParser.FIM_ENQUANTO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCmdEnquanto(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(ENQUANTO);
			setState(345);
			expressao();
			setState(346);
			match(FACA);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1152921513231007815L) != 0) {
				{
				{
				setState(347);
				cmd();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(FIM_ENQUANTO);
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
	public static class CmdFacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(SintaticoParser.FACA, 0); }
		public TerminalNode ATE() { return getToken(SintaticoParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCmdFaca(this);
		}
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(FACA);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1152921513231007815L) != 0) {
				{
				{
				setState(356);
				cmd();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(ATE);
			setState(363);
			expressao();
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
	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(SintaticoParser.ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(SintaticoParser.PONTEIRO, 0); }
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCmdAtribuicao(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(365);
				match(PONTEIRO);
				}
			}

			setState(368);
			identificador();
			setState(369);
			match(ATRIBUICAO);
			setState(370);
			expressao();
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
	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SintaticoParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(SintaticoParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(SintaticoParser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(SintaticoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(SintaticoParser.VIRGULA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCmdChamada(this);
		}
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(IDENT);
			setState(373);
			match(ABREPAR);
			setState(374);
			expressao();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(375);
				match(VIRGULA);
				setState(376);
				expressao();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(FECHAPAR);
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
	public static class CmdRetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(SintaticoParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitCmdRetorne(this);
		}
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(RETORNE);
			setState(385);
			expressao();
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
	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM_INT || _la==SUBTRACAO) {
				{
				{
				setState(387);
				item_selecao();
				}
				}
				setState(392);
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
	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(SintaticoParser.DELIM, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitItem_selecao(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			constantes();
			setState(394);
			match(DELIM);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1152921513231007815L) != 0) {
				{
				{
				setState(395);
				cmd();
				}
				}
				setState(400);
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
	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(SintaticoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(SintaticoParser.VIRGULA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			numero_intervalo();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(402);
				match(VIRGULA);
				setState(403);
				numero_intervalo();
				}
				}
				setState(408);
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
	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(SintaticoParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(SintaticoParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode INTERVALO() { return getToken(SintaticoParser.INTERVALO, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBTRACAO) {
				{
				setState(409);
				op_unario();
				}
			}

			setState(412);
			match(NUM_INT);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERVALO) {
				{
				setState(413);
				match(INTERVALO);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(414);
					op_unario();
					}
				}

				setState(417);
				match(NUM_INT);
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
	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUBTRACAO() { return getToken(SintaticoParser.SUBTRACAO, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(SUBTRACAO);
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
	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			termo();
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(423);
					op1();
					setState(424);
					termo();
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			fator();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICACAO || _la==DIVICAO) {
				{
				{
				setState(432);
				op2();
				setState(433);
				fator();
				}
				}
				setState(439);
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
	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			parcela();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MOD) {
				{
				{
				setState(441);
				op3();
				setState(442);
				parcela();
				}
				}
				setState(448);
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
	public static class Op1Context extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(SintaticoParser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(SintaticoParser.SUBTRACAO, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitOp1(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUBTRACAO) ) {
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
	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(SintaticoParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVICAO() { return getToken(SintaticoParser.DIVICAO, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitOp2(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLICACAO || _la==DIVICAO) ) {
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
	public static class Op3Context extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(SintaticoParser.MOD, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitOp3(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(MOD);
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
	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parcela);
		int _la;
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
			case SUBTRACAO:
			case ABREPAR:
			case PONTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(455);
					op_unario();
					}
				}

				setState(458);
				parcela_unario();
				}
				break;
			case CADEIA:
			case ENDERECO:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				parcela_nao_unario();
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
	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(SintaticoParser.PONTEIRO, 0); }
		public TerminalNode IDENT() { return getToken(SintaticoParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(SintaticoParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(SintaticoParser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(SintaticoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(SintaticoParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(SintaticoParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(SintaticoParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parcela_unario);
		int _la;
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(462);
					match(PONTEIRO);
					}
				}

				setState(465);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(IDENT);
				setState(467);
				match(ABREPAR);
				setState(468);
				expressao();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(469);
					match(VIRGULA);
					setState(470);
					expressao();
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(476);
				match(FECHAPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				match(ABREPAR);
				setState(481);
				expressao();
				setState(482);
				match(FECHAPAR);
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
	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode ENDERECO() { return getToken(SintaticoParser.ENDERECO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(SintaticoParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parcela_nao_unario);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDERECO:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(ENDERECO);
				setState(487);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(CADEIA);
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
	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			exp_aritmetica();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0) {
				{
				setState(492);
				op_relacional();
				setState(493);
				exp_aritmetica();
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
	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(SintaticoParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(SintaticoParser.DIFERENTE, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(SintaticoParser.MAIORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(SintaticoParser.MENORIGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(SintaticoParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(SintaticoParser.MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0) ) {
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
	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			termo_logico();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(500);
				op_logico_1();
				setState(501);
				termo_logico();
				}
				}
				setState(507);
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
	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			fator_logico();
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(509);
				op_logico_2();
				setState(510);
				fator_logico();
				}
				}
				setState(516);
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
	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode NAO() { return getToken(SintaticoParser.NAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAO) {
				{
				setState(517);
				match(NAO);
				}
			}

			setState(520);
			parcela_logica();
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
	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(SintaticoParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(SintaticoParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parcela_logica);
		int _la;
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSO:
			case VERDADEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				_la = _input.LA(1);
				if ( !(_la==FALSO || _la==VERDADEIRO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
			case CADEIA:
			case SUBTRACAO:
			case ABREPAR:
			case ENDERECO:
			case PONTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				exp_relacional();
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
	public static class Op_logico_1Context extends ParserRuleContext {
		public TerminalNode OU() { return getToken(SintaticoParser.OU, 0); }
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterOp_logico_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitOp_logico_1(this);
		}
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(OU);
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
	public static class Op_logico_2Context extends ParserRuleContext {
		public TerminalNode E() { return getToken(SintaticoParser.E, 0); }
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).enterOp_logico_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticoListener ) ((SintaticoListener)listener).exitOp_logico_2(this);
		}
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(E);
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
		"\u0004\u0001D\u0213\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001f\b\u0001\n\u0001\f\u0001"+
		"i\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002x\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003}\b\u0003\n\u0003\f\u0003\u0080\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u0088\b\u0004\n\u0004\f\u0004\u008b\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0091\b\u0004\n\u0004\f\u0004\u0094"+
		"\t\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u0098\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0003\u0007\u009d\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00a1\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u00a7"+
		"\b\t\n\t\f\t\u00aa\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u00b2\b\n\u0001\n\u0001\n\u0005\n\u00b6\b\n\n\n\f\n\u00b9\t\n"+
		"\u0001\n\u0005\n\u00bc\b\n\n\n\f\n\u00bf\t\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00c6\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00cc"+
		"\b\n\n\n\f\n\u00cf\t\n\u0001\n\u0005\n\u00d2\b\n\n\n\f\n\u00d5\t\n\u0001"+
		"\n\u0001\n\u0003\n\u00d9\b\n\u0001\u000b\u0003\u000b\u00dc\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e1\b\u000b\n\u000b\f\u000b"+
		"\u00e4\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u00ec\b\f\n\f\f\f\u00ef\t\f\u0001\r\u0005\r\u00f2\b\r\n\r\f"+
		"\r\u00f5\t\r\u0001\r\u0005\r\u00f8\b\r\n\r\f\r\u00fb\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0107\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u010c\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0111\b\u000f\u0001\u000f\u0005\u000f\u0114\b\u000f"+
		"\n\u000f\f\u000f\u0117\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0120\b\u0010\n"+
		"\u0010\f\u0010\u0123\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u012b\b\u0011\n\u0011\f\u0011"+
		"\u012e\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0132\b\u0011\n\u0011"+
		"\f\u0011\u0135\t\u0011\u0003\u0011\u0137\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0141\b\u0012\n\u0012\f\u0012\u0144\t\u0012\u0003\u0012\u0146"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0152"+
		"\b\u0013\n\u0013\f\u0013\u0155\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u015d\b\u0014\n\u0014"+
		"\f\u0014\u0160\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0166\b\u0015\n\u0015\f\u0015\u0169\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0003\u0016\u016f\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u017a\b\u0017\n\u0017\f\u0017\u017d\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0005\u0019\u0185\b\u0019\n\u0019\f\u0019\u0188\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u018d\b\u001a\n\u001a\f\u001a\u0190\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0195\b\u001b\n\u001b"+
		"\f\u001b\u0198\t\u001b\u0001\u001c\u0003\u001c\u019b\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u01a0\b\u001c\u0001\u001c\u0003\u001c"+
		"\u01a3\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u01ab\b\u001e\n\u001e\f\u001e\u01ae\t\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01b4\b\u001f\n"+
		"\u001f\f\u001f\u01b7\t\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u01bd"+
		"\b \n \f \u01c0\t \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$"+
		"\u0003$\u01c9\b$\u0001$\u0001$\u0003$\u01cd\b$\u0001%\u0003%\u01d0\b%"+
		"\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u01d8\b%\n%\f%\u01db"+
		"\t%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01e5"+
		"\b%\u0001&\u0001&\u0001&\u0003&\u01ea\b&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u01f0\b\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0005)"+
		"\u01f8\b)\n)\f)\u01fb\t)\u0001*\u0001*\u0001*\u0001*\u0005*\u0201\b*\n"+
		"*\f*\u0204\t*\u0001+\u0003+\u0207\b+\u0001+\u0001+\u0001,\u0001,\u0003"+
		",\u020d\b,\u0001-\u0001-\u0001.\u0001.\u0001.\u0000\u0000/\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\\u0000\u0006\u0003\u0000\u0003\u0004"+
		"\u0012\u0012\u0014\u0014\u0002\u0000$\'**\u0001\u000045\u0001\u000067"+
		"\u0001\u0000.3\u0001\u0000$%\u0228\u0000^\u0001\u0000\u0000\u0000\u0002"+
		"g\u0001\u0000\u0000\u0000\u0004w\u0001\u0000\u0000\u0000\u0006y\u0001"+
		"\u0000\u0000\u0000\b\u0084\u0001\u0000\u0000\u0000\n\u0097\u0001\u0000"+
		"\u0000\u0000\f\u0099\u0001\u0000\u0000\u0000\u000e\u009c\u0001\u0000\u0000"+
		"\u0000\u0010\u00a2\u0001\u0000\u0000\u0000\u0012\u00a4\u0001\u0000\u0000"+
		"\u0000\u0014\u00d8\u0001\u0000\u0000\u0000\u0016\u00db\u0001\u0000\u0000"+
		"\u0000\u0018\u00e8\u0001\u0000\u0000\u0000\u001a\u00f3\u0001\u0000\u0000"+
		"\u0000\u001c\u0106\u0001\u0000\u0000\u0000\u001e\u0108\u0001\u0000\u0000"+
		"\u0000 \u011a\u0001\u0000\u0000\u0000\"\u0126\u0001\u0000\u0000\u0000"+
		"$\u013a\u0001\u0000\u0000\u0000&\u0149\u0001\u0000\u0000\u0000(\u0158"+
		"\u0001\u0000\u0000\u0000*\u0163\u0001\u0000\u0000\u0000,\u016e\u0001\u0000"+
		"\u0000\u0000.\u0174\u0001\u0000\u0000\u00000\u0180\u0001\u0000\u0000\u0000"+
		"2\u0186\u0001\u0000\u0000\u00004\u0189\u0001\u0000\u0000\u00006\u0191"+
		"\u0001\u0000\u0000\u00008\u019a\u0001\u0000\u0000\u0000:\u01a4\u0001\u0000"+
		"\u0000\u0000<\u01a6\u0001\u0000\u0000\u0000>\u01af\u0001\u0000\u0000\u0000"+
		"@\u01b8\u0001\u0000\u0000\u0000B\u01c1\u0001\u0000\u0000\u0000D\u01c3"+
		"\u0001\u0000\u0000\u0000F\u01c5\u0001\u0000\u0000\u0000H\u01cc\u0001\u0000"+
		"\u0000\u0000J\u01e4\u0001\u0000\u0000\u0000L\u01e9\u0001\u0000\u0000\u0000"+
		"N\u01eb\u0001\u0000\u0000\u0000P\u01f1\u0001\u0000\u0000\u0000R\u01f3"+
		"\u0001\u0000\u0000\u0000T\u01fc\u0001\u0000\u0000\u0000V\u0206\u0001\u0000"+
		"\u0000\u0000X\u020c\u0001\u0000\u0000\u0000Z\u020e\u0001\u0000\u0000\u0000"+
		"\\\u0210\u0001\u0000\u0000\u0000^_\u0003\u0002\u0001\u0000_`\u0005\u0002"+
		"\u0000\u0000`a\u0003\u001a\r\u0000ab\u0005\u000f\u0000\u0000b\u0001\u0001"+
		"\u0000\u0000\u0000cf\u0003\u0004\u0002\u0000df\u0003\u0014\n\u0000ec\u0001"+
		"\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0003\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0001\u0000\u0000kx\u0003"+
		"\u0006\u0003\u0000lm\u0005#\u0000\u0000mn\u0005(\u0000\u0000no\u00059"+
		"\u0000\u0000op\u0003\f\u0006\u0000pq\u00053\u0000\u0000qr\u0003\u0010"+
		"\b\u0000rx\u0001\u0000\u0000\u0000st\u0005\u0005\u0000\u0000tu\u0005("+
		"\u0000\u0000uv\u00059\u0000\u0000vx\u0003\u0012\t\u0000wj\u0001\u0000"+
		"\u0000\u0000wl\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000\u0000x\u0005"+
		"\u0001\u0000\u0000\u0000y~\u0003\b\u0004\u0000z{\u0005>\u0000\u0000{}"+
		"\u0003\b\u0004\u0000|z\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u00059\u0000\u0000\u0082\u0083\u0003\n\u0005\u0000\u0083\u0007\u0001"+
		"\u0000\u0000\u0000\u0084\u0089\u0005(\u0000\u0000\u0085\u0086\u0005B\u0000"+
		"\u0000\u0086\u0088\u0005(\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0092\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005<\u0000\u0000\u008d"+
		"\u008e\u0003<\u001e\u0000\u008e\u008f\u0005=\u0000\u0000\u008f\u0091\u0001"+
		"\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0091\u0094\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\t\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0003\u0012\t\u0000\u0096\u0098\u0003\u000e\u0007"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u000b\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0000\u0000"+
		"\u0000\u009a\r\u0001\u0000\u0000\u0000\u009b\u009d\u0005C\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u00a1\u0003\f\u0006\u0000\u009f"+
		"\u00a1\u0005(\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u000f\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0007\u0001\u0000\u0000\u00a3\u0011\u0001\u0000\u0000\u0000\u00a4\u00a8"+
		"\u0005\u001c\u0000\u0000\u00a5\u00a7\u0003\u0006\u0003\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005\u001d\u0000\u0000\u00ac\u0013\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\u001e\u0000\u0000\u00ae\u00af\u0005(\u0000\u0000\u00af\u00b1\u0005"+
		":\u0000\u0000\u00b0\u00b2\u0003\u0018\f\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b7\u0005;\u0000\u0000\u00b4\u00b6\u0003\u0004\u0002"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00bd\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u0003\u001c\u000e\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00d9\u0005\u001f\u0000"+
		"\u0000\u00c1\u00c2\u0005!\u0000\u0000\u00c2\u00c3\u0005(\u0000\u0000\u00c3"+
		"\u00c5\u0005:\u0000\u0000\u00c4\u00c6\u0003\u0018\f\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005;\u0000\u0000\u00c8\u00c9\u0005"+
		"9\u0000\u0000\u00c9\u00cd\u0003\u000e\u0007\u0000\u00ca\u00cc\u0003\u0004"+
		"\u0002\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d3\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d2\u0003\u001c\u000e\u0000\u00d1\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\"\u0000"+
		"\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00ad\u0001\u0000\u0000"+
		"\u0000\u00d8\u00c1\u0001\u0000\u0000\u0000\u00d9\u0015\u0001\u0000\u0000"+
		"\u0000\u00da\u00dc\u0005\u0006\u0000\u0000\u00db\u00da\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e2\u0003\b\u0004\u0000\u00de\u00df\u0005>\u0000\u0000"+
		"\u00df\u00e1\u0003\b\u0004\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u00059\u0000\u0000\u00e6\u00e7"+
		"\u0003\u000e\u0007\u0000\u00e7\u0017\u0001\u0000\u0000\u0000\u00e8\u00ed"+
		"\u0003\u0016\u000b\u0000\u00e9\u00ea\u0005>\u0000\u0000\u00ea\u00ec\u0003"+
		"\u0016\u000b\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u0019\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f2\u0003\u0004\u0002\u0000\u00f1\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003"+
		"\u001c\u000e\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u001b\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fc\u0107\u0003\u001e\u000f\u0000\u00fd\u0107\u0003"+
		" \u0010\u0000\u00fe\u0107\u0003\"\u0011\u0000\u00ff\u0107\u0003$\u0012"+
		"\u0000\u0100\u0107\u0003&\u0013\u0000\u0101\u0107\u0003(\u0014\u0000\u0102"+
		"\u0107\u0003*\u0015\u0000\u0103\u0107\u0003,\u0016\u0000\u0104\u0107\u0003"+
		".\u0017\u0000\u0105\u0107\u00030\u0018\u0000\u0106\u00fc\u0001\u0000\u0000"+
		"\u0000\u0106\u00fd\u0001\u0000\u0000\u0000\u0106\u00fe\u0001\u0000\u0000"+
		"\u0000\u0106\u00ff\u0001\u0000\u0000\u0000\u0106\u0100\u0001\u0000\u0000"+
		"\u0000\u0106\u0101\u0001\u0000\u0000\u0000\u0106\u0102\u0001\u0000\u0000"+
		"\u0000\u0106\u0103\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u001d\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0005\u0007\u0000\u0000\u0109\u010b\u0005:\u0000\u0000"+
		"\u010a\u010c\u0005C\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u0115\u0003\b\u0004\u0000\u010e\u0110\u0005>\u0000\u0000\u010f\u0111"+
		"\u0005C\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0003"+
		"\b\u0004\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0005;\u0000\u0000\u0119\u001f\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0005\b\u0000\u0000\u011b\u011c\u0005:\u0000\u0000"+
		"\u011c\u0121\u0003R)\u0000\u011d\u011e\u0005>\u0000\u0000\u011e\u0120"+
		"\u0003R)\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000"+
		"\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0005;\u0000\u0000\u0125!\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0005\t\u0000\u0000\u0127\u0128\u0003R)\u0000\u0128\u012c"+
		"\u0005\n\u0000\u0000\u0129\u012b\u0003\u001c\u000e\u0000\u012a\u0129\u0001"+
		"\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0136\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0133\u0005"+
		"\u000b\u0000\u0000\u0130\u0132\u0003\u001c\u000e\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0137\u0001"+
		"\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u012f\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0005\f\u0000\u0000\u0139#\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0005\u0015\u0000\u0000\u013b\u013c\u0003<\u001e"+
		"\u0000\u013c\u013d\u0005\u0017\u0000\u0000\u013d\u0145\u00032\u0019\u0000"+
		"\u013e\u0142\u0005\u000b\u0000\u0000\u013f\u0141\u0003\u001c\u000e\u0000"+
		"\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000"+
		"\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000"+
		"\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000"+
		"\u0145\u013e\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0005\u0016\u0000\u0000"+
		"\u0148%\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0018\u0000\u0000\u014a"+
		"\u014b\u0005(\u0000\u0000\u014b\u014c\u0005?\u0000\u0000\u014c\u014d\u0003"+
		"<\u001e\u0000\u014d\u014e\u0005\u001b\u0000\u0000\u014e\u014f\u0003<\u001e"+
		"\u0000\u014f\u0153\u0005\u001a\u0000\u0000\u0150\u0152\u0003\u001c\u000e"+
		"\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0005\u0019\u0000\u0000\u0157\'\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0005\r\u0000\u0000\u0159\u015a\u0003R)\u0000\u015a\u015e"+
		"\u0005\u001a\u0000\u0000\u015b\u015d\u0003\u001c\u000e\u0000\u015c\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161"+
		"\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0005\u000e\u0000\u0000\u0162)\u0001\u0000\u0000\u0000\u0163\u0167\u0005"+
		"\u001a\u0000\u0000\u0164\u0166\u0003\u001c\u000e\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016b\u0005"+
		"\u001b\u0000\u0000\u016b\u016c\u0003R)\u0000\u016c+\u0001\u0000\u0000"+
		"\u0000\u016d\u016f\u0005C\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0003\b\u0004\u0000\u0171\u0172\u0005?\u0000\u0000\u0172"+
		"\u0173\u0003R)\u0000\u0173-\u0001\u0000\u0000\u0000\u0174\u0175\u0005"+
		"(\u0000\u0000\u0175\u0176\u0005:\u0000\u0000\u0176\u017b\u0003R)\u0000"+
		"\u0177\u0178\u0005>\u0000\u0000\u0178\u017a\u0003R)\u0000\u0179\u0177"+
		"\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017e"+
		"\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u0005;\u0000\u0000\u017f/\u0001\u0000\u0000\u0000\u0180\u0181\u0005 "+
		"\u0000\u0000\u0181\u0182\u0003R)\u0000\u01821\u0001\u0000\u0000\u0000"+
		"\u0183\u0185\u00034\u001a\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185"+
		"\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u01873\u0001\u0000\u0000\u0000\u0188\u0186"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u00036\u001b\u0000\u018a\u018e\u0005"+
		"9\u0000\u0000\u018b\u018d\u0003\u001c\u000e\u0000\u018c\u018b\u0001\u0000"+
		"\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f5\u0001\u0000\u0000"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0196\u00038\u001c\u0000"+
		"\u0192\u0193\u0005>\u0000\u0000\u0193\u0195\u00038\u001c\u0000\u0194\u0192"+
		"\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u01977\u0001"+
		"\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019b\u0003"+
		":\u001d\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u01a2\u0005&\u0000"+
		"\u0000\u019d\u019f\u0005A\u0000\u0000\u019e\u01a0\u0003:\u001d\u0000\u019f"+
		"\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3\u0005&\u0000\u0000\u01a2\u019d"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a39\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u00055\u0000\u0000\u01a5;\u0001\u0000\u0000"+
		"\u0000\u01a6\u01ac\u0003>\u001f\u0000\u01a7\u01a8\u0003B!\u0000\u01a8"+
		"\u01a9\u0003>\u001f\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a7"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad=\u0001"+
		"\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b5\u0003"+
		"@ \u0000\u01b0\u01b1\u0003D\"\u0000\u01b1\u01b2\u0003@ \u0000\u01b2\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b4\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b6?\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b8\u01be\u0003H$\u0000\u01b9\u01ba\u0003F#\u0000"+
		"\u01ba\u01bb\u0003H$\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bfA\u0001"+
		"\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c2\u0007"+
		"\u0002\u0000\u0000\u01c2C\u0001\u0000\u0000\u0000\u01c3\u01c4\u0007\u0003"+
		"\u0000\u0000\u01c4E\u0001\u0000\u0000\u0000\u01c5\u01c6\u00058\u0000\u0000"+
		"\u01c6G\u0001\u0000\u0000\u0000\u01c7\u01c9\u0003:\u001d\u0000\u01c8\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cd\u0003J%\u0000\u01cb\u01cd\u0003L"+
		"&\u0000\u01cc\u01c8\u0001\u0000\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cdI\u0001\u0000\u0000\u0000\u01ce\u01d0\u0005C\u0000\u0000\u01cf"+
		"\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d1\u01e5\u0003\b\u0004\u0000\u01d2\u01d3"+
		"\u0005(\u0000\u0000\u01d3\u01d4\u0005:\u0000\u0000\u01d4\u01d9\u0003R"+
		")\u0000\u01d5\u01d6\u0005>\u0000\u0000\u01d6\u01d8\u0003R)\u0000\u01d7"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da"+
		"\u01dc\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc"+
		"\u01dd\u0005;\u0000\u0000\u01dd\u01e5\u0001\u0000\u0000\u0000\u01de\u01e5"+
		"\u0005&\u0000\u0000\u01df\u01e5\u0005\'\u0000\u0000\u01e0\u01e1\u0005"+
		":\u0000\u0000\u01e1\u01e2\u0003R)\u0000\u01e2\u01e3\u0005;\u0000\u0000"+
		"\u01e3\u01e5\u0001\u0000\u0000\u0000\u01e4\u01cf\u0001\u0000\u0000\u0000"+
		"\u01e4\u01d2\u0001\u0000\u0000\u0000\u01e4\u01de\u0001\u0000\u0000\u0000"+
		"\u01e4\u01df\u0001\u0000\u0000\u0000\u01e4\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e5K\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005@\u0000\u0000\u01e7\u01ea"+
		"\u0003\b\u0004\u0000\u01e8\u01ea\u0005*\u0000\u0000\u01e9\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01eaM\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ef\u0003<\u001e\u0000\u01ec\u01ed\u0003P(\u0000"+
		"\u01ed\u01ee\u0003<\u001e\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0"+
		"O\u0001\u0000\u0000\u0000\u01f1\u01f2\u0007\u0004\u0000\u0000\u01f2Q\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f9\u0003T*\u0000\u01f4\u01f5\u0003Z-\u0000"+
		"\u01f5\u01f6\u0003T*\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01faS\u0001"+
		"\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u0202\u0003"+
		"V+\u0000\u01fd\u01fe\u0003\\.\u0000\u01fe\u01ff\u0003V+\u0000\u01ff\u0201"+
		"\u0001\u0000\u0000\u0000\u0200\u01fd\u0001\u0000\u0000\u0000\u0201\u0204"+
		"\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0203"+
		"\u0001\u0000\u0000\u0000\u0203U\u0001\u0000\u0000\u0000\u0204\u0202\u0001"+
		"\u0000\u0000\u0000\u0205\u0207\u0005\u0013\u0000\u0000\u0206\u0205\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0208\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0003X,\u0000\u0209W\u0001\u0000\u0000"+
		"\u0000\u020a\u020d\u0007\u0005\u0000\u0000\u020b\u020d\u0003N\'\u0000"+
		"\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000"+
		"\u020dY\u0001\u0000\u0000\u0000\u020e\u020f\u0005\u0011\u0000\u0000\u020f"+
		"[\u0001\u0000\u0000\u0000\u0210\u0211\u0005\u0010\u0000\u0000\u0211]\u0001"+
		"\u0000\u0000\u00009egw~\u0089\u0092\u0097\u009c\u00a0\u00a8\u00b1\u00b7"+
		"\u00bd\u00c5\u00cd\u00d3\u00d8\u00db\u00e2\u00ed\u00f3\u00f9\u0106\u010b"+
		"\u0110\u0115\u0121\u012c\u0133\u0136\u0142\u0145\u0153\u015e\u0167\u016e"+
		"\u017b\u0186\u018e\u0196\u019a\u019f\u01a2\u01ac\u01b5\u01be\u01c8\u01cc"+
		"\u01cf\u01d9\u01e4\u01e9\u01ef\u01f9\u0202\u0206\u020c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}