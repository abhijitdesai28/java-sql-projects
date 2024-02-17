package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionService
{
    public Connection getConnection()
    {
        Connection connection=null;
        try
        {
            String url ="jdbc:mysql://localhost:3306/school";
            String username="root";
            String password="Ad1472583690@";
            connection=DriverManager.getConnection(url,username, password);
            System.out.println("Conected to database :"+connection.getSchema());
        } catch (SQLException e) {
            System.err.println("connection error :"+e.getMessage());
        }
        return connection;
    }
}
