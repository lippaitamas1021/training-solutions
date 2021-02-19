package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(convertToStars(Integer.parseInt(line)));
                stringBuilder.append("\n");
                }
        } catch (IOException ioe) {
            throw new IllegalStateException("Failed at reading the file", ioe);
        }
        return stringBuilder.toString();
    }

    private String convertToStars(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append('*');
        }
        return sb.toString();
    }
}
