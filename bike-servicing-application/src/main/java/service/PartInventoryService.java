package service;

import model.PartInventory;
import repository.PartInventoryRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class PartInventoryService {
    PartInventory partInventory=new PartInventory();
    Scanner scanner=new Scanner(System.in);
    PartInventoryRepository partInventoryRepository=new PartInventoryRepository();
    public void addPart() throws SQLException {
        System.out.println("pls enter Part id:");
        int partId=scanner.nextInt();
        System.out.println("pls enter Part name:");
        String partName =scanner.next();
        System.out.println("pls enter quantity:");
        int quantityAvailable=scanner.nextInt();
        System.out.println("pls enter Price:");
        int price=scanner.nextInt();

        partInventory.setPartId(partId);
        partInventory.setPartName(partName);
        partInventory.setQuantityAvailable(quantityAvailable);
        partInventory.setPrice(price);

        if (partInventoryRepository.addPart(partInventory)) {
            System.out.println("part inserted successfully");
        }else {
            System.out.println("failed to insert part");
        }
    }

    public void viewPart()throws SQLException {
        System.out.println("enter partId :");
        int partId=scanner.nextInt();
        partInventoryRepository.viewPart(partId);
    }

    public void updatePartDetails() throws SQLException{
        System.out.println("enter partId whose data need to update");
        int partId = scanner.nextInt();
        System.out.println("enter quantity  :");
        int quantityAvailable = scanner.nextInt();
        System.out.println("enter new price :");
        int price = scanner.nextInt();

        partInventory.setPartId(partId);
        partInventory.setQuantityAvailable(quantityAvailable);
        partInventory.setPrice(price);
        partInventoryRepository.updatePartDetails(partInventory);
    }

    public void deletePartDetails() throws SQLException{
        System.out.println("enter partId whose data need to delete");
        int partId = scanner.nextInt();

        partInventory.setPartId(partId);

        partInventoryRepository.deletePartDetails(partInventory);

    }

    public void viewAllPartDetails() throws SQLException{
        System.out.println("now fetching all details of parts :");
        partInventoryRepository.viewAllPartDetails();
    }
}
