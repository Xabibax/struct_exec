package parser;

import eval.State;
import lexer.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Body implements AST{
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

    public static Body parse(Token t) throws IOException, UnexpectedCharacter {
        ArrayList<VarDef> tabVarDef = new ArrayList<>();
        Expression exp = null;

        if( t instanceof LPar) {
            while (t instanceof LPar) {
                t = SLexer.getToken();
                if (t instanceof Defvar) {
                    tabVarDef.add(VarDef.parseCompositeVardefTail(t));
                    t = SLexer.getToken();
                } else {
                    exp =Expression.parseCompositeExpressionTail(t);
                    t = SLexer.getToken();
                }
            }
        }
        if (exp == null && !(t instanceof EOF)) {
            exp = Expression.parse(t);
        } else if (exp == null) {
            throw new IOException("Exception (t = " + t.toString() + ") : Il n'y a pas d\"expression à évaluer");
        }
        return new Body(tabVarDef, exp);
    }

    public int eval(State<Expression> state) throws IOException{
        for (int i = 0; i < tabVarDef.size(); i++) {
            tabVarDef.get(i).eval(state);
        }
        return this.exp.eval(state);
    }
}
