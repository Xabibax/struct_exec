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
        if(exp == null) {
            throw new IOException("Exception : il n'y a pas d'expression a évaluer");
        }
        return this.exp.eval(state);
    }

    @Override
    public String gen() {
        String gen = "";
        for (int i = 0; i < tabVarDef.size() ; i++) {
            gen += tabVarDef.get(i);
        }
        gen += this.exp;
        return gen;
    }
}
