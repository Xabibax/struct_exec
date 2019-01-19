package parser;

import eval.State;

public class BinaryExpression implements Expression {
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
    public int eval(State<Expression> state) {
        switch (this.operateur.getOperateur()) {
            case MINUS:
                return exp1.eval(state) - exp2.eval(state);
            case PLUS:
                return exp1.eval(state) + exp2.eval(state);
            case TIMES:
                return exp1.eval(state) * exp2.eval(state);
            case DIVIDE:
                return exp1.eval(state) / exp2.eval(state);
            case LESS:
                return exp1.eval(state) < exp2.eval(state) ? 1 : 0;
            case EQUAL: default:
                return exp1.eval(state) == exp2.eval(state) ? 1 : 0;

        }
    }
}
