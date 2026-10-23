package Interfaces;

public interface IRepositorio <T,ID> {
    boolean guardar (T t);
    T buscarPorId(ID id);
    String listarTodos();
    T eliminar (ID id);
}
