// Generated from D:/IMT/A1/UV-Langage_de_programmation/struct_exec/TP2/Calc/src/parser\Calc.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CalcParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(CalcParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryOrMinus}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOrMinus(CalcParser.UnaryOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisExp}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExp(CalcParser.ParenthesisExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Conditionnal}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionnal(CalcParser.ConditionnalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(CalcParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessBinary(CalcParser.LessBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualBinary(CalcParser.NotEqualBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimesBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesBinary(CalcParser.TimesBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqualBinary(CalcParser.LessEqualBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreBinary(CalcParser.MoreBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusBinary(CalcParser.MinusBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndBinary(CalcParser.AndBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivideBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideBinary(CalcParser.DivideBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualBinary(CalcParser.EqualBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusBinary(CalcParser.PlusBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrBinary(CalcParser.OrBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreEqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreEqualBinary(CalcParser.MoreEqualBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(CalcParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#variableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableId(CalcParser.VariableIdContext ctx);
}