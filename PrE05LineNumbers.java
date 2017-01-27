import java.io.*;

public class PrE05LineNumbers {
    public static void main(String[] args) {
        String inputPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\LineNumbers.txt";
        String outPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\LineNumbersOut.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter(new FileWriter(outPath))){
            String line = reader.readLine();
            int rowCnt = 1;
            while (line != null){
                writer.printf("%d. %s%n", rowCnt, line);
                rowCnt++;
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
