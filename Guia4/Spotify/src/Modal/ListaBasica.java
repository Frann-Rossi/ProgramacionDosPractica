package Modal;

import Interface.IReproduccion;

import java.util.Stack;

public class ListaBasica implements IReproduccion {

    private String nombre;
    private Stack<Cancion> miLista;

    public ListaBasica(String nombre) {
        this.nombre = nombre;
            this.miLista = new Stack<>();
    }

    @Override
    public String reproducir() {
        Stack<Cancion> listaAux = new Stack<>();
        Cancion reproducida = miLista.pop();

        while (!listaAux.isEmpty()){
            listaAux.push(miLista.pop());
        }
        miLista.push(reproducida);

        while (!miLista.isEmpty()){
            listaAux.push(listaAux.pop());
        }
        return reproducida.toString();
    }

    @Override
    public void aniadirCancion(Cancion cancion) {
        miLista.add(cancion);
    }

    @Override
    public boolean eliminarCancion(int numCancion) {
        return false;
    }

    @Override
    public String verMiLista() {
        return miLista.toString();
    }
}
