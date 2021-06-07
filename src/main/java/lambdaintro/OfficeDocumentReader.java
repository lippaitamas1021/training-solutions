package lambdaintro;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class OfficeDocumentReader {

    private static final String REGEXP = ".*\\.(docx|xlsx|pptx)$";

    public List<File> listOfficeDocuments(File folder) {
            List<File> files = Arrays.asList(Objects.requireNonNull(folder.listFiles(f -> f.isFile()
                    && f.getName().toLowerCase().matches(REGEXP))));
            files.sort(Comparator.comparing(File::getName));
            return files;
        }
}
