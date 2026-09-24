package Modelo;

import java.util.Objects;

public abstract class Empleado {
    int nroLegajo;
    String nombre;
    String apellido;
    double salario;
    private boolean activo;

    public Empleado(int nroLegajo, String nombre, String apellido, float salario) {
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.activo = true;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Empleado empleado)) return false;
        return nroLegajo == empleado.nroLegajo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nroLegajo);
    }

    @Override
    public String toString() {
        return  "nroLegajo=" + nroLegajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario + '\'' +
                ", activo=" + activo;
    }
}
