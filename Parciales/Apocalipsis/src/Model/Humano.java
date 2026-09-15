package Model;

import Enum.EFaccion;
import Interface.IAtacar;

import java.util.Objects;

public class Humano implements IAtacar {
    private final int id;
    private String nombre;
    private  int edad;
    private EFaccion faccion;

    public Humano(String nombre, int edad,EFaccion faccion) {
        this.id = GeneradorID.getSiguienteId();
        this.nombre = nombre;
        this.edad = edad;
        this.faccion = faccion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EFaccion getFaccion() {
        return faccion;
    }

    public void setFaccion(EFaccion faccion) {
        this.faccion = faccion;
    }

    @Override
    public String toString() {
        return "Humano{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", faccion=" + faccion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Humano humano)) return false;
        return id == humano.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int atacar() {
        return (int)(Math.random() * 100) + 1;
    }
}
