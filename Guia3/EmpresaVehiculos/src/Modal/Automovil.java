package Modal;

public abstract class Automovil {

    private String marca;
    private String modelo;
    private double velocidadMax;
    private int cantPasajeros;

    public Automovil(String marca, String modelo, double velocidadMax, int cantPasajeros) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
        this.cantPasajeros = cantPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }


    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMax=" + velocidadMax +
                ", cantPasajeros=" + cantPasajeros +
                '}';
    }
}
