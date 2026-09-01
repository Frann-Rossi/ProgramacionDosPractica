package Modal;

import Interface.IEncendible;

public class Termostato extends Dispositivo implements IEncendible {

    private String temperatura;

    public Termostato(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Termostato{" +
                "temperatura='" + temperatura + '\'' +
                "} " + super.toString();
    }

    @Override
    public Boolean encender() {
        setEncendido(true);
        return "Encendiendo termostato...";
    }

    @Override
    public Boolean apagar() {
        setEncendido(false);
        return "Apagando termostato...";
    }
}
