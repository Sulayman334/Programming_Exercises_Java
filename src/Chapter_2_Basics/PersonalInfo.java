package Chapter_2_Basics;

public class PersonalInfo {
    public static void main(String[] args) {
         String firstName = "Alimatou";
         int age = 22;
         double height = 1.7;

         int numberOfMonthsInTheYear =12;
         int ageInMonths = numberOfMonthsInTheYear * age;

         System.out.println("First Name: " + firstName);
         System.out.println("Age: " + age+" years old");
         System.out.println("Height: " + height + " meters");
        System.out.println("Age: " + ageInMonths+" months old");
    }
}
