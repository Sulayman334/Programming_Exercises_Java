package Misscellaneous;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        StudentManagement school = new StudentManagement();
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Enter choice_ 1 to add a student, 2 to display all the students, 3 to calculate the ave" +
                    "rage grade and 4 to exit");
            System.out.println("1. Add student");
            System.out.println("2. Display students");
            System.out.println("3. Calculate average grade");
            System.out.println("4. Exit");

            int choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter student name");
                    String name = keyboard.nextLine();
                    if (name.isBlank()){
                        System.out.println("Name cannot be empty!");
                        name = keyboard.nextLine();
                    }

                    System.out.println("Enter student age");
                    int age = keyboard.nextInt();
                    if (age < 0){
                        System.out.println("Age cannot be negative!");
                        age = keyboard.nextInt();
                    }

                    System.out.println("Enter student grade");
                    double grade = keyboard.nextInt();

                    if (grade < 0 || grade > 100){
                        System.out.println("Grade must be between 0 and 100!");
                        grade = keyboard.nextInt();
                    }

                    school.addStudent (new Student(name, age, grade));
                    break;

                case 2:
                    school.displayAllStudent();
                    break;

                case 3:
                    double average = school.calculateAverage();
                    System.out.println("Average grade: " + average);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input! Please try again");
            }
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudent(){
        for(Student student : students){
            student.displayStudentInfo();
        }
    }

    public double calculateAverage() {
        double totalGrade = 0.0;
        for(Student student : students){
            totalGrade += student.getGrade();
        }
        return totalGrade / students.size();
    }
}
