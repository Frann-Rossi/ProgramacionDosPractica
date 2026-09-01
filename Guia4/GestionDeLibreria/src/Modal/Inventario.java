package Modal;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Libro> libros;

    public Inventario() {
        this.libros = new ArrayList<>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro)
    {
        libros.remove(libro);
    }
}
