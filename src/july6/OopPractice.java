package july6;


import java.util.Scanner;

public class OopPractice {
    public static void main(String [] args){
        //testBicycleClass();
        testBookClass();
    }
    private static void testBookClass(){
        Book myBook = new Book("ABC","Ayesha",5,5);
        if(myBook.loan())
        {
            System.out.println("borrowed");
        }
        else
            System.out.println("cannot borrow");

    }
    private static void testBicycleClass(){
        Bicycle myBike = new Bicycle();
        myBike.setSpeed(readInt("Enter Speed :"));
        myBike.setColor(readString("Enter Color :"));
        myBike.setGear(readString("Enter Gear :"));
        System.out.println("Speed = "+ myBike.getSpeed() +"\nGear = "+myBike.getGear() + "\nColor = " + myBike.getColor());

    }
    private static int readInt(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextInt();
    }
    private static String readString(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextLine();
    }
}
