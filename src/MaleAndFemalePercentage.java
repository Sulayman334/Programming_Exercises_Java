import java.util.Scanner;

public class MaleAndFemalePercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of males registered: ");
        int numberOfRegisteredMales = sc.nextInt();

        System.out.println("Enter the number of registered females: ");
        int numberOfRegisteredFemale = sc.nextInt();

        int totalNumberOfStudents = numberOfRegisteredMales + numberOfRegisteredFemale;
        double percentageOfMales = (double) numberOfRegisteredMales / totalNumberOfStudents;
        double percentageOfRegisteredFemales = (double) numberOfRegisteredFemale / totalNumberOfStudents;

        System.out.println("The percentage of registered males: + " + percentageOfMales);
        System.out.println("The Percentage of registered females: "+ percentageOfRegisteredFemales);
    }
}
