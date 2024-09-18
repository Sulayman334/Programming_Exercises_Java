package Chapter_6_Classes;

public class RectangleTester {
    public static void main(String[] args) {

        Rectangle box = new Rectangle();
        box.setLength(10);
        box.setWidth(5);

        System.out.println("The length of the rectangle is " + box.getLength());
        System.out.println("The width of the rectangle is " + box.getWidth());
        System.out.println("The area of the rectangle is " + box.getArea());
    }
}
