package parser;

import lexer.Op;
import lexer.SLexer;
import lexer.Token;
import lexer.UnexpectedCharacter;

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
        if (t instanceof lexer.LPar) {
            t = SLexer.getToken();

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
                        throw new IOException();
                    }
                } else {
                    throw new IOException();
                }
            } else {
                throw new IOException();
            }
        } else {
            throw new IOException();
        }
    }
}
