package Model;

import Interface.IAtacar;

import java.util.HashMap;
import  Enum.EFaccion;

public class GestorCuarentena {
    private HashMap<Integer, IAtacar> participantes;

    public GestorCuarentena() {
        this.participantes = new HashMap<>();
    }

    public boolean agregar(IAtacar atacante){
        if(participantes.containsKey(atacante.getId()))
        {
            return  false;
        }
        participantes.put(atacante.getId(), atacante);
        return true;
    }

    public boolean eliminarParticipantes(int id)
    {
        return  participantes.remove(id) != null;
    }

    public IAtacar buscarParticipantes(int id)
    {
       return participantes.get(id);
    }

    public String listar()
    {
        StringBuilder sb = new StringBuilder();
        for (IAtacar p : participantes.values())
        {
            sb.append(p.toString()).append("\n");
        }
        return  sb.toString();
    }

    public boolean modificarCantInfectados(int id, int nuevaCant) {
        IAtacar participante = buscarParticipantes(id);
        if (participante == null) {
            return false;
        }
        if (participante instanceof Infectado infectadoReal) {
            infectadoReal.setHumanosInfectados(nuevaCant);
            return true;
        }
        return false;
    }

    int contarParticipantesPorTipo(EFaccion faccion)
    {
        int contador = 0;
        for(IAtacar p : participantes.values())
        {
            if(p instanceof Humano humanoReal)
            {
                if(humanoReal.getFaccion() == faccion)
                {
                    contador++;
                }
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        return "GestorCuarentena{" +
                "participantes=" + listar() +
                '}';
    }
}
