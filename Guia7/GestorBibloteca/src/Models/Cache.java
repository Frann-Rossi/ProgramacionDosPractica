package Models;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Cache <T, ID> {
    private Map<ID,T> datos;

    public Cache() {
        this.datos = new HashMap<>();
    }

    public T obtener(ID id){
        if(datos.containsKey(id)){
            return datos.get(id);
        }
        return null;
    }

    public T cargar(ID id ,Supplier<T> supplier)
    {
        T obj = supplier.get();

        if (obj != null) {
            datos.put(id,obj);
        }
        return obj;
    }
}
