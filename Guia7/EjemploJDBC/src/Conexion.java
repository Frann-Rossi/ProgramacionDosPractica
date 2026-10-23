import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    Connection conn;


    public void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/midb", "root", "HolaMundo");

            System.out.println("Conexion establecida con exito");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Error al conectar con la base de datos");
        }
    }

    public void insertarPersona(Persona p) {
        try {
            /*Statement stmt = conn.createStatement();
            String query = "INSERT INTO personas VALUES (" + p.getDni() + ",'" +p.getNombre() + "')";
            stmt.execute(query);
            stmt.close();*/

            PreparedStatement ps = conn.prepareStatement("INSERT INTO personas VALUES (?,?)");
            ps.setInt(1, p.getDni());
            ps.setString(2, p.getNombre());
            ps.execute();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarPersona(int dni, String nuevoNombre) {
        try {
            /*Statement stmt = conn.createStatement();
            String query = "INSERT INTO personas VALUES (" + p.getDni() + ",'" +p.getNombre() + "')";
            stmt.execute(query);
            stmt.close();*/

            PreparedStatement ps = conn.prepareStatement("UPDATE personas SET nombre = ? WHERE dni = ?");
            ps.setInt(2, dni);
            ps.setString(1, nuevoNombre);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Set<Persona> listar() {
        Set <Persona> personas = new HashSet<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM personas");
            Persona p;
            while (rs.next()) {
                p = new Persona(rs.getInt("dni"), rs.getString("nombre"));
                personas.add(p);

            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return personas;
    }

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
