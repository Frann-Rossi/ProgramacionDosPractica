package Models;

import org.json.JSONObject;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
    private int id;
    private int idPublicacion;
    private int idSocio;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(int id, int idPublicacion, int idSocio, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.id = id;
        this.idPublicacion = idPublicacion;
        this.idSocio = idSocio;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getId() {
        return id;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Prestamo prestamo)) return false;
        return id == prestamo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", idPublicacion=" + idPublicacion +
                ", idSocio=" + idSocio +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }

    public JSONObject toJSON(){
        JSONObject prestamoJSON = new JSONObject();

        prestamoJSON.put("id",id);
        prestamoJSON.put("idPublicacion",idPublicacion);
        prestamoJSON.put("idSocio",idSocio);
        prestamoJSON.put("fechaPrestamo",fechaPrestamo.toString());
        prestamoJSON.put("fechaDevolucion",fechaDevolucion.toString());

        return  prestamoJSON;
    }
}
