package parser;

import lexer.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends CalcBaseVisitor {

    public AST visitLiteral(CalcParser.LiteralContext ctx) {
        return new Literal(new lexer.Literal(ctx.getText()));
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
