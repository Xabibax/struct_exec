package ast;

import eval.State;

import java.io.IOException;

public class ConditionnalExpression extends Expression {
    private Expression condition;
    private Expression ifTrue;
    private Expression ifFalse;

    @Override
    public Type check(State<Expression> state) throws IOException {
        if (this.ifTrue.check(state) == this.ifFalse.check(state)) {
            return this.ifTrue.check(state);
        } else {
            throw new IOException("Les résultats de l'expression conditionnelle n'ont pas le même type");
        }
    }

    public ConditionnalExpression(Expression condition, Expression ifTrue, Expression ifFalse) {
        this.condition = condition;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }


    @Override
    public String toString() {
        return "( " + this.condition + " ? " + this.ifTrue + " : " + this.ifFalse + " )";
    }

    @Override
    public String gen() {
        return this.condition.gen() + "?" + this.ifTrue.gen() + ":" + this.ifFalse.gen();
    }

    @Override
    public int eval(State<Expression> state) throws IOException {
        if (this.condition == null || this.ifFalse == null || this.ifTrue == null) {
            throw new IOException("Exception : L'expression est vide");
        }
        if (condition.check(state) != Type.BOOL) {
            throw new IOException("La condition de l'expresion conditionnelle n'est pas un booleen.");
        } else if (ifTrue.check(state) != ifFalse.check(state)) {
            throw new IOException("Les résultats de l'expression conditionnelle n'ont pas le même type.");
        }
        return this.condition.eval(state) == 1 ? this.ifTrue.eval(state) : this.ifFalse.eval(state);
    }
}
