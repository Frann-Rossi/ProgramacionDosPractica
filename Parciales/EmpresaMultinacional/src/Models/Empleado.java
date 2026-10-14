package Models;

import java.util.Objects;

public abstract class Empleado {
    private String nombre;
    private Integer nroLegajo;
    private double salarioBase;
    private boolean activo;

    public Empleado(String nombre, Integer nroLegajo, double salarioBase) {
        this.nombre = nombre;
        this.nroLegajo = nroLegajo;
        this.salarioBase = salarioBase;
        this.activo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNroLegajo() {
        return nroLegajo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", nroLegajo='" + nroLegajo + '\'' +
                ", salarioBase=" + salarioBase +
                ", activo=" + activo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Empleado empleado)) return false;
        return Objects.equals(nroLegajo, empleado.nroLegajo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nroLegajo);
    }
}
