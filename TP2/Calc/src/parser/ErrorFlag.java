package parser;

public class ErrorFlag {
    private static boolean flagRise = false;

    public static void reset() {
        flagRise = false;
    }
    public static void setFlag() {
        flagRise = true;
    }
    public static boolean getFlag() {
        return flagRise;
    }
}
