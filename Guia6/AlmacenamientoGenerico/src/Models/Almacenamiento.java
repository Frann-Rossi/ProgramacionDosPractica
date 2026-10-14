package Models;

import java.util.ArrayList;
import java.util.List;

public class Almacenamiento <E> {
    List<E> cajas;

    public Almacenamiento() {
        this.cajas = new ArrayList<>();
    }

    public boolean agregar(E e)
    {
        return cajas.add(e);
    }

    public int pos(E e)
    {
        return cajas.indexOf(e);
    }

    public boolean eliminar(E e)
    {
        return cajas.remove(e);
    }

    public boolean eliminar(int pos)
    {
        return cajas.remove(pos) != null;
    }

    public String mostrar()
    {
        StringBuilder sb = new StringBuilder();
        for(E e1 : cajas)
        {
            sb.append(e1).append("\n");
        }
        return sb.toString();
    }

    public boolean buscar(E e)
    {
        return  cajas.get(cajas.indexOf(e)) == null;
    }
}
