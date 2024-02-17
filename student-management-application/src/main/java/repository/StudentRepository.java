package repository;

import model.Address;
import model.Student;
import service.ConnectionService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository
{
    private static Connection connection= null;

    private void initConnection() throws SQLException{
        if (connection == null || connection.isClosed()){
            connection=new ConnectionService().getConnection();
        }
    }

    public List<Address> retrieveAddress(){
        List<Address> addresss = new ArrayList<>();
        try{
            this.initConnection();
        //now below here database operation here...
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from address");
        //now iterate over the result set
        while(resultSet.next())
        {
            int id=resultSet.getInt("address_id");
            String city=resultSet.getString("city");
            //print the data
            Address address =new Address(id,city);
            addresss.add(address);
        }
        } catch (SQLException e) {
           System.err.println("SQL error:"+e.getMessage());
        }finally{
            //close the connection when done
            if(connection!=null)
            {
                try{
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("error closing connection: "+e.getMessage());
                }
            }
        }
        return addresss;
    }
    public Address retrieveAddress(int addressId) {
        Address address=null;
        //use connection to execute sql queries and interact with the database
        try{
            this.initConnection();
            //your database operation here
            Statement statement=connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from address where address_id= " + addressId);
            //iterate over the result
            while(resultSet.next())
            {
                int id=resultSet.getInt("address_id");
                String city =resultSet.getString("city");
                //do something with data
                address=new Address(id,city);
            }
        } catch (SQLException e) {
            System.err.println("SQL error :"+e.getMessage());
        }finally{
            //close the connection when done
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("error closing connection:"+e.getMessage());
                }
            }
        }
        return address;
    }

    public boolean insertStudent(Student student) throws SQLException {
        this.initConnection();
        String query ="INSERT INTO student Values(?, ?, ?, ?, ?)";
        try(PreparedStatement preparedStatement=connection.prepareStatement(query)){
            preparedStatement.setInt(1, student.getStudentId());
            preparedStatement.setString(2,student.getName());
            preparedStatement.setInt(3,student.getAddress().getAddressId());
            preparedStatement.setFloat(4,student.getPercentage());
            preparedStatement.setString(5,student.getGrade());
            System.out.println("inserting student data to table :"+student);

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














