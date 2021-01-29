package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CityOperations {                           // ha a github-ról kell a fájlt beolvasni, akkor a RAW fület kell használni
                                                        // a metódus paramétere BufferedReader legyen azért, hogy lehessen tesztelni
    public String findCityWithMaxLength(BufferedReader bufferedReader) {
        String cityWithLongestName = "";                // lehet akár több város az eredmény, tehát listát kellene visszaadni
        try {
            String line;                                // kommentben magyarázom a kódot vagy beszédes nevű metódust hozok létre erre
            bufferedReader.readLine();                          // van egy header (Település), ennek nem szabad bennemaradnia
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(";");         // a split() metódus STring tömböt ad vissza
                if (parts.length <= 1) {
                    throw new IllegalArgumentException("Illegal line" + line);
                }
                String name = parts[1];
                if (cityWithLongestName.length() < name.length()) {
                    cityWithLongestName = name;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
        if (cityWithLongestName.equals("")) {
            throw new IllegalArgumentException("No city found");
        }
        return cityWithLongestName;
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of("iranyitoszamok.txt"))) {
            String city = new CityOperations().findCityWithMaxLength(bufferedReader);
            System.out.println(city);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }
}
