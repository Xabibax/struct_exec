package ast;

import eval.State;

import java.io.IOException;

public class UnaryExpression extends Expression {
    private Expression exp1;

    public UnaryExpression(Expression exp1) {
        this.exp1 = exp1;
    }

    @Override
    public String toString() {
        return "( - " + this.exp1 + " )";
    }

    @Override
    public String gen() {
        return "-" + this.exp1;
    }

    @Override
    public int eval(State<Expression> state) throws IOException {
        return -exp1.eval(state);
    }

    @Override
    public Type check() throws IOException {
        return this.exp1.check();
    }
}
