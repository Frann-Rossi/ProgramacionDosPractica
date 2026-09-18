package Model;

import Enums.EEspecie;

public final class Reptil extends Animal {
    private EEspecie especie;
    private boolean venenosos;

    public Reptil(String nombre, int edad, EEspecie especie, boolean venenosos) {
        super(nombre, edad);
        this.especie = especie;
        this.venenosos = venenosos;
    }

    public EEspecie getEspecie() {
        return especie;
    }

    public void setEspecie(EEspecie especie) {
        this.especie = especie;
    }

    public boolean isVenenosos() {
        return venenosos;
    }

    public void setVenenosos(boolean venenosos) {
        this.venenosos = venenosos;
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "especie=" + especie +
                ", venenosos=" + venenosos +
                "} " + super.toString();
    }

    @Override
    public String alimentar() {
        return "Estoy comiendo soy un " + getNombre();
    }
}
