package parser;

import eval.State;
import lexer.*;

import javax.swing.plaf.SliderUI;
import java.io.IOException;

public interface Expression extends AST {
    int eval(State<Expression> state) throws IOException;

    static Expression parse(Token t) throws IOException, UnexpectedCharacter {
        if (t instanceof lexer.Literal) {
            return new Literal(((lexer.Literal) t));
        } else if (t instanceof lexer.Identifier) {
            return new VarId((lexer.Identifier) t);
        } else if (t instanceof lexer.LPar) {
            t = SLexer.getToken();
            return Expression.parseCompositeExpressionTail(t);
        } else if ( t instanceof EOF) {
            return null;
        } else {
            throw new RuntimeException("Exception (t = " + t.toString() + ") : t n'est pas un Token valide pour une expression");
        }
    }
    static Expression parseCompositeExpressionTail(Token t) throws IOException, UnexpectedCharacter {
        if (t instanceof lexer.Op) {
            Op operateur = new Op((lexer.Op) t);

            t = SLexer.getToken();
            Expression exp1 = Expression.parse(t);

            t = SLexer.getToken();

            if (operateur.getOperateur() == lexer.Op.MINUS) {
                if (t instanceof lexer.RPar) {
                    return new UnaryExpression(exp1);
                }
            }

            Expression exp2 = Expression.parse(t);

            t = SLexer.getToken();
            if (!(t instanceof RPar)) {
                throw new IOException("Exception (t = " + t.toString() + ") : Pas de parenthèse fermante");
            }
            return new BinaryExpression(operateur, exp1, exp2);

        } else if (t instanceof lexer.If) {

            t = SLexer.getToken();
            Expression exp1 = Expression.parse(t);

            t = SLexer.getToken();
            Expression exp2 = Expression.parse(t);

            t = SLexer.getToken();
            Expression exp3 = Expression.parse(t);

            t = SLexer.getToken();
            if (!(t instanceof lexer.RPar)) {
                throw new IOException("Exception (t = " + t + " : Pas de parenthèse fermante pour un If");
            }

            return new ConditionnalExpression(exp1, exp2, exp3);
        } else {
            throw new RuntimeException("Exception (t = " + t.toString() + ") : t n'est pas un Token valide pour une expressionComposite");
        }
    }
}
