package ast;

import eval.State;

public class BooleanLiteral extends Expression {

    private boolean val;

    public BooleanLiteral(boolean val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return this.val
            ?"true"
            :"false"
        ;
    }

    @Override
    public String gen() {
        return val
            ?"1"
            :"0"
        ;
    }

    @Override
    public int eval(State<Expression> state) {
        return this.val
            ?1
            :0
        ;
    }
}
