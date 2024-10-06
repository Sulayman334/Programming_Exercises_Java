package Misscellaneous.SchoolManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The SchoolManagementSystem class simulates a simple management system for handling various types of people
 * within a school, including students, teachers, administrative staff, technical staff, and employees.
 * It demonstrates object-oriented concepts such as inheritance, polymorphism, and casting.
 */
public class SchoolManagementSystem {

    /**
     * Main entry point of the program. Initializes the system with different types of people and
     * demonstrates sorting, searching, and specific behavior of subclasses.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating an ArrayList to store different Person objects
        ArrayList<Person> people = new ArrayList<Person>();

        // Creating and adding various Person objects to the list
        Person person1 = new UndergraduateStudent("Sulayman Colley", 22, "00001", "Information Systems", 2022);
        Person person2 = new UndergraduateStudent("Abubacarr Jobe", 22, "00002", "Development Studies", 2023);
        Person person3 = new Teacher("Dr. Amelia Earhart", 50, "00003", 10000, "Further Maths");
        Person person4 = new Teacher("Mr. George Washington", 45, "00004", 9000, "Civic Engineering");
        Person person5 = new AdministrativeStaff("Mr Assan Jahateh", 50, "00005", 10000, "Admissions Officer");
        Person person6 = new AdministrativeStaff("Remi Badjie", 48, "00006", 20000, "Registrar");
        Person person7 = new GraduateStudent("Lamin Jallow", 25, "00007", "Political Science", "Policy Development");
        Person person8 = new GraduateStudent("Nabila Abdul-Rahman", 24, "00008", "Computer Science", "Information Ethics");
        Person person9 = new TechnicalStaff("Abubacarr Manneh", 50, "00009", 3000, "IT Support");
        Person person10 = new TechnicalStaff("Amelia Earhart", 45, "00010", 6000, "Laboratory Technician");
        Person person11 = new Employee("Bamba", 50, "00011", 8000);  // Generic employee

        // Adding all the person objects to the people ArrayList
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);
        people.add(person11);

        // Displaying each person's information and their greeting
        for (Person person : people) {
            person.displayInfo();  // Display general information about the person
            person.greet();        // Greet the person
            System.out.println("----------------------------------------------------------------");
        }

        // Checking and casting to specific subtypes (e.g., UndergraduateStudent, Teacher, etc.)
        if (person1 instanceof UndergraduateStudent) {
            System.out.println(person1.name + " is undergraduate");
            ((UndergraduateStudent) person1).attendLectures();  // Call method specific to UndergraduateStudent
        }
        if (person2 instanceof UndergraduateStudent) {
            System.out.println(person2.name + " is undergraduate");
            ((UndergraduateStudent) person2).attendLectures();
        }
        if (person3 instanceof Teacher) {
            System.out.println(person3.name + " is a teacher");
            ((Teacher) person3).teach();  // Call method specific to Teacher
        }
        if (person4 instanceof Teacher) {
            System.out.println(person4.name + " is a teacher");
            ((Teacher) person4).teach();
        }
        if (person5 instanceof AdministrativeStaff) {
            System.out.println(person5.name + " is administrative staff");
            ((AdministrativeStaff) person5).performDuties();  // Call method specific to AdministrativeStaff
        }
        if (person6 instanceof AdministrativeStaff) {
            System.out.println(person6.name + " is administrative staff");
            ((AdministrativeStaff) person6).performDuties();
        }
        if (person7 instanceof GraduateStudent) {
            System.out.println(person7.name + " is a graduate student");
            ((GraduateStudent) person7).conductResearch();  // Call method specific to GraduateStudent
        }
        if (person8 instanceof GraduateStudent) {
            System.out.println(person8.name + " is a graduate student");
            ((GraduateStudent) person8).conductResearch();
        }
        if (person9 instanceof TechnicalStaff) {
            System.out.println(person9.name + " is technical staff");
            ((TechnicalStaff) person9).maintainEquipment();  // Call method specific to TechnicalStaff
        }
        if (person10 instanceof TechnicalStaff) {
            System.out.println(person10.name + " is technical staff");
            ((TechnicalStaff) person10).maintainEquipment();
        }

        if (person11 instanceof Employee) {
            System.out.println(person11.name + " is a new employee");
            System.out.println("----------------------------------------------------------------");
        }

        // Creating and adding Students to a separate list
        ArrayList<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Malick", 22, "20001", "Development Studies");
        Student student2 = new Student("Mahmoud", 21, "20002", "Information Systems");
        students.add(student1);
        students.add(student2);

        // Creating and adding Employees to another list
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("John Doe", 35, "30001", 5000);
        Employee employee2 = new Employee("Jane Smith", 37, "30002", 6000);
        employees.add(employee1);
        employees.add(employee2);

        // Displaying information for each Employee
        for (Employee employee : employees) {
            employee.displayInfo();
            employee.greet();
            System.out.println("----------------------------------------------------------------");
        }

        // Displaying information for each Student
        for (Student student : students) {
            student.displayInfo();
            student.greet();
            System.out.println("----------------------------------------------------------------");
        }

        // Sorting people by name
        String results = sortByName(people);
        System.out.println(results);
        printPeople(people);  // Printing people after sorting
        System.out.println("----------------------------------------------------------------");

        // Searching for a person by ID
        System.out.println("Searching for People by Id");
        printPeopleById(people);  // Example search for person with ID "00001"
    }

    /**
     * Sorts a list of people by their names in ascending order.
     *
     * @param people The list of people to sort
     * @return A string message indicating that the list has been sorted
     */
    public static String sortByName(ArrayList<Person> people) {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);  // Sort based on the name
            }
        });
        return "Sorted by name";
    }

    /**
     * Prints out the names and the type of each person in the list.
     *
     * @param people The list of people to print
     */
    private static void printPeople(ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person.name + " (" + person.getClass().getSimpleName() + ")");  // Print name and class type
        }
    }

    /**
     * Searches for a person in the list by their ID.
     *
     * @param people The list of people to search
     * @param Id The ID to search for
     * @return The person object if found, otherwise null
     */
    public static Person searchById(ArrayList<Person> people, String Id) {
        for (Person person : people) {
            if (person.Id.equals(Id)) {  // Match the ID
                return person;
            }
        }
        return null;  // Return null if no match found
    }

    /**
     * Prints the name and type of a person with a given ID.
     *
     * If the person is not found, prints a message indicating that the person was not found.
     *
     * @param people The list of people to search
     */
    public static void printPeopleById(ArrayList<Person> people) {
        String id = "00001";  // ID to search for
        Person person = searchById(people, id);
        if (person != null) {
            System.out.println(person.name + " (" + person.getClass().getSimpleName() + ")");  // Print person details if found
        } else {
            System.out.println("Person with id " + id + " not found");  // If no match found
        }
    }
}
