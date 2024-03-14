package org.example;

import service.*;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final ConnectionService connectionService=new ConnectionService();

    public static void main( String[] args ) throws SQLException {
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

            System.out.println("Assignment Date Related:>>>>>>>>>>"+"\n"+"     16: View Assignment"+"\n"+"     17: Update Assignment Details"+ "\n"+"     18: Delete Assignment Details"+"\n"+"     19: View all Assignment details");

            System.out.println("Service Request Data Related:>>>>>>>>>>"+"\n"+"     20: view request details with id"+"\n"+"     21: Update request Details"+ "\n"+"     22: Delete request Details"+"\n"+"     23: View all request details");

            System.out.println("Service Technician data Related:>>>>>>>>>>"+"\n"+"     24: Register New Technician"+"\n"+"     25: Retrieve Specific technician Details"+"\n"+"     26: Update Existing technician Details"+
                    "\n"+"     27: Delete Technician Details"+ "\n"+"     28: View all Technician details");

            System.out.println("Service History Related:>>>>>>>>>>"+"\n"+"     29: View history of service"+"\n"+"     30: View total history");
            System.out.println("Do u want to Exit Enter zero(0):");


            System.out.println("Enter your Choice: ");
            choice= Integer.parseInt(scanner.nextLine());

            switch(choice)
            {
                case 0:
                    System.out.println("Thanks for use :Exiting program");
                    break;

                case 1:
                    System.out.println("Performing Adding customer");
                    customerService.insertCustomer();
                    break;

                case 2:
                    System.out.println("performing READ operation on Customer");
                    customerService.retrieveCustomer();
                    break;

                case 3:
                    System.out.println("Performing UPDATE operation on Customer");
                    customerService.updateCustomerDetails();
                    break;

                case 4:
                    System.out.println("Performing DELETE operation on Customer");
                    customerService.deleteCustomerDetails();
                    break;

                case 5:
                    System.out.println("Performing Retrieve All Customer");
                    customerService.viewAllCustomerDetails();
                    break;

                case 6:
                    System.out.println("Performing adding new bike");
                    bikeService.addNewBike();
                    break;

                case 7:
                    System.out.println("performing READ operation on Bike");
                    bikeService.retrieveBike();
                    break;

                case 8:
                    System.out.println("Performing UPDATE operation on Bike");
                    bikeService.updateBikeDetails();
                    break;

                case 9:
                    System.out.println("Performing DELETE operation on Bike");
                    bikeService.deleteBikeDetails();
                    break;

                case 10:
                    System.out.println("Performing Retrieve All Bike");
                    bikeService.viewAllBikeDetails();
                    break;

                case 11:
                    System.out.println("Performing adding part");
                    partInventoryService.addPart();
                    break;

                case 12:
                    System.out.println("performing READ operation on Part");
                    partInventoryService.viewPart();
                    break;

                case 13:
                    System.out.println("Performing UPDATE operation on Part");
                    partInventoryService.updatePartDetails();
                    break;

                case 14:
                    System.out.println("Performing DELETE operation on Bike");
                    partInventoryService.deletePartDetails();
                    break;

                case 15:
                    System.out.println("Performing Retrieve All Part");
                    partInventoryService.viewAllPartDetails();
                    break;

                case 16:
                    System.out.println("performing READ operation on Assignment");
                    assignmentService.viewAssignment();
                    break;

                case 17:
                    System.out.println("Performing UPDATE operation on Assignment");
                    assignmentService.updateAssignmentDetails();
                    break;

                case 18:
                    System.out.println("Performing DELETE operation on Assignment");
                    assignmentService.deleteAssignmentDetails();
                    break;

                case 19:
                    System.out.println("Performing Retrieve All Assignment");
                    assignmentService.viewAllAssignmentDetails();
                    break;

                case 20:
                    System.out.println("performing READ operation on Request");
                    requestService.viewRequest();
                    break;

                case 21:
                    System.out.println("Performing update operation on request");
                    requestService.updateRequestDetails();
                    break;

                case 22:
                    System.out.println("Perform delete operation on Request");
                    requestService.deleteRequestDetails();
                    break;

                case 23:
                    System.out.println("Performing retrieve all request");
                    requestService.viewAllRequestDetails();
                    break;

                case 24:
                    System.out.println("Performing add Technician operation");
                    techniciansService.addTechnician();
                    break;

                case 25:
                    System.out.println("performing READ operation on Technician");
                    techniciansService.reterieveTechnicianDetails();
                    break;

                case 26:
                    System.out.println("Performing UPDATE operation on Technician");
                    techniciansService.updateTechnicanDetails();
                    break;

                case 27:
                    System.out.println("Performing DELETE operation on Technician");
                    techniciansService.deleteTechnicanDetails();
                    break;

                case 28:
                    System.out.println("Perform Retrieve all Technician ");
                    techniciansService.viewAllTechnicanDetails();
                    break;

                case 29:
                    System.out.println("Performing View history");
                    historyService.viewHistory();
                    break;

                case 30:
                    System.out.println("Performing retrieve all history");
                    historyService.viewAllHistory();
                    break;

                default:
                    System.out.println("Invalid choice plz select Correct Option");
                    break;
            }

        }while (choice!=0);
        scanner.close();
    }
}
