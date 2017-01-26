import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Pr05PrintEvery3thLine {
    public static void main(String[] args) {
        String inputPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\input.txt";
        String outputPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\output.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(inputPath));
            PrintWriter out = new PrintWriter(new FileOutputStream(outputPath))){
            String line = in.readLine();
            int counter = 1;
            while (line != null){
                if(counter % 3 == 0){
                    out.println(line);
                }
                counter++;
                line = in.readLine();
            }
        }
        catch (IOException e){
                e.printStackTrace();
        }


    }
}
