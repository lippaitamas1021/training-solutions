package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Covid3 {

    public int wordCounter(BufferedReader bufferedReader, String word) {    // paraméterezhető, általános metódus
        try {                                                               // a BufferedReader-t nem én nyitom meg, ezért nem kell a try-with-resources szerkezet
            String line;
            int counter = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    counter++;
                }
            }
            return counter;
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }

    public static void main(String[] args) {
        Covid3 covid3 = new Covid3();
        Path path = Path.of("src/main/resources/index.html");
        try {
            System.out.println(covid3.wordCounter(Files.newBufferedReader(path), "koronavírus"));
            System.out.println(covid3.wordCounter(Files.newBufferedReader(path), "covid"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file");
        }
    }
}
