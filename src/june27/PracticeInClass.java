package june27;

import java.util.Scanner;

public class PracticeInClass {

    public static void main (String [] args)
    {
        //printBigestNum();
        //que2();
        que3_quadraticEq();
    }
    //1)Program that reads two num and print the bigest one
    private static void printBigestNum()
    {
        int num1 = readInt("Enter num 1 = ");
        int num2 = readInt("Enter num 2 = ");
        if(num1 > num2)
            System.out.println("Bigest num is " + num1);
        else if (num1 < num2)
            System.out.println("Bigest num is " + num2);
        else
            System.out.println("Both num are equal");
    }
    //2)
    private static void que2()
    {
        System.out.println("Enter series of num to calculate  sum and average");
        int num = 0;//readInt("Enter series of num to calculate  sum and average");
        int sum =0;
        int count = 0;
        while(num != -1){
            num = readIntOnly();
            if(num != -1) {
                sum = sum + num;
                count++;
            }
        }
        if(count == 0)
            count = 1;
        System.out.println("Sum of Numbers = "+sum);
        System.out.println("Average of Numbers = "+(sum/count));

    }
    //3)
    private static void que3_quadraticEq(){
        System.out.println("Equation : ax^2 + bx + c = 0");
        int a = readInt("Enter a = ");
        int b = readInt("Enter b = ");
        int c = readInt("Enter c = ");

        double x1 =0;
        double x2 =0;
        double temp ;

        temp = (b*b) - (4*a*c);
        if(temp < 0) {
            temp = 1;
            System.out.println("Cannot calculate -ve square root");
        }
        else {
            //x1 = (-b - sqRoot (b^2 -4 ac) )/2a
            x1 = (-b - Math.sqrt(temp)) / (2 * a);
            //x2 = (-b + sqRoot (b^2 -4 ac) )/2a
            x2 = (-b + Math.sqrt(temp)) / (2 * a);

            System.out.println(x1);
            System.out.println(x2);
        }
    }
    private static int readIntOnly() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static int readInt(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextInt();
    }
}
