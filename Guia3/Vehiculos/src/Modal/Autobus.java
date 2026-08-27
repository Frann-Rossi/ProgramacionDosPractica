package Modal;

import Interface.ITransporte;
import Enum.ETipoTransporte;

public class Autobus implements ITransporte {

    private String numeroLinea;
    private int capacidad;
    private final ETipoTransporte tipo;

    public Autobus(String numeroLinea, int capacidad) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = ETipoTransporte.AUTOBUS;
    }

    public String getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(String numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ETipoTransporte getTipoTransporte() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "numeroLinea=" + numeroLinea +
                ", capacidad=" + capacidad +
                ", tipoTransporte=" + tipo +
                '}';
    }

    @Override
    public String arrancar() {
        return "Autobus arrancando.....";
    }

    @Override
    public String detener() {
        return "Autobus detenido.....";
    }

    @Override
    public int obtenerCapacidad() {
        return Math.max(capacidad, 0);
    }
}
