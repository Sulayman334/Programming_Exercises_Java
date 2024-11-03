package Chapter_10_OOP.MethodChaning;

public class Example1 {
    public static void main(String[] args) {
        String name= "Sulayman               ";
        String fullName = name.concat(" Colley          ");
        fullName = fullName.toUpperCase();
        fullName = fullName.trim();

        System.out.println(fullName);
    }
}
