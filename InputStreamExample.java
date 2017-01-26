import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        String path = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\input.txt";
        try (FileInputStream fileStream = new FileInputStream(path)){
            int oneByte = fileStream.read();
            while (oneByte >= 0){
                System.out.println(oneByte);
                oneByte = fileStream.read();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
