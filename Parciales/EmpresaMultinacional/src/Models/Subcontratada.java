package Models;

import Interfaces.IOutplacement;

public final class Subcontratada extends EmpleadoExterno implements IOutplacement {
    private Integer cuit;

    public Subcontratada(Integer id) {
        super(id);
    }

    public Subcontratada(String nombre, Integer id, String nombreEmpresa, double montoServicios, Integer cuit) {
        super(nombre, id, nombreEmpresa, montoServicios);
        this.cuit = cuit;
    }



    public Integer getCuit() {
        return cuit;
    }

    @Override
    public String toString() {
        return "Subcontratada{" +
                super.toString() +
                ", cuit='" + cuit + '\'' +
                "} ";
    }
}
