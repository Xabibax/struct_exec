package parser;

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
    public int eval() {
        return 0;
    }
}
