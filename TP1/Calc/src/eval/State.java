package eval;

import parser.Expression;

import java.io.IOException;
import java.util.HashMap;

@SuppressWarnings("serial")
public class State<E> extends HashMap<String, E> {

    // returns the value of a variable in the state
    public E lookup(String var) throws IOException {
        E exp = get(var);
        if (exp != null) {
            return get(var);
        } else {
            throw new IOException("Exception ( VarID = " + var + ") : Le VarId n'a pas été défini");
        }
    }
    // binds a variable in the state
    public void bind(String var, E value) {
        put(var, value);
    }
}