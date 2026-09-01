package Modal;

import java.util.Objects;

public class Libro {
    private String titulo;
    private  String autor;
    private  double precio;
    private  int anio;

    public Libro(String titulo, String autor, double precio, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Libro libro)) return false;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", anio=" + anio +
                '}';
    }
}
