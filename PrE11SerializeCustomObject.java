import java.io.*;

public class PrE11SerializeCustomObject {
    public static void main(String[] args) {
        String serFilePath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\course.ser";
        Course course = new Course();
        course.name = "Java Advanced";
        course.studentsCount = 50;

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath))){
            oos.writeObject(course);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Course resCourse = null;
        try(FileInputStream fileIn = new FileInputStream(serFilePath);
            ObjectInputStream ois = new ObjectInputStream(fileIn)){
            resCourse = (Course)ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Course implements Serializable{
    String name;
    int studentsCount;
}