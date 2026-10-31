package Models;

import Enums.ECalificacion;
import Interfaces.IToJson;
import org.json.JSONObject;

import java.time.LocalDate;
import java.util.Objects;

public class OpinionActividad implements IToJson {
    private int id;
    private Actividad actividadRealizada;
    private LocalDate fechaActividadesRealizadas;
    private ECalificacion calificacion;

    public OpinionActividad(int id) {
        this.id = id;
    }

    public OpinionActividad(int id, Actividad actividadRealizada, LocalDate fechaActividadesRealizadas, ECalificacion calificacion) {
        this.id = id;
        this.actividadRealizada = actividadRealizada;
        this.fechaActividadesRealizadas = fechaActividadesRealizadas;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Actividad getActividadRealizada() {
        return actividadRealizada;
    }

    public void setActividadRealizada(Actividad actividadRealizada) {
        this.actividadRealizada = actividadRealizada;
    }

    public LocalDate getFechaActividadesRealizadas() {
        return fechaActividadesRealizadas;
    }

    public void setFechaActividadesRealizadas(LocalDate fechaActividadesRealizadas) {
        this.fechaActividadesRealizadas = fechaActividadesRealizadas;
    }

    public ECalificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(ECalificacion calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof OpinionActividad that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OpinionActividad{" +
                "id=" + id +
                ", actividadRealizada=" + actividadRealizada +
                ", fechaActividadesRealizadas=" + fechaActividadesRealizadas +
                ", calificacion=" + calificacion +
                '}';
    }

    public JSONObject toJson()
    {
        JSONObject opinionActividad = new JSONObject();
        opinionActividad.put("id",id);
        opinionActividad.put("actividadRealizada",actividadRealizada);
        opinionActividad.put("fechaActividadesRealizadas",fechaActividadesRealizadas);
        opinionActividad.put("calificacion",calificacion);
        return  opinionActividad;
    }
}
