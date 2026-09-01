package Modal;

import Interface.IEncendible;

public class Parlante extends Dispositivo implements IEncendible {

    private String cancion;

    public Parlante(String cancion) {
        this.cancion = cancion;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "Parlante{" +
                "cancion='" + cancion + '\'' +
                "} " + super.toString();
    }

    @Override
    public Boolean encender() {

        setEncendido(true);
        return "Encendiendo parlante...";
    }

    @Override
    public Boolean apagar() {
        setEncendido(false);
        return "Apagando parlante...";
    }
}
