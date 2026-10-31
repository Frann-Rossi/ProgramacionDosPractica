package Models;

import Interfaces.IGestora;

import java.util.HashMap;
import java.util.Map;

public class PaquetesDeActividades implements IGestora <Paquete,Integer> {

    private Map<Integer, Paquete> paqueteActividades;

    public PaquetesDeActividades() {
        this.paqueteActividades = new HashMap<>();
    }

    @Override
    public boolean guardar(Actividad actividad) {
        return false;
    }

    @Override
    public Actividad buscarID(Integer integer) {
        return null;
    }

    @Override
    public String mostrar() {
        return "";
    }

    @Override
    public Actividad eliminar(Integer integer) {
        return null;
    }
}
