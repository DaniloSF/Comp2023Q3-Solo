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
	

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompIsiLangParser}.
 */
public interface CompIsiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CompIsiLangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CompIsiLangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CompIsiLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CompIsiLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(CompIsiLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(CompIsiLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(CompIsiLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(CompIsiLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void enterLista_var(CompIsiLangParser.Lista_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void exitLista_var(CompIsiLangParser.Lista_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(CompIsiLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(CompIsiLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(CompIsiLangParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(CompIsiLangParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(CompIsiLangParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(CompIsiLangParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(CompIsiLangParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(CompIsiLangParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#cmdAttr}.
	 * @param ctx the parse tree
	 */
	void enterCmdAttr(CompIsiLangParser.CmdAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#cmdAttr}.
	 * @param ctx the parse tree
	 */
	void exitCmdAttr(CompIsiLangParser.CmdAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CompIsiLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CompIsiLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(CompIsiLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(CompIsiLangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(CompIsiLangParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(CompIsiLangParser.ExprlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompIsiLangParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CompIsiLangParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompIsiLangParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CompIsiLangParser.NumberContext ctx);
}