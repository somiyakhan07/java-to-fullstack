// Bank Account
// Create:
// BankAccount
// deposit()
// SavingsAccount
// calculateInterest()
// Do:
// Create SavingsAccount.
// Upcast it to BankAccount.
// Call deposit().
// Downcast it to SavingsAccount.
// Call calculateInterest().
// Then answer:
// Does casting create a new object?

class Account {
    public void deposit() {
        System.out.println("Deposit Successfull!");
    }
}

class SavingsAccount extends Account {
    public void calculateInterest() {
        System.out.println("Interest calculated!");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        Account a = sa;
        a.deposit();

        SavingsAccount sa1 = (SavingsAccount) a;
        sa1.calculateInterest();

    }

}
// Answer:
// No! Casting does not create a new object.
// All reference variables point to the same object.

/* output:
Deposit Successfull!
Interest calculated!
 */