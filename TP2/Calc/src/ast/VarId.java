package ast;

import eval.State;
import lexer.Identifier;

import java.io.IOException;

public class VarId implements Expression {
    private lexer.Identifier name;

    public VarId(Identifier name) {
        this.name = name;
    }

    public String getName() {
        return name.getName();
    }

    @Override
    public String toString() {
        return "VARID : " + name.getName();
    }

    @Override
    public int eval(State<Expression> state) throws IOException {
        return state.lookup(this.name.getName()).eval(state);
    }
}
