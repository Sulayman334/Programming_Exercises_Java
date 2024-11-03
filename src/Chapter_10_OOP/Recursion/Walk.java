package Chapter_10_OOP.Recursion;

public class Walk {
    public static void main(String[] args) {

        walk(5);
    }

    public static void walk(int steps) {
        if (steps < 1){
            return;
        }else {
            System.out.println("You talk a step");
            walk(steps - 1);
        }
    }
}
