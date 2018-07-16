package july9;

import java.util.Scanner;

public class OOPSample {
    public static void main(String [] args){

        Bicycle myBike = new Bicycle();
        System.out.println(myBike);
        int input = 0;
        while(input!=3) {
            input = readint("1 increase\n2 brake \n3End ");
            // System.out.println();
            if (input == 1) {
                myBike.accelerate(readint("enter Speed to increase :"));
                System.out.println(myBike);
            } else if (input == 2) {
                myBike.brake(readint("enter amount to decrease speed :"));
                System.out.println(myBike);
            }
        }


    }
    private static int readint(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextInt();
    }
}
