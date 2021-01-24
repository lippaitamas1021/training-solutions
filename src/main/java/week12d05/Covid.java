package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Covid {

    public int wordCounter(String word, Path file) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(file)) {
            String line;
            int counter = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    counter++;
                }
            }
            return counter;

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file");
        }
    }

    public static void main(String[] args) {
        Path file = Path.of("index.html");           //"src/main/resources/index.html" ,ha az alkalmazás része a fájl
        Covid covid = new Covid();
        System.out.println(covid.wordCounter("koronavírus", file));
        System.out.println(covid.wordCounter("covid", file));
    }
}
