package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma5 {

    public void printSecret(Path source, Path destination) {
        try (InputStream is = Files.newInputStream(source);
             Writer writer = Files.newBufferedWriter(destination)) {
            byte[] buffer = new byte[10];
            int size;
            while (0 < (size = is.read(buffer))) {
                for (int i = 0; i < size; i++) {
                    char c = (char) (buffer[i] + 10);
                    writer.write(Character.toString(c));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }


    public static void main (String[]args){
        new Enigma5().printSecret(Path.of("secret.dat"), Path.of("result.txt"));
    }
}
