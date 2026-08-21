public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(autor);
        Libro libro = new Libro("Effective Java", 450, 150, autor);
        System.out.println(libro);
        libro.setPrecio(500);
        libro.aumentarStock(50);
        System.out.println(libro);
        System.out.println("Nombre: " + libro.getAutor().getNombre());
        System.out.println("Apellido: " + libro.getAutor().getApellido());
        System.out.println("Email: " + libro.getAutor().getEmail());
        System.out.println("Genero: " + libro.getAutor().getGenero());
        System.out.println(libro.msj());
    }
}