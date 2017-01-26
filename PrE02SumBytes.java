import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrE02SumBytes {
    public static void main(String[] args) {
        String path = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\Pr01.txt";

        try (BufferedReader buffReader = new BufferedReader(new FileReader(path))) {
            String line = buffReader.readLine();
            long sum = 0l;
            while (line != null) {
                for (char c : line.toCharArray()) {
                    sum += c;
                }
                line = buffReader.readLine();
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
