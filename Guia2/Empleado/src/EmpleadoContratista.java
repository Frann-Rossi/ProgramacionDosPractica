public class EmpleadoContratista extends Empleado {
    private int salarioPorHoras;
    private int tarifaProtecto;

    public EmpleadoContratista(String nombre, int salarioPorHoras, int tarifaProtecto) {
        super(nombre);
        this.salarioPorHoras = salarioPorHoras;
        this.tarifaProtecto = tarifaProtecto;
    }

    public int getSalarioPorHoras() {
        return salarioPorHoras;
    }

    public void setSalarioPorHoras(int salarioPorHoras) {
        this.salarioPorHoras = salarioPorHoras;
    }

    public int getTarifaProtecto() {
        return tarifaProtecto;
    }

    public void setTarifaProtecto(int tarifaProtecto) {
        this.tarifaProtecto = tarifaProtecto;
    }

    @Override
    public String toString() {
        return "EmpleadoContratista{" +
                "salarioPorHoras=" + salarioPorHoras +
                ", tarifaProtecto=" + tarifaProtecto +
                '}';
    }

    @Override
    public double calcularPago() {
        return getSalarioPorHoras() + getTarifaProtecto();
    }
}
