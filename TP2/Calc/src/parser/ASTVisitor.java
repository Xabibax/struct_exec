package parser;

import ast.*;
import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends CalcBaseVisitor {

    public AST visitLiteral(CalcParser.LiteralContext ctx) {
        return new Literal(Integer.parseInt(ctx.getText()));
    }
    public AST visitVarId(CalcParser.VarIdContext ctx) {
        return new VarId(ctx.getText());
    }
    public AST visitMinusBinary(CalcParser.MinusBinaryContext ctx) {
        return new BinaryExpression(
                Op.MINUS,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1))
        );
    }
    public AST visitUnary(CalcParser.UnaryContext ctx) {
        return new UnaryExpression((Expression) visit(ctx.expression()));
    }

    public AST visitBinary(CalcParser.BinaryContext ctx) {
        return new BinaryExpression(
                Op.cons(ctx.getText()),
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
            ));
    }
    public AST visitConditionnal(CalcParser.ConditionnalContext ctx) {
        return new ConditionnalExpression(
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)),
                (Expression) visit(ctx.expression(2))
            );
    }


    public AST visitBody(CalcParser.BodyContext ctx) {
        // retrieve ASTs for definitions
        List<CalcParser.VarDefContext> varDefCtxs = ctx.varDef();
        List<VarDef> varDefs = new ArrayList<>();
        for (CalcParser.VarDefContext varDefCtx : varDefCtxs)
            varDefs.add((VarDef)visit(varDefCtx));
        // retrieve AST for expression
        Expression expr = (Expression)visit(ctx.expression());
        // return AST for program
        return new Body(varDefs, expr);
    }
    //*/
}
