package Interface;

import Modal.Cancion;

public interface IReproduccion {
    String reproducir();
    void aniadirCancion(Cancion cancion);
    boolean eliminarCancion(int numCancion);
    String verMiLista();
}
