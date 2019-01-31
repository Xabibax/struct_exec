package calc;

import ast.AST;
import ast.Body;
import ast.Expression;
import eval.State;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import parser.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.server.ExportException;

public class Calc {
    // static boolean verbose = false;

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        // if (args.length>1 && args[1].equals("-v")) verbose = true;
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);

    }

    public static int interpret(FileInputStream is) throws IOException {
        try {
            ANTLRInputStream input = new ANTLRInputStream(is);
            CalcLexer lexer = new CalcLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // remplacement du gestionnaire par défaut : //
            CalcParser parser = new CalcParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new ErrorListener());
            // remplacement du gestionnaire par défaut : //

            ParseTree tree = parser.body();
            System.out.println("ANTLR Syntas tree: " + tree.toStringTree(parser));

            ASTVisitor visitor = new ASTVisitor();
            AST ast = (AST) visitor.visit(tree);
            System.out.println(ast);

            if (ErrorFlag.getFlag()) {
                throw new IOException("Exception : Une erreur a été levée.");
            }

            Body body = (Body) ast;

            return body.eval(new State<>());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
