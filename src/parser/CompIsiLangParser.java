// Generated from C:/Users/Danilo/Documents/UFABC/Compiladores/Comp2023Q3\CompIsiLang.g4 by ANTLR 4.12.0
package parser;

	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	

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
		NUMBER=10, TEXT=11, ATTR=12, SUM=13, SUB=14, OPREL=15, ID=16, VIRG=17, 
		PF=18, AP=19, FP=20, AC=21, FC=22, BLANK=23;
	public static final int
		RULE_programa = 0, RULE_decl = 1, RULE_bloco = 2, RULE_tipo = 3, RULE_lista_var = 4, 
		RULE_cmd = 5, RULE_cmdIf = 6, RULE_cmdRead = 7, RULE_cmdWrite = 8, RULE_cmdAttr = 9, 
		RULE_expr = 10, RULE_termo = 11, RULE_exprl = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "decl", "bloco", "tipo", "lista_var", "cmd", "cmdIf", "cmdRead", 
			"cmdWrite", "cmdAttr", "expr", "termo", "exprl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'INTEGER'", "'REAL'", "'se'", "'entao'", 
			"'senao'", "'leia'", "'escreva'", null, null, "':='", "'+'", "'-'", null, 
			null, "','", "'.'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"TEXT", "ATTR", "SUM", "SUB", "OPREL", "ID", "VIRG", "PF", "AP", "FP", 
			"AC", "FC", "BLANK"
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


		private SymbolTable symbolTable = new SymbolTable();
		private DataType currentType;
		private AbstractExpression expression;
		private char operator;
		private DataType leftDT;
		private DataType rightDT;
		private String   idAtribuido;
		private String   text;
		private Program  program = new Program();
		private Stack<List<AbstractCommand>> stack = new Stack<List<AbstractCommand>>();
		
		public void init(){
			program.setSymbolTable(symbolTable);
			stack.push(new ArrayList<AbstractCommand>());
		}
			
		public void exibirID(){
			symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
		}
		
		public void generateObjectCode(){
			program.generateTarget();
		}
		
		public void runInterpreter(){
			program.run();
		}

	public CompIsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
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
			setState(26);
			match(T__0);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				decl();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
			setState(32);
			bloco();
			setState(33);
			match(T__1);

			        program.setComandos(stack.pop());
			    
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
			setState(36);
			tipo();
			setState(37);
			lista_var();
			setState(38);
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
	public static class BlocoContext extends ParserRuleContext {
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
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompIsiLangListener ) ((CompIsiLangListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompIsiLangVisitor ) return ((CompIsiLangVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				cmd();
				setState(41);
				match(PF);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 66336L) != 0) );
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
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(T__2);
				 currentType = DataType.INTEGER; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__3);
				 currentType = DataType.REAL; 
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
			setState(53);
			match(ID);
			 symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
					
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(55);
				match(VIRG);
				setState(56);
				match(ID);
				 symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
							
				}
				}
				setState(62);
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
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				cmdAttr();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				cmdRead();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				cmdWrite();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				cmdIf();
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
	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(CompIsiLangParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(CompIsiLangParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(CompIsiLangParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(CompIsiLangParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(CompIsiLangParser.AC, i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
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
		enterRule(_localctx, 12, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__4);

			            stack.push(new ArrayList<AbstractCommand>());
			            BinaryExpression _relExpr = new BinaryExpression();
			            CmdIf _cmdIf = new CmdIf();
			        
			setState(71);
			match(AP);
			setState(72);
			expr();

			            _relExpr.setLeftSide(expression);
			        
			setState(74);
			match(OPREL);

			            _relExpr.setOperator(_input.LT(-1).getText().charAt(0));
			        
			setState(76);
			expr();

			            _relExpr.setRightSide(expression);
			            _cmdIf.setExpr(_relExpr);

			        
			setState(78);
			match(FP);
			setState(79);
			match(T__5);
			setState(80);
			match(AC);
			setState(81);
			bloco();
			setState(82);
			match(FC);

			            _cmdIf.setListaTrue(stack.pop());
			        
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(84);
				match(T__6);
				setState(85);
				match(AC);

				            stack.push(new ArrayList<AbstractCommand>());
				        
				setState(87);
				bloco();

				            _cmdIf.setListaFalse(stack.pop());

				        
				setState(89);
				match(FC);
				}
			}


			            stack.peek().add(_cmdIf);
			        
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
		enterRule(_localctx, 14, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__7);
			setState(96);
			match(AP);
			setState(97);
			match(ID);

			        Identifier id = symbolTable.get(_input.LT(-1).getText());
			        if (id == null){
			            throw new RuntimeException("Undeclared Variable");
			        }
			        CmdRead _read = new CmdRead(id);
			        stack.peek().add(_read);
			    
			setState(99);
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
		enterRule(_localctx, 16, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__8);
			setState(102);
			match(AP);
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(103);
				match(ID);

					         	Identifier id = symbolTable.get(_input.LT(-1).getText());
					         	if (id == null){
					         		throw new RuntimeException("Undeclared Variable");	         		
					         	}
					         	CmdWrite _write = new CmdWrite(id);
					         	stack.peek().add(_write);
					         
				}
				break;
			case TEXT:
				{
				setState(105);
				match(TEXT);

					         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
					         	stack.peek().add(_write);
					         	
					         
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
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
		enterRule(_localctx, 18, RULE_cmdAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);

			        idAtribuido = _input.LT(-1).getText();
			        if (!symbolTable.exists(_input.LT(-1).getText())){
			            throw new RuntimeException("Semantic ERROR - Undeclared Identifier");
			        }
			        leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
			        rightDT = null;
			    
			setState(113);
			match(ATTR);
			setState(114);
			expr();

			        // logica para atribuir o valor da expressao no identificador
			        Identifier id = symbolTable.get(idAtribuido);
			        id.setValue(expression.eval());
			        symbolTable.add(idAtribuido, id);

			        //System.out.println("EVAL ("+expression+") = "+expression.eval());

			        CmdAttrib _attr = new CmdAttrib(id, expression);
			        stack.peek().add(_attr);
			        expression = null;
			    
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
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			termo();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==SUB) {
				{
				{
				setState(118);
				exprl();
				}
				}
				setState(123);
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
		public TerminalNode NUMBER() { return getToken(CompIsiLangParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(CompIsiLangParser.ID, 0); }
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
		enterRule(_localctx, 22, RULE_termo);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(NUMBER);

				        expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));
				    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(ID);

				        if (!symbolTable.exists(_input.LT(-1).getText())){
				            throw new RuntimeException("Semantic ERROR - Undeclared Identifier: "+_input.LT(-1).getText());
				        }
				        rightDT = symbolTable.get(_input.LT(-1).getText()).getType();
				        if (leftDT != rightDT){
				            throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
				        }

				        Identifier id = symbolTable.get(_input.LT(-1).getText());
				        if (id.getValue() != null){
				            expression = new NumberExpression(id.getValue());
				        }
				        else{
				            throw new RuntimeException("Semantic ERROR - Unassigned variable");
				        }
				    
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
	public static class ExprlContext extends ParserRuleContext {
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
		enterRule(_localctx, 24, RULE_exprl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==SUM || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			    operator = _input.LT(-1).getText().charAt(0);
			    BinaryExpression _exprADD = new BinaryExpression(operator);
			    _exprADD.setLeftSide(expression);

			setState(132);
			termo();

			    _exprADD.setRightSide(expression);
			    expression = _exprADD;

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
		"\u0004\u0001\u0017\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0004\u0000\u001d\b\u0000\u000b"+
		"\u0000\f\u0000\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002,\b\u0002\u000b\u0002\f\u0002-\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004"+
		">\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"D\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\\\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bl\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\nx\b\n\n\n\f\n{\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0081\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000"+
		"\r\u000e\u0085\u0000\u001a\u0001\u0000\u0000\u0000\u0002$\u0001\u0000"+
		"\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000"+
		"\b5\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000\fE\u0001\u0000"+
		"\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000"+
		"\u0012o\u0001\u0000\u0000\u0000\u0014u\u0001\u0000\u0000\u0000\u0016\u0080"+
		"\u0001\u0000\u0000\u0000\u0018\u0082\u0001\u0000\u0000\u0000\u001a\u001c"+
		"\u0005\u0001\u0000\u0000\u001b\u001d\u0003\u0002\u0001\u0000\u001c\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 !\u0003\u0004\u0002\u0000!\"\u0005\u0002\u0000\u0000"+
		"\"#\u0006\u0000\uffff\uffff\u0000#\u0001\u0001\u0000\u0000\u0000$%\u0003"+
		"\u0006\u0003\u0000%&\u0003\b\u0004\u0000&\'\u0005\u0012\u0000\u0000\'"+
		"\u0003\u0001\u0000\u0000\u0000()\u0003\n\u0005\u0000)*\u0005\u0012\u0000"+
		"\u0000*,\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0005"+
		"\u0001\u0000\u0000\u0000/0\u0005\u0003\u0000\u000004\u0006\u0003\uffff"+
		"\uffff\u000012\u0005\u0004\u0000\u000024\u0006\u0003\uffff\uffff\u0000"+
		"3/\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u00004\u0007\u0001\u0000"+
		"\u0000\u000056\u0005\u0010\u0000\u00006<\u0006\u0004\uffff\uffff\u0000"+
		"78\u0005\u0011\u0000\u000089\u0005\u0010\u0000\u00009;\u0006\u0004\uffff"+
		"\uffff\u0000:7\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\t\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000?D\u0003\u0012\t\u0000@D\u0003\u000e\u0007\u0000"+
		"AD\u0003\u0010\b\u0000BD\u0003\f\u0006\u0000C?\u0001\u0000\u0000\u0000"+
		"C@\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000"+
		"\u0000D\u000b\u0001\u0000\u0000\u0000EF\u0005\u0005\u0000\u0000FG\u0006"+
		"\u0006\uffff\uffff\u0000GH\u0005\u0013\u0000\u0000HI\u0003\u0014\n\u0000"+
		"IJ\u0006\u0006\uffff\uffff\u0000JK\u0005\u000f\u0000\u0000KL\u0006\u0006"+
		"\uffff\uffff\u0000LM\u0003\u0014\n\u0000MN\u0006\u0006\uffff\uffff\u0000"+
		"NO\u0005\u0014\u0000\u0000OP\u0005\u0006\u0000\u0000PQ\u0005\u0015\u0000"+
		"\u0000QR\u0003\u0004\u0002\u0000RS\u0005\u0016\u0000\u0000S[\u0006\u0006"+
		"\uffff\uffff\u0000TU\u0005\u0007\u0000\u0000UV\u0005\u0015\u0000\u0000"+
		"VW\u0006\u0006\uffff\uffff\u0000WX\u0003\u0004\u0002\u0000XY\u0006\u0006"+
		"\uffff\uffff\u0000YZ\u0005\u0016\u0000\u0000Z\\\u0001\u0000\u0000\u0000"+
		"[T\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]^\u0006\u0006\uffff\uffff\u0000^\r\u0001\u0000\u0000\u0000_`\u0005"+
		"\b\u0000\u0000`a\u0005\u0013\u0000\u0000ab\u0005\u0010\u0000\u0000bc\u0006"+
		"\u0007\uffff\uffff\u0000cd\u0005\u0014\u0000\u0000d\u000f\u0001\u0000"+
		"\u0000\u0000ef\u0005\t\u0000\u0000fk\u0005\u0013\u0000\u0000gh\u0005\u0010"+
		"\u0000\u0000hl\u0006\b\uffff\uffff\u0000ij\u0005\u000b\u0000\u0000jl\u0006"+
		"\b\uffff\uffff\u0000kg\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mn\u0005\u0014\u0000\u0000n\u0011\u0001\u0000"+
		"\u0000\u0000op\u0005\u0010\u0000\u0000pq\u0006\t\uffff\uffff\u0000qr\u0005"+
		"\f\u0000\u0000rs\u0003\u0014\n\u0000st\u0006\t\uffff\uffff\u0000t\u0013"+
		"\u0001\u0000\u0000\u0000uy\u0003\u0016\u000b\u0000vx\u0003\u0018\f\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z\u0015\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|}\u0005\n\u0000\u0000}\u0081\u0006\u000b\uffff\uffff"+
		"\u0000~\u007f\u0005\u0010\u0000\u0000\u007f\u0081\u0006\u000b\uffff\uffff"+
		"\u0000\u0080|\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081"+
		"\u0017\u0001\u0000\u0000\u0000\u0082\u0083\u0007\u0000\u0000\u0000\u0083"+
		"\u0084\u0006\f\uffff\uffff\u0000\u0084\u0085\u0003\u0016\u000b\u0000\u0085"+
		"\u0086\u0006\f\uffff\uffff\u0000\u0086\u0019\u0001\u0000\u0000\u0000\t"+
		"\u001e-3<C[ky\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}