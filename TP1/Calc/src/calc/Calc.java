package calc;

import lexer.Lexer;
import lexer.SLexer;
import lexer.Token;
import parser.Expression;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class Calc {
    public static void main(String[] args) throws Exception {
        List<Token> tokens;
        String inputFile = null;
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
        }
    }
}
