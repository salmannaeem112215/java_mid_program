public abstract class ShopMenu extends ShopModel {
    private String[] actions;

    public ShopMenu(String shopName, String ownerName, int areaOfShop, ShopKeeper[] shopKeepers) {
        super(shopName, ownerName, areaOfShop, shopKeepers);
        actions = new String[] { "Set Shop Name", "Get Shop Name", "Set Owner Name",
                "Get Owner Name", "Set Area of Shop",
                "Get Area of Shop", "View Details", "Add Shop Keeper", "Calculate Bill", "View Employee Details",
                "Select Employee" };
    }

    public int displayMenu(int count) {
        int len = 0;
        return Menu.display("SHOP MENU", actions, len);
    }

    public void performAction(int action) {
        int len = 0;

        if (action < len) {
            // super.performAction(action);
            // for super class menu
        } else {
            System.out.println("HERE INSIDE");
            System.out.println("Action " + action + " len" + len + " action - len" + (action - len));
            switch (action - len) {
                case 0:
                    System.out.println("HERE INSIDE");
                    String newShopName = askOwnerName();
                    super.setShopName(newShopName);
                    Menu.showSuccess("Shop Name CHANGED");
                    break;
                case 1:
                    String shopName = getShopName();
                    System.out.println("Shop Name is " + shopName);
                    Menu.showSuccess("");
                    break;
                case 2:
                    String newOwnerName = askOwnerName();
                    super.setOwnerName(newOwnerName);
                    Menu.showSuccess("Owner Name CHANGED");
                    break;
                case 3:
                    String ownerName = getOwnerName();
                    System.out.println("Shop Name is " + ownerName);
                    Menu.showSuccess("");
                    break;
                case 4:
                    int newAreaOfShop = askAreaOfShop();
                    super.setAreaOfShop(newAreaOfShop);
                    Menu.showSuccess("Salaray CHANGED");
                case 5:
                    int areaOfShop = super.getAreaOfShop();
                    System.out.println("Salaray is " + areaOfShop);
                    Menu.showSuccess("");
                    break;

                case 6:
                    super.details();
                    break;
                case 7:
                    // ADD Shop Keeper
                    super.details();
                    break;
                case 8:
                    // CALCULATE BILLS
                    super.details();
                    break;
                case 9:
                    // VIEW EMPLOYEE

                    super.shopKeeperDetails();
                    break;
                case 10:
                    // Select EMPLOYEE
                    int shoperKeeperIndex = super.selectShopKeeper();
                    if (shoperKeeperIndex == -1)
                        return;

                    showShopKeeperMenu(shoperKeeperIndex);
                    super.details();
                    break;
                default:
                    System.out.println("DEFAULT ");
                    break;
            }
        }

    }

    String askShopName() {
        System.out.println("Please Enter New Shop Name ");
        return Menu.getString("Please Enter New Shop Name");
    }

    String askOwnerName() {
        System.out.println("Please Enter New Owner Name ");
        return Menu.getString("Please Enter New Owner Name");
    }

    int askAreaOfShop() {
        System.out.println("Please Enter New Area of shape ");
        return Menu.getIntegerInputWithRange(1, 9999);
    }

}
