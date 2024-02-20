package repository;

import model.ServiceAssignment;
import service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceAssignmentRepository {
    Connection connection=new ConnectionService().getConnection();
    public void viewAssignment(int assignmentId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from serviceassignment where assignmentId= ?");
        statement.setInt(1,assignmentId);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("assignmentId :"+resultSet.getInt(1));
            System.out.println("requestId :"+resultSet.getInt(2));
            System.out.println("technicianId :"+resultSet.getInt(3));
            System.out.println("assignmentDate :"+resultSet.getString(4));
            System.out.println("serviceAssignmentStatus:"+resultSet.getString(5));
        }

    }

    public void updateAssignmentDetails(ServiceAssignment serviceAssignment)throws SQLException {
        PreparedStatement statement = connection.prepareStatement("update serviceassignment set assignmentDate =? ,serviceAssignmentStatus=? where assignmentId=?");
        statement.setString(1,serviceAssignment.getAssignmentDate());
        statement.setString(2,serviceAssignment.getServiceAssignmentStatus());
        statement.setInt(3,serviceAssignment.getAssignmentId());
        statement.executeUpdate();
    }

    public void deleteCustomerDetails(ServiceAssignment serviceAssignment)throws SQLException {
        PreparedStatement statement = connection.prepareStatement("delete from serviceassignment where assignmentId=?");
        statement.setInt(1,serviceAssignment.getAssignmentId());
        statement.executeUpdate();
    }

    public void viewAllAssignmentDetails()throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from serviceassignment");
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("assignmentId :"+resultSet.getInt(1));
            System.out.println("requestId :"+resultSet.getString(2));
            System.out.println("technicianId :"+resultSet.getString(3));
            System.out.println("assignmentDate :"+resultSet.getString(4));
            System.out.println("serviceAssignmentStatus:"+resultSet.getString(5));
        }
    }
}
