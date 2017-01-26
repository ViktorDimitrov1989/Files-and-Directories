import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class PrE04CountCharacterTypes {
    public static void main(String[] args) {
        String inputPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\countCharTypes.txt";
        String outputPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\coutCharTypesResult.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;
            ArrayList<Character> vow = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            ArrayList<Character> punct = new ArrayList<>(Arrays.asList('!', ',', '.', '?'));
            String line = reader.readLine();
            while (line != null) {
                for (char c : line.toCharArray()) {
                    if (vow.contains(c)) {
                        vowels++;
                    } else if (punct.contains(c)) {
                        punctuation++;
                    } else if(c != ' '){
                        consonants++;
                    }
                }
                line = reader.readLine();
            }
            writer.println("Vowels: " + vowels);
            writer.println("Consonants: " + consonants);
            writer.println("Punctuation: " + punctuation);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
