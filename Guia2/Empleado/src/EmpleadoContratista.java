public class EmpleadoContratista extends Empleado {
    private int horasTrabajadas;
    private double valorHora;
    private double tarifaProyecto;

    public EmpleadoContratista(String nombre, int horasTrabajadas, double valorHora, double tarifaProyecto) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.tarifaProyecto = tarifaProyecto;
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

    public double getTarifaProyecto() {
        return tarifaProyecto;
    }

    public void setTarifaProyecto(double tarifaProyecto) {
        this.tarifaProyecto = tarifaProyecto;
    }

    @Override
    public String toString() {
        return "EmpleadoContratista{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                ", tarifaProyecto=" + tarifaProyecto +
                "} " + super.toString();
    }

    @Override
    public double calcularPago() {
        return (horasTrabajadas * valorHora) + tarifaProyecto;
    }
}
