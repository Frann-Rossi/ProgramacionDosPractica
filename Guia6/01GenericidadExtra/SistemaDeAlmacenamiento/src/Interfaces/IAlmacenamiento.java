package Interfaces;

public interface IAlmacenamiento<E,K>  {
    boolean agregar(E e);
    boolean eliminar(K k);
    E obtener(K k);
    String mostrar();
}
