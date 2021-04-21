package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class People {

    private List<Person> people = new ArrayList<>();

    public int getNumberOfMales(String path) {
        int counter = 0;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(path))) {
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String first_name = temp[1];
                String last_name = temp[2];
                String email = temp[3];
                String gender = temp[4];
                String ip_address = temp[5];
                people.add(new Person(id, first_name, last_name, email, gender, ip_address));
            }

            for (Person person : people) {
                if (person.getGender().equalsIgnoreCase("male")) {
                    counter++;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read the file", ioe);
        }
        return counter;
    }
}
