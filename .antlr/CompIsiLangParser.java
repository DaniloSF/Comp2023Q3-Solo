// Generated from c:\Users\Danilo\Documents\UFABC\Compiladores\Comp2023Q3-Solo\CompIsiLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompIsiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, REAL=14, INTEGER=15, TEXT=16, ATTR=17, 
		SUM=18, SUB=19, MUL=20, DIV=21, OPREL=22, ID=23, VIRG=24, PF=25, AP=26, 
		FP=27, AC=28, FC=29, BLANK=30;
	public static final int
		RULE_programa = 0, RULE_decl = 1, RULE_block = 2, RULE_tipo = 3, RULE_lista_var = 4, 
		RULE_cmd = 5, RULE_cmdAttr = 6, RULE_cmdIf = 7, RULE_cmdRead = 8, RULE_cmdWrite = 9, 
		RULE_cmdWhile = 10, RULE_cmdFor = 11, RULE_expr = 12, RULE_exprl = 13, 
		RULE_termo = 14, RULE_termol = 15, RULE_fator = 16, RULE_logicExpr = 17, 
		RULE_number = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "decl", "block", "tipo", "lista_var", "cmd", "cmdAttr", "cmdIf", 
			"cmdRead", "cmdWrite", "cmdWhile", "cmdFor", "expr", "exprl", "termo", 
			"termol", "fator", "logicExpr", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'INTEGER'", "'REAL'", "'se'", "'entao'", 
			"'senao'", "'leia'", "'escreva'", "'enquanto'", "'faca'", "'para'", "'ate'", 
			null, null, null, "':='", "'+'", "'-'", "'*'", "'/'", null, null, "','", 
			"'.'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "REAL", "INTEGER", "TEXT", "ATTR", "SUM", "SUB", "MUL", "DIV", 
			"OPREL", "ID", "VIRG", "PF", "AP", "FP", "AC", "FC", "BLANK"
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
	public String getGrammarFileName() { return "CompIsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompIsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				decl();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
			setState(44);
			block();
			setState(45);
			match(T__1);
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

	public static class DeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Lista_varContext lista_var() {
			return getRuleContext(Lista_varContext.class,0);
		}
		public TerminalNode PF() { return getToken(CompIsiLangParser.PF, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			tipo();
			setState(48);
			lista_var();
			setState(49);
			match(PF);
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

	public static class BlockContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> PF() { return getTokens(CompIsiLangParser.PF); }
		public TerminalNode PF(int i) {
			return getToken(CompIsiLangParser.PF, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				cmd();
				setState(52);
				match(PF);
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << ID))) != 0) );
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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

	public static class Lista_varContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CompIsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CompIsiLangParser.ID, i);
		}
		public List<TerminalNode> VIRG() { return getTokens(CompIsiLangParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(CompIsiLangParser.VIRG, i);
		}
		public Lista_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_var; }
	}

	public final Lista_varContext lista_var() throws RecognitionException {
		Lista_varContext _localctx = new Lista_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lista_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(61);
				match(VIRG);
				setState(62);
				match(ID);
				}
				}
				setState(67);
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

	public static class CmdContext extends ParserRuleContext {
		public CmdAttrContext cmdAttr() {
			return getRuleContext(CmdAttrContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdForContext cmdFor() {
			return getRuleContext(CmdForContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				cmdAttr();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				cmdIf();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				cmdRead();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				cmdWrite();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				cmdWhile();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				cmdFor();
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

	public static class CmdAttrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompIsiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(CompIsiLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAttr; }
	}

	public final CmdAttrContext cmdAttr() throws RecognitionException {
		CmdAttrContext _localctx = new CmdAttrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(ATTR);
			setState(78);
			expr();
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

	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(CompIsiLangParser.AP, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(CompIsiLangParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(CompIsiLangParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(CompIsiLangParser.AC, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> FC() { return getTokens(CompIsiLangParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(CompIsiLangParser.FC, i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__4);
			setState(81);
			match(AP);
			setState(82);
			logicExpr();
			setState(83);
			match(FP);
			setState(84);
			match(T__5);
			setState(85);
			match(AC);
			setState(86);
			block();
			setState(87);
			match(FC);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(88);
				match(T__6);
				setState(89);
				match(AC);
				setState(90);
				block();
				setState(91);
				match(FC);
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

	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(CompIsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(CompIsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(CompIsiLangParser.FP, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__7);
			setState(96);
			match(AP);
			setState(97);
			match(ID);
			setState(98);
			match(FP);
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

	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(CompIsiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(CompIsiLangParser.FP, 0); }
		public TerminalNode ID() { return getToken(CompIsiLangParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(CompIsiLangParser.TEXT, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdWrite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__8);
			setState(101);
			match(AP);
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(103);
			match(FP);
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

	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(CompIsiLangParser.AP, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(CompIsiLangParser.FP, 0); }
		public TerminalNode AC() { return getToken(CompIsiLangParser.AC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FC() { return getToken(CompIsiLangParser.FC, 0); }
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__9);
			setState(106);
			match(AP);
			setState(107);
			logicExpr();
			setState(108);
			match(FP);
			setState(109);
			match(T__10);
			setState(110);
			match(AC);
			setState(111);
			block();
			setState(112);
			match(FC);
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

	public static class CmdForContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(CompIsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(CompIsiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(CompIsiLangParser.ATTR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FP() { return getToken(CompIsiLangParser.FP, 0); }
		public TerminalNode AC() { return getToken(CompIsiLangParser.AC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FC() { return getToken(CompIsiLangParser.FC, 0); }
		public CmdForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFor; }
	}

	public final CmdForContext cmdFor() throws RecognitionException {
		CmdForContext _localctx = new CmdForContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__11);
			setState(115);
			match(AP);
			setState(116);
			match(ID);
			setState(117);
			match(ATTR);
			setState(118);
			expr();
			setState(119);
			match(T__12);
			setState(120);
			expr();
			setState(121);
			match(FP);
			setState(122);
			match(T__10);
			setState(123);
			match(AC);
			setState(124);
			block();
			setState(125);
			match(FC);
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

	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<ExprlContext> exprl() {
			return getRuleContexts(ExprlContext.class);
		}
		public ExprlContext exprl(int i) {
			return getRuleContext(ExprlContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			termo();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==SUB) {
				{
				{
				setState(128);
				exprl();
				}
				}
				setState(133);
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

	public static class ExprlContext extends ParserRuleContext {
		public Token op;
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode SUM() { return getToken(CompIsiLangParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(CompIsiLangParser.SUB, 0); }
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((ExprlContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SUM || _la==SUB) ) {
				((ExprlContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			termo();
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

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public List<TermolContext> termol() {
			return getRuleContexts(TermolContext.class);
		}
		public TermolContext termol(int i) {
			return getRuleContext(TermolContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			fator();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(138);
				termol();
				}
				}
				setState(143);
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

	public static class TermolContext extends ParserRuleContext {
		public Token op;
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TerminalNode MUL() { return getToken(CompIsiLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CompIsiLangParser.DIV, 0); }
		public TermolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termol; }
	}

	public final TermolContext termol() throws RecognitionException {
		TermolContext _localctx = new TermolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((TermolContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
				((TermolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(145);
			fator();
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

	public static class FatorContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompIsiLangParser.ID, 0); }
		public TerminalNode AP() { return getToken(CompIsiLangParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(CompIsiLangParser.FP, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fator);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(ID);
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(AP);
				setState(150);
				expr();
				setState(151);
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

	public static class LogicExprContext extends ParserRuleContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(CompIsiLangParser.OPREL, 0); }
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			expr();
			setState(156);
			((LogicExprContext)_localctx).op = match(OPREL);
			setState(157);
			expr();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CompIsiLangParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(CompIsiLangParser.REAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==REAL || _la==INTEGER) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\6\2+\n\2\r\2\16\2,\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\6\49\n\4\r\4\16\4:\3\5\3\5\3\6\3\6\3\6\7\6B\n\6\f\6"+
		"\16\6E\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16\u0084\n"+
		"\16\f\16\16\16\u0087\13\16\3\17\3\17\3\17\3\20\3\20\7\20\u008e\n\20\f"+
		"\20\16\20\u0091\13\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u009c\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&\2\7\3\2\5\6\4\2\22\22\31\31\3\2\24\25\3\2\26"+
		"\27\3\2\20\21\2\u009d\2(\3\2\2\2\4\61\3\2\2\2\68\3\2\2\2\b<\3\2\2\2\n"+
		">\3\2\2\2\fL\3\2\2\2\16N\3\2\2\2\20R\3\2\2\2\22a\3\2\2\2\24f\3\2\2\2\26"+
		"k\3\2\2\2\30t\3\2\2\2\32\u0081\3\2\2\2\34\u0088\3\2\2\2\36\u008b\3\2\2"+
		"\2 \u0092\3\2\2\2\"\u009b\3\2\2\2$\u009d\3\2\2\2&\u00a1\3\2\2\2(*\7\3"+
		"\2\2)+\5\4\3\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\5\6"+
		"\4\2/\60\7\4\2\2\60\3\3\2\2\2\61\62\5\b\5\2\62\63\5\n\6\2\63\64\7\33\2"+
		"\2\64\5\3\2\2\2\65\66\5\f\7\2\66\67\7\33\2\2\679\3\2\2\28\65\3\2\2\29"+
		":\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\7\3\2\2\2<=\t\2\2\2=\t\3\2\2\2>C\7\31\2"+
		"\2?@\7\32\2\2@B\7\31\2\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\13\3"+
		"\2\2\2EC\3\2\2\2FM\5\16\b\2GM\5\20\t\2HM\5\22\n\2IM\5\24\13\2JM\5\26\f"+
		"\2KM\5\30\r\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2"+
		"\2\2M\r\3\2\2\2NO\7\31\2\2OP\7\23\2\2PQ\5\32\16\2Q\17\3\2\2\2RS\7\7\2"+
		"\2ST\7\34\2\2TU\5$\23\2UV\7\35\2\2VW\7\b\2\2WX\7\36\2\2XY\5\6\4\2Y_\7"+
		"\37\2\2Z[\7\t\2\2[\\\7\36\2\2\\]\5\6\4\2]^\7\37\2\2^`\3\2\2\2_Z\3\2\2"+
		"\2_`\3\2\2\2`\21\3\2\2\2ab\7\n\2\2bc\7\34\2\2cd\7\31\2\2de\7\35\2\2e\23"+
		"\3\2\2\2fg\7\13\2\2gh\7\34\2\2hi\t\3\2\2ij\7\35\2\2j\25\3\2\2\2kl\7\f"+
		"\2\2lm\7\34\2\2mn\5$\23\2no\7\35\2\2op\7\r\2\2pq\7\36\2\2qr\5\6\4\2rs"+
		"\7\37\2\2s\27\3\2\2\2tu\7\16\2\2uv\7\34\2\2vw\7\31\2\2wx\7\23\2\2xy\5"+
		"\32\16\2yz\7\17\2\2z{\5\32\16\2{|\7\35\2\2|}\7\r\2\2}~\7\36\2\2~\177\5"+
		"\6\4\2\177\u0080\7\37\2\2\u0080\31\3\2\2\2\u0081\u0085\5\36\20\2\u0082"+
		"\u0084\5\34\17\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\33\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\t\4\2\2\u0089\u008a\5\36\20\2\u008a\35\3\2\2\2\u008b\u008f\5\""+
		"\22\2\u008c\u008e\5 \21\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\37\3\2\2\2\u0091\u008f\3\2\2"+
		"\2\u0092\u0093\t\5\2\2\u0093\u0094\5\"\22\2\u0094!\3\2\2\2\u0095\u009c"+
		"\5&\24\2\u0096\u009c\7\31\2\2\u0097\u0098\7\34\2\2\u0098\u0099\5\32\16"+
		"\2\u0099\u009a\7\35\2\2\u009a\u009c\3\2\2\2\u009b\u0095\3\2\2\2\u009b"+
		"\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009c#\3\2\2\2\u009d\u009e\5\32\16"+
		"\2\u009e\u009f\7\30\2\2\u009f\u00a0\5\32\16\2\u00a0%\3\2\2\2\u00a1\u00a2"+
		"\t\6\2\2\u00a2\'\3\2\2\2\n,:CL_\u0085\u008f\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}