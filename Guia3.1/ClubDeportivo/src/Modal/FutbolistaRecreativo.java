package Modal;

import Interface.IEntrenable;

public class FutbolistaRecreativo extends Futbolista implements IEntrenable {
    private int posicion;
    private int entrenamientosPorSemana;

    public FutbolistaRecreativo(String nombre, int posicion, int entrenamientosPorSemana) {
        super(nombre);
        this.posicion = posicion;
        this.entrenamientosPorSemana = entrenamientosPorSemana;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getEntrenamientosPorSemana() {
        return entrenamientosPorSemana;
    }

    public void setEntrenamientosPorSemana(int entrenamientosPorSemana) {
        this.entrenamientosPorSemana = entrenamientosPorSemana;
    }

    @Override
    public String toString() {
        return "FutbolistaRecreativo{" +
                "posicion=" + posicion +
                ", entrenamientosPorSemana=" + entrenamientosPorSemana +
                "} " + super.toString();
    }

    @Override
    public String entrenar(String tema) {
        return "El futbolista " + getNombre() + " entrenó " + tema;
    }
}
