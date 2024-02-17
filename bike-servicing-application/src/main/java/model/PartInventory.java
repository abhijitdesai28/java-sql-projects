package model;

public class PartInventory {
    private int partId;
    private String partName;
    private int quantityAvailable;
    private int price;

    //declare getter and setter method

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //declare default constructor
    public PartInventory(){

    }

    //declare parameterized constructor
    public PartInventory(int partId, String partName, int quantityAvailable, int price) {
        this.partId = partId;
        this.partName = partName;
        this.quantityAvailable = quantityAvailable;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PartInventory{" +
                "partId=" + partId +
                ", partName='" + partName + '\'' +
                ", quantityAvailable=" + quantityAvailable +
                ", price=" + price +
                '}';
    }
}
