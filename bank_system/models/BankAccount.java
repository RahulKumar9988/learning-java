package models;

public class BankAccount {
    private String accountNumber;
    private String userName;
    private double balance;

    public BankAccount(String accountNumber, String userName, double balance){
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            transactionHistory("deposit", amount);
        }else{
            System.out.println("invalid amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            transactionHistory("withdrawal", amount);
        }else{
            System.out.println("invalid amount");
        }
    }

    public String getAccountNumber(){
        return accountNumber;   
    }

    public double getBalance() {
        return balance;
    }   
    
    public void transactionHistory(String transactionType, double amount){
        System.out.println("Type: " + transactionType + " | Amount: " + amount);
    }
}
