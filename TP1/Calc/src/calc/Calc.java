package calc;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import parser.CalcLexer;
import parser.CalcParser;
import parser.ErrorListener;
import parser.ReportingCalcLexer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Calc {
    // static boolean verbose = false;

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        // if (args.length>1 && args[1].equals("-v")) verbose = true;
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        ReportingCalcLexer lexer = new ReportingCalcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));
        // ASTVisitor visitor = new ASTVisitor();
        // AST ast = visitor.visit(tree);
        // System.out.println(ast);
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
            throw e;
        }
    }
}
