package repository;

import model.Customer;
import service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRepository {
    Connection connection=new ConnectionService().getConnection();
    public boolean insertCustomer(Customer customer) {

        String query ="INSERT INTO customer Values(?,?,?,?,?,?)";
        try(PreparedStatement preparedStatement=connection.prepareStatement(query)){
            preparedStatement.setInt(1,customer.getCustomerId());
            preparedStatement.setString(2,customer.getFirstName());
            preparedStatement.setString(3,customer.getLastName());
            preparedStatement.setString(4,customer.getEmail());
            preparedStatement.setLong(5,customer.getPhone());
            preparedStatement.setString(6,customer.getAddress());
            System.out.println("inserting customer data to into:"+customer+" table");

            int rowInserted=preparedStatement.executeUpdate();
            return rowInserted>0;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public void retrieveCustomer(int customerId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from customer where customerId= ?");
        statement.setInt(1,customerId);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("customerId :"+resultSet.getInt(1));
            System.out.println("firstName :"+resultSet.getString(2));
            System.out.println("lastName :"+resultSet.getString(3));
            System.out.println("mailId :"+resultSet.getString(4));
            System.out.println("phone:"+resultSet.getString(5));
            System.out.println("address :"+resultSet.getString(6));
        }

    }

    public void updateCustomerDetails(Customer customer) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("update customer set email =? ,phone=?, address=? where customerId=?");
         statement.setString(1,customer.getEmail());
         statement.setLong(2,customer.getPhone());
         statement.setString(3,customer.getAddress());
         statement.setInt(4,customer.getCustomerId());
         statement.executeUpdate();
    }

    public void deleteCustomerDetails(Customer customer) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("delete from customer where customerId=?");
        statement.setInt(1,customer.getCustomerId());
        statement.executeUpdate();
    }

    public void viewAllCustomer() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from customer");
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
        {
            System.out.println("customerId :"+resultSet.getInt(1));
            System.out.println("firstName :"+resultSet.getString(2));
            System.out.println("lastName :"+resultSet.getString(3));
            System.out.println("mailId :"+resultSet.getString(4));
            System.out.println("phone:"+resultSet.getString(5));
            System.out.println("address :"+resultSet.getString(6));
        }

    }
}
