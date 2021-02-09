package iozip.names;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EmployeeFileManager {

    public void saveEmployees(Path path, List<String> employees) {
        try (ZipOutputStream outputStream = new ZipOutputStream(
                new BufferedOutputStream(Files.newOutputStream(path)))) {
            outputStream.putNextEntry(new ZipEntry("names.dat"));
            for (int i = 0; i < employees.size(); i++) {
                outputStream.write(employees.get(i).getBytes());
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);}
    }
}
