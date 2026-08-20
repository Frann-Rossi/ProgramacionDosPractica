public class Cilindro extends Circulo {
    private double altura;

    public Cilindro() {
        super();
        this.altura = 1.0;
        ;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                "} " + super.toString();
    }

    @Override
    public double calcularArea() {
        double areaBase = super.calcularArea();

        return 2 * Math.PI * getRadio() * altura
                + 2 * areaBase;
    }

    public double calcularVolumen() {
        return super.calcularArea() * altura;
    }

    public String mostrarInfo()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Cilindro: subclase de ");
        sb.append(super.mostrarInfo());
        sb.append(", altura=");
        sb.append(altura);
        return sb.toString();
    }
}
