package ast;

import eval.State;

import java.io.IOException;

public abstract class Expression extends AST{
    public abstract int eval(State<Expression> state) throws IOException;

}
