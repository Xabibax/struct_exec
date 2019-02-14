package parser;

public class Op {

    private lexer.Op operateur;

    public Op(lexer.Op operateur) {
        this.operateur = operateur;
    }

    @Override
    public String toString() {
        return String.valueOf(this.operateur);
    }

    public lexer.Op getOperateur() {
        return operateur;
    }
}