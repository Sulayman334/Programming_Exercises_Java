package Chapter_10_OOP.ExceptionHandlingAndFileReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\colle\\Idea" +
                    "Projects\\Programming Exercise\\src\\Chapter_10_OOP\\ExceptionHandlingAndFileReader\\" +
                    "saul.txt"));

        String line;
            while ((line = reader.readLine()) != null) {
            System.out.println(line);
            }

            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
