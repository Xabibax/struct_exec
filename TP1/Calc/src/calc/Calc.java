package calc;

import eval.State;
import lexer.SLexer;
import lexer.Token;
import parser.Body;
import parser.Expression;

import java.awt.font.LayoutPath;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Calc {


    public static void main(String[] args) throws Exception {
        List<Token> tokens;
        String inputFile;
        InputStream is = System.in;
        if ( args.length>0 ) {
            inputFile = args[0];
            is = new FileInputStream(inputFile);
        }

        try {
            SLexer.init(is);
            Token t = SLexer.getToken();
            while ( ! ( t instanceof lexer.EOF)) {
                System.out.println( Expression.parse(t));
                t = SLexer.getToken();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static int interpret(FileInputStream is) throws Exception {
        try {
            SLexer.init(is);
            Token t = SLexer.getToken();
            Body body = Body.parse(t);
            System.out.println(body);
            t = SLexer.getToken();
            if (! (t instanceof lexer.EOF)) {
                throw new IOException("Exception (t = " + t.toString() + ") : Le parser n'a pas parcouru tout le fichier");
            }
            return body.eval(new State<>());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
