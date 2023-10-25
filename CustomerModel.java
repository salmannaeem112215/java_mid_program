public class CustomerModel extends Person {
    private double purchasedAmount;
    private int associatedEmployee;

    public CustomerModel(int id, String name, double purchasedAmount, int associatedEmployee) {
        super(id, name);
        this.purchasedAmount = purchasedAmount;
        this.associatedEmployee = associatedEmployee;
        super.details(name);
    }

    public void details() {
        super.details();
        System.out.println("Purchased Amount: $" + purchasedAmount);
    }

    public void details(String val) {
        super.details(val);
        System.out.println("Purchased Amount: $" + purchasedAmount);
    }

    public int getAssociatedEmployee() {
        return associatedEmployee;
    }

    public void setAssociatedEmployee(int associatedEmployee) {
        this.associatedEmployee = associatedEmployee;
    }

    public double getPurchasedAmount() {
        return purchasedAmount;
    }

    public void setPurchasedAmount(double purchasedAmount) {
        this.purchasedAmount = purchasedAmount;
    }

}
