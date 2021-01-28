package ioreadstring.transaction;

import exceptionclass.bank.Bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

        private List<BankAccount> accountList = new ArrayList<>();

    public void uploadListFromFile(String path){
        Path accounts = Path.of(path);
        try {
            List<String> accountsFromFile = Files.readAllLines(accounts);
            for(String account : accountsFromFile){
                String[] temp = account.split(";");
                BankAccount bankAccount = new BankAccount(temp[0],temp[1],Integer.parseInt(temp[2]));
                accountList.add(bankAccount);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't open file",ioe);
        }
    }

    public void makeTransactions(String path){
        Path transactions = Path.of(path);
        try {
            List<String> transactionsFromFile = Files.readAllLines(transactions);

            for(String s : transactionsFromFile){
                String[] temp = s.split(";");
                for(BankAccount bankAccount : accountList){
                    if(temp[0].equals(bankAccount.getAccountNumber())){
                        bankAccount.setBalance(Double.parseDouble(temp[1]));
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not find the file",ioe);
        }
    }

    public List<BankAccount> getAccountList() {
        return accountList;
    }
}
