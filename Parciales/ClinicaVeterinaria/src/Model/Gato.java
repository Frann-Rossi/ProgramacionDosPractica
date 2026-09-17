package Model;

import java.util.ArrayList;

public final class Gato extends  Animal {
    private boolean esterilizados;
    private VisitasMedicas visitas;

    public Gato(String nombre, int edad, boolean esterilizados) {
        super(nombre, edad);
        this.esterilizados = esterilizados;
        this.visitas = new VisitasMedicas();
    }

    public boolean isEsterilizados() {
        return esterilizados;
    }

    public void setEsterilizados(boolean esterilizados) {
        this.esterilizados = esterilizados;
    }

    public boolean agregarVisita(String visita)
    {
        return visitas.agregarVisita(visita);
    }

    public boolean quitarVisita(String visita)
    {
        return visitas.quitarVisita(visita);
    }

    public String mostrarVisitas()
    {
        return visitas.mostrarVisitas();
    }

    @Override
    public String toString() {
        return "Gato{" +
                "esterilizados=" + esterilizados +
                ", visitas=" + mostrarVisitas() +
                "} " + super.toString();
    }


}
