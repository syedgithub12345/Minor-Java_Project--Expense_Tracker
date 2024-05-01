package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbclass {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/expmanage";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "zuf2rqR2@1";

    // Initialize connection and statement objects
    public static Connection conn = null;
    public static Statement st = null;

    // Establish database connection
    static {
        try {
            conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            st = conn.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
