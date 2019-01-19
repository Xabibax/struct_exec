package parser;

import eval.State;
import lexer.Token;

public class Literal implements Expression {

    private lexer.Literal val;

    public Literal(lexer.Literal val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val.toString();
    }

    @Override
    public int eval(State<Expression> state) {
        return val.getNumber();
    }
}
