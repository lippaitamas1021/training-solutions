package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        int counter = 0;
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                if (line.contains(String.valueOf(4))) {
                    System.out.println("****");
                }
                if (line.contains(String.valueOf(3))) {
                        System.out.println("***");
                    }
                if (line.contains(String.valueOf(2))) {
                    System.out.println("**");
            }
                if (line.contains(String.valueOf(1))) {
                    System.out.println("*");
                }
                }
        } catch (IOException ioe) {
            throw new IllegalStateException("Failed at reading the file", ioe);
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        Histogram histogram = new Histogram();
        histogram.createHistogram((Files.newBufferedReader(Path.of("histogram.txt"))));
    }
}
