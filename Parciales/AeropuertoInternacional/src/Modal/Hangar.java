package Modal;

import java.util.HashSet;

public class Hangar {
    private String nombre;
    private final HashSet<Avion> flota;

    public Hangar(String nombre) {
        this.nombre = nombre;
        this.flota = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Avion> getFlota() {
        return flota;
    }

    public boolean agregarFlota(Avion avion)
    {
       return flota.add(avion);
    }

    public boolean quitarFlota(Avion avion)
    {
        return flota.remove(avion);
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "nombre='" + nombre + '\'' +
                ", flota=" + flota +
                '}';
    }
}
