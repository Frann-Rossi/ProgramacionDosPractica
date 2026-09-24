package Modelo;

import Interface.IOutplacement;

public final class Administrativo extends Empleado implements IOutplacement {

    private String departamento;

    public Administrativo(int nroLegajo, String nombre, String apellido, float salario, String departamento, boolean activo) {
        super(nroLegajo, nombre, apellido, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                super.toString() +
                "departamento='" + departamento + '\'' +
                '}';
    }
}
