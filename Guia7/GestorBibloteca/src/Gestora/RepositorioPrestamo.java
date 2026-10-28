package Gestora;

import Interfaces.IRepositorio;
import Models.Prestamo;
import org.json.JSONArray;

import java.util.*;

public class RepositorioPrestamo implements IRepositorio <Prestamo,Integer> {
    private Map<Integer, List<Prestamo>> listaPrestamos;

    public RepositorioPrestamo() {
        this.listaPrestamos = new HashMap<>();
    }

    @Override
    public boolean guardar(Prestamo prestamo) {
        if(!listaPrestamos.containsKey(prestamo.getIdSocio()))
            listaPrestamos.put(prestamo.getIdSocio(),new ArrayList<>());
        return listaPrestamos.get(prestamo.getIdSocio()).add(prestamo);
    }

    @Override
    public Prestamo buscarPorId(Integer id) {
        if(!listaPrestamos.containsKey(id))
            return null;
        return (Prestamo) listaPrestamos.get(id);
    }

    public Prestamo buscarPorId2(Integer id) {
        for(List<Prestamo> lista : listaPrestamos.values()){
            for(Prestamo p : lista)
            {
                if(p.getId() == id){
                    return p;
                }
            }
        }
        return null;
    }

    @Override
    public String listarTodos() {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, List<Prestamo>> entry : listaPrestamos.entrySet()) {
            sb.append("ID Socio: ")
                    .append(entry.getKey())
                    .append("\n");

            sb.append("Préstamos:\n");
            for (Prestamo p : entry.getValue()) {
                sb.append(p).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public Prestamo eliminar(Integer idPrestamo) {
        for(List<Prestamo> listP : listaPrestamos.values()){
            Iterator<Prestamo> iterator = listP.iterator();

            while(iterator.hasNext()){
                Prestamo prestamo = iterator.next();
                if(prestamo.getId() == idPrestamo){
                    iterator.remove();
                    return prestamo;
                }
            }
        }
        return  null;
    }

    @Override
    public String toString() {
        return "RepositorioPrestamo{" +
                "listaPrestamos=" + listarTodos() +
                '}';
    }

    public JSONArray toJSON(){
        JSONArray listaPersonasJSON = new JSONArray();
        JSONArray listaPrestamosJSON;

        for (List<Prestamo> lista : listaPrestamos.values()) {
            listaPrestamosJSON = new JSONArray();
            for (Prestamo p : lista) {
                listaPrestamosJSON.put(p.toJSON());
            }
            listaPersonasJSON.put(listaPrestamosJSON);
        }

        return  listaPersonasJSON;
    }
}
