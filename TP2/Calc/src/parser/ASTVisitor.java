package parser;

import ast.*;

public class ASTVisitor extends CalcBaseVisitor {

    public AST visitIntegerLiteral(CalcParser.IntegerLiteralContext ctx) {
        return new IntegerLiteral(Integer.parseInt(ctx.getText()));
    }
    public AST visitBooleanLiteral(CalcParser.BooleanLiteralContext ctx) {
        return new IntegerLiteral(Integer.parseInt(ctx.getText()));
    }
    public AST visitParenthesisExp(CalcParser.ParenthesisExpContext ctx) {
        return new ParenthesisExp((Expression) visit(ctx.expression()));
    }

    public AST visitUnaryOrMinus(CalcParser.UnaryOrMinusContext ctx) {
        return new UnaryExpression((Expression) visit(ctx.expression()));
    }

    public AST visitDivideBinary(CalcParser.DivideBinaryContext ctx) {
        return new BinaryExpression(
                Op.DIVIDE,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
                ));
    }
    public AST visitTimesBinary(CalcParser.TimesBinaryContext ctx) {
        return new BinaryExpression(
                Op.TIMES,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
                ));
    }
    public AST visitMinusBinary(CalcParser.MinusBinaryContext ctx) {
        Expression exp1 = (Expression) visit(ctx.expression(0));
        return new BinaryExpression(
                Op.MINUS,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
                ));
    }
    public AST visitPlusBinary(CalcParser.PlusBinaryContext ctx) {
        return new BinaryExpression(
                Op.PLUS,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
                ));
    }
    public AST visitLessBinary(CalcParser.LessBinaryContext ctx) {
        return new BinaryExpression(
                Op.LESS,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
                ));
    }
    public AST visitLessEqualBinary(CalcParser.LessEqualBinaryContext ctx) {
        return new BinaryExpression(
                Op.LESSEQUAL,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
                ));
    }
    public AST visitMoreBinary(CalcParser.MoreBinaryContext ctx) {
        return new BinaryExpression(
                Op.MORE,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
                ));
    }
    public AST visitMoreEqualBinary(CalcParser.MoreEqualBinaryContext ctx) {
        return new BinaryExpression(
                Op.MOREEQUAL,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
                ));
    }
    public AST visitAndBinary(CalcParser.AndBinaryContext ctx) {
        return new BinaryExpression(
                Op.AND,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
                ));
    }
    public AST visitOrBinary(CalcParser.OrBinaryContext ctx) {
        return new BinaryExpression(
                Op.OR,
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
    public AST visitEqualBinary(CalcParser.EqualBinaryContext ctx) {
        return new BinaryExpression(
                Op.EQUAL,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
                ));
    }
    public AST visitNotEqualBinary(CalcParser.NotEqualBinaryContext ctx) {
        return new BinaryExpression(
                Op.EQUAL,
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1)
                ));
    }


/*
    public AST visitVariableId(CalcParser.VariableIdContext ctx) {
        return new VarId(ctx.IDENTIFIER().getText());
    }

    public AST visitVarDef(CalcParser.VarDefContext ctx) {
        return new VarDef(
                (VarId) visit(ctx.variableId()),
                (Expression) visit(ctx.expression())
        );
    }

    public AST visitBody(CalcParser.BodyContext ctx) {
        // retrieve ASTs for definitions
        List<CalcParser.VarDefContext> varDefCtxs = ctx.varDef();
        List<VarDef> varDefs = new ArrayList<>();
        for (CalcParser.VarDefContext varDefCtx : varDefCtxs)
            varDefs.add((VarDef)visit(varDefCtx));
        // retrieve AST for expression
        Expression expr;
        if (ctx.expression() == null) {
            ErrorFlag.setFlag();
            return null;
        } else {
            expr = (Expression) visit(ctx.expression());
        }
        // return AST for program
        return new Body(varDefs, expr);
    }

    public AST visitProgram(CalcParser.ProgramContext ctx) {
        Body body = (Body) visit(ctx.body());

        return new Program(funcDefs, body);

    }
    //*/
}
