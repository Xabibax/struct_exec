package lexer;

public enum Op implements Token {
    PLUS, MINUS, TIMES, DIVIDE, EQUAL, LESS;

    @Override
    public String toString() {
        return "OP : " + super.toString();
    }
}
