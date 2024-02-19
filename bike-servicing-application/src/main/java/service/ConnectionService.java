package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionService {
    public Connection getConnection() {

            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/bike-servicing";
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("connection build!!!!!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }


