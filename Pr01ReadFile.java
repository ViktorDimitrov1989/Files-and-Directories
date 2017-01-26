import java.io.FileInputStream;
import java.io.IOException;

public class Pr01ReadFile {
    public static void main(String[] args) {
        String path = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\input.txt";
        try(FileInputStream fis = new FileInputStream(path)) {
            int bytes = fis.read();
            while (bytes != -1){
                System.out.print(Integer.toBinaryString(bytes) + " ");
                bytes = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
