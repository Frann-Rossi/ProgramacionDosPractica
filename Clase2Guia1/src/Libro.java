public class Libro {
    private static int cont = 0;
    private int id;
    private String titulo;
    private String autor;
    private double precio;
    private int cant;

    public Libro() {
    }

    public Libro(String titulo, String autor, double precio, int cant) {
        this.id = cont;
        cont++;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cant = cant;
    }

    public int getId() {
        return id;
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

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        if (cant >= 0) {
            this.cant = cant;
        }

    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", cant=" + cant +
                '}';
    }

    public boolean venderCopias(int cantVendidos) {
        if (cantVendidos >= 0 && cantVendidos <= cant) {
            cant -= cantVendidos;
            return true;
        }
        return false;
    }

//    public void incrementarCopias(int cantidad) {
//        if (cantidad > 0) {
//            cant += cantidad;
//        }
//    }

    public void incremetarCopias(int cantidad) {
        if (cantidad >= 0) {
            setCant(cantidad + cant);
        }
    }
}
