package Chapter_5_Methods;

public class SimpleMethod {
    public static void main(String[] args) {
        System.out.println("Hello from the main method");
        displayMessage();
        System.out.println("Back in the main method");
    }

    public static void displayMessage(){
        System.out.println("Hello from the display message method");
    }
}
