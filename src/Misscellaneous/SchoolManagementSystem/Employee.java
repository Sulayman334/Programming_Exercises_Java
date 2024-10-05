package Misscellaneous.SchoolManagementSystem;

public class Employee extends Person{

    protected double salary;

    public Employee(String name, int age, String id,double salary) {
        super(name, age, id);
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }

    @Override
    public void greet() {
        System.out.println("Hello, I am " + name + ". I am employed at the school.");
    }
}
