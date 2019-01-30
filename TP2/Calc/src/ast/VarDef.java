package ast;

import eval.State;

import java.io.IOException;

public class VarDef extends AST{
    private VarId id;
    private Expression exp;


    public VarDef(VarId id, Expression exp) {
        this.id = id;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "VARDEF : ( = " + id + " " + exp + " )";
    }

    public void eval(State<Expression> state) throws IOException {
        if(!state.containsKey(this.id.getName())){
            state.bind(this.id.getName(), this.exp);
        } else {
            throw new IOException("Exception (VarID = " + this.id.getName() + ") : la variable a déjà été défini elle ne peut pas être redéfini");
        }
    }
}
