package parser;

public class BinaryExpression implements Expression {
    private Op operateur;
    private Expression exp1;
    private Expression exp2;

    public BinaryExpression(Op operateur, Expression exp1, Expression exp2) {
        this.operateur = operateur;
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public String toString() {
        return "( " + this.operateur + " " + this.exp1 + " " + this.exp2 + " )";
    }
}
