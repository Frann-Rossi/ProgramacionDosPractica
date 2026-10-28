package Exceptions;

public class LibroNoDisponibleException extends BibliotecaException {
    public LibroNoDisponibleException() {
        super("El libro no esta disponible");
    }
}
