package lexer;

public class LPar implements Token {

    private String parenthese;

    LPar(String parenthese) {
        this.parenthese = parenthese;
    }

    @Override
    public String toString() {
        return "LPAR : " + this.parenthese;
    }
}
