package Models;

import org.json.JSONObject;

import java.util.Objects;

public abstract class Publicacion implements Comparable <Publicacion> {
    private int id;
    private String titulo;
    private int anio;
    private boolean disponible;

    public Publicacion(int id,String titulo, int anio) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Publicacion that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", disponible=" + disponible +
                '}';
    }

    @Override
    public int compareTo(Publicacion o) {
        int res = titulo.compareToIgnoreCase(o.titulo) ;

        if(res != 0)
        {
            return res;
        }
        return Integer.compare(anio,o.anio);
    }

    public JSONObject toJSON()
    {
        JSONObject publicacionJSON = new JSONObject();

        publicacionJSON.put("id",id);
        publicacionJSON.put("titulo",titulo);
        publicacionJSON.put("anio",anio);
        publicacionJSON.put("disponible",disponible);

        return publicacionJSON;
    }
}
