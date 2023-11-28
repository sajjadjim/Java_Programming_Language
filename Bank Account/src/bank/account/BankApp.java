package bank.account;
import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creating a Saving Account
        Saving savingAccount = new Saving();
        savingAccount.customerName = "Tanzina Teresa ";
        savingAccount.accountNumber = 234561778;
        savingAccount.balance = 10000.0;
        savingAccount.interestRate = 50.0;
        // Creating a Current Account
        Current currentAccount = new Current();
        currentAccount.customerName = "Tanzina  Teresa ";
        currentAccount.accountNumber = 789012;
        currentAccount.balance = 2000.0;
        currentAccount.minimumBalance = 50000.0;
        currentAccount.serviceCharge = 500.0;
        // Performing operations on Saving Account
        savingAccount.deposit(50000.0);
        savingAccount.computeAndDepositInterest();
        savingAccount.withdraw(20000.0);
        savingAccount.displayAccountDetails();
        // Performing operations on Current Account
        currentAccount.deposit(30000.0);
        currentAccount.checkMinimumBalance();
        currentAccount.withdraw(22000.0);
        currentAccount.displayAccountDetails();

        scanner.close();
    }
}