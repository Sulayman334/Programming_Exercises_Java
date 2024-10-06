package Misscellaneous.SchoolManagementSystem;

/**
 * The UndergraduateStudent class represents a student pursuing an undergraduate degree.
 * It extends the Student class and includes additional information such as the year of study.
 */
public class UndergraduateStudent extends Student {

    // Private field to store the year of study for the undergraduate student
    private int year;

    /**
     * Constructor to initialize an UndergraduateStudent object.
     *
     * @param name  The name of the undergraduate student
     * @param age   The age of the undergraduate student
     * @param id    The ID of the undergraduate student
     * @param major The major/field of study of the undergraduate student
     * @param year  The current year of study of the undergraduate student
     */
    public UndergraduateStudent(String name, int age, String id, String major, int year) {
        // Call the constructor of the superclass (Student)
        super(name, age, id, major);
        this.year = year;  // Initialize the year of study
    }

    /**
     * Overrides the displayInfo method from the Student class to display
     * additional information about the year of study.
     */
    @Override
    public void displayInfo() {
        // Call the displayInfo method from the superclass (Student)
        super.displayInfo();
        // Print the year of the undergraduate student
        System.out.println("Year: " + year);
    }

    /**
     * Simulates the undergraduate student attending lectures.
     * Prints a message indicating the student's participation in a lecture.
     */
    public void attendLectures() {
        // Print a message indicating the student is attending an undergraduate lecture
        System.out.println(name + " is attending an undergraduate lecture.");
    }
}
