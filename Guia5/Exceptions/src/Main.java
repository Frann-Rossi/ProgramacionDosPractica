import Exceptions.ValorInvalidoException;
import Models.Juego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int intento ;
        int opc;
        Juego juego = null;

        do
        {
            System.out.println("Juego == 1");
            System.out.println("Salir == 0");
            System.out.println("Ingrese una opcion:");

            opc = scanner.nextInt();

            switch (opc)
            {
                case 1:
                    juego = new Juego();
                    System.out.println("\nIngrese un numero para adivinar");
                    try {
                        intento = scanner.nextInt();
                        System.out.println(juego.validadNumero(intento));
                        System.out.println(juego.compararNumero(intento));
                    }
                    catch (ValorInvalidoException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
            }
        }while (opc != 0);
    }
}