package Misscellaneous.SchoolManagementSystem;

/**
 * The TechnicalStaff class represents a staff member responsible for technical support in the school.
 * It extends the Employee class and adds a specific area of expertise for the technical staff.
 */
public class TechnicalStaff extends Employee {

    // Field representing the area of technical expertise of the staff member
    private String expertise;

    /**
     * Constructor to initialize a TechnicalStaff object with the specified attributes.
     *
     * @param name     The name of the technical staff member
     * @param age      The age of the technical staff member
     * @param id       The ID of the technical staff member
     * @param salary   The salary of the technical staff member
     * @param expertise The area of technical expertise (e.g., IT support, laboratory equipment)
     */
    public TechnicalStaff(String name, int age, String id, double salary, String expertise) {
        super(name, age, id, salary);  // Calls the constructor of the Employee class
        this.expertise = expertise;    // Initializes the expertise field
    }

    /**
     * Overrides the displayInfo method from the Employee class to display
     * additional information about the technical staff, specifically their area of expertise.
     */
    public void displayInfo() {
        super.displayInfo();  // Calls the displayInfo method from the Employee class
        System.out.println("Expertise: " + expertise);  // Displays the expertise of the technical staff
    }

    /**
     * Simulates the action of the technical staff maintaining equipment in their area of expertise.
     * Prints a message describing the maintenance action.
     */
    public void maintainEquipment() {
        System.out.println(name + " is maintaining equipment related to " + expertise);  // Prints maintenance action with expertise
        System.out.println("----------------------------------------------------------------");
    }
}
