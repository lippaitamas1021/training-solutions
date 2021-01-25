package week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma {

    public String printSecret(Path path) {
        StringBuilder sb = new StringBuilder();
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b : bytes) {
                char c = (char) (b + 10);
                sb.append(c);                   // összegyűjtöttük egy StringBuilder-be és egyszerre írtuk ki
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
        return sb.toString();
    }


        public static void main (String[]args){
           String result = new Enigma().printSecret(Path.of("secret.dat"));
            System.out.println(result);
        }
    }
