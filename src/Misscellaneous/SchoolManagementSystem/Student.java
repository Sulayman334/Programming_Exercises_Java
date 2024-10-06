package Misscellaneous.SchoolManagementSystem;

/**
 * The Student class represents a student in the school management system.
 * It extends the Person class and includes additional attributes and methods
 * specific to a student.
 */
public class Student extends Person {

    // Protected field to store the major of the student
    protected String major;

    /**
     * Constructor to initialize the Student object.
     *
     * @param name  the name of the student
     * @param age   the age of the student
     * @param id    the ID of the student
     * @param major the major of the student
     */
    public Student(String name, int age, String id, String major) {
        // Call the constructor of the superclass (Person)
        super(name, age, id);
        this.major = major;
    }

    /**
     * Override the displayInfo method to include the major information.
     */
    @Override
    public void displayInfo() {
        // Call the displayInfo method of the superclass (Person)
        super.displayInfo();
        // Print the major of the student
        System.out.println("Major: " + major);
    }

    /**
     * Method to greet, introducing the student by name and major.
     */
    @Override
    public void greet() {
        // Print a greeting message including the student's name and major
        System.out.println("Hello, my name is " + name + ", a student majoring in " + major);
    }

    /**
     * Method to simulate studying.
     */
    public void study() {
        // Print a message indicating the student is studying
        System.out.println(name + " is studying.");
    }
}
