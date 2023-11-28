package bank.account;

class Saving extends Account {
    double interestRate;

    void computeAndDepositInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of Taka" + interest + " deposited.");
    }
}