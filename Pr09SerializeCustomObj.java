import java.io.*;

public class Pr09SerializeCustomObj {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.color = "green";
        cube.width = 15.3;
        cube.height = 12.4;
        cube.depth = 3.0;

        String path = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.0 Files and directories\\save.ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(cube);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Cube deserCube = null;
        try(FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn)){
            deserCube = (Cube)in.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(deserCube.color);
        System.out.println(deserCube.width);
        System.out.println(deserCube.height);
        System.out.println(deserCube.depth);


    }
}

class Cube implements Serializable {
    String color;
    double width;
    double height;
    double depth;
}
