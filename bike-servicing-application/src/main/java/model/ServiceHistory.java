package model;

public class ServiceHistory {
    private int historyId;
    private ServiceRequest serviceRequest;
    private ServiceTechnicians serviceTechnicians;
    private String serviceDate;
    private String comments;

    //declare getter and setter method
    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public ServiceTechnicians getServiceTechnicians() {
        return serviceTechnicians;
    }

    public void setServiceTechnicians(ServiceTechnicians serviceTechnicians) {
        this.serviceTechnicians = serviceTechnicians;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    //declare default constructor
    public ServiceHistory(){

    }
    //declare parameterized constructor
    public ServiceHistory(int historyId, ServiceRequest serviceRequest,
                          ServiceTechnicians serviceTechnicians,
                          String serviceDate, String comments) {
        this.historyId = historyId;
        this.serviceRequest = serviceRequest;
        this.serviceTechnicians = serviceTechnicians;
        this.serviceDate = serviceDate;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "ServiceHistory{" +
                "historyId=" + historyId +
                ", serviceRequest=" + serviceRequest +
                ", serviceTechnicians=" + serviceTechnicians +
                ", serviceDate='" + serviceDate + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
