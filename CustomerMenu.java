public abstract class CustomerMenu extends CustomerModel implements Menu {
    private String[] actions;

    public CustomerMenu(int id, String name, int purchasedAmount, int associatedEmployee) {
        super(id, name, purchasedAmount, associatedEmployee);
        actions = new String[] { "Set Purchased Amount", "Get Purchased Amount", "Set Associated Employee",
                "Get Associated Employee", "View Details" };
    }

    public void showMenuAndDisplayAction() {
    }

    public int displayMenu(int count) {
        int len = super.displayMenu(count);
        return Menu.display(getName(), actions, len);
    }

    public void performAction(int action) {
        int len = super.getTotalActions();

        if (action < len) {
            super.performAction(action);
        } else {
            switch (action - len) {
                case 0:
                    int newId = askAssociatedEmployeeId();
                    setId(newId);
                    Menu.showSuccess("ID CHANGED");
                    break;
                case 1:
                    int id = getId();
                    System.out.println("ID is " + id);
                    Menu.showSuccess("");
                    break;
                case 2:
                    int purchaseAmout = askPurchaseAmount();
                    setPurchasedAmount(purchaseAmout);
                    Menu.showSuccess("Purchased Value CHANGED");
                    break;
                case 3:
                    double purchaseAmount = getPurchasedAmount();
                    System.out.println("Purchase Amout is " + purchaseAmount);
                    Menu.showSuccess("");
                    break;
                case 4:
                    super.details();
                default:
                    break;
            }
        }

    }

    int askAssociatedEmployeeId() {
        System.out.println("Please Enter New ID ");
        return Menu.getIntegerInputWithRange(0, 9999);
    }

    int askPurchaseAmount() {
        System.out.println("Please Enter New Purchased Amount ");
        return Menu.getIntegerInputWithRange(0, 9999);
    }

}
