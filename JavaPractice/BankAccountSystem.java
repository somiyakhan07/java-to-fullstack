// Q2 — Bank Account System
// ============================================================
//
// Create a BankAccount class.
//
// Use:
// - Encapsulation
// - Constructor
// - this
// - Methods
// - Array of Objects
//
// Features:
// - Create account
// - Deposit
// - Withdraw
// - Check balance
// - Display account details

class BankAccount {

    // private variables provide Encapsulation
    private String accountHolder;
    private long accountNo;
    private int balance;
    private String password;

    // Constructor initializes account details when object is created
    public BankAccount(String accountHolder, long accountNo, String password) {
        // this refers to the current object
        this.accountHolder = accountHolder;
        this.accountNo = accountNo;
        this.password = password;
    }

    // Getter is used to access private data
    public String getAccountHolder() {
        return accountHolder;
    }

    // Returns the current account balance
    public int checkBalance() {
        return balance;
    }

    // Deposit increases the current account balance
    public int deposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful: " + amount);
        return balance;
    }

    // Withdraw decreases balance only if sufficient balance is available
    public int withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful: " + amount);
            return balance;
        } else {
            System.out.println("Insufficient balance");
            return balance;
        }
    }

    // Displays account information
    public void accountDetails() {
        System.out.println("Name: " + accountHolder);
        System.out.println("Acc.No: " + accountNo);
        System.out.println("Balance: " + balance);
    }

    // Checks old password before setting a new password
    public void setNewPassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(password)) {
            this.password = newPassword;
            System.out.println("Password set successfully");
        } else {
            System.out.println("Wrong Password!");
        }
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {

        // Array of objects: stores multiple BankAccount objects
        BankAccount[] acc = new BankAccount[3];

        // Creating individual BankAccount objects
        acc[0] = new BankAccount("Alina", 11111111, "@23456");
        acc[1] = new BankAccount("Hero", 22222222, "234@34");
        acc[2] = new BankAccount("Lina", 33333333, "987#22");

        // Deposit money into Alina's account
        acc[0].deposit(10000);

        System.out.println();

        // Check current balance
        System.out.println(acc[0].checkBalance());

        System.out.println();

        // Withdraw money from Alina's account
        acc[0].withdraw(560);

        System.out.println();

        // Check balance after withdrawal
        System.out.println(acc[0].checkBalance());

        System.out.println();

        // Display complete account details
        acc[0].accountDetails();

        System.out.println();

        // Change password after verifying the old password
        acc[0].setNewPassword("@23456", "@22223333");
    }
}
/* 
Output:
Deposit successful: 10000

10000

Withdraw successful: 560

9440

Name: Alina
Acc.No: 11111111
Balance: 9440

Password set successfully
 */

// Explanation:
// - Encapsulation: account data is private.
// - Constructor initializes each BankAccount object.
// - this refers to the current object.
// - Each account has its own balance because balance is not static.
// - Array of objects stores multiple bank accounts.
// - deposit() adds money and withdraw() removes money.
// - String passwords are compared using .equals().
// - checkBalance() follows Java naming convention: camelCase.