package parser;

import eval.State;
import lexer.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Body {
    private ArrayList<VarDef> tabVarDef;
    private Expression exp;

    public Body(ArrayList<VarDef> tabVarDef, Expression exp) {
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
                }
            }
        }
        if (exp == null) {
            exp = Expression.parse(t);
        }
        return new Body(tabVarDef, exp);
    }

    public int eval(State<Expression> state) {
        return this.exp.eval(state);
    }
}
