package week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Decoder {

    public void decode(Path path) {                     // Ha String lenne a visszatérési érték típusa, akkor a StringBuilder-t kell használni
        try {                                           // nagy állomány esetén érdemes InputStream-et használni    try (InputStream is = Files.newInputStream(path)) { byte[] buffer = new byte[1000]; ....
            // (InputStream is = Files.newInputStream(path))
            //byte[] buffer = new byteF10G;             Ez a puffer mérete
            byte[] bytes = Files.readAllBytes(path);    // a fájl tartalmát ez olvassa be
            //int size;
            // while (size = is.read(buffer)) > 0) { System.out.println(size);
            //for (int i = 0; i < size; i++) {
            // char c = (char) buffer[i] + 10);
            // System.out.print(c);
            for (byte b : bytes) {
                char c = (char) (b + 10);               // A típuskényszerítés (cast-olás) precedenciája nagyobb, ezért kell zárójelezni
                System.out.print(c);                    // ha sortörés nélkül kell, akkor Sístem.out.print()
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not decode file", ioe);
        }
    }

    public static void main(String[] args) {
        new Decoder().decode(Path.of("secret.dat"));
    }
}
