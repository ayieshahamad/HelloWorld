package july25;

public class Supervisor extends Manager {
    private static final int MAX_HOURS = 35;

    public Supervisor(){
        baseSalary = 10;
        hoursWorked = 40;
    }

    public Supervisor(String name, double baseSalary, double hoursWorked) {
        super(name, baseSalary, hoursWorked);

        title = "Supervisor";
    }

    @Override
    public double calculateSalary(){

        double salary = super.calculateSalary();
        if(hoursWorked > MAX_HOURS){
            salary += (hoursWorked - 35)*baseSalary;
        }
        return salary;
    }
}
