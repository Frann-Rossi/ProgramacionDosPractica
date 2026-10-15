package Models;

import java.util.HashSet;
import java.util.Set;

public class Conjunto <E> {
    private Set<E> elementos;

    public Conjunto() {
        this.elementos = new HashSet<>();
    }

    public boolean agregar(E e)
    {
        return elementos.add(e);
    }

    public boolean eliminar(E e)
    {
        return elementos.remove(e);
    }

    public String mostrar()
    {
        StringBuilder sb = new StringBuilder();
        for(E e : elementos)
        {
            sb.append(e).append("\n");
        }
        return sb.toString();
    }

    public boolean contiene (E e)
    {
        return elementos.contains(e);
    }
}
