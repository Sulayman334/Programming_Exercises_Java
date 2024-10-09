package Chapter_4_LoopsAndFiles;
import java.io.IOException;
import java.io.FileWriter;
public class File2 {
    public static void main(String[] args) {

        try{
            FileWriter fileWriter = new FileWriter("Poem.txt");

            fileWriter.write("Roses are red\n violets are green\n violets are blue\n");
            fileWriter.append("A poem by bro");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
