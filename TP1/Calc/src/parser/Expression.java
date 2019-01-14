package parser;

import lexer.*;

import javax.swing.plaf.SliderUI;
import java.io.IOException;

public interface Expression extends AST {
    public static Expression parse(Token t) throws IOException, UnexpectedCharacter {
        if (t instanceof lexer.Literal) {
            return new Literal(((lexer.Literal) t).getNumber());
        } else if (t instanceof lexer.LPar) {
            t = SLexer.getToken();
            if ( t instanceof lexer.Op ) {
                Op operateur = (lexer.Op) t;

                t = SLexer.getToken();
                Expression exp1 = Expression.parse(t);

                t = SLexer.getToken();

                if ( operateur == lexer.Op.MINUS) {
                    if (t instanceof lexer.RPar) {
                        return new UnaryExpression(exp1);
                    }
                }

                Expression exp2 = Expression.parse(t);

                t = SLexer.getToken();
                if (! ( t instanceof RPar )) {
                    throw new IOException();
                }
                return new BinaryExpression(operateur, exp1, exp2);

            } else if ( t instanceof lexer.If) {
                t = SLexer.getToken();

                if ( ! ( t instanceof lexer.LPar)) {
                    throw new IOException();
                }

                Expression exp1 = Expression.parse(t);

                t = SLexer.getToken();
                Expression exp2 = Expression.parse(t);

                t = SLexer.getToken();
                Expression exp3 = Expression.parse(t);

                t = SLexer.getToken();
                if ( ! ( t instanceof lexer.RPar)) {
                    throw new IOException();
                }

                return new ConditionnalExpression(exp1, exp2, exp3);
            }
        } else if ( t instanceof EOF) {
            return null;
        } else {
            throw new RuntimeException();
        }
        return null;
    }

}
