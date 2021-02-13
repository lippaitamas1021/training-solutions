package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameOfThrones {

    public String getHouse(BufferedReader reader) throws IOException {
        reader.readLine();
        String line;
        Map<String, Integer> numberOfBattles = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            List<String> houses = new ArrayList<>();
            for (int i = 5; i <= 12; i++) {
                if (!parts[i].isBlank()) {
                    houses.add(parts[i]);
                }
            }
            for (String house : houses) {
                if (numberOfBattles.containsKey(house)) {
                    numberOfBattles.put(house, numberOfBattles.get(house) + 1);
                } else {
                    numberOfBattles.put(house, 1);
                }
            }
        }
        int max = 0;
        String houseMax = null;
        for (Map.Entry<String, Integer> entry: numberOfBattles.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                houseMax = entry.getKey();
            }
        }
        return houseMax;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("battles.txt"))) {
           String house = new GameOfThrones().getHouse(reader);
            System.out.println(house);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}

