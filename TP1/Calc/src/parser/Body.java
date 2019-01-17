package parser;

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
        if( t instanceof LPar) {
            t = SLexer.getToken();
            ArrayList<VarDef> tabVarDef = new ArrayList<>();
            Expression exp;

            if ( t instanceof Defvar) {
                while ( t instanceof Defvar) {
                    tabVarDef.add(VarDef.parse(t));
                }
            }
            if ( t instanceof lexer.Op
                    || t instanceof lexer.If
                    || t instanceof lexer.Identifier ) {
                exp = Expression.parse(t);
                return new Body(tabVarDef, exp);
            } else {
                throw new IOException();
            }
        } else if ( t instanceof lexer.Literal) {
            return new Body(new ArrayList<>(), Expression.parse(t));
        }
                else {
            throw new IOException();
        }
    }
}
