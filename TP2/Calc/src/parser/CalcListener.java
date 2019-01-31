// Generated from D:/IMT/A1/UV-Langage_de_programmation/struct_exec/TP2/Calc/src/parser\Calc.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code UnaryOrMinus}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOrMinus(CalcParser.UnaryOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryOrMinus}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOrMinus(CalcParser.UnaryOrMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExp}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExp(CalcParser.ParenthesisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExp}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExp(CalcParser.ParenthesisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Conditionnal}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionnal(CalcParser.ConditionnalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Conditionnal}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionnal(CalcParser.ConditionnalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(CalcParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(CalcParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessBinary(CalcParser.LessBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessBinary(CalcParser.LessBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualBinary(CalcParser.NotEqualBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualBinary(CalcParser.NotEqualBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimesBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTimesBinary(CalcParser.TimesBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimesBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTimesBinary(CalcParser.TimesBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessEqualBinary(CalcParser.LessEqualBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessEqualBinary(CalcParser.LessEqualBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoreBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMoreBinary(CalcParser.MoreBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoreBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMoreBinary(CalcParser.MoreBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusBinary(CalcParser.MinusBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusBinary(CalcParser.MinusBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndBinary(CalcParser.AndBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndBinary(CalcParser.AndBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideBinary(CalcParser.DivideBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideBinary(CalcParser.DivideBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualBinary(CalcParser.EqualBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualBinary(CalcParser.EqualBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusBinary(CalcParser.PlusBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusBinary(CalcParser.PlusBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrBinary(CalcParser.OrBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrBinary(CalcParser.OrBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoreEqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMoreEqualBinary(CalcParser.MoreEqualBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoreEqualBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMoreEqualBinary(CalcParser.MoreEqualBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(CalcParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(CalcParser.IntegerLiteralContext ctx);
}