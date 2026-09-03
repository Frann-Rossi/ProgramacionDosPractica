import Modal.*;

public class Main {

    public static void main(String[] args) {

        Lampara lampara = new Lampara("Alta");
        Termostato termostato = new Termostato("22");
        Parlante parlante = new Parlante("Despacito");

        // Estado inicial
        System.out.println(lampara);
        System.out.println(termostato);
        System.out.println(parlante);

        // Encendemos los dispositivos
        System.out.println("Lampara encendida: " + lampara.encender());
        System.out.println("Termostato encendido: " + termostato.encender());
        System.out.println("Parlante encendido: " + parlante.encender());

        // Consultamos si están encendidos
        System.out.println("¿Lampara encendida? " + lampara.isEncendido());
        System.out.println("¿Termostato encendido? " + termostato.isEncendido());
        System.out.println("¿Parlante encendido? " + parlante.isEncendido());

        // Intentamos encender nuevamente la lámpara
        System.out.println("Intentar encender lámpara otra vez: " + lampara.encender());

        // Apagamos los dispositivos
        System.out.println("Lampara apagada: " + lampara.apagar());
        System.out.println("Termostato apagado: " + termostato.apagar());
        System.out.println("Parlante apagado: " + parlante.apagar());

        // Consultamos nuevamente
        System.out.println("¿Lampara encendida? " + lampara.isEncendido());
        System.out.println("¿Termostato encendido? " + termostato.isEncendido());
        System.out.println("¿Parlante encendido? " + parlante.isEncendido());
    }
}