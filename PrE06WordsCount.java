import java.io.*;
import java.util.*;

public class PrE06WordsCount {
    public static void main(String[] args) {
        String wordsPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\words.txt";
        String textPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\text.txt";
        String resultPath = "E:\\Softuni\\Softuni Courses - Data\\Java Courses\\Java Advanced\\6.1 Exercises\\result.txt";


        try(BufferedReader textReader = new BufferedReader(new FileReader(textPath));
            PrintWriter writer = new PrintWriter(new FileWriter(resultPath));
            BufferedReader wordsReader = new BufferedReader(new FileReader(wordsPath))){
            LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

            ArrayList<String> words = new ArrayList<>();
            String wordsLine = wordsReader.readLine();
            while (wordsLine != null){
                words.addAll(Arrays.asList(wordsLine.split(" ")));
                wordsLine = wordsReader.readLine();
            }


            String line = textReader.readLine();
            while (line != null){
                for (String s : line.split(" ")) {
                    if(!s.equals(" ")){
                        if(words.contains(s)){
                            if(!wordsMap.containsKey(s)){
                                wordsMap.put(s,1);
                            }
                            else{
                                wordsMap.put(s, wordsMap.get(s) + 1);
                            }
                        }
                    }
                }
                line = textReader.readLine();
            }
            String debug = "";
            for (Map.Entry<String,Integer> entry : entriesSortedByValues(wordsMap)) {
                writer.printf("%s - %d%n", entry.getKey(), entry.getValue());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static <K,V extends Comparable<? super V>>
    SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
                new Comparator<Map.Entry<K,V>>() {
                    @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        int res = e2.getValue().compareTo(e1.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
