package july4;

import java.util.Scanner;

public class ArrayStringPractice {
    public static void main(String[] args){
        que1();
    }
    private static void que1(){
        //how many char 'a' in a string
        String str = "My name is ayesha Hamad. a";//read("Enter string : ");//"I have an apple a";
        int countA = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'a')
                countA++;
        }
        System.out.println("char 'a' = " + countA + " str.length() = " + str.length());

    }
    //
    private static String read(String command) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(command);
        return scanner.nextLine();
    }

}
