package lexer;

public class Identifier implements Token {

    private String name;

    Identifier(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IDENTIFIER : " + this.name;
    }

    public String getName() {
        return name;
    }
}
