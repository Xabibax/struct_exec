package parser;

import lexer.Token;

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
}
