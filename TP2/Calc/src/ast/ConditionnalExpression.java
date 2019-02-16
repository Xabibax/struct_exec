package ast;

import eval.State;

import java.io.IOException;

public class ConditionnalExpression extends Expression {
    private Expression condition;
    private Expression ifTrue;
    private Expression ifFalse;

    @Override
    public Type check() throws IOException {
        if (this.ifTrue.check() == this.ifFalse.check()) {
            return this.ifTrue.check();
        } else {
            throw new IOException("Les résultats de l'expression conditionnelle n'ont pas le même type");
        }
    }

    public ConditionnalExpression(Expression condition, Expression ifTrue, Expression ifFalse) throws IOException {
        if (condition.check() != Type.BOOL) {
            throw new IOException("La condition de l'expresion conditionnelle n'est pas un booleen.");
        } else if (ifTrue.check() != ifFalse.check()) {
            throw new IOException("Les résultats de l'expression conditionnelle n'ont pas le même type.");
        }
        this.condition = condition;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }


    @Override
    public String toString() {
        return "( if " + this.condition + " " + this.ifTrue + " " + this.ifFalse + " )";
    }

    @Override
    public String gen() {
        return this.condition + "?" + this.ifTrue + ":" + this.ifFalse;
    }

    @Override
    public int eval(State<Expression> state) throws IOException {
        if (this.condition == null || this.ifFalse == null || this.ifTrue == null) {
            throw new IOException("Exception : L'expression est vide");
        }
        return this.condition.eval(state) != 0 ? this.ifTrue.eval(state) : this.ifFalse.eval(state);
    }
}
