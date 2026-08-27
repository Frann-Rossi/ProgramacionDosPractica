package Modal;

import Interface.IVolador;

public class Murcielago extends Animal implements IVolador {

    public Murcielago(String nombre) {
        super(nombre);
    }



    @Override
    public String volar() {
        return "Volando....";
    }


}
