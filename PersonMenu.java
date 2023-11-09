public abstract class PersonMenu extends PersonModel {
    private String[] actions;

    public PersonMenu(int id, String name) {
        super(id, name);
        actions = new String[] { "Set ID", "Get ID", "Set Name", "Get Name" };
    }

    public int displayMenu(int count) {
        return Menu.display(getName(), actions, count, DisplayType.start);
    }

    public int getTotalActions() {
        return actions.length;
    }

    public void performAction(int action) {
        switch (action) {
            case 0:
                int newId = askSetId();
                setId(newId);
                Menu.showSuccess("ID CHANGED");
                break;
            case 1:
                int id = getId();
                System.out.println("ID is " + id);
                Menu.showSuccess("");
                break;
            case 2:
                String newName = askName();
                setName(newName);
                Menu.showSuccess("Name CHANGED");
                break;
            case 3:
                String name = getName();
                System.out.println("Name is " + name);
                Menu.showSuccess("");
                break;

            default:
                break;
        }
    }

    int askSetId() {
        System.out.println("Please Enter New ID ");
        return Menu.getIntegerInputWithRange(0, 9999);
    }

    String askName() {
        System.out.println("Please Enter New Name ");
        return Menu.getString("");
    }

}
