package Modal;

import java.util.Objects;
import Enum.ETipo;

public abstract class Avion {
    private  String nombreModelo;
    private String marca;
    private int capacidadCombustible;
    private String tipoMotor;
    private int capacidadAsientos;
    private String identificacion;
    private final ETipo tipo;

    public Avion(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int capacidadAsientos, String identificacion, ETipo tipo) {
        this.nombreModelo = nombreModelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
        this.capacidadAsientos = capacidadAsientos;
        this.identificacion = identificacion;
        this.tipo = tipo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidadAsientos() {
        return capacidadAsientos;
    }

    public void setCapacidadAsientos(int capacidadAsientos) {
        this.capacidadAsientos = capacidadAsientos;
    }

    public ETipo getTipo(){
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Avion avion)) return false;
        return Objects.equals(identificacion, avion.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificacion);
    }

    @Override
    public String toString() {
        return "Avion{" +
                "nombreModelo='" + nombreModelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", capacidadAsientos=" + capacidadAsientos +
                '}';
    }

    public abstract String despegan();
    public abstract String aterrizan();
    public abstract String vuelan();
}
