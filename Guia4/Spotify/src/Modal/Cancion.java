package Modal;
import Enum.EGenero;

import java.util.Objects;

public class Cancion {
    private String nombre;
    private int duracion;
    private EGenero genero;
    private Album album;
    private Artista artistaInvitado;

    public Cancion(String nombre, int duracion, EGenero genero, Album album, Artista artistaInvitado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
        this.artistaInvitado = artistaInvitado;
    }

    public Cancion(String nombre, int duracion, EGenero genero, Album album) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
        this.artistaInvitado = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public EGenero getGenero() {
        return genero;
    }

    public void setGenero(EGenero genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cancion cancion)) return false;
        return Objects.equals(nombre, cancion.nombre) && Objects.equals(album, cancion.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, album);
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", genero=" + genero +
                ", album=" + album +
                ", artistaInvitado=" + artistaInvitado +
                '}';
    }
}
