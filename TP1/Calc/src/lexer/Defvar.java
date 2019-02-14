package lexer;

public class Defvar implements Token {

    private String affect;

    Defvar(String affect) {
        this.affect = affect;
    }

    @Override
    public String toString() {
        return "DEFVAR : " + this.affect ;
    }
}
