package Models;

import Interfaces.IRepositorio;
import org.json.JSONArray;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RepositorioPublicacion implements IRepositorio<Publicacion,Integer> {

    private Set<Publicacion> listaPublicacion;

    public RepositorioPublicacion() {
        this.listaPublicacion = new HashSet<>();
    }

    @Override
    public boolean guardar(Publicacion publicacion) {
        if(listaPublicacion.contains(publicacion))
            return false;

        return listaPublicacion.add(publicacion);
    }

    @Override
    public Publicacion buscarPorId(Integer id) {
        for(Publicacion p : listaPublicacion)
        {
            if(p.getId() == id)
            {
                return p;
            }
        }
        return null;
    }

    @Override
    public String listarTodos() {
        StringBuilder sb = new StringBuilder();
        for(Publicacion p : listaPublicacion)
        {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Publicacion eliminar(Integer id) {
        Iterator<Publicacion> it = listaPublicacion.iterator();
        while(it.hasNext())
        {
            Publicacion p = it.next();
            if(p.getId() == id){
                it.remove();
                return p;
            }
        }
        return  null;
    }

    @Override
    public String toString() {
        return "RepositorioPublicacion{" +
                "listaPublicacion=" + listarTodos() +
                '}';
    }

    public JSONArray toJSON()
    {
        JSONArray listaPublicacionJSON = new JSONArray();
        for(Publicacion p : listaPublicacion)
        {
            listaPublicacionJSON.put(p.toJSON());
        }
        return  listaPublicacionJSON;
    }
}
