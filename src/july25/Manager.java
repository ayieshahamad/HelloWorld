package july25;

public class Manager extends Employee {
    public Manager(){

    }

    public Manager(String name, double baseSalary, double hoursWorked) {
        super(name, baseSalary, hoursWorked);
        title = "Manager";
    }

    @Override
    public double calculateSalary() {//2% of total income
        double sal = super.calculateSalary();
        return (sal + sal*0.02);
        //1.02 *sal
    }
}
