package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> numberOfOwls = new HashMap<>();
    
    public void readFromFile(BufferedReader reader) {
        try {
            String line;
            while ((line = reader.readLine())  != null) {
                String[] temp = line.split("=");
                String name = temp[0];
                int number = Integer.parseInt(temp[1]);
                numberOfOwls.put(name, number);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed at reading the file", e);
        }
    }

    public int getNumberOfOwls(String name) {
        int value = 0;
        for (Map.Entry entries : numberOfOwls.entrySet()) {
            if (numberOfOwls.containsKey(name)) {
                value = numberOfOwls.get(name);
            }
        }
        return value;
    }

    public static void main(String[] args) throws IOException {
        OwlCounter owlCounter = new OwlCounter();
        BufferedReader reader = Files.newBufferedReader(Path.of("owls.txt"));
        owlCounter.readFromFile(reader);
    }
}
