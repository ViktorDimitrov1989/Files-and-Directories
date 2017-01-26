import java.io.File;

public class Pr07ListFiles {
    public static void main(String[] args) {
        String stringPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\Files-and-Streams";

        File dir = new File(stringPath);
        File[] files = dir.listFiles();
        for (File file : files) {
            if(!file.isDirectory()){
                System.out.printf("%s: %s%n", file.getName(), file.length());
            }
        }
    }
}
