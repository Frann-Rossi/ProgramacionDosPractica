package Modal;

import Interface.ICaminante;
import Interface.INadador;
import Interface.IVolador;

public class Pato extends Animal implements IVolador, INadador, ICaminante {
    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    public String caminar() {
        return "El pato camina";
    }

    @Override
    public String nadar() {
        return "El pato nada";
    }

    @Override
    public String volar() {
        return "El pato vuela";
    }
}
