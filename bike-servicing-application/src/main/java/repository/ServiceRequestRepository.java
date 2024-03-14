package repository;

import model.ServiceRequest;
import service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceRequestRepository {
    Connection connection=new ConnectionService().getConnection();

    public void viewRequest(int requestId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from servicerequests where requestId= ?");
        statement.setInt(1,requestId);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("requestId :"+resultSet.getInt(1));
            System.out.println("bikeId :"+resultSet.getInt(2));
            System.out.println("status :"+resultSet.getString(3));
            System.out.println("description:"+resultSet.getString(4));
        }
    }

    public void updateRequestDetails(ServiceRequest serviceRequest)throws SQLException {
        PreparedStatement statement = connection.prepareStatement("update servicerequests set status =? ,description=? where requestId=?");
        statement.setString(1,serviceRequest.getStatus());
        statement.setString(2,serviceRequest.getDescription());
        statement.setInt(3,serviceRequest.getRequestId());
        statement.executeUpdate();
    }

    public void deleteRequestDetails(ServiceRequest serviceRequest) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("delete from servicerequests where requestId=?");
        statement.setInt(1,serviceRequest.getRequestId());
        statement.executeUpdate();
    }

    public void viewAllRequestDetails() throws SQLException{
        PreparedStatement statement = connection.prepareStatement("select * from servicerequests");
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("requestId :"+resultSet.getInt(1));
            System.out.println("bikeId :"+resultSet.getInt(2));
            System.out.println("status :"+resultSet.getString(3));
            System.out.println("description:"+resultSet.getString(4));
        }
    }
}
