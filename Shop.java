public class Shop extends ShopMenu {
    public Shop(String shopName, String ownerName, int areaOfShop, ShopKeeper[] shopKeepers) {
        super(shopName, ownerName, areaOfShop, shopKeepers);
    }

    public static Shop dummy(int id) {
        int newId = id * 5;
        ShopKeeper shopKeeper0 = ShopKeeper.dummy(0 + newId);
        ShopKeeper shopKeeper1 = ShopKeeper.dummy(1 + newId);
        ShopKeeper shopKeeper2 = ShopKeeper.dummy(2 + newId);
        ShopKeeper shopKeeper3 = ShopKeeper.dummy(3 + newId);
        ShopKeeper shopKeeper4 = ShopKeeper.dummy(4 + newId);

        ShopKeeper[] shopkeepers = new ShopKeeper[] { shopKeeper0, shopKeeper1, shopKeeper2,
                shopKeeper3, shopKeeper4 };
        return new Shop("SHOP1", "WALI AHMED", 100, shopkeepers);
    }

    public void menu() {
        while (true) {
            int val = super.displayMenu(0);
            int actionVal = Menu.getIntegerInputWithRange(-1, val - 1);
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
