package Models;

import Interfaces.IToJson;
import org.json.JSONObject;

import java.util.Objects;

public class Actividad implements IToJson {
    private int id;
    private String descripcion;
    private int cupoMax;
    private double costoActividad;

    public Actividad(int id, String descripcion, int cupoMax, double costoActividad) {
        this.id = id;
        this.descripcion = descripcion;
        this.cupoMax = cupoMax;
        this.costoActividad = costoActividad;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }

    public double getCostoActividad() {
        return costoActividad;
    }

    public void setCostoActividad(double costoActividad) {
        this.costoActividad = costoActividad;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Actividad actividad)) return false;
        return id == actividad.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cupoMax=" + cupoMax +
                ", costoActividad=" + costoActividad +
                '}';
    }

    public JSONObject toJson(){
        JSONObject activadJSON = new JSONObject();
        activadJSON.put("id",id);
        activadJSON.put("descripcion",descripcion);
        activadJSON.put("cupoMax",cupoMax);
        activadJSON.put("costoActividad",costoActividad);
        return  activadJSON;
    }
}
