public class Main {
    public static void main(String[] args) {
        Cilindro cilindro1 = new Cilindro();
        System.out.println(cilindro1);
        Cilindro cilindro2 = new Cilindro(5.0, "azul", 10.0);
        System.out.println(cilindro2);
        double volumenCilindro = cilindro2.calcularVolumen();
        double areaCilindro = cilindro2.calcularArea();
        System.out.println("Volumen del Cilindro 2:" + volumenCilindro);
        System.out.println("Area del Cilindro 2:" + areaCilindro);
        String infoCilindro2 = cilindro2.mostrarInfo();
        System.out.println(infoCilindro2);
    }
}