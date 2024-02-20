package repository;

import model.PartInventory;
import service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PartInventoryRepository {
    Connection connection=new ConnectionService().getConnection();

    public boolean addPart(PartInventory partInventory) throws SQLException {
        String query ="INSERT INTO partinventory Values(?,?,?,?)";
        try(PreparedStatement preparedStatement=connection.prepareStatement(query)){
            preparedStatement.setInt(1,partInventory.getPartId());
            preparedStatement.setString(2,partInventory.getPartName());
            preparedStatement.setInt(3,partInventory.getQuantityAvailable());
            preparedStatement.setInt(4,partInventory.getPrice());

            System.out.println("inserting part data to into:"+partInventory+" table");

            int rowInserted=preparedStatement.executeUpdate();
            return rowInserted>0;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;

    }

    public void viewPart(int partId) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("select * from partinventory where partId= ?");
        statement.setInt(1,partId);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("partId :"+resultSet.getInt(1));
            System.out.println("partName :"+resultSet.getString(2));
            System.out.println("quantityAvailable :"+resultSet.getInt(3));
            System.out.println("price :"+resultSet.getInt(4));

        }
    }

    public void updatePartDetails(PartInventory partInventory) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("update partinventory set quantityAvailable =? ,price=? where partId=?");
        statement.setInt(1,partInventory.getQuantityAvailable());
        statement.setInt(2,partInventory.getPrice());
        statement.setInt(3,partInventory.getPartId());

        statement.executeUpdate();
    }

    public void deletePartDetails(PartInventory partInventory)throws SQLException {
        PreparedStatement statement = connection.prepareStatement("delete from partinventory where partId=?");
        statement.setInt(1,partInventory.getPartId());
        statement.executeUpdate();
    }

    public void viewAllPartDetails() throws SQLException{
        PreparedStatement statement = connection.prepareStatement("select * from partinventory");
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("partId :"+resultSet.getInt(1));
            System.out.println("partName :"+resultSet.getString(2));
            System.out.println("quantityAvailable :"+resultSet.getInt(3));
            System.out.println("price :"+resultSet.getInt(4));

        }


    }
}
