package Modal;

import Interface.IEncendible;

public class Lampara extends Dispositivo implements IEncendible {

    private String intencidad;

    public Lampara(String intencidad) {
        this.intencidad = intencidad;
    }

    public String getIntencidad() {
        return intencidad;
    }

    public void setIntencidad(String intencidad) {
        this.intencidad = intencidad;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "intencidad='" + intencidad + '\'' +
                "} " + super.toString();
    }


}
