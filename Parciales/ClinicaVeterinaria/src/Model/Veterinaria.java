package Model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Veterinaria {
    private HashMap<Integer,Animal> listaAnimal;

    public Veterinaria() {
        this.listaAnimal = new HashMap<>();
    }

    public boolean agregarAnimal(Animal animal)
    {
        return listaAnimal.putIfAbsent(animal.getId(),animal) == null;
    }

    public boolean quitarAnimal(Integer id)
    {
        return listaAnimal.remove(listaAnimal.remove(id)) != null;
    }

    public String mostrarListaVeterinaria()
    {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<Integer,Animal>> it = listaAnimal.entrySet().iterator();

        while (it.hasNext())
        {
            Map.Entry<Integer,Animal> entry = it.next();
            sb.append(entry.getValue().toString());
        }

     return sb.toString();
    }

    @Override
    public String toString() {
        return "Veterinaria{" +
                "listaAnimal=" + mostrarListaVeterinaria() +
                '}';
    }


}
