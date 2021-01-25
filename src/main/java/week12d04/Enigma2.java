package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma2 {                                          // darabokban olvassuk be a fájlt, 1000 byte-os pufferrel
    public String printSecret(Path path) {
        StringBuilder sb = new StringBuilder();
        try (InputStream is = Files.newInputStream(path)) {     //InputStream-mel olvassuk be
            //byte[] bytes = Files.readAllBytes(path);
            byte[] buffer = new byte[1000];                     // 1000 byte-os puffer tömb létrehozása
            int size;                                           // el kell tárolni egy változóba, hogy hány byte-ot olvastam már be
            while (0 < (size = is.read(buffer))) {              // addig olvasom be a fájl tartalmát, amíg a beolvasott byte-ok száma nagyobb, mint 0
                for (int i = 0; i < size; i++) {                 // ki kell olvasni annyit, amennyit már beolvasott
                    char c = (char) (buffer[i] + 10);
                    sb.append(c);
                }
            }
            } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
        return sb.toString();
    }


    public static void main (String[]args){
        String result = new Enigma2().printSecret(Path.of("secret.dat"));
        System.out.println(result);
    }
}
