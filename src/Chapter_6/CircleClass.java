package Chapter_6;

public class CircleClass {

    private double radius;
    private final double PI = 3.14159;

    public CircleClass(double radius){
        this.radius = radius;

    }

    public CircleClass(){
        this.radius = 0.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
    public double getDiameter(){
        return 2 * radius;
    }

}
