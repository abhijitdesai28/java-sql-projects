package model;

public class ServiceRequest {
    private int requestId;
    private Bike bike;
    private String requestDate;
    private String status;
    private String description;

    //declare getter and setter method

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //declare default constructor
    public ServiceRequest(){

    }

     //declare parameterized constructor
    public ServiceRequest(int requestId, Bike bike, String requestDate, String status, String description) {
        this.requestId = requestId;
        this.bike = bike;
        this.requestDate = requestDate;
        this.status = status;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ServiceRequest{" +
                "requestId=" + requestId +
                ", bike=" + bike +
                ", requestDate='" + requestDate + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
