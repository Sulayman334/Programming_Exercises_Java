package Misscellaneous.SchoolManagementSystem;

/**
 * The Employee class represents an employee of the school, extending the Person class.
 * It includes additional attributes and methods related to the employee's salary and a custom greeting.
 */
public class Employee extends Person {

    // Protected field to store the salary of the employee
    protected double salary;

    /**
     * Constructor to initialize an Employee object with the given name, age, ID, and salary.
     *
     * @param name   The name of the employee
     * @param age    The age of the employee
     * @param id     The unique ID of the employee
     * @param salary The salary of the employee
     */
    public Employee(String name, int age, String id, double salary) {
        // Call the constructor of the superclass (Person)
        super(name, age, id);
        this.salary = salary;  // Initialize the salary field
    }

    /**
     * Overrides the displayInfo method from the Person class to include
     * additional information about the employee's salary.
     */
    @Override
    public void displayInfo() {
        // Call the displayInfo method from the superclass (Person)
        super.displayInfo();
        // Print the salary of the employee
        System.out.println("Salary: " + salary);
    }

    /**
     * Overrides the greet method from the Person class to provide a custom
     * greeting specific to employees.
     */
    @Override
    public void greet() {
        // Print a custom greeting message that includes the employee's name
        System.out.println("Hello, I am " + name + ". I am employed at the school.");
    }
}
