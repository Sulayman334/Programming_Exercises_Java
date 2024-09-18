package Chapter_5_Methods;

public class ValueReturn {
    public static void main(String[] args) {
        int total,value1 = 20,value2 =40;
        total = sum(value1,value2);
        System.out.println("Total: "+ total);
    }

    public static int sum (int num1,int num2){

        return num1 + num2;
    }
}
