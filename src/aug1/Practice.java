package aug1;

import java.util.Scanner;

public class Practice {
    public static void main(String [] args){

        SubsRestaurant subs = new SubsRestaurant();
        subs.addMeat(1,2);
        System.out.println(subs.getTotalPrice());

    }
    private static int readInt(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextInt();
    }
}
