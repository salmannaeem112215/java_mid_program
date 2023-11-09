
public class EmployeeModel extends Person {
    private int age;
    private double salary;

    public EmployeeModel(int id, String name, int age, double salary) {
        super(id, name);
        this.age = age;
        this.salary = salary;
    }

    public void details() {
        super.details();
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }

    public void details(String val) {
        super.details(val);
        System.out.println(val + " Age: " + age);
        System.out.println(val + " Salary: $" + salary);
    }

    public void selectionDetails(String val) {
        System.out.println(val + " Name: " + super.getName());
    }

    public void calcSalary() {
        System.out.println("Calculating salary for " + getName());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int employeeModelAge) {
        this.age = employeeModelAge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double employeeModelSalary) {
        this.salary = employeeModelSalary;
    }
}
