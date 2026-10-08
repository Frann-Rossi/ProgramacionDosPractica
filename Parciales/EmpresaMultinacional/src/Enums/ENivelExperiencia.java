package Enums;

import Interfaces.IAsignableAProyecto;

public enum ENivelExperiencia {
    JUNIOR(1),
    SEMISENIOR(1.5),
    SENIOR(2);

    private double nivelExperiencia;

    ENivelExperiencia(double nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public double getNivelExperiencia() {
        return nivelExperiencia;
    }


}
