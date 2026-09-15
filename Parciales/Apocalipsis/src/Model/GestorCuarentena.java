package Model;

import Interface.IAtacar;

import java.util.HashMap;

public class GestorCuarentena {
    private HashMap<Integer, IAtacar> participantes;

    public GestorCuarentena() {
        this.participantes = new HashMap<>();
    }
}
