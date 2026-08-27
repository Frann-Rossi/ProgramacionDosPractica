package Modal;

import Interface.ITransporte;
import Enum.ETipoTransporte;

public class Bicicleta implements ITransporte {

    private String numeroSerie;
    private final ETipoTransporte tipo;

    public Bicicleta(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.tipo = ETipoTransporte.BICICLETA;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public ETipoTransporte getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "numeroSerie='" + numeroSerie + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public String arrancar() {
        return "Bicicleta arrancando.....";
    }

    @Override
    public String detener() {
        return "Bicicleta detenido.....";
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }
}
