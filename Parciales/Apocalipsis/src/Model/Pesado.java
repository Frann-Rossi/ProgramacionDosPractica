package Model;

import Interface.IAlimentar;

public class Pesado extends Infectado implements IAlimentar {
    private int vida;

    public Pesado(String nombre, String origen, int humanosInfectados, int vida) {
        super(nombre, origen, humanosInfectados);
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Pesado{" +
                "vida=" + vida +
                "} " + super.toString();
    }

    public boolean romperPuertas() {
        if (vida == 0) {
            return false;
        }
        this.vida--;
        return true;
    }

    @Override
    public boolean alimentarse(Infectado infectado) {
        return infectado instanceof Regular;
    }
}
