package Modal;

import Enum.ETipo;
import Interface.IVueloPasajeros;

public class AvionPrivado extends Avion implements IVueloPasajeros {
    private boolean tieneJacuzzi;
    private String claveWifi;

    public AvionPrivado(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int capacidadAsientos, String identificacion, boolean tieneJacuzzi, String claveWifi) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, capacidadAsientos, identificacion, ETipo.PRIVADO);
        this.tieneJacuzzi = tieneJacuzzi;
        this.claveWifi = claveWifi;
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    public void setTieneJacuzzi(boolean tieneJacuzzi) {
        this.tieneJacuzzi = tieneJacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    @Override
    public String comiendo() {
        return "Comiendo en avion privado...";
    }

    @Override
    public String mantitaDeFrio() {
        return "Usando mantita en avion privado...";
    }

    public boolean verMundial() {
        return true;
    }

    @Override
    public String despegan() {
        return "Avion Privado DESPEGANDO...";
    }

    @Override
    public String aterrizan() {
        return "Avion Privado ATERRIZANDO...";
    }

    @Override
    public String vuelan() {
        return "Avion Privado VOLANDO...";
    }

    @Override
    public String toString() {
        return super.toString() +
                " AvionPrivado{" +
                "tieneJacuzzi=" + tieneJacuzzi +
                ", claveWifi='" + claveWifi + '\'' +
                '}';
    }
}
