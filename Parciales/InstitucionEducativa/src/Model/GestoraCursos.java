package Model;

import java.util.HashMap;
import java.util.Map;

public class GestoraCursos {
    //private Map<String, HashSet<Alumno>> cursos;
    private Map<String, Curso> mapaCursos;

    public GestoraCursos() {
        this.mapaCursos = new HashMap<>();
    }

    public boolean agregarCurso (String nombreCurso)
    {
        if(!mapaCursos.containsKey(nombreCurso))
        {
            mapaCursos.put(nombreCurso,new Curso(nombreCurso));
            return true;
        }
        return false;
    }

    public boolean agregarAlumnosCurso(String nombreCurso, Alumno alumno)
    {
        if(mapaCursos.containsKey(nombreCurso))
        {
            Curso a = mapaCursos.get(nombreCurso);
            a.agregarAlumnos(alumno);
            return  true;
        }
        return  false;
    }

    public  boolean eliminarAlumnosCurso(String nombreCurso,int dni)
    {
        if(mapaCursos.containsKey(nombreCurso))
        {
            return mapaCursos.get(nombreCurso).eliminarAlumnos(dni);
        }
        return false;
    }
}
