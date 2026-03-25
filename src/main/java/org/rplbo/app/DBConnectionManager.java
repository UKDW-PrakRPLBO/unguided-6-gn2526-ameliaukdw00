package org.rplbo.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
    // TODO 1 : CONNECT KE DATABASE (Masukan Path DB)
    private static final String DB_URL = "jdbc:sqlite:asylum.db";
    private static Connection connection;

    private DBConnectionManager() {}

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                // TODO 2 : getConnection jika connection null/closed
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection(DB_URL);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}