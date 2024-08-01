package Chapter_6;

import java.util.Scanner;

public class CircleClassTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = keyboard.nextInt();

        CircleClass circle = new CircleClass(radius);

        System.out.println("Area: "+circle.getArea());
        System.out.println("Circumference: "+circle.getCircumference());
        System.out.println("Diameter: "+circle.getDiameter());
    }
}
