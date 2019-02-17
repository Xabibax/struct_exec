// Generated from G:/IMT/struct_exec/TP2/Calc/src/parser\Calc.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by the {@code AndBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndBinary(CalcParser.AndBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelBinary(CalcParser.RelBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ternary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary(CalcParser.TernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(CalcParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualBinary(CalcParser.EqualBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrBinary(CalcParser.OrBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarId}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(CalcParser.VarIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultBinary(CalcParser.MultBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddBinary(CalcParser.AddBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(CalcParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#operatorMult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorMult(CalcParser.OperatorMultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#operatorAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAdd(CalcParser.OperatorAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#operatorRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorRel(CalcParser.OperatorRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#operatorEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorEqual(CalcParser.OperatorEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#operatorAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAnd(CalcParser.OperatorAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#operatorOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOr(CalcParser.OperatorOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#variableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableId(CalcParser.VariableIdContext ctx);
}