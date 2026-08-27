package Modal;

import Interface.ITransporte;
import Enum.ETipoTransporte;


public class Tranvia implements ITransporte {

    private String ruta;
    private int capacidad;
    private final ETipoTransporte tipo;

    public Tranvia(int capacidad, String ruta) {
        this.tipo = ETipoTransporte.TRANVIA;
        this.capacidad = capacidad;
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ETipoTransporte getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Tranvia{" +
                "ruta='" + ruta + '\'' +
                ", capacidad=" + capacidad +
                ", tipo=" + tipo +
                ", arrnacar: "+ obtenerCapacidad() +
                '}';
    }

    @Override
    public String arrancar() {
        return "Tranvia arrancando.....";
    }

    @Override
    public String detener() {
        return "Tranvia detenido.....";
    }

    @Override
    public int obtenerCapacidad() {
        return Math.max(capacidad, 0);
    }
}
