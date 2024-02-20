package service;
import model.Customer;
import repository.CustomerRepository;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerService {

    CustomerRepository customerRepository=new CustomerRepository();
    Customer customer=new Customer();
    Scanner scanner=new Scanner(System.in);
    public void insertCustomer() {
        System.out.println("pls enter customer id:");
        int customerId=scanner.nextInt();
        System.out.println("pls enter customer firstname:");
        String firstName =scanner.next();
        System.out.println("pls enter customer lastName:");
        String lastName=scanner.next();
        System.out.println("pls enter mailId:");
        String mailId=scanner.next();
        System.out.println("pls enter phone:");
        long phone = scanner.nextLong();
        System.out.println("plz enter address");
        String address = scanner.next();

        customer.setCustomerId(customerId);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(mailId);
        customer.setPhone(phone);
        customer.setAddress(address);

       if (customerRepository.insertCustomer(customer)) {
           System.out.println("customer inserted successfully");
       }else {
           System.out.println("failed to insert customer");
       }
    }

    public void retrieveCustomer() throws SQLException {
        System.out.println("enter customer id :");
        int customerId=scanner.nextInt();
        customerRepository.retrieveCustomer(customerId);
    }

    public void updateCustomerDetails() throws SQLException {
        System.out.println("enter customer whose data need to update");
        int customerId = scanner.nextInt();
        System.out.println("enter new mail :");
        String email = scanner.next();
        System.out.println("enter new phone :");
        String phone = scanner.next();
        System.out.println("enter new address :");
        String address = scanner.next();

        customer.setCustomerId(customerId);
        customer.setEmail(email);
        customer.setPhone(Long.parseLong(phone));
        customer.setAddress(address);
        customerRepository.updateCustomerDetails(customer);
    }

    public void deleteCustomerDetails() throws SQLException {
        System.out.println("enter customerId whose data need to delete");
        int customerId = scanner.nextInt();

        customer.setCustomerId(customerId);

        customerRepository.deleteCustomerDetails(customer);

    }
    public void viewAllCustomerDetails() throws SQLException {
        System.out.println("now fetching all details of customer :");
        customerRepository.viewAllCustomer();
    }
}
