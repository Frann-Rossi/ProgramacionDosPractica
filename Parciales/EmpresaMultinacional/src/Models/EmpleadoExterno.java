package Models;

import java.util.Objects;

public abstract class EmpleadoExterno {
    private String nombre;
    private Integer id;
    private String nombreEmpresa;
    private double montoServicios;

    public EmpleadoExterno(Integer id) {
        this.id = id;
    }

    public EmpleadoExterno(String nombre, Integer id, String nombreEmpresa, double montoServicios) {
        this.nombre = nombre;
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.montoServicios = montoServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public double getMontoServicios() {
        return montoServicios;
    }

    public void setMontoServicios(double montoServicios) {
        this.montoServicios = montoServicios;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EmpleadoExterno that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
