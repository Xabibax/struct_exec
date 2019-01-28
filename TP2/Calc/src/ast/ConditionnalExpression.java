package ast;

import eval.State;

import java.io.IOException;

public class ConditionnalExpression implements Expression {
    private Expression condition;
    private Expression ifTrue;
    private  Expression ifFalse;

    public ConditionnalExpression(Expression condition, Expression ifTrue, Expression ifFalse) {
        this.condition = condition;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }


    @Override
    public String toString() {
        return "( if " + this.condition + " " + this.ifTrue + " " + this.ifFalse + " )";
    }

    @Override
    public int eval(State<Expression> state) throws IOException {
        return this.condition.eval(state) != 0 ? this.ifTrue.eval(state) : this.ifFalse.eval(state);
    }
}
