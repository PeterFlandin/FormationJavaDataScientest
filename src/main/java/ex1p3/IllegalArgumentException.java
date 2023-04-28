package ex1p3;

public class IllegalArgumentException extends Exception {

    String message;

    public IllegalArgumentException (String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "IllegalArgumentException " + ": " + message;
    }
}
