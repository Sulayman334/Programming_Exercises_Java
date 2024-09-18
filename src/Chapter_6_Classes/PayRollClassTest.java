package Chapter_6_Classes;

import java.util.Scanner;

public class PayRollClassTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        String employeeName = keyboard.nextLine();

        System.out.println("Enter the employee ID");
        String employeeID = keyboard.nextLine();

        System.out.println("Enter the employee hourly pay rate");
        int hourlyPayRate = keyboard.nextInt();

        System.out.println("Enter the number of hours worked");
        int numberOfHoursWorked = keyboard.nextInt();
        PayRollClass pay = new PayRollClass(employeeName,employeeID,hourlyPayRate,numberOfHoursWorked);

        System.out.println("Gross pay: "+ pay.employeeGrossPay(hourlyPayRate,numberOfHoursWorked));
    }
}
