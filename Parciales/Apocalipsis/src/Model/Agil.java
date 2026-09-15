package Model;

import Interface.IAlimentar;

public class Agil extends Infectado implements IAlimentar {
    private double alturaMax;

    public Agil(String nombre, String origen, int humanosInfectados, double alturaMax) {
        super(nombre, origen, humanosInfectados);
        this.alturaMax = alturaMax;
    }

    public double getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(double alturaMax) {
        this.alturaMax = alturaMax;
    }

    @Override
    public String toString() {
        return "Agil{" +
                "alturaMax=" + alturaMax +
                "} " + super.toString();
    }

    public boolean saltar(double obstaculo) {
        return alturaMax > obstaculo;
    }

    @Override
    public boolean alimentarse(Infectado infectado) {
        return infectado instanceof Regular;
    }
}
