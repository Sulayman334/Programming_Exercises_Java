package Misscellaneous;

import java.util.Scanner;

public class String_Manipulator {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = keyboard.nextLine();

        String_Manipulator manipulator = new String_Manipulator();
        StringBuilder reversedWord = manipulator.reverseString(word);
        System.out.println("Reversed: " + reversedWord);


        String upperCaseWord = manipulator.toUpperCase(word);
        System.out.println("Uppercase : " + upperCaseWord);


        boolean isPalindrome = manipulator.isPalindrome(word);
        System.out.println("Is Palindrome : " + isPalindrome);


    }
    public StringBuilder reverseString(String word){
        StringBuilder builder= new StringBuilder(word);
        return builder.reverse();
    }

    public String toUpperCase(String word){
        return word.toUpperCase();
    }


    public boolean isPalindrome(String word){
        StringBuilder reversedWord = reverseString(word);
        return reversedWord.toString().equalsIgnoreCase(word);
    }
}
