package Chapter_2_Basics;

public class MethodExercise {
    public static void main(String[] args) {

        double circleRadius = 5;
        double circleArea = calculateCircleArea(circleRadius);

        System.out.println("The area of the circle is: " + circleArea);

    }

    public static double calculateCircleArea(double radius){
        return Math.PI * Math.pow(radius,2);
    }
}
