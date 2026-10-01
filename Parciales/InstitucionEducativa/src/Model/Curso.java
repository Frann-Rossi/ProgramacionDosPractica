package Model;

import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String nombreCurso;
    private Set<Alumno> alumnos;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.alumnos = new HashSet<>();
    }

    public boolean agregarAlumonos(Alumno alumno)
    {
        return alumnos.add(alumno);
    }

    public boolean eliminarAlumno(Alumno alumno)
    {
        return alumnos.remove(alumno);
    }

    public String mostrarAlumnos()
    {
        StringBuilder sb = new StringBuilder();
        for (Alumno a : alumnos)
        {
            sb.append(a).append("\n");
        }
        return sb.toString();
    }




}
