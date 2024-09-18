package Chapter_5_Methods;

public class ShowChar {
    public static void main(String[] args) {
        showCharacter("Solo",3);
    }
    public static void showCharacter(String word, int number){
        System.out.println("Solo , "+word.charAt(number));
    }

}
