package iostringwriter.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Diary {

    private String name;
    private int mark;

    public Diary(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public static void newMark(String name, int mark) {
        Path file = Path.of("tanulo_neve.txt");
        try {
            if (Files.exists(file)) {
                Files.writeString(file, name, StandardOpenOption.APPEND);
                Files.writeString(file, String.valueOf(mark), StandardOpenOption.APPEND);

            } else {
                Files.writeString(file, name);
                Files.writeString(file, String.valueOf(mark));
            }
        } catch (IOException ioe) {
            throw  new IllegalStateException("Can not find the file", ioe);
        }

    }

    public static void main(String[] args) {
       newMark("Mila Kunis", 5);
    }
}
