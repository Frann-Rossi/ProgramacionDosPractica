package Interface;

import Modelo.Empleado;

public interface IOutplacement {
    default boolean despedirEmpleado(Empleado empleado)
    {
       if(empleado.isActivo())
       {
             empleado.setActivo(false);
             return true;
       }
       return  false;
    }
}
