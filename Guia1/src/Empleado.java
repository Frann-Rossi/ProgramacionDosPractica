public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, String apellido, int salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void aumentoDeSuelto(double aumento) {
        salario = salario + (salario * aumento);
    }

    public double salarioAnual() {
        return salario * 12;
    }
}
