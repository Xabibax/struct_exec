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
            throw new IOException("Exception (t + " + t.toString() + ") : t n'est pas une parenthèse ouvrante");
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
                    throw new IOException("Exception (t = " + t.toString() + ") : t n'est pas un une parenthèse fermante");
                }
            } else {
                throw new IOException("Exception (t = " + t.toString() + ") : t n'est pas un Identifier");
            }
        } else {
            throw new IOException("Exception (t = " + t.toString() + ") : t n'est pas un Defvar");
        }
    }
    public void eval(State<Expression> state) {
        state.bind(this.id.getName(), this.exp);
    }
}
