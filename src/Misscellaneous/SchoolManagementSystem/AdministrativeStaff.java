package Misscellaneous.SchoolManagementSystem;

/**
 * The AdministrativeStaff class represents an administrative staff member in the school management system.
 * It extends the Employee class and includes additional attributes and methods specific to administrative staff.
 */
public class AdministrativeStaff extends Employee {

    // Private field to store the role of the administrative staff
    private String role;

    /**
     * Constructor to initialize the AdministrativeStaff object.
     *
     * @param name   the name of the administrative staff
     * @param age    the age of the administrative staff
     * @param id     the ID of the administrative staff
     * @param salary the salary of the administrative staff
     * @param role   the role of the administrative staff
     */
    public AdministrativeStaff(String name, int age, String id, double salary, String role) {
        // Call the constructor of the superclass (Employee)
        super(name, age, id, salary);
        this.role = role;
    }

    /**
     * Override the displayInfo method to include the role information.
     */
    @Override
    public void displayInfo() {
        // Call the displayInfo method of the superclass (Employee)
        super.displayInfo();
        // Print the role of the administrative staff
        System.out.println("Role: " + role);
    }

    /**
     * Method to simulate performing administrative duties.
     */
    public void performDuties() {
        // Print a message indicating the staff is performing administrative duties
        System.out.println(name + " is performing administrative duties as a " + role);
    }
}
