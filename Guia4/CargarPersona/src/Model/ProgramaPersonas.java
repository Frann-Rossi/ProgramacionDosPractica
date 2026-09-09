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

    public void  agregarUnaPesona(Persona persona)
    {
        personas.put(persona.getDni(),persona);
    }

    public void eliminarUnaPersona(String dni)
    {
        personas.remove(dni);
    }
}
