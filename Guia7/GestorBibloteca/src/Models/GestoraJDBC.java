package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestoraJDBC {

    private Connection conn;

    public void createConnection() throws SQLException {
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gestor_biblioteca",
                "root",
                "1234"
        );
    }

    public Connection getConnection() {
        return conn;
    }

    public void closeConnection() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
}