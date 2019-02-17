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
        return "( " +  this.exp1 + " " + this.operateur.toString() + " " + this.exp2 + " )";
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
        if ((this.exp1.check() == Type.BOOL)
         && (this.exp2.check() == Type.BOOL)) {
            switch (this.operateur) {
                case EQUAL:
                    return exp1.eval(state) == exp2.eval(state) ? 1 : 0;
                case NOTEQUAL:
                    return exp1.eval(state) != exp2.eval(state) ? 1 : 0;
                case AND:
                    return (exp1.eval(state) == 1 && exp2.eval(state) == 1) ? 1 : 0;
                case OR:
                    return (exp1.eval(state) == 1 || exp2.eval(state) == 1) ? 1 : 0;
                case TIMES:
                case DIVIDE:
                case PLUS:
                case MINUS:
                case LESS:
                case MORE:
                case LESSEQUAL:
                case MOREEQUAL:
                    throw new IOException("Exception : l'opérateur " + this.operateur + " n'est pas un opérateur valide pour l'évaluation des booléens.");
                default:
                    throw new IOException("Exception : opérateur inconnue");
            }
        } else if ((this.exp1.check() == Type.INT)
                && (this.exp2.check() == Type.INT)) {
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
        } else {
            throw new IOException("Exception : les deux expressions, de l'expresseion binaire, ne sont pas du même type.");
        }
    }

    @Override
    public Type check() throws IOException {
        if (this.exp1.check() == this.exp2.check()) {
            if (this.exp1.check() == Type.BOOL) {
                switch (this.operateur) {
                    case EQUAL:
                    case NOTEQUAL:
                    case AND:
                    case OR:
                        return Type.BOOL;
                    case TIMES:
                    case DIVIDE:
                    case PLUS:
                    case MINUS:
                    case LESS:
                    case MORE:
                    case LESSEQUAL:
                    case MOREEQUAL:
                        throw new IOException("Exception : l'opérateur " + this.operateur + " n'est pas un opérateur valide pour des booléens.");
                    default:
                        throw new IOException("Exception : opérateur inconnue");
                }
            } else if (this.exp1.check() == Type.INT){
                switch (this.operateur) {
                    case TIMES:
                    case DIVIDE:
                    case PLUS:
                    case MINUS:
                        return Type.INT;
                    case LESS:
                    case MORE:
                    case LESSEQUAL:
                    case MOREEQUAL:
                    case EQUAL:
                    case NOTEQUAL:
                    case AND:
                    case OR:
                        return Type.BOOL;
                    default:
                        throw new IOException("Exception : opérateur inconnue");
                }
            } else {
                throw new IOException("Exception : les deux expressions, de l'expresseion binaire, ne sont pas du même type.");
            }
        } else {
            throw new IOException("Exception : l'expression binaire ne peut pas être résolue car les deux expressions n'ont pas le même type.");
        }
    }

}
