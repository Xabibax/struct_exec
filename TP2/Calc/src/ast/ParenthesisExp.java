package ast;

import eval.State;

import java.io.IOException;

public class ParenthesisExp extends Expression {

    private Expression exp;

    public ParenthesisExp(Expression exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return exp.toString();
    }

    public int eval(State<Expression> state) throws IOException {
        return this.exp.eval(state);
    }
}
