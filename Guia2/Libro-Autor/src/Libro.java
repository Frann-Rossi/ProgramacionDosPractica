public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }

//    public double aumentarStock(int cant) {
//        return stock + cant;
//    }
//
//    public double disminuirStock(int cant) {
//        return stock - cant;
//    }

    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
        }
    }

    public void disminuirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
        }
    }

//    public String msj() {
//        return "El libro, " + titulo +
//                " de " + autor.getNombre() +
//                ". Se vende a " + precio + " pesos.";
//    }

    public String msj() {
        StringBuilder sb = new StringBuilder();

        sb.append("El libro, ");
        sb.append(titulo);
        sb.append(" de ");
        sb.append(autor.getNombre());
        sb.append(". Se vende a ");
        sb.append(precio);
        sb.append(" pesos. ");
        return sb.toString();
    }
}
