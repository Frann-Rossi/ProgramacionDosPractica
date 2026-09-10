package Modal;

import java.util.HashMap;
import java.util.Objects;

public class Aeropuerto {
    private String nombre;
    private final String identificador;
    private String direccion;
    private int capacidad;
    private  HashMap<String,Hangar> hangares;

    public Aeropuerto(String nombre,String identificador, String direccion, int capacidad) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.hangares = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", identificador='" + identificador + '\'' +
                ", direccion='" + direccion + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Aeropuerto that)) return false;
        return Objects.equals(identificador, that.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificador);
    }

    public boolean agregarAvion(Avion avion){
        String tipoAvion = avion.getTipo().toString();
        if(!hangares.containsKey(tipoAvion))
        {
            hangares.put(tipoAvion,new Hangar(tipoAvion));
        }
        return hangares.get(tipoAvion).agregarAvion(avion);
    }

    public  boolean quitarAvion(Avion avion)
    {
        String tipoAvion = avion.getTipo().toString();
        if(!hangares.containsKey(tipoAvion)){
            return  false;
        }
        return  hangares.get(tipoAvion).quitarAvion(avion);
    }

    public void mostrar
}
