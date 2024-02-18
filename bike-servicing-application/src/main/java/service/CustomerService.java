package service;

import model.Bike;
import model.Customer;
import repository.BikeRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class CustomerService {
    private static final BikeRepository BIKE_REPOSITORY=new BikeRepository();
    public static void insertCustomer() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("pls enter CustomerId:");
        int customerId=scanner.nextInt();
        System.out.println("pls enter First name");
        String firstName=scanner.nextLine();
        System.out.println("pls enter last name");
        String lastName=scanner.nextLine();
        System.out.println("pls enter emailId:");
        String emailId=scanner.nextLine();
        System.out.println("pls enter Address:");
        String address=scanner.nextLine();


        Address address =BIKE_REPOSITORY.retrieveAddress(addressId);
        Customer bike = new Customer(customerId, firstName, lastName,email,phone,address);
        try {
            if (STUDENT_REPOSITORY.insertStudent(student)) {
                System.out.println("Customer inserted successfully");
            } else {
                System.out.println("failed to insert Customer");
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void retrieveCustomer() {
    }

    public void updateCustomerDetails() {
    }

    public void deleteCustomerDetails() {
    }

    public void viewAllCustomerDetails() {
    }
}
