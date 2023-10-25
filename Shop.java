public class Shop extends ShopMenu {
    public Shop(String shopName, String ownerName, int areaOfShop, ShopKeeper[] shopKeepers) {
        super(shopName, ownerName, areaOfShop, shopKeepers);
    }

    public static Shop dummy(int id) {
        int newId = id * 5;
        ShopKeeper shopKeeper1 = new ShopKeeper(0 + newId, "shoperKeeper1", 23, 10000);
        ShopKeeper shopKeeper2 = new ShopKeeper(1 + newId, "shoperKeeper2", 23, 10000);
        ShopKeeper shopKeeper3 = new ShopKeeper(2 + newId, "shoperKeeper3", 23, 10000);
        ShopKeeper shopKeeper4 = new ShopKeeper(3 + newId, "shoperKeeper4", 23, 10000);
        ShopKeeper shopKeeper5 = new ShopKeeper(4 + newId, "shoperKeeper5", 23, 10000);

        ShopKeeper[] shopkeepers = new ShopKeeper[] { shopKeeper1, shopKeeper2,
                shopKeeper3, shopKeeper4, shopKeeper5 };
        return new Shop("SHOP1", "WALI AHMED", 100, shopkeepers);
    }

    public void menu() {
        while (true) {
            int val = super.displayMenu(0);
            int actionVal = Menu.getIntegerInputWithRange(-1, val);
            if (actionVal == -1)
                break;
            System.out.println("------------------------------------------------------");
            super.performAction(actionVal);
            System.out.println("------------------------------------------------------");

            System.out.println("");
            System.out.println("");
            Menu.sleep(500);
        }
    }
}
