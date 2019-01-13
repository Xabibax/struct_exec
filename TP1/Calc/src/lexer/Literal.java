package lexer;

public class Literal implements Token {

    private String number;

    Literal(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "LITERAL : " + this.number;
    }
}
