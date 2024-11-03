package Chapter_2_Basics;

import java.util.Scanner;

public class SubstringExtractor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();

        System.out.println(sentence.substring(3,9));
    }
}
