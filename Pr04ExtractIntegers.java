import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pr04ExtractIntegers {
    public static void main(String[] args) {
        String inputPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\input.txt";
        String outputPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\output.txt";

        try(Scanner scanner = new Scanner(new FileInputStream(inputPath));
            PrintWriter out = new PrintWriter(new FileOutputStream(outputPath))){

            while (scanner.hasNext()){
                if(scanner.hasNextInt()){
                    int number = scanner.nextInt();
                    out.println(number);
                }
                scanner.next();
            }
        }
        catch (IOException e){
                e.printStackTrace();
        }


    }
}
