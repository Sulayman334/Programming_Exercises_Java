package Chapter_7;

public class Ages {
    public static void main(String[] args) {

        int [] ages = {12,23,45,32,12,34,56,67,78,90};

        float average,sum = 0;

        for (int i = 0; i < ages.length;i++){
            System.out.println(ages[i]);
            sum += ages[i];
        }
        System.out.println("Sum: " + sum);
        average = sum / ages.length;
        System.out.println("Average: " + average);

    }
}
