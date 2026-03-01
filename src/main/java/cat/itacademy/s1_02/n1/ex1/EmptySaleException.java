package cat.itacademy.s1_02.n1.ex1;

public class EmptySaleException extends RuntimeException {
    public EmptySaleException() {
        super("To make a sale you must add products first");
    }
}