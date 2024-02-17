package org.example;

/**
 * Hello world!
 *
 */
import service.ConnectionService;
import service.StudentService;

import java.util.Scanner;

public class App
{
    //create object of ConnectionService class
    private static final ConnectionService connectionService=new ConnectionService();

    public static void main(String[] args)
    {
        //create object of StudentService class
        StudentService studentService= new StudentService();
        Scanner scanner= new Scanner(System.in);
        int choice =0;
        do{
            System.out.println("========STUDENT MANAGEMENT SYSTEM========");
            System.out.println("----------------------------------");
            System.out.println("Select operation");
            System.out.println("1: Create Student"+"\n"+"2: Retrieve Student"+"\n"+"3: Update Student"+"\n"+"4: Delete Student"+
                    "\n"+"5: Retrieve Student"+"\n"+"0: Exit");

            System.out.println("Enter your Choice: ");
            choice= Integer.parseInt(scanner.nextLine());

            switch(choice)
            {
                case 1:
                    System.out.println("Performing create operation on Student");
                    StudentService.insertStudent();
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
                    studentService.retrieveAddress();
                    break;

                case 0:
                    System.out.println("Thanks for use :Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice plz select Correct Option");
            }
        }
        while(choice!=0);
        scanner.close();

    }
}

