package Chapter_9;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        double radius,area;
        char choice;
        String input;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Enter the radius of the circle");
            radius = keyboard.nextInt();

            keyboard.nextLine();

            area = Math.PI * Math.pow(radius,2);
            System.out.println("The area of the circle is " + area);

            System.out.println("Do you want to do this again");
            input = keyboard.nextLine();
            choice = input.charAt(0);

        } while (Character.toUpperCase(choice) == 'Y');
    }

}
