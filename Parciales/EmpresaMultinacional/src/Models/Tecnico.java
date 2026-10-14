package Models;

import Enums.ENivelExperiencia;
import Interfaces.IAsignableAProyecto;

public final class Tecnico extends Empleado implements IAsignableAProyecto {
    private ENivelExperiencia nivelExperiencia;
    private String proyecto;

    public Tecnico(String nombre, Integer nroLegajo, double salarioBase, ENivelExperiencia nivelExperiencia) {
        super(nombre, nroLegajo, salarioBase);
        this.nivelExperiencia = nivelExperiencia;
    }

    public ENivelExperiencia getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(ENivelExperiencia nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                super.toString() +
                "nivelExperiencia=" + nivelExperiencia +
                ", proyecto='" + proyecto + '\'' +
                "} ";
    }

    @Override
    public void tomarProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String mostrarProyecto() {
        return "El proyecto es:" + proyecto;
    }
}
