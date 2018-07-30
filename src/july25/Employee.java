package july25;

public class Employee {
    private String name;
    protected double baseSalary;
    protected double hoursWorked;
    protected String title;

    public double getBaseSalary() {
        return baseSalary;
    }

    public Employee(){
        name = "abc";
        baseSalary = 20;
        hoursWorked = 35;
    }

    public Employee(String name, double baseSalary, double hoursWorked) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
        title = "Employee";
    }

    public double calculateSalary() {

        return baseSalary*hoursWorked;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                "title = " +title +
                ", baseSalary=" + baseSalary +
                ", hoursWorked=" + hoursWorked +
                " salary = " + calculateSalary();
    }
}
