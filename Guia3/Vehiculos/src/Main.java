import Modal.Autobus;
import Enum.ETipoTransporte;
import Modal.Bicicleta;
import Modal.Tranvia;

public class Main {
    public static void main(String[] args) {
        Autobus autobus = new Autobus("Linea A",50);
        System.out.println(autobus);

        Bicicleta bicicleta = new Bicicleta("123qwe");
        System.out.println(bicicleta);

        Tranvia tranvia = new Tranvia(60,"Ruta 1");
        System.out.println(tranvia);
    }
}