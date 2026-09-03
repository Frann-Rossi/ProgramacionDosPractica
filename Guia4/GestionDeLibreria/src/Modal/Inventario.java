package Modal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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

    public String mostrarLibros()
    {
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros)
        {
            sb.append(libro).append('\n');
        }
        return sb.toString();
    }

    public int buscarPos(String titulo, String autor)
    {
        Libro libro = new Libro(titulo,autor);
        return libros.indexOf(libro);
    }

    public Libro buscarLibro(String titulo,String autor)
    {
        int pos = buscarPos(titulo, autor);
        return  libros.get(pos);
    }

    public void actualizarPrecio (String titulo, String autor,double precio)
    {
        Libro libro;
        int pos = buscarPos(titulo, autor);
        libro = libros.get(pos);
        libro.setPrecio(precio);
    }

    public double calcularPrecioTotal()
    {
        double total = 0;
        for (Libro libro : libros)
        {
            total =+ libro.getPrecio();
        }
        return  total;
    }

    public int contarLibros()
    {
        return libros.size();
    }

//    public Libro libroMasCaro()
//    {
//        Libro masCaro = libros.getFirst();
//        //Libro masCaro = libros.get(0);
//        for(Libro libro : libros)
//        {
//            if(libro.getPrecio() > masCaro.getPrecio())
//            {
//                masCaro = libro;
//            }
//        }
//        return masCaro;
//    }

    public Libro libroMasCaro() {
        return Collections.max(libros);
    }

    public Libro libroMenosCaro(){
        return Collections.min(libros);
    }

}
