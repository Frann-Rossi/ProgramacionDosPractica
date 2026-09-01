import Modal.Dispositivo;
import Modal.Lampara;

public class Main {
    public static void main(String[] args) {
        Lampara lampara = new Lampara("10");
        System.out.println(lampara);
        System.out.println(lampara.encendido());
    }
}