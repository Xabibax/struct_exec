package ast;

import eval.State;

import java.io.IOException;

public class BinaryExpression extends Expression {
    private Op operateur;
    private Expression exp1;
    private Expression exp2;

    public BinaryExpression(Op operateur, Expression exp1, Expression exp2) {
        this.operateur = operateur;
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public String toString() {
        return "( " + this.operateur + " " + this.exp1 + " " + this.exp2 + " )";
    }

    @Override
    public String gen() {
        return this.exp1 + this.operateur.toString() + this.exp2;
    }

    @Override
    public int eval(State<Expression> state) throws IOException {
        if ((this.exp1 == null ) || (this.exp2 == null)) {
            throw new IOException("Exception il manque une expression.");
        }
        if (this.check() == Type.BOOL) {
            switch (this.operateur) {
                case EQUAL:
                    return exp1.eval(state) == exp2.eval(state) ? 1 : 0;
                case NOTEQUAL:
                    return exp1.eval(state) != exp2.eval(state) ? 1 : 0;
                default:
                    throw new IOException("Exception : opérateur inconnue");
            }
        } else {
            switch (this.operateur) {
                case TIMES:
                    return exp1.eval(state) * exp2.eval(state);
                case DIVIDE:
                    return exp1.eval(state) / exp2.eval(state);
                case PLUS:
                    return exp1.eval(state) + exp2.eval(state);
                case MINUS:
                    return exp1.eval(state) - exp2.eval(state);
                case LESS:
                    return exp1.eval(state) < exp2.eval(state) ? 1 : 0;
                case MORE:
                    return exp1.eval(state) > exp2.eval(state) ? 1 : 0;
                case LESSEQUAL:
                    return exp1.eval(state) <= exp2.eval(state) ? 1 : 0;
                case MOREEQUAL:
                    return exp1.eval(state) >= exp2.eval(state) ? 1 : 0;
                case EQUAL:
                    return exp1.eval(state) == exp2.eval(state) ? 1 : 0;
                case NOTEQUAL:
                    return exp1.eval(state) != exp2.eval(state) ? 1 : 0;
                case AND:
                    return ((exp1.eval(state) >= 1) && (exp2.eval(state)) >= 1) ? 1 : 0;
                case OR:
                    return ((exp1.eval(state) >= 1) || (exp2.eval(state)) >= 1) ? 1 : 0;
                default:
                    throw new IOException("Exception : opérateur inconnue");
            }
        }
    }

    @Override
    public Type check() throws IOException {
        if (this.exp1.check() == this.exp2.check()) {
            return this.exp2.check();
        } else {
            throw new IOException("L'expression binaire ne peut pas être résolue car les deux expressions n'ont pas le même type.");
        }
    }

}
