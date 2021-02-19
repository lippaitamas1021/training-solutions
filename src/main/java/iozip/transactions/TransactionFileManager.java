package iozip.transactions;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TransactionFileManager {

    public void saveTransactions(Path path, List<Transaction> transactionList) {
        try (ZipOutputStream outputStream = new ZipOutputStream(
                new BufferedOutputStream(Files.newOutputStream(path)))) {
            for (Transaction transaction : transactionList) {
            outputStream.putNextEntry(new ZipEntry(Long.toString(transaction.getId())));
            String outputString = transaction.getTime().toString() + "\n" + transaction
                    .getAccount() + "\n" + Double.toString(transaction.getAmount());
                outputStream.write(outputString.getBytes());
                outputStream.closeEntry();
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}