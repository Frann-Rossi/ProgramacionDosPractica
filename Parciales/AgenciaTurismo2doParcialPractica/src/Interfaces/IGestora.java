package Interfaces;

public interface IGestora <T,ID>{
    boolean guardar(T t);
    T buscarID (ID id);
    String mostrar();
    T eliminar (ID id);
}
