package ioreadbytes.byteacount;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int readBytesAndFindAs(String path) {
        int sumOfA = 0;
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(Path.of(path)))) {
            byte[] bytes = new byte[2000];
            int size;
            while ((size = inputStream.read(bytes)) > 0) {
                for (int i = 0; i < size; i++) {
                    if (bytes[i] == (byte) 'a') {
                        sumOfA++;
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return sumOfA;
    }
}
