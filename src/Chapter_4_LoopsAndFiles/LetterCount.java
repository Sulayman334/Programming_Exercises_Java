package Chapter_4_LoopsAndFiles;

import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.nextLine();

        System.out.println("Enter a letter");
        char letter = keyboard.next().charAt(0);
        int count = 0;

        for (int i = 0; i < word.length(); i++ )
            if (word.charAt(i) == letter){
                count++;
            }

        System.out.println("The number of times "+letter +"appears in "+ word +" is: " + count);
    }
}
