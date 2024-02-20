package service;

import repository.ServiceHistoryRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class HistoryService {
    Scanner scanner=new Scanner(System.in);
    ServiceHistoryRepository serviceHistoryRepository=new ServiceHistoryRepository();

    public void viewHistory()throws SQLException {
        System.out.println("enter history id :");
        int historyId=scanner.nextInt();
        serviceHistoryRepository.viewHistory(historyId);
    }

    public void viewAllHistory()throws SQLException {
        System.out.println("now fetching all details of history :");
        serviceHistoryRepository.viewAllHistory();
    }
}
