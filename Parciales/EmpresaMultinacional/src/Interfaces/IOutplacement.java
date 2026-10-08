package Interfaces;

import Models.Empleado;

public interface IOutplacement {
    default boolean despedir(Empleado empleado) {
        if(empleado.isActivo())
        {empleado.setActivo(false);
            return true;}
        return false;
    }
}
