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

    @Override
    public String gen() {
        return "(" + this.exp + ")";
    }

    public int eval(State<Expression> state) throws IOException {
        if (this.exp == null) {
            throw new IOException("Exception : L'expression est vide");
        }
        return this.exp.eval(state);
    }

    @Override
    public Type check(State<Expression> state) throws IOException {
        return this.exp.check(state);
    }
}
