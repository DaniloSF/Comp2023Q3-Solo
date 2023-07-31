// Generated from C:/Users/Danilo/Documents/UFABC/Compiladores/Comp2023Q3\CompLang.g4 by ANTLR 4.12.0
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
 * by {@link TypeExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypeExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TypeExpressionParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(TypeExpressionParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(TypeExpressionParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#lista_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_var(TypeExpressionParser.Lista_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(TypeExpressionParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#cmdIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(TypeExpressionParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#cmdRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRead(TypeExpressionParser.CmdReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#cmdWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWrite(TypeExpressionParser.CmdWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#cmdAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAttr(TypeExpressionParser.CmdAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TypeExpressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(TypeExpressionParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeExpressionParser#exprl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprl(TypeExpressionParser.ExprlContext ctx);
}