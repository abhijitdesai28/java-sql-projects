package service;

public class CheckConnectionBuildOrNot {
    public static void main(String[] args) {
        //in this pgm we are checking connected or not to database
        ConnectionService connectionService=new ConnectionService();
        connectionService.getConnection();
    }
}
