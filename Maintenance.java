public class Maintenance {
	private int floorNumber;
    private String maintenanceInchargeName;
    private boolean maintenanceCheck;
    private int numberOfEmployees;
    private Floor floor;
    private Electricals electricals;

    public Maintenance(int floorNumber, String maintenanceInchargeName, boolean maintenanceCheck, int numberOfEmployees, Floor associatedFloor, Electricals electricals) {
        this.floorNumber = floorNumber;
        this.maintenanceInchargeName = maintenanceInchargeName;
        this.maintenanceCheck = maintenanceCheck;
        this.numberOfEmployees = numberOfEmployees;
        this.floor = associatedFloor;
        this.electricals = electricals;
    }

    public void maintenanceDetails() {
        System.out.println("Maintenance Details for Floor " + floorNumber);
        System.out.println("Maintenance Incharge: " + maintenanceInchargeName);
        System.out.println("Maintenance Check: " + (maintenanceCheck ? "Passed" : "Failed"));
    }

    public void staffDetails() {
        System.out.println("Number of Maintenance Employees: " + numberOfEmployees);
    }

    public void checkMaintenance() {
        if(maintenanceCheck) {
        	System.out.println("No need for maintenance.");
        }
        else {
        	System.out.println("Maintenance required!");
        }
    }
    
    public Floor getAssociatedFloor() {
        return floor;
    }

    public void setAssociatedFloor(Floor associatedFloor) {
        this.floor = associatedFloor;
    }
    
    public Electricals getElectricals() {
        return electricals;
    }

    public void setElectricals(Electricals electricals) {
        this.electricals = electricals;
    }

    // Getters and setters for the attributes
    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getMaintenanceInchargeName() {
        return maintenanceInchargeName;
    }

    public void setMaintenanceInchargeName(String maintenanceInchargeName) {
        this.maintenanceInchargeName = maintenanceInchargeName;
    }

    public boolean isMaintenanceCheck() {
        return maintenanceCheck;
    }

    public void setMaintenanceCheck(boolean maintenanceCheck) {
        this.maintenanceCheck = maintenanceCheck;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
