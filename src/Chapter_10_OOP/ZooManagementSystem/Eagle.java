package Chapter_10_OOP.ZooManagementSystem;

public class Eagle extends Animal implements Movable{
    public Eagle(String name,int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println("The eagle is flying");

    }

    @Override
    void makeSound() {
        System.out.println("The eagle makes a beautiful chirping sound");
    }
}
