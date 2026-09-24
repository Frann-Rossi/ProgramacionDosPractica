package Modelo;

import java.util.*;

public class GestoraEmpleados {
    private Map<Integer,Empleado> empleados;
    private List<AgenteExterno>  empleadosExternos;

    public GestoraEmpleados() {
        this.empleados = new HashMap<>();
        this.empleadosExternos = new ArrayList<>();
    }

    public boolean agregar(Empleado empleado)
    {
        return empleados.putIfAbsent(empleado.getNroLegajo(),empleado) == null;
    }

    public  boolean agregar(AgenteExterno agente)
    {
        return empleadosExternos.add(agente);
    }

    public boolean eliminarEmpleado(int nroLegajo)
    {
        return empleados.remove(nroLegajo) != null;
    }

    public boolean eliminarAgenteExterno(int id)
    {
        Iterator<AgenteExterno> it = empleadosExternos.iterator();

        while(it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                return true;
            }
        }
        return  false;
    }

    public String mostrarEmpleados()
    {
        StringBuilder sb = new StringBuilder();
        for (Empleado e : empleados.values())
        {
            sb.append(e).append('\n');
        }
        return  sb.toString();
    }

    public String mostrarAgenteExterno()
    {
        StringBuilder sb = new StringBuilder();
        for (AgenteExterno aE : empleadosExternos)
        {
            sb.append(aE).append('\n');
        }
        return  sb.toString();
    }
}
