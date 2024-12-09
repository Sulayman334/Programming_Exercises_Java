package Misscellaneous;

import java.util.Scanner;

public class DataSet {
    private int count;
    private double sum;
    private double sumOfSquares;

    public DataSet(int count, double sum, double sumOfSquares) {
        this.count = 0;
        this.sum = 0.0;
        this.sumOfSquares = 0.0;

    }

    public void add(double value) {
        count++;
        sum += value;
        sumOfSquares += value * value;
    }

    public double getAverage() {
        if (count == 0) {
            return 0.0;
        }
        return sum / count;
    }

    public double getStandardDeviation() {
        if (count <= 1) {
            return 0.0;
        }
        double mean = getAverage();
        double variance = sumOfSquares / count - mean * mean;
        return Math.sqrt(variance);
    }


    public static void main(String[] args) {
        DataSet dataset = new DataSet(0, 0, 0);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the floating point number (type done to finish)");

        while (keyboard.hasNext()) {
            String input = keyboard.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            double value = Double.parseDouble(input);
            dataset.add(value);
        }

        System.out.println("Count: "+dataset.count);
        System.out.println("Average: "+ dataset.getAverage());
        System.out.println("Standard Deviation: "+ dataset.getStandardDeviation());
        System.out.println("Variance: "+ "done");



    }

}
