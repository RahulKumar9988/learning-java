package services;

import java.util.HashMap;
import java.util.Map;
import models.BankAccount;

public class BankService {
    private Map<String,BankAccount> accounts = new HashMap<>();

    public void createAccount(BankAccount account){
        accounts.put(account.getAccountNumber(),account);
    }

    public void deposit(String accountNumber, double amount){
        BankAccount account = accounts.get(accountNumber);
        if(account != null){
            account.deposit(amount);
        }
    }

    public void withdraw(String accountNumber, double amount){
        BankAccount account = accounts.get(accountNumber);
        if(account != null){
            account.withdraw(amount);
        }
    }

}
