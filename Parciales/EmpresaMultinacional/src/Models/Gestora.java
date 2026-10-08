package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gestora {
    private List<EmpleadoExterno> mapaEmpleadosExternos;
    private Map<Integer, Empleado> mapaEmpleado;

    public Gestora() {
        this.mapaEmpleadosExternos = new ArrayList<>();
        this.mapaEmpleado = new HashMap<>();
    }

    public boolean agregar(EmpleadoExterno e) {
        return mapaEmpleadosExternos.add(e);
    }

    public boolean agregar(Empleado e) {
        return mapaEmpleado.put(e.getNroLegajo(), e) == null;
    }

    /*
    public boolean eliminar(int id) {
        return mapaEmpleadosExternos.removeIf(e -> e.getId().equals(id));
    }
    */

    public boolean eliminar(int id)
    {
        return mapaEmpleadosExternos.remove(new Subcontratada(id));
    }

    public boolean eliminar(Integer nro) {
        return mapaEmpleado.remove(nro) != null;
    }

    public String mostrarEmpleadosExternos()
    {
        StringBuilder sb = new StringBuilder();
        for (EmpleadoExterno e : mapaEmpleadosExternos)
        {
            sb.append(e).append("\n");
        }
        return sb.toString();
    }

    public  String mostrarEmpleados()
    {
        StringBuilder sb = new StringBuilder();
        for (Empleado e : mapaEmpleado.values())
        {
            sb.append(e).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Gestora{" +
                "mapaEmpleadosExternos=" + mostrarEmpleadosExternos() +
                ", mapaEmpleado=" + mostrarEmpleados() +
                '}';
    }
}
