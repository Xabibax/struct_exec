package lexer;

public class LPar implements Token {

    private String parentthese;

    LPar(String parentthese) {
        this.parentthese = parentthese;
    }

    @Override
    public String toString() {
        return "LPAR : " + this.parentthese;
    }
}
