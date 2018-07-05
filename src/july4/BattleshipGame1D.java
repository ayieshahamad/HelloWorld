package july4;

import java.util.Random;
import java.util.Scanner;

public class BattleshipGame1D {

    private static Random random;
    private static int min = 1;
    private static int max = 10;

    public static void main(String[] args){
        random = new Random();
        //computerTurn = random.nextInt(max - min + 1) + min;
        game();
    }
    private static void game(){
        char [] playerBoard = new char [10];
        char [] computerBoard = new char [10];
        initBoards(playerBoard);
        initBoards(computerBoard);

        String []playerName = new String[2];
        int []score = new int [2];

        //enter name here
        playerName[0] = read("Please enter your name and press enter: ");
        playerName[1] = "Computer";
        System.out.println("Welcome "+playerName[0]+"! My name is "+playerName[1]+" LAB and I will be your opponent today. Get ready to battle!!");

        System.out.println("Here is your current battle-board. Please choose where to place your short boat: ");
        output(playerBoard,0);
        System.out.print("Enter a spot (1 - 10): ");
        setShortBoat(playerBoard,false);
        setShortBoat(computerBoard,true);

        System.out.println("Here is your current battle-board. Please choose where to place your long boat: ");
        output(playerBoard,0);
        System.out.print("Enter a spot for the head of your long boat (1-10): ");
        setLongBoat(playerBoard,false);
        setLongBoat(computerBoard,true);

        System.out.println("All set up! BATTLE BEGINS. ");
        System.out.println(playerName[0]+":");
        output(playerBoard,0);
        System.out.println(playerName[1]+":");
        output(computerBoard,0);

        while(score[0] != 3 && score[1] != 3){

            System.out.print("\nWhere do you want to shoot? (Enter 1-10): ");
            //your turn
            checkShootOrMissed(computerBoard,false,score,0,playerName[0],playerName[1]);
            // computer turn
            checkShootOrMissed(playerBoard,true,score,1,playerName[1],playerName[0]);

            if(score[0] == 3 || score[1] == 3)
                System.out.println("Final board:");

            System.out.println(playerName[0]+":");
            output(playerBoard,0);
            System.out.println(playerName[1]+":");
            output(computerBoard,0);
        }
        if(score[0] == 3)
            System.out.println(playerName[0]+" had taken down all ships of "+playerName[1]+"!!!\n"+playerName[0]+" won the game!!");
        else
            System.out.println(playerName[1]+" had taken down all ships of "+playerName[0]+"!!!\n"+playerName[1]+" won the game!!");
    }
    private static void checkShootOrMissed(char [] board, boolean isComputer, int[] score,int indexScore,String playerName,String opponentName){
        int turn = 0;
        do{
            turn = input(isComputer);
        } while (turn <= 0 || turn >= 11);

        if(isComputer == true){
            System.out.println("COMPUTER chooses to shoot at spot "+turn+".");
        }
        if(board[turn-1] == '*') {
            System.out.println(playerName+" got a perfect shot at a "+opponentName+"'s ship!!!");
            board[turn -1] = 'x';
            score[indexScore]++;
        }
        else if (board[turn-1] == '0' )//|| board[turn-1] == '-' || board[turn-1] == 'x' )
        {
            System.out.println(playerName+" missed!!!");
            board[turn -1] = '-';
        }
    }
    private static int input(boolean isComputer){
        if(isComputer == false)
            return readIntOnly();
        else
            return random.nextInt(max - min + 1) + min;
    }
    private static void setShortBoat(char [] board, boolean isComputer){
        int turn =0;
        do {
            turn = input(isComputer);
        } while (turn <= 0 || turn >= 11);

        board[turn-1] = '*';
    }
    private static void setLongBoat(char [] board, boolean isComputer){
        int turn =0;
        do {
            turn = input(isComputer);
        } while (turn <= 0 || turn >= 10 || board[turn-1] == '*' || board [turn] == '*');

        board[turn-1] = '*';
        board[turn] = '*';
    }
    private static void output(char [] board , int print){
        for(int i =0; i < board.length; i ++){
            if(print == 0)
                System.out.print(" " + board[i]);
            else
                System.out.print(" ?");
        }
        System.out.println("");
    }
    private static void initBoards(char [] board) {
        for (int i =0;i <board.length ; i++)
            board[i] = '0';
    }
    private static int readIntOnly() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static String read(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextLine();
    }

}
