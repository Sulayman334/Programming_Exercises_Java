import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favourite city");
        String favouriteCity = sc.nextLine();

        System.out.println(favouriteCity.length());
        System.out.println(favouriteCity.toUpperCase());
        System.out.println(favouriteCity.toLowerCase());
        System.out.println(favouriteCity.charAt(0));
    }
}
