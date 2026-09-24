package Modelo;

import Interface.IOutplacement;

public final class Despedidor extends AgenteExterno implements IOutplacement {
    private String cuit;

    public Despedidor(int id, String departamento, String activo, String nombre, String apellido, String empresaPrestadora, double montoACobrar, String cuit) {
        super(id, nombre, apellido, empresaPrestadora, montoACobrar);
        this.cuit = cuit;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }


    @Override
    public String toString() {
        return "Despedidor{" +
                super.toString() +
                "cuit='" + cuit + '\'' +
                '}';
    }
}
