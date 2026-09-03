package Modal;

import Interface.ICompetible;
import Interface.IEntrenable;

public class FutbolistaProfesional extends Futbolista implements IEntrenable, ICompetible {
    private double sueldoMensual;
    private String representante;

    public FutbolistaProfesional(String nombre, double sueldoMensual, String representante) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
        this.representante = representante;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "FutbolistaProfesional{" +
                "sueldoMensual=" + sueldoMensual +
                ", representante='" + representante + '\'' +
                "} " + super.toString();
    }

    @Override
    public String competir(String resultado) {
        return "El futbolista profesional " + getNombre()
                + ". Su resultado en la competencia fue: " + resultado;
    }

    @Override
    public String entrenar(String tema) {
        return "El futbolista profesional " + getNombre() + " entrenó " + tema;
    }
}
