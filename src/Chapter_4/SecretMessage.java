package Chapter_4;
import java.io.File;
public class SecretMessage {
    public static void main(String[] args) {

        File keyboard = new File("/C:/Users/colle/Downloads/Sully.txt/");
        if (keyboard.exists()){
            System.out.println("File exist");
            System.out.println(keyboard.getPath());
            System.out.println(keyboard.getAbsolutePath());
            System.out.println(keyboard.isFile());
        }else {
            System.out.println("File does not exist");
        }

    }
}
