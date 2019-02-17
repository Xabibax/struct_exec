package parser;

import ast.*;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends CalcBaseVisitor {

    @Override
    public AST visitIntegerLiteral(CalcParser.IntegerLiteralContext ctx) {
        return new IntegerLiteral(Integer.parseInt(ctx.getText()));
    }

    @Override
    public AST visitBooleanLiteral(CalcParser.BooleanLiteralContext ctx) {
        return new BooleanLiteral(ctx.getText().equals("true"));
    }

    @Override
    public AST visitParenthesisExp(CalcParser.ParenthesisExpContext ctx) {
        return new ParenthesisExp((Expression) visit(ctx.expression()));
    }

    @Override
    public AST visitUnaryOrMinus(CalcParser.UnaryOrMinusContext ctx) {
        return new UnaryExpression((Expression) visit(ctx.expression()));
    }

    @Override
    public Object visitTernary(CalcParser.TernaryContext ctx) {
        if (ctx.expression().size() != 3) {
            return defaultResult();
        }
        return new ConditionnalExpression(
            (Expression) visit(ctx.expression(0)),
            (Expression) visit(ctx.expression(1)),
            (Expression) visit(ctx.expression(2))
        );
    }

    @Override
    public Object visitMultBinary(CalcParser.MultBinaryContext ctx) {
        return new BinaryExpression(
            Op.cons(ctx.operatorMult().getText()),
            (Expression) visit(ctx.expression(0)),
            (Expression) visit(ctx.expression(1))
        );
    }

    @Override
    public Object visitAndBinary(CalcParser.AndBinaryContext ctx) {
        return new BinaryExpression(
                Op.cons(ctx.operatorAnd().getText()),
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1))
        );
    }

    @Override
    public Object visitRelBinary(CalcParser.RelBinaryContext ctx) {
        return new BinaryExpression(
                Op.cons(ctx.operatorRel().getText()),
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1))
        );
    }

    @Override
    public Object visitEqualBinary(CalcParser.EqualBinaryContext ctx) {
        return new BinaryExpression(
                Op.cons(ctx.operatorEqual().getText()),
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1))
        );
    }

    @Override
    public Object visitOrBinary(CalcParser.OrBinaryContext ctx) {
        return new BinaryExpression(
                Op.cons(ctx.operatorOr().getText()),
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1))
        );
    }

    @Override
    public Object visitAddBinary(CalcParser.AddBinaryContext ctx) {
        return new BinaryExpression(
                Op.cons(ctx.operatorAdd().getText()),
                (Expression) visit(ctx.expression(0)),
                (Expression) visit(ctx.expression(1))
        );
    }

    @Override
    public AST visitVariableId(CalcParser.VariableIdContext ctx) {
        return new VarId(ctx.IDENTIFIER().getText());
    }

    @Override
    public AST visitVarDef(CalcParser.VarDefContext ctx) {
        return new VarDef(
            (VarId) visit(ctx.variableId()),
            (Expression) visit(ctx.expression())
        );
    }

    @Override
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
/*
    public AST visitProgram(CalcParser.ProgramContext ctx) {
        Body body = (Body) visit(ctx.body());

        return new Program(funcDefs, body);

    }
    //*/
}
