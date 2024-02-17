package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionService {
    public Connection getConnection(){
        Connection connection=null;
        try
        {
            String url="jdbc:mysql://localhost:3306/bike-servicing";
            String username="root";
            String password="************";
            connection= DriverManager.getConnection(username);
            System.out.println("connected to database");
        }catch(SQLException e)
        {
            System.err.println("connection error :"+e.getMessage());
        }

        return connection;

    }
}
