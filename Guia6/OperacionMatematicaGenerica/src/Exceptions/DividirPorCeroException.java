package Exceptions;

public class DividirPorCeroException extends Exception {
    public DividirPorCeroException() {
        super("No se puede dividir por cero");
    }
}
