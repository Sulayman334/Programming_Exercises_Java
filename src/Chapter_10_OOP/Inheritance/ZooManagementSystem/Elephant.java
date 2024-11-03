package Chapter_10_OOP.Inheritance.ZooManagementSystem;

public class Elephant extends Animal implements Movable{
    public Elephant(String name,int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println("Elephant is walking");

    }

    @Override
    void makeSound() {
        System.out.println("Elephant makes a loud roar");
    }
}
