package Models;

import Interfaces.IAsignableAProyecto;

public final class ConsultorExterno extends EmpleadoExterno implements IAsignableAProyecto {

    private int duracionContrato;
    private String proyecto;


    public ConsultorExterno(Integer id) {
        super(id);
    }

    public ConsultorExterno(String nombre, Integer id, String nombreEmpresa, double montoServicios, int duracionContrato) {
        super(nombre, id, nombreEmpresa,montoServicios);
        this.duracionContrato = duracionContrato;
    }

    @Override
    public String toString() {
        return "ConsultorExterno{" +
                super.toString() +
                ", duracionContrato=" + duracionContrato +
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
