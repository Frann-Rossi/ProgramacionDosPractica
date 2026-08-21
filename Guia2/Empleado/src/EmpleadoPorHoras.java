public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                "} " + super.toString();
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * valorHora;
    }
}
