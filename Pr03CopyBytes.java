import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Pr03CopyBytes {
    public static void main(String[] args) {
        String inputPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\input.txt";
        String outputPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\output.txt";


        try(FileInputStream fis = new FileInputStream(inputPath)){
            FileOutputStream fos = new FileOutputStream(outputPath);
            int oneByte = fis.read();
            while (oneByte != -1){
                if(oneByte == ' ' || oneByte == '\n') {
                    fos.write(oneByte);
                }
                else{
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        fos.write(digits.charAt(i));
                    }
                }
                oneByte = fis.read();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
