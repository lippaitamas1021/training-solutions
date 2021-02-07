package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Hachiko {

    public Map<String, Integer> countWords(BufferedReader reader, String... words) {
        Map<String, Integer> result = new HashMap<>();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                countWordsInLine(line, result, words);
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can not read the line");
        }
        return result;
    }

    public void countWordsInLine(String line, Map<String, Integer> result, String... words) {
        for (String word : words) {
            if (line.toLowerCase().contains(word.toLowerCase())) {
                Integer prevValue = result.get(word);
                if (prevValue == null) {                //null-t ad vissza, nem 0-át, a 0 már egy konkrét érték, a null azt jelenti, hogy üres
                    result.put(word, 1);                //helyette lehetne: if (!result.containsKey(word)), ez olvashatóbb, viszont lassabb
                } else {
                    result.put(word, prevValue + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("hachiko.txt"))) {
            System.out.println(new Hachiko().countWords(reader, "Hachiko", "haza", "pályaudvar", "jó"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read lines", ioe);
        }
    }
}
