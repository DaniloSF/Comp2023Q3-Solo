// Generated from C:/Users/Danilo/Documents/UFABC/Compiladores/Comp2023Q3-Solo\CompIsiLang.g4 by ANTLR 4.12.0
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CompIsiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8394528L) != 0) );
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
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterLista_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitLista_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitLista_var(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterCmdAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitCmdAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitCmdAttr(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitCmdIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitCmdIf(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(CompIsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(CompIsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(CompIsiLangParser.FP, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitCmdRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitCmdRead(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(CompIsiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(CompIsiLangParser.FP, 0); }
		public TerminalNode ID() { return getToken(CompIsiLangParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(CompIsiLangParser.TEXT, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitCmdWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitCmdWrite(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitCmdWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitCmdWhile(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterCmdFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitCmdFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitCmdFor(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitExprl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitExprl(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterTermol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitTermol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitTermol(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitLogicExpr(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CompIsiLangParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(CompIsiLangParser.REAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
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
		"\u0004\u0001\u001e\u00a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0004\u0000)\b\u0000\u000b\u0000\f\u0000"+
		"*\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u00027\b\u0002"+
		"\u000b\u0002\f\u00028\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004@\b\u0004\n\u0004\f\u0004C\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"K\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007^\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005"+
		"\f\u0082\b\f\n\f\f\f\u0085\t\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u008c\b\u000e\n\u000e\f\u000e\u008f\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u009a\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000"+
		"\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$\u0000\u0005\u0001\u0000\u0003\u0004\u0002\u0000"+
		"\u0010\u0010\u0017\u0017\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0015"+
		"\u0001\u0000\u000e\u000f\u009b\u0000&\u0001\u0000\u0000\u0000\u0002/\u0001"+
		"\u0000\u0000\u0000\u00046\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000"+
		"\u0000\b<\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fL\u0001"+
		"\u0000\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010_\u0001\u0000\u0000"+
		"\u0000\u0012d\u0001\u0000\u0000\u0000\u0014i\u0001\u0000\u0000\u0000\u0016"+
		"r\u0001\u0000\u0000\u0000\u0018\u007f\u0001\u0000\u0000\u0000\u001a\u0086"+
		"\u0001\u0000\u0000\u0000\u001c\u0089\u0001\u0000\u0000\u0000\u001e\u0090"+
		"\u0001\u0000\u0000\u0000 \u0099\u0001\u0000\u0000\u0000\"\u009b\u0001"+
		"\u0000\u0000\u0000$\u009f\u0001\u0000\u0000\u0000&(\u0005\u0001\u0000"+
		"\u0000\')\u0003\u0002\u0001\u0000(\'\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,-\u0003\u0004\u0002\u0000-.\u0005\u0002\u0000\u0000"+
		".\u0001\u0001\u0000\u0000\u0000/0\u0003\u0006\u0003\u000001\u0003\b\u0004"+
		"\u000012\u0005\u0019\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0003"+
		"\n\u0005\u000045\u0005\u0019\u0000\u000057\u0001\u0000\u0000\u000063\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009\u0005\u0001\u0000\u0000\u0000:;\u0007\u0000"+
		"\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<A\u0005\u0017\u0000\u0000"+
		"=>\u0005\u0018\u0000\u0000>@\u0005\u0017\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000B\t\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DK\u0003"+
		"\f\u0006\u0000EK\u0003\u000e\u0007\u0000FK\u0003\u0010\b\u0000GK\u0003"+
		"\u0012\t\u0000HK\u0003\u0014\n\u0000IK\u0003\u0016\u000b\u0000JD\u0001"+
		"\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000"+
		"JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000K\u000b\u0001\u0000\u0000\u0000LM\u0005\u0017\u0000\u0000MN\u0005"+
		"\u0011\u0000\u0000NO\u0003\u0018\f\u0000O\r\u0001\u0000\u0000\u0000PQ"+
		"\u0005\u0005\u0000\u0000QR\u0005\u001a\u0000\u0000RS\u0003\"\u0011\u0000"+
		"ST\u0005\u001b\u0000\u0000TU\u0005\u0006\u0000\u0000UV\u0005\u001c\u0000"+
		"\u0000VW\u0003\u0004\u0002\u0000W]\u0005\u001d\u0000\u0000XY\u0005\u0007"+
		"\u0000\u0000YZ\u0005\u001c\u0000\u0000Z[\u0003\u0004\u0002\u0000[\\\u0005"+
		"\u001d\u0000\u0000\\^\u0001\u0000\u0000\u0000]X\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0005\b\u0000"+
		"\u0000`a\u0005\u001a\u0000\u0000ab\u0005\u0017\u0000\u0000bc\u0005\u001b"+
		"\u0000\u0000c\u0011\u0001\u0000\u0000\u0000de\u0005\t\u0000\u0000ef\u0005"+
		"\u001a\u0000\u0000fg\u0007\u0001\u0000\u0000gh\u0005\u001b\u0000\u0000"+
		"h\u0013\u0001\u0000\u0000\u0000ij\u0005\n\u0000\u0000jk\u0005\u001a\u0000"+
		"\u0000kl\u0003\"\u0011\u0000lm\u0005\u001b\u0000\u0000mn\u0005\u000b\u0000"+
		"\u0000no\u0005\u001c\u0000\u0000op\u0003\u0004\u0002\u0000pq\u0005\u001d"+
		"\u0000\u0000q\u0015\u0001\u0000\u0000\u0000rs\u0005\f\u0000\u0000st\u0005"+
		"\u001a\u0000\u0000tu\u0005\u0017\u0000\u0000uv\u0005\u0011\u0000\u0000"+
		"vw\u0003\u0018\f\u0000wx\u0005\r\u0000\u0000xy\u0003\u0018\f\u0000yz\u0005"+
		"\u001b\u0000\u0000z{\u0005\u000b\u0000\u0000{|\u0005\u001c\u0000\u0000"+
		"|}\u0003\u0004\u0002\u0000}~\u0005\u001d\u0000\u0000~\u0017\u0001\u0000"+
		"\u0000\u0000\u007f\u0083\u0003\u001c\u000e\u0000\u0080\u0082\u0003\u001a"+
		"\r\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0019\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0007\u0002\u0000\u0000\u0087\u0088\u0003\u001c\u000e"+
		"\u0000\u0088\u001b\u0001\u0000\u0000\u0000\u0089\u008d\u0003 \u0010\u0000"+
		"\u008a\u008c\u0003\u001e\u000f\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u001d\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0007\u0003\u0000\u0000"+
		"\u0091\u0092\u0003 \u0010\u0000\u0092\u001f\u0001\u0000\u0000\u0000\u0093"+
		"\u009a\u0003$\u0012\u0000\u0094\u009a\u0005\u0017\u0000\u0000\u0095\u0096"+
		"\u0005\u001a\u0000\u0000\u0096\u0097\u0003\u0018\f\u0000\u0097\u0098\u0005"+
		"\u001b\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0093\u0001"+
		"\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0095\u0001"+
		"\u0000\u0000\u0000\u009a!\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u0018"+
		"\f\u0000\u009c\u009d\u0005\u0016\u0000\u0000\u009d\u009e\u0003\u0018\f"+
		"\u0000\u009e#\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0004\u0000\u0000"+
		"\u00a0%\u0001\u0000\u0000\u0000\b*8AJ]\u0083\u008d\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}