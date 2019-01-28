package ast;

import eval.State;

public class Literal extends Expression {

    private int val;

    public Literal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }

    @Override
    public int eval(State<Expression> state) {
        return this.val;
    }
}
