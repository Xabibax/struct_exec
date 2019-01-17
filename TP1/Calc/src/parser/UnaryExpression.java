package parser;

import lexer.Op;

public class UnaryExpression implements Expression {
    private Expression exp1;

    public UnaryExpression(Expression exp1) {
        this.exp1 = exp1;
    }

    @Override
    public String toString() {
        return "( - " + this.exp1 + " )";
    }

    @Override
    public int eval() {
        return 0;
    }
}
