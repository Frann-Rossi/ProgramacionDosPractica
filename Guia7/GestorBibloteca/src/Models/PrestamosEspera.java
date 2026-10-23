package Models;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class PrestamosEspera {
    private Map<Integer,Queue<Prestamo>> listaDeEspera;

    public PrestamosEspera() {
        this.listaDeEspera = new HashMap<>();
    }

    public boolean agregar(Prestamo p){
        if(!listaDeEspera.containsKey(p.getIdPublicacion()))
            listaDeEspera.put(p.getIdPublicacion(), new LinkedList<>());

        return  listaDeEspera.get(p.getIdPublicacion()).offer(p);
    }

    public  Prestamo verSiguiente(int idPublicacion)
    {
        Queue<Prestamo> listaEspera = listaDeEspera.get(idPublicacion);
        return  listaEspera == null ? null : listaEspera.peek();
    }

    public Prestamo atenderSiguiente(int idPublicacion)
    {
        Queue<Prestamo> listaEspera = listaDeEspera.get(idPublicacion);
        return  listaEspera == null ? null : listaEspera.poll();
    }

    public boolean estaVacia() {
        return listaDeEspera.isEmpty();
    }

    public int cantidadEnEspera(int idPublicacion) {
        Queue<Prestamo> cola = listaDeEspera.get(idPublicacion);
        return cola == null ? 0 : cola.size();
    }
}
