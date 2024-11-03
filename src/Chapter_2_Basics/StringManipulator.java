package Chapter_2_Basics;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine();

        char lastCharacter = string.charAt(string.length() - 1);


        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.charAt(0));
        System.out.println(lastCharacter);
    }
}
