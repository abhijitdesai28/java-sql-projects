package model;

public class Bike {
    private int bikeId;
   // private Customer customer;
    private int customerId;
    private String make;
    private String model;
    private int year;
    private String color;
    private String licensePlate;

    //declare setter method and getter method

    public int getBikeId() {
        return bikeId;
    }

    public void setBikeId(int bikeId) {
        this.bikeId = bikeId;
    }

//   // public Customer getCustomer() {
//        return customer;
//    }

//    public void setCustomer(int customer) {
//        this.customer = customer;
//    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getCustomerId(){return customerId;}

    public int setCustomerId(int customerId){return this.customerId=customerId;}

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    //declare default constructor
    public Bike(){

    }

    //declare parametrized constructor
    public Bike(int bikeId,int customerId,String make, String model, int year, String color,String licensePlate) {
        this.bikeId = bikeId;
      //  this.customer = customer;
        this.customerId=customerId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.licensePlate=licensePlate;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeId=" + bikeId +
                ", customerId='"+customerId +'\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
