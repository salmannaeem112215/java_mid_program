import java.util.*;

public class ShopModel {
    private String shopName;
    private String ownerName;
    private int areaOfShop;
    // private int numberOfshopKeepers;
    private List<ShopKeeper> shopKeepers;
    private List<Customer> customers;

    public ShopModel(String shopName, String ownerName, int areaOfShop, ShopKeeper[] shopKeepers) {
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.areaOfShop = areaOfShop;
        this.shopKeepers = new ArrayList<ShopKeeper>();
        this.customers = new ArrayList<Customer>();

        for (int i = 0; i < shopKeepers.length; i++) {
            this.shopKeepers.add(shopKeepers[i]);
        }
    }

    public void calcBill() {
        System.out.println("Calculating the bill for " + shopName);
    }

    public void details() {
        System.out.println("Shop Name: " + shopName);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Area of Shop: " + areaOfShop + " square meters");
        System.out.println("Number of shopKeepers: " + shopKeepers.size());
    }

    // Getters and setters for the attributes
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAreaOfShop() {
        return areaOfShop;
    }

    public void setAreaOfShop(int areaOfShop) {
        this.areaOfShop = areaOfShop;
    }

    public int getNumberOfshopKeepers() {
        return shopKeepers.size();
    }

    public boolean addShopKeeper(ShopKeeper s) {
        int existingShopKeeperIndex = findShopKeeper(s.getId());
        if (existingShopKeeperIndex != -1) {
            System.out.println("ShopKeeper With this EID Already Exist");
            return false;
        } else {
            shopKeepers.add(s);
            return true;
        }
    }

    public int findShopKeeper(int eId) {
        for (int i = 0; i < shopKeepers.size(); i++) {
            if (shopKeepers.get(i).getId() == i) {
                return i;
            }
        }
        return -1;
    }

    public boolean addCustomer(Customer customer) {
        int existingCustomerIndex = findCustomer(customer.getId());
        if (existingCustomerIndex != -1) {
            System.out.println("Customer With this EID Already Exist");
            return false;
        } else {
            customers.add(customer);
            return true;
        }
    }

    public int findCustomer(int cId) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == i) {
                return i;
            }
        }
        return -1;
    }

    public void shopKeeperDetails() {
        for (int i = 0; i < shopKeepers.size(); i++) {
            shopKeepers.get(i).details(i + " : ");
        }
    }

    public void shopKeeperSelectionDetails(int len) {
        for (int i = 0; i < shopKeepers.size(); i++) {
            shopKeepers.get(i).selectionDetails((len + i) + " : ");
        }
    }

    public int selectShopKeeper() {
        shopKeeperSelectionDetails(0);
        return Menu.getIntegerInputWithRange(-1, shopKeepers.size() - 1);
    }

    public boolean showShopKeeperMenu(int index) {
        System.err.println("HI");
        if (index < shopKeepers.size()) {

            shopKeepers.get(index).menu();

            System.err.println("OUT OF SHOP KEEPER MENU");
            return true;
        } else {
            return false;

        }
    }

}
