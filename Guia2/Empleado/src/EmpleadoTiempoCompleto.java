import java.util.StringJoiner;

public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto{" +
                "salarioMensual=" + salarioMensual +
                "} " + super.toString();
    }

    @Override
    public double calcularPago() {
        return getSalarioMensual();
    }
}
