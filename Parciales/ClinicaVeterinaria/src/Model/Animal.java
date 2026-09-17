package Model;

import Interface.IAnimal;

import java.util.Objects;

public abstract class Animal{
    private static int cont = 0;
    private final int id;
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.id = cont;
        cont++;
        this.nombre = nombre;
        this.edad = edad;
    }

    public static int getCont() {
        return cont;
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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public abstract String alimentar();
}
