import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empleado[] empleados = new Empleado[10];
        int opcion;
        int cantidadEmpleados = 0;
        String nombre;
        int horasTrabajadas;
        double valorHora;

        do {
            System.out.println("Cargar empleado tiempo completo == 1");
            System.out.println("Cargar empleado por ahora == 2");
            System.out.println("Cargar empleado contratista == 3");
            System.out.println("Mostrar empleados == 4");
            System.out.println("Mostrar pagos == 5");
            System.out.println("Salir == 0");
            System.out.println("Ingrese una opcion:");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el salario mensual:");
                    double salarioMensual = scanner.nextDouble();
                    empleados[cantidadEmpleados] = new EmpleadoTiempoCompleto(nombre, salarioMensual);
                    cantidadEmpleados++;
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese las horas trabajadas:");
                    horasTrabajadas = scanner.nextInt();
                    System.out.println("Ingrese el valor por hora:");
                    valorHora = scanner.nextDouble();
                    empleados[cantidadEmpleados] = new EmpleadoPorHoras(nombre, horasTrabajadas, valorHora);
                    cantidadEmpleados++;
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese las horas trabajadas:");
                    horasTrabajadas = scanner.nextInt();
                    System.out.println("Ingrese el valor por hora:");
                    valorHora = scanner.nextDouble();
                    System.out.println("Ingrese la tarifa del proyecto:");
                    double tarifaProyecto = scanner.nextDouble();
                    empleados[cantidadEmpleados] = new EmpleadoContratista(nombre, horasTrabajadas, valorHora, tarifaProyecto);
                    cantidadEmpleados++;
                    break;
                case 4:
                    for (int i = 0; i < cantidadEmpleados; i++) {
                        System.out.println(empleados[i]);
                    }
                    break;
                case 5:
                    for (int i = 0; i < cantidadEmpleados; i++) {
                        double salario = empleados[i].calcularPago();
                        System.out.println("El salario de " + empleados[i].getNombre() + " fue: " + salario);
                    }
            }
        } while (opcion != 0);
    }
}