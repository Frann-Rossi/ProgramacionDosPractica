package BDD;

import Models.Socio;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioSocioJDBC {

    public static boolean guardar( Socio socio) {
        //crear tabla
        Connection conn = null;
        try {
            conn = Conexion.createConnection();
            String sql = "INSERT INTO socios (id, nombre, email, fecha_alta) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, socio.getId());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getEmail());
            ps.setDate(4, Date.valueOf(socio.getFechaDeAlta()));
            return ps.executeUpdate() == 1;
        } catch(SQLIntegrityConstraintViolationException e){

        }catch (SQLException e) {
            Logger.getLogger(RepositorioSocioJDBC.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }

    }

    public static Socio buscarPorId(Connection conn, int id) {
        String sql = "SELECT * FROM socios WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapear(rs);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(RepositorioSocioJDBC.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public static List<Socio> listar(Connection conn) {
        List<Socio> socios = new ArrayList<>();
        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM socios")) {
            while (rs.next()) {
                socios.add(mapear(rs));
            }
        } catch (SQLException e) {
            Logger.getLogger(RepositorioSocioJDBC.class.getName()).log(Level.SEVERE, null, e);
        }
        return socios;
    }

    public static String listarTodos(Connection conn) {
        StringBuilder sb = new StringBuilder();
        for (Socio s : listar(conn)) {
            sb.append(s).append("\n");
        }
        return sb.toString();
    }

    public static Socio eliminar(Connection conn, int id) {
        Socio socio = buscarPorId(conn, id);
        if (socio == null) {
            return null;
        }
        try (PreparedStatement ps = conn.prepareStatement("DELETE FROM socios WHERE id = ?")) {
            ps.setInt(1, id);
            ps.executeUpdate();
            return socio;
        } catch (SQLException e) {
            Logger.getLogger(RepositorioSocioJDBC.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    private static Socio mapear(ResultSet rs) throws SQLException {
        return new Socio(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("email"),
                rs.getDate("fecha_alta").toLocalDate()
        );
    }
}
