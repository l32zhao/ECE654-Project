public class Account {
    private int accountID;
    private double balance;

    //@ public model double specBalance;

    //@ public invariant specBalance >= 0; // Balance must always be non-negative.

    //@ requires initialBalance >= 0; // Initial balance must be non-negative.
    //@ ensures specBalance == initialBalance; // Balance should be set to initialBalance.
    public Account(int accountID, double initialBalance) {
        this.accountID = accountID;
        this.balance = initialBalance;
        //@ set specBalance = initialBalance; // Set specBalance explicitly.
    }

    //@ requires amount > 0; // Deposit amount must be positive.
    //@ ensures specBalance == \old(specBalance) + amount; // Balance increases by the deposited amount.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            //@ set specBalance = balance; // Update specBalance explicitly.
        }
    }

    //@ requires amount > 0 && amount <= specBalance; // Withdrawal must be positive and <= current balance.
    //@ ensures specBalance == \old(specBalance) - amount; // Balance decreases by the withdrawn amount.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            //@ set specBalance = balance; // Update specBalance explicitly.
        }
    }

    //@ ensures \result == specBalance; // Returns the current balance.
    public /*@ pure @*/ double getBalance() {
        return balance;
    }
}
