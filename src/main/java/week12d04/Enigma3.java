package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma3 {

    public String printSecret(Path path) {
        StringBuilder sb = new StringBuilder();
        try (InputStream is = Files.newInputStream(path)) {
            byte[] buffer = new byte[10];                       // 10 byte-os puffert hoztam létre
            int size;                                           // általában 64 kbyte-os pufferrel dolgozunk
            while (0 < (size = is.read(buffer))) {
                System.out.println(size);
                for (int i = 0; i < size; i++) {                // csak a size méretéig szabad menni, nem a buffer végéig
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
        String result = new Enigma3().printSecret(Path.of("secret.dat"));
        System.out.println(result);
    }
}
