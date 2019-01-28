package ast;

import java.io.IOException;

public enum Op {
    MINUS, PLUS, TIMES, DIVIDE, EQUAL, LESS;

    public static Op cons(String op) {
        switch (op) {
            case ("-"):
                return MINUS;
            case ("+"):
                return PLUS;
            case ("*"):
                return TIMES;
            case ("/"):
                return DIVIDE;
            case ("=="):
                return EQUAL;
            case ("<"): default:
                return LESS;
        }
    }
    @Override
    public String toString() {
        return "OP : " + super.toString();
    }
}
