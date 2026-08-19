public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Franco", "rossifrancomatias@gmail.com", 10);
        System.out.println(cliente);
        Factura factura = new Factura(10000,cliente);
        System.out.println(factura);
        double descuento = factura.descuneto();
        System.out.println(descuento);
    }
}