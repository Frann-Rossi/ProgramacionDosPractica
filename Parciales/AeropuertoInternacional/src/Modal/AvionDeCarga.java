package Modal;

import Enum.ETipo;

import java.util.ArrayList;

public class AvionDeCarga extends Avion {
    private double capacidadKilos;
    private final ArrayList<String> productosTransportados;

    public AvionDeCarga(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, String identificacion, double capacidadKilos) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, 0, identificacion, ETipo.DECARGA);
        this.capacidadKilos = capacidadKilos;
        this.productosTransportados = new ArrayList<>();
    }

    public double getCapacidadKilos() {
        return capacidadKilos;
    }

    public void setCapacidadKilos(double capacidadKilos) {
        this.capacidadKilos = capacidadKilos;
    }

    public ArrayList<String> getProductosTransportados() {
        return productosTransportados;
    }

    public boolean agregarProducto(String producto) {
        return productosTransportados.add(producto);
    }

    public boolean quitarProducto(String producto) {
        return productosTransportados.remove(producto);
    }

    public boolean ingresar() {
        return true;
    }

    public String descargarContenido() {
        return "Descargando contenido: " + productosTransportados;
    }

    @Override
    public String despegan() {
        return "Avion de Carga DESPEGANDO...";
    }

    @Override
    public String aterrizan() {
        return "Avion de Carga ATERRIZANDO...";
    }

    @Override
    public String vuelan() {
        return "Avion de Carga VOLANDO...";
    }

    @Override
    public String toString() {
        return super.toString() +
                " AvionDeCarga{" +
                "capacidadKilos=" + capacidadKilos +
                ", productosTransportados=" + productosTransportados +
                '}';
    }
}
