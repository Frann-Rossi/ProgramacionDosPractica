package Modelo;
import Enums.*;
import Interface.IAsignableAProyecto;

public final class Tecnico extends Empleado implements IAsignableAProyecto {
    private ENivelExperiencia experiencia;
    private String proyecto;

    public Tecnico(int nroLegajo, String nombre, String apellido, float salario, ENivelExperiencia experiencia) {
        super(nroLegajo, nombre, apellido, (float) (salario * experiencia.getMultiplicadorSalario()));
        this.experiencia = experiencia;
        proyecto = "Sin asignar";
    }

    public ENivelExperiencia getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(ENivelExperiencia experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void tomarProyecto(String proyectoAsignado) {
        this.proyecto = proyectoAsignado;
    }

    @Override
    public String mostrarProyecto() {
        return proyecto;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                super.toString() +
                "experiencia=" + experiencia +
                '}';
    }
}
