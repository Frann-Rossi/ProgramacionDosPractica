package Modal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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

    public String mostrarAvionesAeropuerto()
    {
       StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String,Hangar>> it = hangares.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String, Hangar> entry = it.next();

            String nombreHangar = entry.getKey();
            Hangar hangar = entry.getValue();

            sb.append("Hangar: ").append(nombreHangar).append('\n');
            sb.append(hangar.mostrarAvionesHangar()).append('\n');
        }
//        for(String tipo: hangares.keySet())
//            {
//                sb.append("\nHangar "+ tipo + ": \n { "+ hangares.get(tipo).mostrarAvionesHangar() +" } ");
//            }
//        for (Map.Entry<String, Hangar> entry : hangares.entrySet()) {
//            String nombreHangar = entry.getKey();
//            Hangar hangar = entry.getValue();
//
//            sb.append("Hangar: ").append(nombreHangar).append('\n');
//            sb.append(hangar.mostrarAvionesHangar()).append('\n');
//        }
        return sb.toString();
    }
}


