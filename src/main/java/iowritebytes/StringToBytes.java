package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {

    public void writeAsBytes(List<String> words, Path path) {
        Path file = Path.of(String.valueOf(path));
        try (OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(file))) {
            for (int i = 0; i < words.size(); i++) {
                if (!words.get(i).startsWith("_")) {
                    outputStream.write(words.get(i).getBytes());
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);}
    }
}
