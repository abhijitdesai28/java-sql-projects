package org.example;

import service.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final ConnectionService connectionService=new ConnectionService();

    public static void main( String[] args )
    {
        //create object of all service classes
        AssignmentService assignmentService = new AssignmentService();
        BikeService bikeService = new BikeService();
        ConnectionService connectionService = new ConnectionService();
        CustomerService customerService = new CustomerService();
        HistoryService historyService = new HistoryService();
        PartInventoryService partInventoryService = new PartInventoryService();
        RequestService requestService = new RequestService();
        TechniciansService techniciansService = new TechniciansService();

        //create object of scanner class
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        do {
            System.out.println("======================================Bike-Servicing-Application=======================================");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Select Operation");
            System.out.println("Customer Related:>>>>>>>>>>"+"\n"+"     1: Register New Customer & Bike"+"\n"+"     2: Retrieve Customer"+"\n"+"     3:  Update Customer Details"+
                    "\n"+"     4: Delete Customer"+"\n"+"     5: View all Customer");

            System.out.println("Bike Related:>>>>>>>>>>"+"\n"+"     6: Register New Bike for Existing customer"+"\n"+"     7: Retrieve Bike Details"+"\n"+"     8: Update Bike Details"+
                    "\n"+"     9: Delete Bike Details"+"\n"+"     10: View all Bike details");

            System.out.println("Parts Related:>>>>>>>>>>"+"\n"+"     11: Add part into Inventory"+"\n"+"     12: view required part"+"\n"+"     13: Update part Details"+
                    "\n"+"     14: Delete part Details"+"\n"+"     15: View all part details");

            System.out.println("Assignment Date Related:>>>>>>>>>>"+"\n"+"     16: View Assignment"+"\n"+"     17: Retrieve Specific Assignment Details"+"\n"+"     18: Update Assignment Details"+
                    "\n"+"     19: Delete Assignment Details"+"\n"+"     20: View all Assignment details");

            System.out.println("Service Request Data Related:>>>>>>>>>>"+"\n"+"     21: view request details with id"+"\n"+"     22: Retrieve specific request Details"+"\n"+"     23: Update request Details"+
                    "\n"+"     24: Delete request Details"+"\n"+"     25: View all request details");

            System.out.println("Service Technician data Related:>>>>>>>>>>"+"\n"+"     26: Register New Technician"+"\n"+"     27: Retrieve Specific technician Details"+"\n"+"     28: Update Existing technician Details"+
                    "\n"+"     29: Delete Technician Details"+"\n"+"     30: View all Technician details");

            System.out.println("Service History Related:>>>>>>>>>>"+"\n"+"     31: View history of service"+"\n"+"     32: View total history");


            System.out.println("Enter your Choice: ");
            choice= Integer.parseInt(scanner.nextLine());

            switch(choice)
            {
                case 1:
                    System.out.println("Performing create operation on Customer & Bike");
                    //StudentService.insertStudent();
                    break;

                case 2:
                    System.out.println("performing READ operation on Student");
                    //add your read logic here
                    break;

                case 3:
                    System.out.println("Performing UPDATE operation on Student");
                    //add your logic here
                    break;

                case 4:
                    System.out.println("Performing DELETE operation on Student");
                    //add your logic here
                    break;

                case 5:
                    System.out.println("Perform Retrieve operation Address");
                    //write your logic here
                    break;

                case 0:
                    System.out.println("Thanks for use :Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice plz select Correct Option");

            }

        }while (choice!=0);
        scanner.close();
    }
}
