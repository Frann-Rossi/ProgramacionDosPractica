package Model;

import java.util.ArrayList;
import java.util.List;

public class VisitasMedicas {
    private List<String> visitasMedicas;

    public VisitasMedicas() {
        this.visitasMedicas = new ArrayList<>();
    }

    public boolean agregarVisita(String visita)
    {
        return  visitasMedicas.add(visita);
    }

    public  boolean quitarVisita(String visita)
    {
        return visitasMedicas.remove(visita);
    }

    public String mostrarVisitas()
    {
        StringBuilder sb = new StringBuilder();
        for (String v : visitasMedicas)
        {
            sb.append(v).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "VisitasMedicas{" +
                "visitasMedicas=" + mostrarVisitas() +
                '}';
    }
}
