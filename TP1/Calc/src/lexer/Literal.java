package lexer;

public class Literal implements Token {

    private String number;

    public Literal(String number) {
        this.number = number;
    }

    public int getNumber() {
        return Integer.parseInt(number);
    }
    @Override
    public String toString() {
        return "LITERAL : " + this.number;
    }
}
