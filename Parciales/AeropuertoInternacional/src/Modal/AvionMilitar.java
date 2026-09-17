package Modal;

import Enum.ETipo;

public class AvionMilitar extends Avion {
    private String sistemaArmas;
    private int cantidadBalas;

    public AvionMilitar(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int capacidadAsientos, String identificacion, String sistemaArmas, int cantidadBalas) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, capacidadAsientos, identificacion, ETipo.MILITAR);
        this.sistemaArmas = sistemaArmas;
        this.cantidadBalas = cantidadBalas;
    }

    public String getSistemaArmas() {
        return sistemaArmas;
    }

    public void setSistemaArmas(String sistemaArmas) {
        this.sistemaArmas = sistemaArmas;
    }

    public int getCantidadBalas() {
        return cantidadBalas;
    }

    public void setCantidadBalas(int cantidadBalas) {
        this.cantidadBalas = cantidadBalas;
    }

    public boolean ingresar() {
        return true;
    }

    @Override
    public String despegan() {
        return "Avion Militar DESPEGANDO...";
    }

    @Override
    public String aterrizan() {
        return "Avion Militar ATERRIZANDO...";
    }

    @Override
    public String vuelan() {
        return "Avion Militar VOLANDO...";
    }

    @Override
    public String toString() {
        return super.toString() +
                " AvionMilitar{" +
                "sistemaArmas='" + sistemaArmas + '\'' +
                ", cantidadBalas=" + cantidadBalas +
                '}';
    }
}
