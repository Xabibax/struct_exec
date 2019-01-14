package parser;

import lexer.Token;

public class Literal implements Expression {

    private int val;

    public Literal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }
}
