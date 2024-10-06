package Misscellaneous.SchoolManagementSystem;

/**
 * The GraduateStudent class represents a student pursuing a graduate degree.
 * It extends the Student class and includes additional information such as the research topic.
 */
public class GraduateStudent extends Student {

    // Private field to store the research topic of the graduate student
    private String researchTopic;

    /**
     * Constructor to initialize a GraduateStudent object.
     *
     * @param name         The name of the graduate student
     * @param age          The age of the graduate student
     * @param id           The ID of the graduate student
     * @param major        The major/field of study of the graduate student
     * @param researchTopic The specific research topic the graduate student is working on
     */
    public GraduateStudent(String name, int age, String id, String major, String researchTopic) {
        // Call the constructor of the superclass (Student)
        super(name, age, id, major);
        this.researchTopic = researchTopic;  // Initialize the research topic field
    }

    /**
     * Overrides the displayInfo method from the Student class to display
     * additional information about the research topic of the graduate student.
     */
    @Override
    public void displayInfo() {
        // Call the displayInfo method from the superclass (Student)
        super.displayInfo();
        // Print the research topic of the graduate student
        System.out.println("Research Topic: " + researchTopic);
    }

    /**
     * Simulates the graduate student conducting research.
     * Prints a message indicating the student's research activity.
     */
    public void conductResearch() {
        // Print a message indicating the student is conducting research on their topic
        System.out.println(name + " is conducting research on " + researchTopic);
        System.out.println("--------------------------------------------------------");
    }
}
