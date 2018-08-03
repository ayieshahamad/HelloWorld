package july27;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int input =0;
        do{
            input = readInt("1) Invoice\n2)Purchase Order");
            if(input == 1){
                //invoice
                invoice();
            }
            else if(input == 2){
                //purchase order
                purchaseOrder();
            }
        }
        while(input != 3);

    }
    private static int readInt(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextInt();
    }
    public static void invoice(){

    }
    public static void purchaseOrder(){

    }

}
