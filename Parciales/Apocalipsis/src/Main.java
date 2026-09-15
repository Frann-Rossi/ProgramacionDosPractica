import Interface.IAtacar;
import Model.*;
import Enum.EFaccion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Humano humano1 = new Humano("Franco", 31, EFaccion.COMUNA4);
        Humano humano2 = new Humano("Pablo", 32, EFaccion.MILITARES);
        Humano humano3 = new Humano("Joel", 45, EFaccion.LUCIERNAGAS);

        Infectado corredor = new Regular("Corredor Básico", "Calles de Boston", 3);
        Infectado acechador = new Agil("Acechador Sigiloso", "Hospital", 12, 3.5);
        Infectado gordinflon = new Pesado("Gordinflón", "Gimnasio Escolar", 25, 50);

        GestorCuarentena gestor = new GestorCuarentena();

        gestor.agregar(humano1);
        gestor.agregar(humano2);
        gestor.agregar(humano3);
        gestor.agregar(corredor);
        gestor.agregar(acechador);
        gestor.agregar(gordinflon);

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Listar participantes");
            System.out.println("2. Buscar participante por ID");
            System.out.println("3. Eliminar participante");
            System.out.println("4. Modificar infectados de un participante");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n--- LISTA DE PARTICIPANTES ---");
                    System.out.println(gestor.listar());
                    break;
                case 2:
                    System.out.print("Ingrese el ID a buscar: ");
                    int idBuscar = scanner.nextInt();
                    IAtacar encontrado = gestor.buscarParticipantes(idBuscar);
                    if (encontrado != null) {
                        System.out.println("\n¡Participante encontrado!");
                        System.out.println(encontrado.toString());
                        System.out.println("Daño de ataque: " + encontrado.atacar());
                    } else {
                        System.out.println("\nError: No se encontró a nadie con el ID " + idBuscar);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el ID a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    if (gestor.eliminarParticipantes(idEliminar)) {
                        System.out.println("\n¡Participante eliminado con éxito!");
                    } else {
                        System.out.println("\nError: El ID ingresado no existe en el sistema.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el ID del Infectado: ");
                    int idModificar = scanner.nextInt();
                    System.out.print("Ingrese la nueva cantidad de humanos infectados: ");
                    int nuevaCant = scanner.nextInt();
                    if (gestor.modificarCantInfectados(idModificar, nuevaCant)) {
                        System.out.println("\n¡Cantidad de infectados modificada correctamente!");
                    } else {
                        System.out.println("\nError: El ID no existe o le pertenece a un Humano (los humanos no tienen esta estadística).");
                    }
                    break;
                case 5:
                    System.out.println("\nSaliendo del sistema de Cuarentena... ¡Sobrevive!");
                    break;
                default:
                    System.out.println("\nOpción inválida. Por favor, ingrese un número del 1 al 5.");
                    break;
            }
        }while (opcion != 5);

    }
}
