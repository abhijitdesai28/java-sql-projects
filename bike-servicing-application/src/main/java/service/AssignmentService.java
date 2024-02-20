package service;

import model.ServiceAssignment;
import repository.ServiceAssignmentRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class AssignmentService {
    ServiceAssignment serviceAssignment=new ServiceAssignment();
    ServiceAssignmentRepository serviceAssignmentRepository=new ServiceAssignmentRepository();
    Scanner scanner=new Scanner(System.in);
    public void viewAssignment()throws SQLException {
        System.out.println("enter assignment id :");
        int assignmentId=scanner.nextInt();
        serviceAssignmentRepository.viewAssignment(assignmentId);
    }

    public void updateAssignmentDetails() throws SQLException{
        System.out.println("enter assignmentId whose data need to update");
        int assignmentId = scanner.nextInt();
        System.out.println("enter new assignmentDate :");
        String assignmentDate = scanner.next();
        System.out.println("enter new status:");
        String status = scanner.next();

        serviceAssignment.setAssignmentId(assignmentId);
        serviceAssignment.setAssignmentDate(assignmentDate);
        serviceAssignment.setServiceAssignmentStatus(status);
        serviceAssignmentRepository.updateAssignmentDetails(serviceAssignment);

    }

    public void deleteAssignmentDetails() throws SQLException{
        System.out.println("enter assignmentId whose data need to delete");
        int assignmentId = scanner.nextInt();

        serviceAssignment.setAssignmentId(assignmentId);

        serviceAssignmentRepository.deleteCustomerDetails(serviceAssignment);
    }

    public void viewAllAssignmentDetails() throws SQLException{
        System.out.println("now fetching all details of service assignment :");
        serviceAssignmentRepository.viewAllAssignmentDetails();
    }
}
