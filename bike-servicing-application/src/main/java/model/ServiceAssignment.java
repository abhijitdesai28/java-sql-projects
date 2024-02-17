package model;

public class ServiceAssignment {
    private int assignmentId;
    private ServiceRequest serviceRequest;
    private ServiceTechnicians serviceTechnicians;
    private String assignmentDate;
    private String ServiceAssignmentStatus;

    //declare getter and setter method

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
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

    public String getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(String assignmentDate) {
        this.assignmentDate = assignmentDate;
    }

    public String getServiceAssignmentStatus() {
        return ServiceAssignmentStatus;
    }

    public void setServiceAssignmentStatus(String serviceAssignmentStatus) {
        ServiceAssignmentStatus = serviceAssignmentStatus;
    }

    //declare default constructor
    public ServiceAssignment(){

    }
    //declare parameterized constructor

    public ServiceAssignment(int assignmentId, ServiceRequest serviceRequest,
                             ServiceTechnicians serviceTechnicians, String assignmentDate,
                             String serviceAssignmentStatus) {
        this.assignmentId = assignmentId;
        this.serviceRequest = serviceRequest;
        this.serviceTechnicians = serviceTechnicians;
        this.assignmentDate = assignmentDate;
        ServiceAssignmentStatus = serviceAssignmentStatus;
    }

    @Override
    public String toString() {
        return "ServiceAssignment{" +
                "assignmentId=" + assignmentId +
                ", serviceRequest=" + serviceRequest +
                ", serviceTechnicians=" + serviceTechnicians +
                ", assignmentDate='" + assignmentDate + '\'' +
                ", ServiceAssignmentStatus='" + ServiceAssignmentStatus + '\'' +
                '}';
    }
}
