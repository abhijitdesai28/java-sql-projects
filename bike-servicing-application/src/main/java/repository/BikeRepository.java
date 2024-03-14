package repository;

import model.Bike;
import service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BikeRepository {
    Connection connection=new ConnectionService().getConnection();
    public boolean addNewBike(Bike bike) {
        String query ="INSERT INTO bike Values(?,?,?,?,?,?,?)";
        try(PreparedStatement preparedStatement=connection.prepareStatement(query)){
            preparedStatement.setInt(1,bike.getBikeId());
            preparedStatement.setInt(2,bike.getCustomerId());
            preparedStatement.setString(3,bike.getMake());
            preparedStatement.setString(4,bike.getModel());
            preparedStatement.setString(5,bike.getColor());
            preparedStatement.setLong(6,bike.getYear());
            preparedStatement.setString(7,bike.getLicensePlate());
            System.out.println("inserting customer data to into:"+bike+" table");

            int rowInserted=preparedStatement.executeUpdate();
            return rowInserted>0;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;

    }

    public void retrieveBike(int bikeId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from bike where bikeId= ?");
        statement.setInt(1,bikeId);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("bikeId :"+resultSet.getInt(1));
            System.out.println("customerId :"+resultSet.getInt(2));
            System.out.println("make :"+resultSet.getString(3));
            System.out.println("model :"+resultSet.getString(4));
          //  System.out.println("year :"+resultSet.getInt(4));
            System.out.println("year :"+resultSet.getString(5));
            System.out.println("color:"+resultSet.getString(6));
            System.out.println("licensePlate :"+resultSet.getString(7));
        }

    }

    public void updateBikeDetails(Bike bike) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("update bike set year =? ,make=?, model=?, licensePlate=? where bikeId=?");
        statement.setInt(1,bike.getYear());
        statement.setString(2,bike.getMake());
        statement.setString(3,bike.getModel());
        statement.setString(4,bike.getLicensePlate());
        statement.setInt(5,bike.getBikeId());
        statement.executeUpdate();
    }

    public void deleteBikeDetails(Bike bike) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("delete from bike where bikeId=?");
        statement.setInt(1,bike.getBikeId());
        statement.executeUpdate();
    }

    public void viewAllBikeDetails() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from bike");
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("bikeId :"+resultSet.getInt(1));
            System.out.println("customerId :"+resultSet.getInt(2));
            System.out.println("make :"+resultSet.getString(3));
            System.out.println("model :"+resultSet.getString(4));
            System.out.println("year :"+resultSet.getInt(5));
            System.out.println("color:"+resultSet.getString(6));
            System.out.println("licensePlate :"+resultSet.getString(7));
        }
    }
}

