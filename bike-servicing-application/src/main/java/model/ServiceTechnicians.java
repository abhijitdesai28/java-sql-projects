package model;

public class ServiceTechnicians {
    private int technicianId;
    private String firstName;
    private String lastName;
    private String specialization;

    //declare getter and setter method
    public int getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(int technicianId) {
        this.technicianId = technicianId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    //declare default constructor
    public ServiceTechnicians(){
        
    }

    //declare parameterized constructor
    public ServiceTechnicians(int technicianId, String firstName, String lastName, String specialization) {
        this.technicianId = technicianId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "ServiceTechnicians{" +
                "technicianId=" + technicianId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
