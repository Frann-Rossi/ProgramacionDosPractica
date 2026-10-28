package Interfaces;

import Exceptions.BibliotecaException;

public interface IRepositorio <T,ID> {
    boolean guardar (T t);
    T buscarPorId(ID id) throws BibliotecaException;
    String listarTodos();
    T eliminar (ID id);
}
