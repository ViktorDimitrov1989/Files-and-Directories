import java.io.*;
import java.util.ArrayList;

public class PrE10SerializeArrayList {
    public static void main(String[] args) {

        String serPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\list.ser";
        String deserPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\list.txt";

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(2.4);
        doubleList.add(3.454);
        doubleList.add(56.234);
        doubleList.add(4.001);


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serPath))){
            oos.writeObject(doubleList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Double> deserList = null;
        try(FileInputStream fileIn = new FileInputStream(serPath);
            PrintWriter writer = new PrintWriter(new FileWriter(deserPath))){
            ObjectInputStream ois = new ObjectInputStream(fileIn);
            deserList = (ArrayList) ois.readObject();
            for (Double num : deserList) {
                writer.println(num);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
