import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrE07MergeTwoFiles {
    public static void main(String[] args) {
        String file1Path = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\words.txt";
        String file2Path = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\text.txt";
        String mergedFile = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\result.txt";

        Path firstReader = Paths.get(file1Path);
        Path secReader = Paths.get(file2Path);
        try(PrintWriter outPut = new PrintWriter(new FileWriter(mergedFile))){
            List<String> firstList = Files.readAllLines(firstReader);
            List<String> secList = Files.readAllLines(secReader);
            List<String> merged = new ArrayList<>(firstList);
            merged.addAll(secList);
            for (String line : merged) {
                outPut.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
