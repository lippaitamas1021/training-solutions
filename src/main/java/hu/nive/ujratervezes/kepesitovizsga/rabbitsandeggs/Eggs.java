package hu.nive.ujratervezes.kepesitovizsga.rabbitsandeggs;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Eggs {

    private List<Rabbit> rabbits = new ArrayList<>();

    public Rabbit getRabbitWithMaxEggs() {
        Rabbit searchedRabbit = null;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of("src/test/resources/eggs.csv"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(";");
                String name = temp[0];
                int eggs = Integer.parseInt(temp[1]);
                rabbits.add(new Rabbit(name, eggs));
            }
            int max = 0;

            for (Rabbit rabbit : rabbits) {
                if (max < rabbit.getEggs()) {
                    max = rabbit.getEggs();
                    searchedRabbit = rabbit;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not red the file", ioe);
        }
        return searchedRabbit;
    }
}
