package bank.account;
class Current extends Account {
    double minimumBalance;
    double serviceCharge;

    void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Minimum balance not maintained. Service charge of Taka" + serviceCharge + " applied.");
        }
    }
}
