import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmpleadoTiempoCompleto empleadoTiempoCompleto = null;
        EmpleadoPorHoras empleadoPorHoras = null;
        EmpleadoContratista empleadoContratista = null;

        int opcion;
        String nombre;

        do {
            System.out.println("Cargar empleado tiempo completo == 1");
            System.out.println("Cargar empleado por ahora == 2");
            System.out.println("Cargar empleado contratista == 3");
            System.out.println("Salir == 0");
            System.out.println("Ingrese una opcion:");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    int salarioMensual;
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el salario mensual:");
                    salarioMensual = scanner.nextInt();
                    empleadoTiempoCompleto = new EmpleadoTiempoCompleto(nombre,salarioMensual);
                    System.out.println(empleadoTiempoCompleto.toString());
                    break;
                case 2:
                    int horasTrabajadas;
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese las horas trabajadas:");
                    horasTrabajadas = scanner.nextInt();
                    empleadoPorHoras = new EmpleadoPorHoras(nombre,horasTrabajadas);
                    System.out.println(empleadoPorHoras.toString());
                    break;
                case 3:
                    int salarioPorHoras;
                    int tarifaProtecto;
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el salario por horas:");
                    salarioPorHoras = scanner.nextInt();
                    System.out.println("Ingrese tarifa del proyecto:");
                    tarifaProtecto = scanner.nextInt();
                    empleadoContratista = new EmpleadoContratista(nombre,salarioPorHoras,tarifaProtecto);
                    System.out.println(empleadoContratista.toString());
                    break;
            }
        } while (opcion != 0);
    }
}