public class ShopKeeper extends Employee {

    public ShopKeeper(int id, String name, int age, double salary) {
        super(id, name, age, salary);

    }

    public static ShopKeeper dummy(int id) {
        return new ShopKeeper(id, "shoperKeeper" + id, 20 + id, 10000 + id);
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
