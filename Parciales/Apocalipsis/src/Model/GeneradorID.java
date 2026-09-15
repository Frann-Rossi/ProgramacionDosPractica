package Model;

public class GeneradorID {
    private static int idGlobal = 0;

    public static int getSiguienteId() {
        int idAsignado = idGlobal;
        idGlobal++;
        return idAsignado;
    }
}
