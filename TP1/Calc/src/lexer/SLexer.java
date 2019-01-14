package lexer;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SLexer {
    private static Lexer lexer;

    public static void init(InputStream is) throws IOException {
        lexer = new Lexer(is);
    }
    public static Token getToken() throws IOException, UnexpectedCharacter {
        try {
            return  lexer.getToken();
        } catch ( IOException e) {
            throw e;
        } catch ( UnexpectedCharacter uc) {
            throw uc;
        }
    }
    public static List<Token> slex() throws UnexpectedCharacter, IOException {
        // return the list of tokens recorded in the file
        List<Token> tokens = new ArrayList<>();

        try {
            Token token = lexer.getToken();

            while (! (token instanceof EOF)) {
                tokens.add(token);
                token = getToken();
            }
            tokens.add(token); // this is the EOF token
        } catch (IOException e){
            lexer.in.close(); // close the reader
            throw e; // pass the exception up the stack
        }
        return tokens;
    }
}
