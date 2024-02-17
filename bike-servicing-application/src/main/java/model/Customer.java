package model;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private long phone;
    private String address;

    //declare setter method
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhone(long phone){
        this.phone=phone;
    }
    public void setAddress(String address){
        this.address=address;
    }

    //declare getter method
    public int getCustomerId(){
        return customerId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public long getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }

    //declare default constructor
    public Customer(){

    }
    //declare parameterized constructor
    public Customer(int customerId,String firstName,String lastName,String email,long phone,String address){
        this.customerId=customerId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.phone=phone;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }
}
