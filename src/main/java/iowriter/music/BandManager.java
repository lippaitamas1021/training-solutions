package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    private List<Band> bands = new ArrayList<>();

    public void readBandsFromFile(Path inputFile) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(inputFile)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(";");
                Band band = new Band(temp[0], Integer.parseInt(temp[1]));
                bands.add(band);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read the file", e);
        }
    }

    public void writeBandsBefore(Path outputFile, int year) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(outputFile)) {
            for (Band band : olderThan(year)) {
                bufferedWriter.write(band.getName() + " " + band.getYear() + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not write the file", e);
        }
    }

    public List<Band> olderThan(int year) {
        List<Band> result = new ArrayList<>();
        for (Band band : bands) {
            if (band.getYear() < year) {
                result.add(band);
            }
        }
        return result;
    }
}
