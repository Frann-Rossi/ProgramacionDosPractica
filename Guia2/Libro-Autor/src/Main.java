public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(autor);
        Libro libro = new Libro("Effective Java", 450, 150, autor);
        System.out.println(libro);
        libro.setPrecio(500);
        libro.setStock(libro.getStock() + 50);
        System.out.println(libro);
        System.out.println(libro.getAutor());
        String msj = libro.msj();
        System.out.println(msj);
    }
}