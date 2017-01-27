import java.io.File;

public class PrE08GetFolderSize {
    public static void main(String[] args) {
        String folderPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\Files-and-Streams";
        File root = new File(folderPath);
        System.out.println(root.length());
    }
}
