import java.io.File;
import java.util.ArrayDeque;

public class Pr08NestedFolders {
    public static void main(String[] args) {
        String stringPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\Files-and-Streams";
        File root = new File(stringPath);
        ArrayDeque<File> dirs = new ArrayDeque<File>();
        dirs.offer(root);
        int counter = 0;
        while (!dirs.isEmpty()){
            File current = dirs.removeFirst();
            File[] currentDir = current.listFiles();
            for (File file : currentDir) {
                if(file.isDirectory()){
                    dirs.addLast(file);
                }
            }
            counter++;
            System.out.println(current.getName());
        }
        System.out.println(counter + " folders");
    }
}
