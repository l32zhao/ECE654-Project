public class Account {
    private int accountID;
    private double balance;

    //@ invariant balance >= 0; // Balance must always be non-negative.

    //@ requires initialBalance >= 0; // Initial balance must be non-negative.
    //@ ensures balance == initialBalance; // Balance should be set to initialBalance.
    public Account(int accountID, double initialBalance) {
        this.accountID = accountID;
        this.balance = initialBalance;
    }

    //@ requires amount > 0; // Deposit amount must be positive.
    //@ ensures balance == \old(balance) + amount; // Balance increases by the deposited amount.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    //@ requires amount > 0 && amount <= balance; // Withdrawal must be positive and <= current balance.
    //@ ensures balance == \old(balance) - amount; // Balance decreases by the withdrawn amount.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    //@ ensures \result == balance; // Returns the current balance.
    public double getBalance() {
        return balance;
    }
}
