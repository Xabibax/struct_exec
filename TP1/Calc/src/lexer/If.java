package lexer;

public class If implements Token {

    private String symboleIf;

    If(String symboleIf) {
        this.symboleIf = symboleIf;
    }

    @Override
    public String toString() {
        return "IF : " + this.symboleIf;
    }
}
