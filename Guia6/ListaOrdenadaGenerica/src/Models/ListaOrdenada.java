package Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada <E extends Comparable<E>> {
    private List<E> listas;
    private boolean asc;

    public ListaOrdenada(boolean asc) {
        this.listas = new ArrayList<>();
        this.asc = asc;
    }

    public  boolean agregar(E e)
    {
        listas.add(e);
        if(asc)
        {
            Collections.sort(listas);
        }
        else {
            listas.sort(Collections.reverseOrder());
        }
        return true;
    }

    public int pos(E e)
    {
        return listas.indexOf(e);
    }

    public E obtener(int pos)
    {
        return listas.get(pos);
    }

    public boolean eliminar(E e)
    {
        return listas.remove(e);
    }

    public boolean eliminar(int pos)
    {
        if(pos < 0 || pos >= listas.size())
            //Agregar EXpetion
            return  false;

        return listas.remove(pos) != null;
    }




}
