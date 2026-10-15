import Exceptions.DividirPorCeroException;
import Models.OperacionMatematica;

public class Main {
    public static void main(String[] args) {
        double sumar = OperacionMatematica.sumar(1,1);
        try
        {
            double dividir = OperacionMatematica.dividir(1,0);
            System.out.println("Dividir:" + dividir);
        }
        catch (DividirPorCeroException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Suma:" + sumar);

    }
}