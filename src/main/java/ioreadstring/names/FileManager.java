package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path path;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String fileRealtivePath) {
        this.path =  Path.of(fileRealtivePath);
    }

    public void readFromFile() throws IOException {
            List<String> fileInString = Files.readAllLines(path);
            for (String s : fileInString) {
                String firstAndLast[] = s.split(" ");
                Human human = new Human(firstAndLast[0], firstAndLast[1]);
                humans.add(human);
            }
    }

    public List<Human> getHumans() {
        return new ArrayList<>(humans);
    }

    public Path getPath() {
        return path;
    }
}
