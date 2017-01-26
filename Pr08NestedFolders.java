import java.io.File;
import java.util.ArrayDeque;

public class Pr08NestedFolders {
    public static void main(String[] args) {
        String stringPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\Files-and-Streams";
        File root = new File(stringPath);
        ArrayDeque<File> dirs = new ArrayDeque<File>();
        dirs.offer(root);
        while (!dirs.isEmpty()){
            File current = dirs.removeFirst();



        }



    }
}
