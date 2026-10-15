package Models;

import java.util.Set;
import java.util.TreeSet;

public class ListaOrdenada <E> {
    private Set<E> lista;

    public ListaOrdenada() {
        this.lista = new TreeSet<>();
    }

    public Set<E> getLista() {
        return lista;
    }


}
