package repository;

import model.Bike;
import service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
