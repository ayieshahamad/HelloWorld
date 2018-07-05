package june29;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {

        rockPaperScissorGame_With2DArray();
    }
    private static void rockPaperScissorGame_With2DArray(){
        Random random = new Random();
        int max=3;
        int min=1;

        int playerScore = 0, computerScore = 0;
        int playerTurn =0,   computerTurn = 0;

        String [] option = new String[max];
        option[0] = "Rock";
        option[1] = "Paper";
        option[2] = "Scissor";

        int [][] gameStatus = new int[3][3];
        for(int i = 0 ; i < max ; i++){
            gameStatus[i][i] = 0;
        }
        gameStatus[0][1] = gameStatus[1][2] = gameStatus[2][0] = 2;//computer winning postions
        gameStatus[0][2] = gameStatus[1][0] = gameStatus[2][1] = 1;//player 1 winning positions

        while(playerScore !=3 && computerScore != 3) {

            System.out.println("Please enter:\n1- For Rock\n2- For Paper\n3- For Scissor");

            playerTurn = readIntOnly();
            if (playerTurn >= 1 && playerTurn <= 3) {
                computerTurn = random.nextInt(max - min + 1) + min;

                if (gameStatus[playerTurn - 1][computerTurn - 1] == 1)
                    playerScore++;
                else if (gameStatus[playerTurn - 1][computerTurn - 1] == 2)
                    computerScore++;

                System.out.println("You go " + option[playerTurn - 1] + ". Computer goes " + option[computerTurn - 1] + "! You won " + playerScore + " times. Computer won " + computerScore + " times..");
            }
        }
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

    private static int readIntOnly() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
