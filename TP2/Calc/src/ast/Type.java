package ast;

public enum Type {
    INT, BOOL;

    @Override
    public String toString() {
        switch (this) {
            case INT:
                return "Integer";
            case BOOL: default:
                return ("Boolean");
        }
    }

}
