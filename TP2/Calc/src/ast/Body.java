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
        return "Body : VarDef" + this.tabVarDef + " Expression" + this.exp;
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
        String start = "#include <stdio.h>\n" +
                "int main(int argc, char *argv[]) {\n" +
                "  return printf(\"%i\\n\", ";
        String end = ");\n" +
                "}";
        String tExp = "";
        for (int i = 0; i < tabVarDef.size() ; i++) {
            tExp += tabVarDef.get(i);
        }
        tExp += this.exp;
        String gen = start + tExp + end;
        return gen;
    }
}
