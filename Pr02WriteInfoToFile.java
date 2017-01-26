import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class Pr02WriteInfoToFile {
    public static void main(String[] args) {
        String inputPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\input.txt";
        String outputPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\output.txt";

        HashSet<Character> punctuation = new HashSet<Character>(Arrays.asList(',','.','!','?'));


        try(FileInputStream fis = new FileInputStream(inputPath);
            FileOutputStream fos = new FileOutputStream(outputPath)){
            int oneByte = fis.read();
            while (oneByte != -1){
                if(!punctuation.contains(oneByte)){
                    fos.write(oneByte);
                }

                oneByte = fis.read();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
