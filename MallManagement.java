import java.util.*;

public class MallManagement {
    private String mallName;
    private List<Floor> floors;
    private int numberOfEmployees;
    private Maintenance maintenance;
    private List<Employee> employees;
    private List<Customer> customers;

    public MallManagement(String name, int num) {
        this.mallName = name;
        this.numberOfEmployees = num;

    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Getters and setters for the attributes
    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Maintenance getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
