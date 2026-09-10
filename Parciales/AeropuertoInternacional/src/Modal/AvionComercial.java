package Modal;

import Interface.IVueloPasajeros;

import java.util.ArrayList;
import Enum.ETipo;

public class AvionComercial extends Avion implements IVueloPasajeros {
    private int cantAzafatas;
    private final ArrayList<String> servicios;

    public AvionComercial(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int capacidadAsientos, String identificacion, int cantAzafatas) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, capacidadAsientos, identificacion, ETipo.COMERCIAL);
        this.cantAzafatas = cantAzafatas;
        this.servicios = new ArrayList<>();
    }

    public int getCantAzafatas() {
        return cantAzafatas;
    }

    public void setCantAzafatas(int cantAzafatas) {
        this.cantAzafatas = cantAzafatas;
    }

    public ArrayList<String> getServicios() {
        return servicios;
    }

    @Override
    public String comiendo() {
        return "Comiendo...";
    }

    @Override
    public String mantitaDeFrio() {
        return "Gracias por la mantita...";
    }

    @Override
    public String despegan() {
        return "Avion Comercial DESPEGANDO...";
    }

    @Override
    public String aterrizan() {
        return "Avion Comercial ATERRIZANDO...";
    }

    @Override
    public String vuelan() {
        return "Avion Comercial VOLANDO...";
    }

    public boolean agregarServicio(String servicio) {
        return servicios.add(servicio);
    }
    public boolean quitarServicio(String servicio) {
        return servicios.remove(servicio);
    }
}
