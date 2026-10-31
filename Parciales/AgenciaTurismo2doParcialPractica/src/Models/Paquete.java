package Models;

import Interfaces.IGestora;

import java.util.List;

public class Paquete <T extends Actividad> implements IGestora <
        Actividad,Integer> {
    private List<T> listaDePaquetes;


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
