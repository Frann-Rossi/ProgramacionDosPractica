package Models;

import Interfaces.IGestora;

import java.util.HashSet;
import java.util.Set;

public class GestoraActivad implements IGestora <Actividad,Integer> {

    private Set<Actividad> actividades;

    public GestoraActivad() {
        this.actividades = new HashSet<>();
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
