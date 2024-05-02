package Chapter_2;

import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your address");
        String address = sc.nextLine();

        System.out.println("Enter the name of your college");
        String college = sc.nextLine();

        System.out.println("Enter your profession");
        String profession = sc.nextLine();

        System.out.println("Enter a type of animal");
        String animal = sc.nextLine();

        System.out.println("Enter your pets name");
        String pet = sc.nextLine();

        System.out.println("There once was a person named "+ name+ " who lived in "+address+".\n At the age of  "+age+", " + name
                 +" went to college at " +college+ ".\n" + name + "graduated and went to work as a " +profession + ".\nThen, "
                +name + "adopted a(n) " + animal +" named " + pet + ".\nThey both lived" +
                "happily ever after!");



    }

}
