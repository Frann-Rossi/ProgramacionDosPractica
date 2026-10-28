package Gestora;

import Exceptions.SocioNoEncontradoException;
import Interfaces.IRepositorio;
import Models.Socio;
import org.json.JSONArray;

import java.util.HashMap;
import java.util.Map;

public class RepositorioSocio implements IRepositorio<Socio,Integer> {
    private Map<Integer,Socio> listaSocios;

    public RepositorioSocio() {
        this.listaSocios = new HashMap<>();
    }

    @Override
    public boolean guardar(Socio socio) {
        return listaSocios.put(socio.getId(), socio) == null;
    }

    @Override
    public Socio buscarPorId(Integer id) throws SocioNoEncontradoException {
        Socio socio =listaSocios.get(id);
        if(socio ==  null)
            throw new SocioNoEncontradoException();
        return socio;
    }

    @Override
    public String listarTodos() {
        StringBuilder sb = new StringBuilder();
        for(Socio s : listaSocios.values())
        {
            sb.append(s).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Socio eliminar(Integer id) {
        return listaSocios.remove(id);
    }

    @Override
    public String toString() {
        return "RepositorioSocio{" +
                "listaSocios=" + listarTodos() +
                '}';
    }

    public JSONArray toJson(){
        JSONArray listaSociosJSON = new JSONArray();

        for(Socio s : listaSocios.values()){
            listaSociosJSON.put(s.toJSON());
        }
        return  listaSociosJSON;
    }
}
