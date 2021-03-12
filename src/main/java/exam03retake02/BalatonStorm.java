package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class BalatonStorm {

    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {
        List<String> stations = new ArrayList<>();
        String line;
        String station = null;
        while ((line = reader.readLine()) != null) {
            if (line.contains("allomas")) {
                station = extractStationName(line);
            }
            if (isStorm(line)) {
                stations.add(station);
            }
        }
        Collections.sort(stations, Collator.getInstance(new Locale("hu", "HU")));
        return stations;
    }

    private boolean isStorm(String line) {
        return line.contains("\"level\": 3,");
    }

    private String extractStationName(String line) {
        return line.substring(line.indexOf(": \"") + 3, line.lastIndexOf("\""));
    }

    public static void main(String[] args) throws IOException {
        BalatonStorm balatonStorm = new BalatonStorm();

    }
}
