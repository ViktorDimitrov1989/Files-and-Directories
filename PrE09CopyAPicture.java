import java.io.*;

public class PrE09CopyAPicture {
    public static void main(String[] args) {
        String picturePath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\softuni-2.0.jpg";
        String resultPicturePath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\picture-copy.jpg";

        try(FileInputStream inputStream = new FileInputStream(picturePath);
            FileOutputStream outputStream = new FileOutputStream(resultPicturePath)){
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer,0,length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
