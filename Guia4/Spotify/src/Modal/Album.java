package Modal;

import java.util.Objects;

public class Album {
    private  int anioPublicado;
    private String titulo;
    private  Artista artista;

    public Album(int anioPublicado, String titulo, Artista artista) {
        this.anioPublicado = anioPublicado;
        this.titulo = titulo;
        this.artista = artista;
    }

    public int getAnioPublicado() {
        return anioPublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Album album)) return false;
        return Objects.equals(titulo, album.titulo) && Objects.equals(artista, album.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista);
    }

    @Override
    public String toString() {
        return "Album{" +
                "anioPublicado=" + anioPublicado +
                ", titulo='" + titulo + '\'' +
                ", artista=" + artista +
                '}';
    }
}
