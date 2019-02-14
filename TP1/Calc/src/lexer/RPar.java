package lexer;

public class RPar implements Token {

    private String parentthese;

    RPar(String parentthese) {
        this.parentthese = parentthese;
    }

    @Override
    public String toString() {
        return "RPAR : " + this.parentthese;
    }
}
