package Chapter_10_OOP.Polymorphism;

public class MathOperationTest {
    public static void main(String[] args) {
        MathOperation operation = new MathOperation();
        System.out.println(operation.add(8,9));
        System.out.println(operation.add(9.8,4.9));
        System.out.println(operation.add(9,10,11));
    }
}
