package lexer;

public class Defun implements Token {

    private String defun;

    Defun(String defun) {
        this.defun = defun;
    }

    @Override
    public String toString() {
        return "DEFUN : " + this.defun;
    }
}
