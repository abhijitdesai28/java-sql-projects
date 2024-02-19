package service;

import model.Bike;
import model.Customer;
import repository.BikeRepository;

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

    public void retrieveBike() {
    }

    public void updateBikeDetails() {
    }

    public void deleteBikeDetails() {
    }

    public void viewAllBikeDetails() {
    }
}
