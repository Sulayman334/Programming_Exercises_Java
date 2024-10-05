package Misscellaneous.SchoolManagementSystem;

public class Person {

    protected String name;
    protected int age;
    protected String Id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.Id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + Id);
    }

    public void greet(){
        System.out.println("Hello, my name is " + name);
    }
}
