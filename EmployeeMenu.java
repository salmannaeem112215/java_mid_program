public abstract class EmployeeMenu extends EmployeeModel {
    private String[] actions;

    public EmployeeMenu(int id, String name, int age, double salary) {
        super(id, name, age, salary);
        actions = new String[] { "Set Age", "Get Age", "Set Salary",
                "Get Salary", "View Details" };
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
                    int age = askAge();
                    setAge(age);
                    Menu.showSuccess("Age CHANGED");
                    break;
                case 1:
                    int newAge = getAge();
                    System.out.println("Age is " + newAge);
                    Menu.showSuccess("");
                    break;
                case 2:
                    int newSalaray = askSalary();
                    setId(newSalaray);
                    Menu.showSuccess("Salaray CHANGED");
                case 3:
                    int id = getId();
                    System.out.println("Salaray is " + id);
                    Menu.showSuccess("");
                    break;

                case 4:
                    super.details();
                default:
                    break;
            }
        }

    }

    int askSalary() {
        System.out.println("Please Enter New Salary ");
        return Menu.getIntegerInputWithRange(0, 999999);
    }

    int askAge() {
        System.out.println("Please Enter New Age ");
        return Menu.getIntegerInputWithRange(1, 99);
    }

}
