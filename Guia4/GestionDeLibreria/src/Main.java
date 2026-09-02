import Modal.Inventario;
import Modal.Libro;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Algo","Alguien",12.21,1992);
        Libro libro2 = new Libro("Algo2","Alguien2",21.11,1995);
        Inventario inventario = new Inventario();
        inventario.agregarLibro(libro1);
        inventario.agregarLibro(libro2);
        String libros = inventario.mostrarLibros();
        System.out.println(libros);
        }
}
