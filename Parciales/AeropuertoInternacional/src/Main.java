import Modal.Aeropuerto;
import Modal.AvionComercial;
import Modal.AvionDeCarga;
import Modal.AvionMilitar;
import Modal.AvionPrivado;

public class Main {
    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto(
                "Aeropuerto Internacional Astor Piazzolla",
                "MDQ",
                "Mar del Plata, Buenos Aires",
                10
        );

        AvionComercial avionComercial1 = new AvionComercial(
                "Boeing 737",
                "Boeing",
                26000,
                "Turbofan",
                180,
                "ARG-001",
                6
        );

        AvionComercial avionComercial2 = new AvionComercial(
                "Airbus A320",
                "Airbus",
                24000,
                "Turbofan",
                170,
                "ARG-002",
                5
        );

        AvionComercial avionComercial3 = new AvionComercial(
                "Embraer 190",
                "Embraer",
                13000,
                "Turbofan",
                100,
                "ARG-003",
                4
        );

        AvionPrivado avionPrivado1 = new AvionPrivado(
                "Gulfstream G650",
                "Gulfstream",
                20000,
                "Turbofan",
                18,
                "PRI-001",
                true,
                "mundial2026"
        );

        AvionPrivado avionPrivado2 = new AvionPrivado(
                "Cessna Citation X",
                "Cessna",
                12000,
                "Turbofan",
                12,
                "PRI-002",
                false,
                "vueloPrivado"
        );

        AvionDeCarga avionDeCarga1 = new AvionDeCarga(
                "Boeing 747 Cargo",
                "Boeing",
                180000,
                "Turbofan",
                "CAR-001",
                112000
        );

        AvionDeCarga avionDeCarga2 = new AvionDeCarga(
                "Antonov AN-124",
                "Antonov",
                210000,
                "Turbofan",
                "CAR-002",
                150000
        );

        AvionMilitar avionMilitar1 = new AvionMilitar(
                "F-16 Fighting Falcon",
                "Lockheed Martin",
                7000,
                "Turbofan",
                1,
                "MIL-001",
                "aire-aire",
                500
        );

        AvionMilitar avionMilitar2 = new AvionMilitar(
                "A-10 Thunderbolt",
                "Fairchild Republic",
                11000,
                "Turbofan",
                1,
                "MIL-002",
                "aire-tierra",
                1200
        );

        avionComercial1.agregarServicio("Cena");
        avionComercial1.agregarServicio("Wifi");
        avionComercial2.agregarServicio("Desayuno");
        avionComercial3.agregarServicio("Manta");

        avionDeCarga1.agregarProducto("Medicamentos");
        avionDeCarga1.agregarProducto("Alimentos");
        avionDeCarga2.agregarProducto("Repuestos");
        avionDeCarga2.agregarProducto("Maquinaria");

        aeropuerto.agregarAvion(avionComercial1);
        aeropuerto.agregarAvion(avionComercial2);
        aeropuerto.agregarAvion(avionComercial3);
        aeropuerto.agregarAvion(avionPrivado1);
        aeropuerto.agregarAvion(avionPrivado2);
        aeropuerto.agregarAvion(avionDeCarga1);
        aeropuerto.agregarAvion(avionDeCarga2);
        aeropuerto.agregarAvion(avionMilitar1);
        aeropuerto.agregarAvion(avionMilitar2);

        System.out.println("=== DATOS DEL AEROPUERTO ===");
        System.out.println(aeropuerto);

        System.out.println("\n=== AVIONES DEL AEROPUERTO ===");
        System.out.println(aeropuerto.mostrarAvionesAeropuerto());

        System.out.println("=== ACCIONES DE UN AVION COMERCIAL ===");
        System.out.println(avionComercial1.despegan());
        System.out.println(avionComercial1.vuelan());
        System.out.println(avionComercial1.aterrizan());

        System.out.println("\n=== SERVICIOS DEL AVION " + avionComercial1.getIdentificacion() + " ===");
        System.out.println(avionComercial1.getServicios());
        System.out.println(avionComercial1.comiendo());
        System.out.println(avionComercial1.mantitaDeFrio());

        System.out.println("\n=== FUNCIONES DEL AVION PRIVADO ===");
        System.out.println(avionPrivado1.despegan());
        System.out.println("Tiene jacuzzi: " + avionPrivado1.isTieneJacuzzi());
        System.out.println("Clave wifi: " + avionPrivado1.getClaveWifi());
        System.out.println("Puede ver el mundial: " + avionPrivado1.verMundial());
        System.out.println(avionPrivado1.comiendo());
        System.out.println(avionPrivado1.mantitaDeFrio());

        System.out.println("\n=== FUNCIONES DEL AVION DE CARGA ===");
        System.out.println(avionDeCarga1.vuelan());
        System.out.println("Puede ingresar: " + avionDeCarga1.ingresar());
        System.out.println(avionDeCarga1.descargarContenido());

        System.out.println("\n=== FUNCIONES DEL AVION MILITAR ===");
        System.out.println(avionMilitar1.aterrizan());
        System.out.println("Puede ingresar: " + avionMilitar1.ingresar());
        System.out.println("Sistema de armas: " + avionMilitar1.getSistemaArmas());
        System.out.println("Cantidad de balas: " + avionMilitar1.getCantidadBalas());

        System.out.println("\n=== QUITAR AVION DEL AEROPUERTO ===");
        System.out.println("Quitando avion " + avionComercial2.getIdentificacion() + ": " + aeropuerto.quitarAvion(avionComercial2));
        System.out.println("\n=== AVIONES DEL AEROPUERTO DESPUES DE QUITAR ===");
        System.out.println(aeropuerto.mostrarAvionesAeropuerto());

    }
}
