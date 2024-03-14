package repository;

import model.ServiceTechnicians;
import service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceTechniciansRepository {
    Connection connection=new ConnectionService().getConnection();
    public boolean addTechnician(ServiceTechnicians serviceTechnicians) {
        String query ="INSERT INTO servicetechnician Values(?,?,?,?)";
        try(PreparedStatement preparedStatement=connection.prepareStatement(query)){
            preparedStatement.setInt(1,serviceTechnicians.getTechnicianId());
            preparedStatement.setString(2,serviceTechnicians.getFirstName());
            preparedStatement.setString(3,serviceTechnicians.getLastName());
            preparedStatement.setString(4,serviceTechnicians.getSpecialization());
            System.out.println("inserting customer data to into:"+serviceTechnicians+" table");

            int rowInserted=preparedStatement.executeUpdate();
            return rowInserted>0;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public void reterieveTechnicianDetails(int technicianId) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("select * from servicetechnician where technicianId= ?");
        statement.setInt(1,technicianId);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("technicianId :"+resultSet.getInt(1));
            System.out.println("firstName :"+resultSet.getString(2));
            System.out.println("lastName :"+resultSet.getString(3));
            System.out.println("specialization :"+resultSet.getString(4));

        }
    }

    public void updateTechnicanDetails(ServiceTechnicians serviceTechnicians) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("update servicetechnician set lastName =? ,specialization=? where technicianId=?");
        statement.setString(1,serviceTechnicians.getLastName());
        statement.setString(2,serviceTechnicians.getSpecialization());
        statement.setInt(3,serviceTechnicians.getTechnicianId());
        statement.executeUpdate();
    }

    public void deleteTechnicanDetails(ServiceTechnicians serviceTechnicians) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("delete from servicetechnician where technicianId=?");
        statement.setInt(1,serviceTechnicians.getTechnicianId());
        statement.executeUpdate();
    }

    public void viewAllTechnicanDetails() throws SQLException{
        PreparedStatement statement = connection.prepareStatement("select * from servicetechnician");
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("technicianId :"+resultSet.getInt(1));
            System.out.println("firstName :"+resultSet.getString(2));
            System.out.println("lastName :"+resultSet.getString(3));
            System.out.println("specialization :"+resultSet.getString(4));
        }

    }
}
