package june29;

import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        //System.out.println("My First Program!");
        que1();
        //rockPaperScissorGame_With2DArray();
    }
    private static void que1(){
        //Write a program that allows you to enter the height of 10 students, then
        // show the average height, and how many elements are above average, how many are below average.
        int size = 10;
        float average = 0;
        float [] heightOfStudents = new float[size];

        for (int i = 0; i < size; i++) {
            heightOfStudents[i] = readFloat("Enter height of student " + (i+1) + " ");
            average = average + heightOfStudents[i];
        }
        //avergae calculated
        average = average / size;

        int countAboveAverage = 0;
        int countBelowAverage = 0;

        for (int j =0; j <size ; j++ ){
            if(heightOfStudents[j] > average)
                countAboveAverage++;
            else
                countBelowAverage++;
        }
        System.out.println("Average = " + average +
                            "\nStudents above Average = " + countAboveAverage +
                            "\nStudents below Average = " + countBelowAverage);

    }
    private static void que2(){
        //int numOfVehicles;
    }


    private static float readFloat(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextFloat();
    }
}
