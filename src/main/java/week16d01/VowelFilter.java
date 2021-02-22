package week16d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class VowelFilter {

    List<String> vowels = new ArrayList<>(List.of("a", "á", "e", "é", "i", "í", "o", "ó", "u", "ú", "ü", "ű"));

    public String filterVowels(BufferedReader bufferedReader) throws IOException {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split("");
                for (int i = 0; i < temp.length; i++) {
                    if (!vowels.contains(temp[i].toLowerCase())) {
                        stringBuilder.append(temp[i]);
                    }
                }
                stringBuilder.append("\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed at reading", e);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = Files.newBufferedReader(Path.of("words.txt"));
        VowelFilter vowelFilter = new VowelFilter();
        System.out.println(vowelFilter.filterVowels(bufferedReader));
    }
}
