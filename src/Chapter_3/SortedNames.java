package Chapter_3;

import java.util.Scanner;

public class SortedNames {
    public static void main(String[] args) {

        Scanner keyboard =new Scanner(System.in);
        System.out.println("Enter the first name");
        String name1 = keyboard.nextLine();

        System.out.println("Enter the second name");
        String name2 = keyboard.nextLine();

        System.out.println("Enter the third name");
        String name3 = keyboard.nextLine();

        String temp;

        if (name1.compareTo(name2) >0){
            temp = name1;
            name1 = name2;
            name2 = temp;
        }
        if (name1.compareTo(name3) >0){
            temp = name1;
            name1 = name3;
            name3 = temp;
        }
        if (name2.compareTo(name3) >0){
            temp = name2;
            name2 = name3;
            name3 = temp;
        }
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);




    }
}
