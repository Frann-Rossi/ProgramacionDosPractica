package Model;

import java.util.HashMap;

public class ProgramaPersonas {
    HashMap<String,Persona> personas;

    public ProgramaPersonas() {
        this.personas = new HashMap<>();
    }

    public HashMap<String, Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(HashMap<String, Persona> personas) {
        this.personas = personas;
    }

    public void  agregarUnaPesona(Persona persona)
    {
        personas.put(persona.getDni(),persona);
    }

    public void agregarPersonas(Persona[] personas) {
        for (Persona persona : personas) {
            agregarUnaPesona(persona);
        }
    }


    public void eliminarUnaPersona(Persona persona)
    {
        personas.remove(persona.getDni());
    }
}
