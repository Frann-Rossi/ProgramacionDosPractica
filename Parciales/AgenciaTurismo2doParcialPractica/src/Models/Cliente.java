package Models;

import Interfaces.IToJson;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Cliente implements IToJson {
    private String nombre;
    private String correo;
    private List<OpinionActividad> historialActividades;


    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.historialActividades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(correo, cliente.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(correo);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    public JSONObject toJson(){
        JSONObject clienteJSON = new JSONObject();
        clienteJSON.put("nombre",nombre);
        clienteJSON.put("correo",correo);
        return  clienteJSON;
    }

    public boolean guardarOpinionActividad(OpinionActividad opinion)
    {
        if(historialActividades.contains(opinion))
            return false;

        return historialActividades.add(opinion);
    }

    public boolean eliminarOpinionActividad (int id)
    {
        return  historialActividades.removeIf(o -> o.getId() == id);
    }

//    public boolean eliminarOpinionActividad(int id)
//    {
//        for (OpinionActividad o : historialActividades)
//        {
//            if (o.getId() == id)
//            {
//                historialActividades.remove(o);
//                return true;
//            }
//        }
//        return false;
//    }

    public OpinionActividad eliminarOpinionActividad (OpinionActividad opinion)
    {
        return  historialActividades.remove(opinion) ? opinion : null;
    }

//    public OpinionActividad eliminarOpinionActividad (OpinionActividad opinion)
//    {
//        if(historialActividades.remove(opinion))
//        {
//            return opinion;
//        }
//        return  null;
//    }

    public String mostrar()
    {
        StringBuilder sb = new StringBuilder();
        for(OpinionActividad opinion : historialActividades)
        {
            sb.append(opinion).append("\n");
        }
        return sb.toString();
    }

//    public JSONArray toJSON()
//    {
//        JSONArray listaClientesJSON = new JSONArray();
//        for (Cliente c: historialActividades)
//        {
//            listaClientesJSON.put(c.toJson());
//        }
//        return  listaClientesJSON;
//    }
}
