import java.util.*;

public class Floor {
    private int floorNumber;
    private int numberOfShops;
    private List<Shop> shops;

    public Floor(int floorNumber, int numberOfShops) {
        this.floorNumber = floorNumber;
        this.numberOfShops = numberOfShops;
    }

    public void floorDetails() {
        System.out.println("Floor Number: " + floorNumber);
        System.out.println("Number of Shops: " + numberOfShops);
    }

    public void shopStatus() {
        System.out.println("Checking shop status on Floor " + floorNumber);
        // Add logic to check and display shop status here
    }

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    // Getters and setters for the attributes
    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getNumberOfShops() {
        return numberOfShops;
    }

    public void setNumberOfShops(int numberOfShops) {
        this.numberOfShops = numberOfShops;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

}