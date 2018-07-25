package july11;

import java.util.Scanner;

public class MusicPlayerProgram {
    public static void main (String [] args){

        MusicPlayer myMusicPlayer = new MusicPlayer();
        int input = 0;

        do {
            displayMenu();
            input = getCommand("Please enter your selection:");
            if(input == 1 ) {

                if(myMusicPlayer.getIndex() == 0) {
                    if(getString("You currently have no songs in your playlist! Add a new one? [Y/N] ").charAt(0) == 'Y')
                        myMusicPlayer.add(getString("Title "),getString("Author "));
                }

                myMusicPlayer.showPlayList();

            }
            else if(input == 2) {
                if(myMusicPlayer.getIndex() == 0) {
                    if(getString("You currently have no songs in your playlist! Add a new one? [Y/N] ").charAt(0) == 'Y')
                        myMusicPlayer.add(getString("Title "),getString("Author "));
                }
                myMusicPlayer.showPlayList();
                myMusicPlayer.play(getCommand("Which song do you want to play? "));
            }
            else if(input == 3){
                myMusicPlayer.add(getString("Title "),getString("Author "));
            }

        }while(input != 4);

    }
    public static void displayMenu(){
        System.out.println("\n**********************\n" +
                "*                    *\n" +
                "* COMIT MUSIC PLAYER *\n" +
                "*                    *\n" +
                "**********************\n" +
                "1- Show playlist\n" +
                "2- Play a song\n" +
                "3- Add a song \n" +
                "4- Quit\n");
    }
    public static int getCommand(String command){
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextInt();
    }
    public static String getString(String command){
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.next();
    }
}
