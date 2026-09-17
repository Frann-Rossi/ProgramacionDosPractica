package Model;

import java.util.ArrayList;

public final class Perro extends Animal {
    private boolean vacunado;
    private VisitasMedicas visitas;
    public Perro(String nombre, int edad,boolean vacunado) {
        super(nombre, edad);
        this.vacunado = vacunado;
        this.visitas = new VisitasMedicas();
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
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
        return "Perro{" +
                "vacunado=" + vacunado +
                ", visitas=" + mostrarVisitas() +
                "} " + super.toString();
    }

    @Override
    public boolean alta() {
        return true;
    }

    @Override
    public boolean baja() {
        return true;
    }
}
