import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Ejercicio 1
//        // Punto A
//        Empleado empleado1 = new Empleado("23456345 ", "Carlos", "Gutiérrez", 25000);
//        // Punto B
//        Empleado empleado2 = new Empleado("34234123  ", "Ana ", "Sánchez", 27500);
//
//        // Punto C
//        System.out.println(empleado1.toString());
//        System.out.println(empleado2.toString());
//
//        // Punto D
//        empleado1.aumentoDeSuelto(1.15);
//        System.out.println(empleado1.toString());
//        System.out.println(empleado1.salarioAnual());


        // Ejercicio 2
//        CuentaBancaria cuenta1 = new CuentaBancaria("Cuenta uno", 15000);
//        boolean res = cuenta1.credito(2500);
//        System.out.println(cuenta1);
//        boolean res2 = cuenta1.debit(1500);
//        if (res2) {
//            System.out.println(cuenta1);
//        }
//        boolean res3 = cuenta1.debit(30000);
//        if (res3) {
//            System.out.println(cuenta1);
//        } else {
//            System.out.println("El valor no es valido");
//        }


        // Ejercicio 3
//        Libro libro1 = new Libro("Harry Potter", "J.K. Rowling", 22.22, 10);
//        System.out.println(libro1.toString());
//        libro1.venderCopias(4);
//        System.out.println(libro1.toString());
//        libro1.incremetarCopias(2);
//        System.out.println(libro1.toString());

        // Ejercicio 4
        ItemVenta item = null;
        String descripcion;
        int cantidad;
        double precioUnitario;
        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar item");
            System.out.println("2. Mostrar item");
            System.out.println("3. Modificar cantidad");
            System.out.println("4. Modificar precio unitario");
            System.out.println("5. Mostrar precio total");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese descripcion: ");
                    descripcion = scanner.nextLine();
                    System.out.print("Ingrese cantidad: ");
                    cantidad = scanner.nextInt();
                    System.out.print("Ingrese precio unitario: ");
                    precioUnitario = scanner.nextDouble();
                    item = new ItemVenta(descripcion, cantidad, precioUnitario);
                    break;
                case 2:
                    System.out.println(item.toString());
                    break;
                case 3:
                    System.out.println("Ingrese una nueva cantidad:");
                    cantidad = scanner.nextInt();
                    item.setCantidad(cantidad);
                    break;
                case 4:
                    System.out.print("Ingrese el nuevo precio unitario: ");
                    precioUnitario = scanner.nextDouble();
                    item.setPrecioUnitario(precioUnitario);
                    break;
                case 5:
                    System.out.println("Precio total: " + item.calcularPrecioTotal());
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");

            }
        } while (opcion != 6);

    }
}