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

    public boolean agregarAvion(Avion avion)
    {
       return flota.add(avion);
    }

    public boolean quitarAvion(Avion avion)
    {
        return flota.remove(avion);
    }

    public String mostrarAviones()
    {
        StringBuilder sb = new StringBuilder();
        for (Avion avion : flota)
        {
            sb.append(avion.toString() + '\n');
        }
        return  sb.toString();
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "nombre='" + nombre + '\'' +
                ", flota=" + flota +
                '}';
    }
}
