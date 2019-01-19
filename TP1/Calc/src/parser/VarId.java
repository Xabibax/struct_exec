package parser;

import eval.State;
import lexer.Identifier;

public class VarId implements Expression {
    private lexer.Identifier name;

    public VarId(Identifier name) {
        this.name = name;
    }

    public Identifier getName() {
        return name;
    }

    @Override
    public String toString() {
        return "VARID : " + name.getName();
    }

    @Override
    public int eval(State<Expression> state) {
        return state.lookup(this.name.getName()).eval(state);
    }
}
