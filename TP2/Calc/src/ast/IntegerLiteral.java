package ast;

import eval.State;

public class IntegerLiteral extends Expression {

    private int val;

    public IntegerLiteral(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }

    @Override
    public String gen() {
        return String.valueOf(this.val);
    }

    @Override
    public int eval(State<Expression> state) {
        return this.val;
    }

    @Override
    public Type check() {
        return Type.INT;
    }
}
