package Misscellaneous.SchoolManagementSystem;

public class Student extends  Person{

    protected String major;

    public Student(String name, int age, String id,String major) {
        super(name, age, id);
        this.major = major;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + ",a student majoring in " + major);
    }

    public void study(){
        System.out.println(name + " is studying.");
    }
}
