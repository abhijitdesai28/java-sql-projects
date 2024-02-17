package model;

public class Address {
    //declare global private variable addressId and city
    private int addressId;
    private String city;

    //declare setter method
    public void setAddressId(int addressId) {
        this.addressId=addressId;
    }

    public void setCity(String city) {
        this.city=city;
    }

    //declare getter method
    public int getAddressId() {
        return addressId;
    }
    public String getCity() {
        return city;
    }

    //declare default constructor
    public Address() {

    }

    //declare parameterized constructor
    public Address(int addressId,String city) {
        this.addressId=addressId;
        this.city=city;

    }
}
