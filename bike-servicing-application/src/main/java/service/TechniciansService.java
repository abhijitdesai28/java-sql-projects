package service;

import model.ServiceTechnicians;
import repository.ServiceTechniciansRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class TechniciansService {
    ServiceTechnicians serviceTechnicians=new ServiceTechnicians();
    ServiceTechniciansRepository serviceTechniciansRepository=new ServiceTechniciansRepository();
    Scanner scanner= new Scanner(System.in);
    public void addTechnician() throws SQLException {
        System.out.println("pls enter technicianId:");
        int technicianId=scanner.nextInt();
        System.out.println("pls enter customer firstname:");
        String firstName =scanner.next();
        System.out.println("pls enter customer lastName:");
        String lastName=scanner.next();
        System.out.println("pls enter specialization:");
        String specialization=scanner.next();

        serviceTechnicians.setTechnicianId(technicianId);
        serviceTechnicians.setFirstName(firstName);
        serviceTechnicians.setLastName(lastName);
        serviceTechnicians.setSpecialization(specialization);

        if (serviceTechniciansRepository.addTechnician(serviceTechnicians)) {
            System.out.println("Technician inserted successfully");
        }else {
            System.out.println("failed to insert Technician");
        }
    }

    public void reterieveTechnicianDetails() throws SQLException {
        System.out.println("enter  technicianId :");
        int customerId=scanner.nextInt();
        serviceTechniciansRepository.reterieveTechnicianDetails(customerId);
    }

    public void updateTechnicanDetails()throws SQLException {
        System.out.println("enter Technician whose data need to update");
        int technicianId = scanner.nextInt();
        System.out.println("enter LastName :");
        String lastName = scanner.next();
        System.out.println("enter Specialization :");
        String specialization = scanner.next();


        serviceTechnicians.setTechnicianId(technicianId);
        serviceTechnicians.setLastName(lastName);
        serviceTechnicians.setSpecialization(specialization);
        serviceTechniciansRepository.updateTechnicanDetails(serviceTechnicians);
    }

    public void deleteTechnicanDetails()throws SQLException {
        System.out.println("enter technicianId whose data need to delete");
        int technicianId = scanner.nextInt();

        serviceTechnicians.setTechnicianId(technicianId);

        serviceTechniciansRepository.deleteTechnicanDetails(serviceTechnicians);
    }

    public void viewAllTechnicanDetails() throws SQLException{
        System.out.println("now fetching all details of technician :");
        serviceTechniciansRepository.viewAllTechnicanDetails();
    }
}
