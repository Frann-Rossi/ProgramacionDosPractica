import Enums.ENivelExperiencia;
import Models.Empleado;
import Models.Tecnico;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Tecnico("nombre",121,12212, ENivelExperiencia.SEMISENIOR);
    }
}