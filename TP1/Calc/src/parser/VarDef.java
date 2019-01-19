package parser;

import eval.State;
import lexer.*;
import lexer.Op;

import java.io.IOException;

public class VarDef {
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

    public static VarDef parse(Token t) throws IOException, UnexpectedCharacter {
        if (t instanceof LPar) {
            return VarDef.parseCompositeVardefTail(t);
        } else {
            System.out.println("Exception (t + " + t.toString() + ") : t n'est pas une parenthèse ouvrante");
            throw new IOException();
        }
    }
    public static VarDef parseCompositeVardefTail(Token t) throws IOException, UnexpectedCharacter {
        if (t instanceof lexer.Defvar) {
            t = SLexer.getToken();

            if (t instanceof lexer.Identifier) {
                VarId varId = new VarId((lexer.Identifier) t);

                t = SLexer.getToken();
                Expression exp = Expression.parse(t);

                t = SLexer.getToken();
                if (t instanceof lexer.RPar) {
                    return new VarDef(varId, exp);
                } else {
                    System.out.println("Exception (t = " + t.toString() + ") : t n'est pas un une parenthèse fermante");
                    throw new IOException();
                }
            } else {
                System.out.println("Exception (t = " + t.toString() + ") : t n'est pas un Identifier");
                throw new IOException();
            }
        } else {
            System.out.println("Exception (t = " + t.toString() + ") : t n'est pas un Defvar");
            throw new IOException();
        }
    }
    public void eval(State<Expression> state) {
        state.bind(this.id.toString(), this.exp);
    }
}
