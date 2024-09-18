package Chapter_5_Methods;

public class LoopCall {
    public static void main(String[] args) {

        System.out.println("Hello from the main method");
        for (int i = 1; i <= 5;i++) {
            displayMessage();
        }
        System.out.println("Back to the main method");

    }
    public static void displayMessage(){
        System.out.println("Hello from the display message method");
    }
}
