package Chapter_10_OOP.Inheritance.ZooManagementSystem;

public abstract class Animal implements Movable {

     private String name;
     private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();

}
