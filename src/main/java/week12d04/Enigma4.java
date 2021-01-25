package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma4 {                              // Azt akarom, hogy a beolvasott byte-okat írja ki egy másik fájlba

    public void printSecret(Path source, Path destination) {
        try (InputStream is = Files.newInputStream(source);
            OutputStream os = Files.newOutputStream(destination)) {     // Writer-t és BufferedReader-t is lehetne haszn
            byte[] buffer = new byte[10];
            int size;
            while (0 < (size = is.read(buffer))) {
                for (int i = 0; i < size; i++) {
                    char c = (char) (buffer[i] + 10);
                    os.write(c);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }


    public static void main (String[]args){
       new Enigma4().printSecret(Path.of("secret.dat"), Path.of("result.txt"));
    }
}
