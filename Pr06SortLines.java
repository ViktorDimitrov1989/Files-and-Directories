import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Pr06SortLines {
    public static void main(String[] args) {
        String inputStr = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\input.txt";
        String outputStr = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\output.txt";

        Path inPath = Paths.get(inputStr);
        Path outPath = Paths.get(outputStr);
        try {
            List<String> lines = Files.readAllLines(inPath);
            Collections.sort(lines);
            Files.write(outPath,lines);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
