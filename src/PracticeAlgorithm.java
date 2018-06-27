import java.util.Scanner;
public class PracticeAlgorithm {

    public static void main(String[] args) {

        System.out.println("PRACTICE 22-JUNE-2018\n");
        int queNum = readInt("Enter 1 - 30 to run any practice program\nEnter 0 to exit\n");

        while(queNum!=0)
        {
            if(queNum==1){
                que1();
            }
            else if (queNum==2){
                que2();
            }
            else if (queNum==3){
                que3();
            }
            else if (queNum == 4 || queNum == 5|| queNum == 6 || queNum==7){
                que4_7();
            }
            else if (queNum == 8){
                que8_13(1,3);
            }
            else if (queNum == 9){
                que8_13(1,9);
            }
            else if (queNum == 10){
                que8_13(1,10000);
            }
            else if (queNum == 11){
                que8_13(5,10);
            }
            else if (queNum == 12){
                que8_13(5,15);
            }
            else if (queNum == 13){
                que13();
            }
            else if (queNum == 14){
                que14();
            }
            else if (queNum == 15){
                que15();
            }
            else if (queNum == 16){
                que16();
            }
            else if (queNum == 17){
                que17();
            }
            else if (queNum == 18){
                que18();
            }
            else if (queNum == 19){
                que19();
            }
            else if (queNum == 20){
                que20();
            }
            else if (queNum == 21){
                que21();
            }
            else if (queNum == 22){
                que22();
            }
            else if (queNum == 23){
                que23();
            }
            else if (queNum == 24){
                que24();
            }
            else if (queNum == 25){
                que25();
            }
            else if (queNum == 26){
                que26();
            }
            else if (queNum == 27){
                que27();
            }
            else if (queNum == 28){
                que28();
            }
            else if (queNum == 29){
                que29();
            }
            else if (queNum == 30){
                que30();
            }

            queNum = readInt("Enter 1 - 30 to run any practice program\nEnter 0 to exit\n");
        }

        System.out.println("EXIT\n");
    }

    private static void que1()
    {
        System.out.println("Hi, I already print sentences");
    }
    private static void que2()
    {
        int num = 600;
        System.out.println("integer Num = " + 500 + " " + num );
    }
    private static void que3()
    {
        float num = 1000f;
        System.out.println("float Num = " + 500.01 + " " + num );
    }
    private static void que4_7()
    {
        int num1 =0, num2 =0;
        System.out.println("Enter 2 numbers and perform arithmatic operation.");
        num1 = readInt("Enter num1 = ");
        num2 = readInt("Enter num 2 = ");
        System.out.println("Enter op: +,-,*,/");
        char op = readChar();
        if(op == '+')
        {
            System.out.println("SUM: "+num1+" + "+num2+ " = " +(num1+num2));
        }
        else if (op == '-')
        {
            System.out.println("SUB: "+num1+" - "+num2+ " = " +(num1-num2));
        }
        else if (op == '*')
        {
            System.out.println("MUL: "+num1+" * "+num2+ " = " +(num1*num2));
        }
        else if (op == '/')
        {
            System.out.println("DIV: "+num1+" / "+num2+ " = " +(num1/num2));
        }
        else
        {
            System.out.println("INVALID");
        }
    }
    private static void que8_13(int start, int end)
    {
        for(int i =start; i <= end ; i++ ){
            //System.out.print(i+ " ");
            System.out.format("%,7d%n", i);
        }
    }
    private static void que13()
    {
        int start = readInt("Enter starting num to print from ");
        int end = readInt("Enter Ending num to print till :");
        que8_13(start,end);
    }
    private static void que14()
    {
        String wordToPrint = read("Enter the word to print :");
        int numToPrint = readInt("Enter how many times you want to print :");
        for (int i =0 ; i < numToPrint ; i++){
            System.out.println((i+1) + " " + wordToPrint);
        }
    }
    private static void que15()
    {
        System.out.println("program that prints the squares of the first 30 natural numbers on the screen");
        for(int i =1; i<=30 ; i++){
            System.out.println(i*i);
        }
    }
    private static void que16()
    {
        System.out.println("program that reads an integer from the keyboard and makes the sum of the next 100 numbers");
        int num = readInt("Enter Number to start sum = ");
        int sum = 0;
        for (int i =num+1;i<=(num+10) ; i++){
            sum = sum + i;
        }
        System.out.println("SUM = " + sum);
    }
    private static void que17()
    {
        System.out.println("CAD to USD conversion (Current Rate:0.75)");
        float cad = (float)readDouble("Enter CAD : ");
        System.out.println(cad +" CAD is equal to " + (cad*0.75) + " USD ");
    }
    private static void que18()
    {
        System.out.println("program that reads two numbers on the keyboard and say which is the largest and which is the smallest.\n");
        int num1 = readInt("Enter num1 = ");
        int num2 = readInt("Enter num2 = ");
        if(num1 > num2)
            System.out.println("Largest " + num1 + "\nSmallest " + num2);
        else if(num1 < num2)
            System.out.println("Largest " + num2 + "\nSmallest " + num1);
        else
            System.out.println("Both are Equal");

    }
    private static void que19()
    {
        int N=10;
        double A=10.5;
        char C = 'a';
        System.out.println("N = "+N+" A = " + A +" C = "+C+"N + A = "+ (N + A) + "\nA - N = "+(A - N));
    }
    private static void que20()
    {
        System.out.println("positive or negative");
        int num = readInt("Enter any num like -10 or 10");
        if(num >=0)
            System.out.println(num +" is positive");
        else
            System.out.println(num +" is negative");

    }
    private static void que21()
    {
        /*
        Print the enrollment, the average and the word "approved"
        if the student has an average greater than or equal to 6, and the word "not approved" otherwise.
        Data: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 Where: MAT is an
        integer variable that represents the student's enrollment. CAL1, CAL2, CAL3, CAL4 and CAL5 are real-type
        variables representing the student's 5 grades.*/
        int MAT =0;
        float cal=0;
        float sum =0;
        for(int i =0;i<5;i++)
        {
            cal = (float)readDouble("Enter  Cal"+(i+1));
            sum = sum + cal;
        }
        sum = sum/5;
        System.out.print("Enrollment: "+ MAT +
                           " average: "+sum);
        if(sum >= 6)
            System.out.println(" APPROVED");
        else
            System.out.println(" NOT APPROVED");

    }
    private static void que22()
    {

    }
    private static void que23()
    {
        System.out.println("MULTIPLICATION TABLES:");
       // int table = readInt("Enter Number of table you want to print");
        for(int j =2 ;j<=11; j++) {
            System.out.println("Table : "+j);
            for (int i = 1; i <= 10; i++) {
                System.out.println(j + " x " + i + " = " + (j * i));
            }
        }
    }
    private static void que24()
    {
        System.out.println("CALCULATOR");
        que4_7();
    }
    private static void que25()
    {

    }
    private static void que26()
    {
        int workers = readInt("Number of workers");
        int largest = 0;
        int salary =0;
        for (int i=0;i<workers;i++)
        {
            salary = readInt("Worker "+(i+1)+": Enter Salary :");
            if(salary>largest)
                largest =salary;

        }
        System.out.println("largest Salary is" +largest);

    }
    private static void que27()
    {
        String str =read("Enter String to print");
        Another(str);
    }
    private static void que28()
    {

    }
    private static void que29()
    {
        int variable =0;
        funcWithSameVariable();
        System.out.println("NO -- ERROR ");

    }
    private static void que30()
    {

    }
    //
    private static void funcWithSameVariable()
    {
        int variable =0;
    }
    public static void Another(String str)
    {
        System.out.println("PRINTED: "+str);
    }
    private static int readInt(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextInt();
    }
    private static double readDouble(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextDouble();
    }
    private static String read(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextLine();
    }
    private static char readChar()
    {
        Scanner s= new Scanner(System.in);
        char x = s.next().charAt(0);
        return x;
    }
}
