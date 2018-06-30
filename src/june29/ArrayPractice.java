package june29;

import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        //System.out.println("My First Program!");
        //que1();
        rockPaperScissorGame_With2DArray();
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

    private static void rockPaperScissorGame_WithCondition(){
        Random random = new Random();
        int max=3;
        int min=1;

        int playerScore = 0, computerScore = 0;
        int playerTurn =0, computerTurn = 0;

        String [] option = new String[3];
        option[0] = "Rock";
        option[1] = "Paper";
        option[2] = "Scissor";

        while(playerScore !=3 && computerScore != 3) {

            System.out.println(
                            "Please enter:\n" +
                            "1- For Rock\n" +
                            "2- For Paper\n" +
                            "3- For Scissor");

            playerTurn = readIntOnly();
            computerTurn = random.nextInt(max - min + 1) + min;
            //System.out.println(computerTurn);

            if(playerTurn == 1){//rock
                if (computerTurn == 2)//paper
                    computerScore++;
                else if (computerTurn == 3)//scissor
                    playerScore++;
            }
            else if (playerTurn == 2){//paper
                if(computerTurn == 1)//rock
                    playerScore++;
                else if (computerTurn == 3)//scissor
                    computerScore++;
            }
            else if (playerTurn == 3){//scissor
                if(computerTurn == 1)//rock
                    computerScore++;
                else if (computerTurn == 2)//paper
                    playerScore++;
            }
            System.out.println("You go "+ option[playerTurn-1] +
                               ". Computer goes " + option[computerTurn-1] +
                               "! You won " + playerScore + " times. Computer won " + computerScore + " times.");
        }
    }
    private static void rockPaperScissorGame_With2DArray(){
        Random random = new Random();
        int max=3;
        int min=1;

        int playerScore = 0, computerScore = 0;
        int playerTurn =0, computerTurn = 0;

        String [] option = new String[max];
        option[0] = "Rock";
        option[1] = "Paper";
        option[2] = "Scissor";

        int [][] gameStatus = new int[3][3];
        for(int i = 0 ; i < max ; i++){
            gameStatus[i][i] = 0;
            // gameStatus[i]
            // gameStatus[i]
        }
        gameStatus[0][1] = gameStatus[1][2] = gameStatus[2][0] = 2;//computer winning postions
        gameStatus[0][2] = gameStatus[1][0] = gameStatus[2][1] = 1;//player 1 winning positions

        while(playerScore !=3 && computerScore != 3) {

            System.out.println(
                    "Please enter:\n" +
                            "1- For Rock\n" +
                            "2- For Paper\n" +
                            "3- For Scissor");
            playerTurn = readIntOnly();
            computerTurn = random.nextInt(max - min + 1) + min;
            //System.out.println(computerTurn);

            if(gameStatus[playerTurn-1][computerTurn-1] == 1)
                playerScore ++;
            else if (gameStatus[playerTurn-1][computerTurn-1] == 2)
                computerScore ++;

            System.out.println("You go "+ option[playerTurn-1] +
                    ". Computer goes " + option[computerTurn-1] +
                    "! You won " + playerScore + " times. Computer won " + computerScore + " times..");
        }
    }
    private static int readIntOnly() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static float readFloat(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextFloat();
    }
}
