package Modelo;

import java.util.Objects;

public abstract class AgenteExterno {
    private int id;
    private String nombre;
    private String apellido;
    private String empresaPrestadora;
    private double montoACobrar;

    public AgenteExterno(int id, String nombre, String apellido, String empresaPrestadora, double montoACobrar) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresaPrestadora = empresaPrestadora;
        this.montoACobrar = montoACobrar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmpresaPrestadora() {
        return empresaPrestadora;
    }

    public void setEmpresaPrestadora(String empresaPrestadora) {
        this.empresaPrestadora = empresaPrestadora;
    }

    public double getMontoACobrar() {
        return montoACobrar;
    }

    public void setMontoACobrar(double montoACobrar) {
        this.montoACobrar = montoACobrar;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AgenteExterno that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", empresaPrestadora='" + empresaPrestadora + '\'' +
                ", montoACobrar=" + montoACobrar;
    }
}
