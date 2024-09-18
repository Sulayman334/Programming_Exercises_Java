package Chapter_4_LoopsAndFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
    public static void main(String[] args) {

        try {
            FileReader keyboard = new FileReader("C:/Users/colle/Downloads/Poet.txt");
            int data = keyboard.read();
            while (data != -1){
                System.out.print((char)data);
                data = keyboard.read();
            }
            keyboard.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
