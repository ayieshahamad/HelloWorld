package july25;

public class EmployeeProgram {
    public static void main(String [] args){

        Employee employee = new Employee("ayesha",12,10);
        System.out.println(employee);


        President president = new President("president",12,10);
        System.out.println(president);

        Manager manager = new Manager("manager",12,10);
        System.out.println(manager);

        Supervisor supervisor = new Supervisor("supervisor",12,40);
        System.out.println(supervisor);

       /* System.out.println(employee.calculateSalary());
        employee = new President();
        System.out.println(employee.calculateSalary());
        employee = new Manager();
        System.out.println(employee.calculateSalary());
        employee = new Supervisor();
        System.out.println(employee.getBaseSalary()); */  //function in employee returns value from its class
    }
}
