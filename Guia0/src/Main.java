import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Ejercio 1
        /*
        int numN = 1;
        double numA = 1.1;
        char numC = '1';
        double res1 = numA + numN;
        double res2 = numA - numN;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(numC);
        */

        // Ejercio 2
        /*
        int numX = 1;
        int numY = 2;
        double numN1 = 2.2;
        double numM = 2.3;
        int resNum = numX * numY;
        double resNum2 = numN1 / numM;
        System.out.println(resNum);
        System.out.println(resNum2);
        */

        // Ejercio 3
        /*
        System.out.println("Ingrese un valor por teclado:");
        int aumento = scanner.nextInt();
        System.out.println(aumento);
        aumento += 77;
        System.out.println(aumento);
        aumento = 3 * 2;
        System.out.println(aumento);
        */

        // Ejercicio 4
        /*
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        B = C;
        System.out.println(B);
        C = A;
        System.out.println(C);
        A = D;
        System.out.println(A);
        D = B;
        System.out.println(D);
        */

        // Ejercicio 5
        /*
        int A = 2;
        if(A % 2 == 0)
        {
            System.out.println("Par");
        }
        else
        {
            System.out.println("Impar");
        }
        */

        // Ejercicio 6
        /*
        System.out.println("Ingrese un valor:");
        int B = scanner.nextInt();
        if(B < 0)
        {
            System.out.println("Negativo");
        }
        else
        {
            System.out.println("Positivo");
        }
        */

        /*
        // Ejercicio 7
        System.out.println("Ingrese una palabra:");
        char caracter = scanner.next().charAt(0);
        System.out.println(caracter);
        */

        // Ejercicio 8


        // Ejercicio 9
        /*
        System.out.println("Ingrese un nombre:");
        String nombre = scanner.next();
        System.out.println("Buenos Dias " + nombre);
        */

        // Ejercicio 10
        /*
        System.out.println("Ingrese el radio:");
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area es:"+ area);
        */

        // Ejercicio 11
        /*
        System.out.println("Ingrese una valecidad:");
        int velKM = scanner.nextInt();
        int velMS = velKM * 1000 / 3600;
        System.out.println(velMS);
        */

        // Ejercicio 12
        /*
        System.out.println("Ingrese el cateto 1:");
        double cateto1 = scanner.nextDouble();
        System.out.println("Ingrese el cateto 2:");
        double cateto2 = scanner.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        System.out.println(hipotenusa);
        */

        // Ejercicio 13
        /*
        System.out.println("Ingrese un valor para el radio:");
        double radio = scanner.nextDouble();
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio,3);
        System.out.println(volumen);
        */

        // Ejercicio 14
        /*
        System.out.println("Ingrese un valor de 3 cifras:");
        int num = scanner.nextInt();
        int centenas = num / 100;
        int decenas = (num / 10) % 10;
        int unidades = num % 10;
        System.out.println(centenas);
        System.out.println(decenas);
        System.out.println(unidades);
        */

        // Ejercicio 15
        /*
        System.out.println("Ingrese un valor de 5 cifras:");
        String num = scanner.nextLine();
        for (int i = 0; i < num.length(); i++) {
            if(i % 2 == 0)
            {
               System.out.println(num.charAt(i));
            }
        }
        */

        // Ejercicio 16
        /*
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int S = scanner.nextInt();
        if(H >= 0  && H <= 23 && M >= 0 && M <= 59 && S >= 0 && S <= 59)
        {
            System.out.println("Hora valida:" + H + ":" + M + ":" + S);
        }
        else
        {
            System.out.println("Hora no valida:" + H + ":" + M + ":" + S);
        }
        */

        // Ejercicio 17
        /*
        String nombre = scanner.next();
        int edad = scanner.nextInt();
        double salario = scanner.nextDouble();
        double aumento;
        double nuevoSalarios;

        if(edad > 60)
        {
            aumento = salario * 0.15;
            nuevoSalarios = salario + aumento;
            System.out.println("Nombre:" + nombre);
            System.out.println("Edad:" + edad);
            System.out.println("Salario:" + nuevoSalarios);
        }
        else if (edad >= 51 && edad <= 60)
        {
            aumento = salario * 0.10;
            nuevoSalarios = salario + aumento;
            System.out.println("Nombre:" + nombre);
            System.out.println("Edad:" + edad);
            System.out.println("Salario:" + nuevoSalarios);
        }
        else if (edad >= 19 && edad <= 50)
        {
            aumento = salario * 0.05;
            nuevoSalarios = salario + aumento;
            System.out.println("Nombre:" + nombre);
            System.out.println("Edad:" + edad);
            System.out.println("Salario:" + nuevoSalarios);
        }
        else
        {
            System.out.println("Nombre:" + nombre);
            System.out.println("Edad:" + edad);
            System.out.println("Salario:" + salario);
        }
        */

        // Ejercicio 18
    }
}