package Chapter_2_Basics;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.nextLine();

        System.out.println(word.length() + " characters");

    }
}
