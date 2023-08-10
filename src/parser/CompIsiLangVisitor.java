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
	

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompIsiLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompIsiLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(CompIsiLangParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(CompIsiLangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(CompIsiLangParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(CompIsiLangParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#lista_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_var(CompIsiLangParser.Lista_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(CompIsiLangParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(CompIsiLangParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#cmdRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRead(CompIsiLangParser.CmdReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#cmdWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWrite(CompIsiLangParser.CmdWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#cmdAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAttr(CompIsiLangParser.CmdAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CompIsiLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(CompIsiLangParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#exprl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprl(CompIsiLangParser.ExprlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompIsiLangParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CompIsiLangParser.NumberContext ctx);
}