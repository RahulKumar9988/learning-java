
import models.BankAccount;
import services.BankService;

public class Main {

    public static void main(String[] args) {

        BankService bank = new BankService();

        BankAccount acc1 =
                new BankAccount("101", "Rahul", 5000);

        bank.createAccount(acc1);

        bank.deposit("101", 2000);
        bank.withdraw("101", 1000);

        System.out.println("Balance: " + acc1.getBalance());
    }
}