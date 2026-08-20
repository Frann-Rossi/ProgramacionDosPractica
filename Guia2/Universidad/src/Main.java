public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(
                "40111222",
                "Juan",
                "Perez",
                "juan@gmail.com",
                "Calle 123",
                2022,
                85000.0,
                "Programacion"
        );

        Estudiante estudiante2 = new Estudiante(
                "40222333",
                "Maria",
                "Gomez",
                "maria@gmail.com",
                "Calle 456",
                2023,
                90000.0,
                "Contabilidad"
        );

        Estudiante estudiante3 = new Estudiante(
                "40333444",
                "Pedro",
                "Lopez",
                "pedro@gmail.com",
                "Calle 789",
                2021,
                75000.0,
                "Administracion"
        );

        Estudiante estudiante4 = new Estudiante(
                "40444555",
                "Ana",
                "Martinez",
                "ana@gmail.com",
                "Calle 101",
                2024,
                95000.0,
                "Sistemas"
        );

        Staff staff1 = new Staff(
                "30111222",
                "Carlos",
                "Rodriguez",
                "carlos@gmail.com",
                "Calle 111",
                450000.0,
                "mañana"
        );

        Staff staff2 = new Staff(
                "30222333",
                "Laura",
                "Fernandez",
                "laura@gmail.com",
                "Calle 222",
                520000.0,
                "noche"
        );

        Staff staff3 = new Staff(
                "30333444",
                "Miguel",
                "Gonzalez",
                "miguel@gmail.com",
                "Calle 333",
                480000.0,
                "mañana"
        );

        Staff staff4 = new Staff(
                "30444555",
                "Sofia",
                "Diaz",
                "sofia@gmail.com",
                "Calle 444",
                600000.0,
                "noche"
        );

        Persona[] personas = new Persona[8];
        personas[0] = estudiante1;
        personas[1] = estudiante2;
        personas[2] = estudiante3;
        personas[3] = estudiante4;

        personas[4] = staff1;
        personas[5] = staff2;
        personas[6] = staff3;
        personas[7] = staff4;

        for (Persona persona : personas) {
            System.out.println(persona);
        }

//        for (int i = 0; i < personas.length; i++) {
//            System.out.println(personas[i]);
//        }

        int cantidadEstudiantes = 0;
        int cantidadStaff = 0;

        for (Persona persona : personas) {

            if (persona instanceof Estudiante) {
                cantidadEstudiantes++;
            }

            if (persona instanceof Staff) {
                cantidadStaff++;
            }
        }

        System.out.println("Cantidad de estudiantes: " + cantidadEstudiantes);
        System.out.println("Cantidad de Staff: " + cantidadStaff);
    }
}