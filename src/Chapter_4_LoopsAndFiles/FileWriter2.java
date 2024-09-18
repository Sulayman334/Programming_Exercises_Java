package Chapter_4_LoopsAndFiles;
import java.io.FileWriter;


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