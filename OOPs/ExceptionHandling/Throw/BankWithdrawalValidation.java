// Q2 — Bank Withdrawal Validation
// ============================================================
//
// Create a BankAccount class with a balance variable.
//
// Requirements:
// - Create a method to withdraw money.
// - Use throw if the withdrawal amount is less than or equal to 0.
// - Use throw if the withdrawal amount exceeds the balance.
// - Deduct the amount only when the withdrawal is valid.
// - Handle exceptions using try-catch.
//
// Goal:
// Validate a transaction using throw and try-catch.

class BankAccount {
    int balance = 10000;

    public int getBalance() {
        return balance;
    }

    public int withdraw(int amount) {
        if (amount <= 0) {
            // Throw an exception if the amount is invalid.
            throw new IllegalArgumentException("Invalid Balance");
        } else if (amount <= balance) {
            // Deduct money only when the balance is sufficient.
            balance -= amount;
            System.out.println("Withdrawal successful");
            return balance;
        } else {
            // Throw an exception if the balance is insufficient.
            throw new IllegalArgumentException("Insufficient Balance");
        }
    }
}

public class BankWithdrawalValidation {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        try {
            b1.withdraw(110000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Balance: " + b1.getBalance());
    }

}

// Insufficient Amount
// Balance: 10000