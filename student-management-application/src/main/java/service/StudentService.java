package service;

import model.Address;
import model.Student;
import repository.StudentRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private static final StudentRepository STUDENT_REPOSITORY=new StudentRepository();

    public List<Address> retrieveAddress()
    {
        return STUDENT_REPOSITORY.retrieveAddress();
    }

    public static void insertStudent()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("pls enter student id:");
        int studentId=Integer.parseInt(scanner.nextLine());
        System.out.println("pls enter student name:");
        String name =scanner.nextLine();
        System.out.println("pls enter student addressId:");
        int addressId=Integer.parseInt(scanner.nextLine());
        System.out.println("pls enter student percentage:");
        float percentage=Float.parseFloat(scanner.nextLine());
        System.out.println("pls enter student grade :");
        String grade=scanner.nextLine();

       Address address =STUDENT_REPOSITORY.retrieveAddress(addressId);
       Student student = new Student(studentId, name, address,percentage,grade);
       try {
           if (STUDENT_REPOSITORY.insertStudent(student)) {
               System.out.println("Student inserted successfully");
           } else {
               System.out.println("failed to insert student");
           }
       }
           catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }
}
