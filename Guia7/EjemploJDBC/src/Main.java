import java.sql.*;
import java.sql.Connection;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conexion con = new Conexion();
        con.createConnection();
        con.insertarPersona(new Persona(9999,"Lauti"));
        Set<Persona> listado = con.listar();
        for (Persona p : listado) {
            System.out.println(p);
        }
        con.closeConnection();
    }

}