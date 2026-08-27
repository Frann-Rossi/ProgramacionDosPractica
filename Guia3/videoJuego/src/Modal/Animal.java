package Modal;

public abstract class Animal {

    private String nombre;

    public Animal(String nombre) {
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
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void comer() {
        System.out.println("El animal está comiendo");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo");
    }
}
