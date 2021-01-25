package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class Covid2 {

    public int wordCounter(String word, Path path) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Covid2.class.getResourceAsStream("index.html")))) {
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
        } catch (NullPointerException npe) {
            throw new IllegalStateException("Can not find the file", npe);
        }
    }

    public static void main(String[] args) {
        Covid2 covid2 = new Covid2();
        Path path = Path.of("src/main/resources/index.html");
        System.out.println(covid2.wordCounter("koronavírus", path));
        System.out.println(covid2.wordCounter("covid", path));
    }
}
