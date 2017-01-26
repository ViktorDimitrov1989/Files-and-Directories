import java.io.*;

public class PrE03AllCapitals {
    public static void main(String[] args) {
        String inPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\Capitals.txt";
        String outPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\outputCapitals.txt";

        try(BufferedReader buffReader = new BufferedReader(new FileReader(inPath));
            PrintWriter writer = new PrintWriter(new FileWriter(outPath))){
            String line = buffReader.readLine();
            while (line != null){
                writer.println(line.toUpperCase());
                line = buffReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
