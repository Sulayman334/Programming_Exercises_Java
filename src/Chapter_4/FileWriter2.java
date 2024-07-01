package Chapter_4;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriter2 {
    public static void main(String[] args) {
        try {
            FileWriter keyboard = new FileWriter("C:/Users/colle/Downloads/Poet.txt");
            keyboard.write("Hello");
            keyboard.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}