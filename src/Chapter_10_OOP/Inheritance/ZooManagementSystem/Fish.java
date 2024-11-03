package Chapter_10_OOP.Inheritance.ZooManagementSystem;

public class Fish extends Animal implements Movable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("The fish makes a sound");
    }

    @Override
    public void move() {
        System.out.println("The fish is swimming");
    }
}
