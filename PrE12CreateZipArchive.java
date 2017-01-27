import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class PrE12CreateZipArchive {
    private final static String path = "/src/resources/toZip.txt";
    private final static String zipPath = "/src/resources/toZip.zip";
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + path;
        String zippedFilePath = projectPath + zipPath;


        try(FileOutputStream fos = new FileOutputStream(zippedFilePath);
            ZipOutputStream zos = new ZipOutputStream(fos)){

            ZipEntry zipEntry = new ZipEntry(filePath);
            zos.putNextEntry(zipEntry);

            File inputFile = new File(filePath);
            FileInputStream fis = new FileInputStream(inputFile);
            byte[] buf = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buf)) > 0){
                zos.write(buf, 0 , bytesRead);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
