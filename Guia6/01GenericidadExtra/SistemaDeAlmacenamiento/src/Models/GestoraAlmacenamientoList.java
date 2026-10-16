package Models;

import Interfaces.IAlmacenamiento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestoraAlmacenamientoList implements IAlmacenamiento<Documento,Integer> {
    private List<Documento> documentoList;

    public GestoraAlmacenamientoList() {
        this.documentoList = new ArrayList<>();
    }


    @Override
    public boolean agregar(Documento documento) {
        return documentoList.add(documento);
    }

    @Override
    public boolean eliminar(Integer pos) {
        return documentoList.remove(pos.intValue()) != null;
    }

    @Override
    public Documento obtener(Integer pos) {
        return documentoList.get(pos);
    }

    @Override
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        Iterator<Documento> it = documentoList.iterator();

        while(it.hasNext())
        {
            sb.append(it.next()).append("\n");
        }
        return sb.toString();
    }

    public int pos (String titulo,String autor)
    {
        return documentoList.equals(titulo)
    }

    @Override
    public String toString() {
        return "GestoraAlmacenamientoList{" +
                "documentoList=" + mostrar() +
                '}';
    }
}
