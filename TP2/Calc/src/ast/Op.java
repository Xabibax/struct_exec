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
                return NOTEQUAL;
            case ("<="):
                return LESSEQUAL;
            case (">"):
                return MORE;
            case (">="):
                return MOREEQUAL;
            case ("&&"):
                return AND;
            case ("||"):
                return OR;
            case ("<"): default:
                return LESS;

        }
    }
    @Override
    public String toString() {
        switch (this) {
            case MINUS:
                return "-";
            case PLUS:
                return "+";
            case TIMES:
                return ("*");
            case DIVIDE:
                return ("/");
            case EQUAL:
                return ("==");
            case NOTEQUAL:
                return ("!=");
            case LESS:
                return ("<");
            case LESSEQUAL:
                return ("<=");
            case MORE:
                return (">");
            case MOREEQUAL:
                return (">=");
            case AND:
                return ("AND");
            case OR:
            default:
                return ("OR");
        }
    }
}
