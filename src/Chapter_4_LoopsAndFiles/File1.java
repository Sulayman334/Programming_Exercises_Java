package Chapter_4_LoopsAndFiles;
import java.io.File;
public class File1 {
    public static void main(String[] args) {


        File file = new File("C:\\Users\\colle\\IdeaProjects\\Programming Exercise\\src\\Chapter_4_" +
                "LoopsAndFiles\\SecretMessage.txt");
        if (file.exists()) {
            System.out.println("File exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        }else {
            System.out.println("File does not exist");
        }

    }
}
