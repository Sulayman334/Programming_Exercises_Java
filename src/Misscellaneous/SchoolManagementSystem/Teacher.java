package Misscellaneous.SchoolManagementSystem;

/**
 * The Teacher class represents a teacher in the school management system.
 * It extends the Employee class and adds a specific subject that the teacher teaches.
 */
public class Teacher extends Employee {

    // Field representing the subject that the teacher teaches
    private String subject;

    /**
     * Constructor to initialize a Teacher object with the specified attributes.
     *
     * @param name    The name of the teacher
     * @param age     The age of the teacher
     * @param id      The ID of the teacher
     * @param salary  The salary of the teacher
     * @param subject The subject that the teacher teaches
     */
    public Teacher(String name, int age, String id, double salary, String subject) {
        super(name, age, id, salary);  // Calls the constructor of the Employee class
        this.subject = subject;        // Initializes the subject field
    }

    /**
     * Overrides the displayInfo method from the Employee class to display
     * additional information about the teacher, specifically the subject they teach.
     */
    @Override
    public void displayInfo() {
        super.displayInfo();  // Calls the displayInfo method from Employee class
        System.out.println(name + " is teaching " + subject);  // Displays the subject taught by the teacher
    }

    /**
     * Displays a message indicating that the teacher is teaching their subject.
     */
    public void teach() {
        System.out.println(name + " is teaching " + subject);  // Prints teaching action with the subject
    }
}
