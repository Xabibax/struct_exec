package ast;

import eval.State;

import java.io.IOException;
import java.util.List;

public class Body extends AST{
    private List<VarDef> tabVarDef;
    private Expression exp;

    public Body(List<VarDef> tabVarDef, Expression exp) {
        this.tabVarDef = tabVarDef;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "BODY : " + this.tabVarDef + this.exp;
    }

    public int eval(State<Expression> state) throws IOException{
        for (int i = 0; i < tabVarDef.size(); i++) {
            tabVarDef.get(i).eval(state);
        }
        return this.exp.eval(state);
    }
}
