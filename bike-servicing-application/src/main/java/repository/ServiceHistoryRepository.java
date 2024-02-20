package repository;

import service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceHistoryRepository {
    Connection connection=new ConnectionService().getConnection();

    public void viewHistory(int historyId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from servicehistory where historyId= ?");
        statement.setInt(1,historyId);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("historyId :"+resultSet.getInt(1));
            System.out.println("requestId :"+resultSet.getInt(2));
            System.out.println("technician :"+resultSet.getInt(3));
            System.out.println("serviceDate :"+resultSet.getString(4));
            System.out.println("comments:"+resultSet.getString(5));
        }
    }

    public void viewAllHistory() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from servicehistory");
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("historyId :"+resultSet.getInt(1));
            System.out.println("requestId :"+resultSet.getString(2));
            System.out.println("technician :"+resultSet.getString(3));
            System.out.println("serviceDate :"+resultSet.getString(4));
            System.out.println("comments:"+resultSet.getString(5));
        }
    }
}
