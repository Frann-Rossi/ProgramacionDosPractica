package Models;

import Interfaces.IOutplacement;

public final class Administrativo extends  Empleado implements IOutplacement {
    private String departamento;

    public Administrativo(String nombre, Integer nroLegajo, double salarioBase, String departamento) {
        super(nombre, nroLegajo, salarioBase);
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
                "} ";
    }
}
