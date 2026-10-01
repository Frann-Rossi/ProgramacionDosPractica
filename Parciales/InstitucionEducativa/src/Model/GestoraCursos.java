package Model;

import java.util.HashMap;
import java.util.Map;

public class GestoraCursos {
    //private Map<String, HashSet<Alumno>> cursos;
    private Map<String, Curso> cursos;

    public GestoraCursos() {
        this.cursos = new HashMap<>();
    }
}
