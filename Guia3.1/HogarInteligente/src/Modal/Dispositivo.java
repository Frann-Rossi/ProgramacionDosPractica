package Modal;

public abstract class Dispositivo {
    private  boolean encendido;

    public Dispositivo() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "encendido=" + encendido +
                '}';
    }
}
