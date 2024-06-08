package Chapter_3;

import java.util.Scanner;

public class SecretWord {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a secret word");
        String secretWord = keyboard.nextLine();

        if (secretWord.equalsIgnoreCase("SULLY")){
            System.out.println("Congratulation! that's the secret word");
        }else {
            System.out.println("Wrong! Try Again");
        }

    }
}
