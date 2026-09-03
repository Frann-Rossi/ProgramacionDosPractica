package Modal;

public abstract class Futbolista {
    private String nombre;

    public Futbolista(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
