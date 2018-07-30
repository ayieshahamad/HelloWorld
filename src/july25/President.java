package july25;

public class President extends Employee{
    public President(){

    }

    public President(String name, double baseSalary, double hoursWorked) {
        super(name, baseSalary, hoursWorked);
        title = "President";
    }

    @Override
    public double calculateSalary() {// 50% of total income
        double sal = super.calculateSalary();
        return (sal + sal*0.5); //am i doing this right?
        //1.50*sal; //
    }

}
