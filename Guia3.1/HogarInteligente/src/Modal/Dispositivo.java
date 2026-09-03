package Modal;

public abstract class Dispositivo {
    private boolean encendido;

    public Dispositivo() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public Boolean encender() {
        if (isEncendido()) return false;
        this.encendido = true;
        return true;
    }

    public Boolean apagar() {
        if (!isEncendido()) return false;
        this.encendido = false;
        return true;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "encendido=" + encendido +
                '}';
    }
}
