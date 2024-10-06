package Misscellaneous.SchoolManagementSystem;

/**
 * The Person class represents a person with basic attributes such as name, age, and ID.
 * This class serves as a base class for other types of people in the system (e.g., students, teachers).
 */
public class Person {

    // Protected fields to store the name, age, and ID of the person
    protected String name;
    protected int age;
    protected String Id;

    /**
     * Constructor to initialize a Person object with the given name, age, and ID.
     *
     * @param name The name of the person
     * @param age  The age of the person
     * @param id   The unique ID of the person
     */
    public Person(String name, int age, String id) {
        this.name = name;  // Initialize the name field
        this.age = age;    // Initialize the age field
        this.Id = id;      // Initialize the ID field
    }

    /**
     * Displays the information of the person, including their name, age, and ID.
     */
    public void displayInfo() {
        // Print the name of the person
        System.out.println("Name: " + name);
        // Print the age of the person
        System.out.println("Age: " + age);
        // Print the ID of the person
        System.out.println("ID: " + Id);
    }

    /**
     * Prints a greeting message introducing the person by their name.
     */
    public void greet() {
        // Print a greeting message that includes the person's name
        System.out.println("Hello, my name is " + name);
    }
}
