package Model;

import Interface.IAtacar;

import java.util.Objects;

public abstract class Infectado implements IAtacar {
    private static int contador = 0;
    private final int id;
    private String nombre;
    private String origen;
    private int humanosInfectados;

    public Infectado(String nombre, String origen, int humanosInfectados) {
        this.id = contador;
        contador++;
        this.nombre = nombre;
        this.origen = origen;
        this.humanosInfectados = humanosInfectados;
    }

    public static int getContador() {
        return contador;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }


    public int getHumanosInfectados() {
        return humanosInfectados;
    }

    public void setHumanosInfectados(int humanosInfectados) {
        this.humanosInfectados = humanosInfectados;
    }

    @Override
    public String toString() {
        return "Infectado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", humanosInfectados=" + humanosInfectados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Infectado infectado)) return false;
        return id == infectado.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int atacar() {
        return 100;
    }
}
