package Chapter_4;

public class Squares {
    public static void main(String[] args) {
        int number;
        System.out.println("Number    Number Squared");
        System.out.println("---------------------");
        for (number =1; number <= 10; number++){
            System.out.println(number +"\t\t" + Math.multiplyExact(number,number));
        }
    }
}
