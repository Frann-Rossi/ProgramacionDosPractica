public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                "} " + super.toString();
    }

    @Override
    public double calcularPago() {
        return getHorasTrabajadas() * horasTrabajadas;
    }
}
