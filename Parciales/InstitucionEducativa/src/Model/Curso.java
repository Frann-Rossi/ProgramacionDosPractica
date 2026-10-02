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

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public boolean agregarAlumnos(Alumno alumno)
    {
        return alumnos.add(alumno);
    }

    public boolean eliminarAlumnos(int dni)
    {
        Alumno a = new Alumno(dni);
        return alumnos.remove(a);
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

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", alumnos=" + mostrarAlumnos() +
                '}';
    }
}
