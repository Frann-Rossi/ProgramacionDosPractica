public class Cilindro extends Circulo {
    private  double altura;

    public Cilindro() {
        super();
        this.altura = 1.0;;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }
}
