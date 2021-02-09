package iodatastream.bank;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BankAccountManager {

    public void saveAccount(BankAccount account, Path folder) {
        Path path = folder.resolve(account.getAccountNumber() + ".dat");
        try (DataOutputStream os = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
                String an = account.getAccountNumber();
                os.writeUTF(an);
                String name = account.getOwner();
                os.writeUTF(name);
                Double b = account.getBalance();
                os.writeDouble(b);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);}
    }

    public BankAccount loadAccount(InputStream is) {
        try (DataInputStream inputStream = new DataInputStream(
                new BufferedInputStream(is))) {
            String accountNumber = inputStream.readUTF();
            String owner = inputStream.readUTF();
            int balance = inputStream.readInt();
            return new BankAccount(accountNumber, owner, balance);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
