// Generated from G:/IMT/struct_exec/TP2/Calc/src/parser\Calc.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CalcParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CalcParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(CalcParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(CalcParser.VarDefContext ctx);
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
	 * Enter a parse tree produced by the {@code RelBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelBinary(CalcParser.RelBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelBinary(CalcParser.RelBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ternary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernary(CalcParser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ternary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernary(CalcParser.TernaryContext ctx);
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
	 * Enter a parse tree produced by the {@code VarId}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarId(CalcParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarId}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarId(CalcParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultBinary(CalcParser.MultBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultBinary(CalcParser.MultBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddBinary(CalcParser.AddBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddBinary}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddBinary(CalcParser.AddBinaryContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link CalcParser#operatorMult}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMult(CalcParser.OperatorMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#operatorMult}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMult(CalcParser.OperatorMultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#operatorAdd}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAdd(CalcParser.OperatorAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#operatorAdd}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAdd(CalcParser.OperatorAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#operatorRel}.
	 * @param ctx the parse tree
	 */
	void enterOperatorRel(CalcParser.OperatorRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#operatorRel}.
	 * @param ctx the parse tree
	 */
	void exitOperatorRel(CalcParser.OperatorRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#operatorEqual}.
	 * @param ctx the parse tree
	 */
	void enterOperatorEqual(CalcParser.OperatorEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#operatorEqual}.
	 * @param ctx the parse tree
	 */
	void exitOperatorEqual(CalcParser.OperatorEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#operatorAnd}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAnd(CalcParser.OperatorAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#operatorAnd}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAnd(CalcParser.OperatorAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#operatorOr}.
	 * @param ctx the parse tree
	 */
	void enterOperatorOr(CalcParser.OperatorOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#operatorOr}.
	 * @param ctx the parse tree
	 */
	void exitOperatorOr(CalcParser.OperatorOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#variableId}.
	 * @param ctx the parse tree
	 */
	void enterVariableId(CalcParser.VariableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#variableId}.
	 * @param ctx the parse tree
	 */
	void exitVariableId(CalcParser.VariableIdContext ctx);
}