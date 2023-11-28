package bank.account;
import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of Taka" + amount + " successful.");
    }

    void displayAccountDetails() {
        System.out.println("\nAccount Details :");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Taka" + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("\nWithdrawal of Taka" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}



