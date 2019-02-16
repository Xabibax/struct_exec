package ast;

import eval.State;

import java.io.IOException;

public class VarId extends Expression {
    private String name;

    public VarId(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "VARID : " + this.name;
    }

    @Override
    public String gen() {
        return this.name;
    }

    @Override
    public int eval(State<Expression> state) throws IOException {
        return state.lookup(this.name).eval(state);
    }

    @Override
    public Type check() {
        return null;
    }
}
