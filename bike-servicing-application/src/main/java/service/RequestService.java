package service;

import model.ServiceRequest;
import repository.ServiceRequestRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class RequestService {
    ServiceRequest serviceRequest=new ServiceRequest();
    ServiceRequestRepository serviceRequestRepository=new ServiceRequestRepository();
    Scanner scanner=new Scanner(System.in);
    public void viewRequest() throws SQLException {
        System.out.println("enter request id :");
        int requestId=scanner.nextInt();
        serviceRequestRepository.viewRequest(requestId);
    }

    public void updateRequestDetails() throws SQLException{
        System.out.println("enter requestId whose data need to update");
        int requestId = scanner.nextInt();
        System.out.println("enter new STATUS :");
        String status = scanner.next();
        System.out.println("enter new DESCRIPTION:");
        String description = scanner.next();

        serviceRequest.setRequestId(requestId);
        serviceRequest.setStatus(status);
        serviceRequest.setDescription(description);
        serviceRequestRepository.updateRequestDetails(serviceRequest);
    }

    public void deleteRequestDetails()throws SQLException {
        System.out.println("enter requestId whose data need to delete");
        int requestId = scanner.nextInt();

        serviceRequest.setRequestId(requestId);

        serviceRequestRepository.deleteRequestDetails(serviceRequest);
    }

    public void viewAllRequestDetails()throws SQLException {
        System.out.println("now fetching all details of service request :");
        serviceRequestRepository.viewAllRequestDetails();
    }
}
