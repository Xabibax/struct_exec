package ast;

import java.io.IOException;

public enum Op {
    MINUS, PLUS, TIMES, DIVIDE, EQUAL, LESS, NOTEQUAL, LESSEQUAL, MORE, MOREEQUAL, AND, OR;

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
            case ("!="):
                return EQUAL;
            case ("<="):
                return EQUAL;
            case (">"):
                return EQUAL;
            case (">="):
                return EQUAL;
            case ("AND"):
                return EQUAL;
            case ("OR"):
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
