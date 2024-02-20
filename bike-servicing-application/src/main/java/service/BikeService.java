package service;

import model.Bike;
import model.Customer;
import repository.BikeRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class BikeService {
    Bike bike=new Bike();
    BikeRepository bikeRepository=new BikeRepository();
    Scanner scanner=new Scanner(System.in);
    public void addNewBike() {
        System.out.println("pls enter bike id:");
        int bikeId=scanner.nextInt();
        System.out.println("plz enter customer id:");
        int customerId=scanner.nextInt();
        System.out.println("pls enter make:");
        String make=scanner.next();
        System.out.println("pls enter model:");
        String model=scanner.next();
        System.out.println("pls enter year:");
        int year = scanner.nextInt();
        System.out.println("plz enter color");
        String color = scanner.next();
        System.out.println("plz enter licensePlate");
        String licensePlate=scanner.next();

        bike.setBikeId(bikeId);
        bike.setCustomerId(customerId);
        bike.setMake(make);
        bike.setModel(model);
        bike.setYear(year);
        bike.setColor(color);
        bike.setLicensePlate(licensePlate);

        if (bikeRepository.addNewBike(bike)) {
            System.out.println("bike inserted successfully");
        }else {
            System.out.println("failed to insert bike");
        }
    }

    public void retrieveBike() throws SQLException {
        System.out.println("enter bike id :");
        int bikeId=scanner.nextInt();
        bikeRepository.retrieveBike(bikeId);
    }

    public void updateBikeDetails() throws SQLException {
        System.out.println("enter bike id whose data need to update");
        int bikeId = scanner.nextInt();
        System.out.println("enter year :");
        int year = scanner.nextInt();
        System.out.println("enter new color :");
        String color = scanner.next();
        System.out.println("enter new licensePlate:");
        String licensePlate = scanner.next();

        bike.setCustomerId(bikeId);
        bike.setYear(year);
        bike.setColor(color);
        bike.setLicensePlate(licensePlate);
        bikeRepository.updateBikeDetails(bike);
    }

    public void deleteBikeDetails() throws SQLException {
        System.out.println("enter bikeId whose data need to delete");
        int bikeId = scanner.nextInt();

        bike.setBikeId(bikeId);

        bikeRepository.deleteBikeDetails(bike);
    }

    public void viewAllBikeDetails() throws SQLException {
        System.out.println("now fetching all details of bike :");
        bikeRepository.viewAllBikeDetails();
    }
}
