// Design a simple E-Wallet system.
// A user should be able to add money, withdraw money, and transfer money from the wallet.
// The system should prevent invalid transactions and should never allow the balance to become negative.

class Account { // create class
    private String accountHolder; // private variable
    private double balance;

    public String getAccountHolderName() { // fetch account holder name
        return accountHolder;
    }

    public void setAccountHolderName(String accountHolder) { // set account holder name
        this.accountHolder = accountHolder;
    }

    public double getBalance() { // fetch balance
        return balance;
    }

    public Account(String accountHolder) { // parameterized constructor
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public void addMoney(double amount) { // add amount method with validation
        if (amount > 0) {
            balance += amount;
            System.out.println("Added Amount: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid amount, Please add amount more than 0");
        }
    }

    public void withdraw(double amount) { // withdraw amount method with validation
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("You have insufficient balance to withdraw amount");
        }
    }

    public void transfer(double amount) { // transfer amount method with validation
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transferred Amount: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("you have insufficient balance to transfer money");
        }
    }

}

public class EWallet { // main class
    public static void main(String[] args) { // main method
        Account a1 = new Account("Lina"); // create class obj a1 and set account holder name
        System.out.println("Account Holder: " + a1.getAccountHolderName());
        System.out.println();
        a1.addMoney(20000); // call method to add amount
        System.out.println();
        a1.addMoney(1000); // call method to add amount
        System.out.println();
        a1.withdraw(2000); // call method to withdraw amount
        System.out.println();
        a1.transfer(500); // call method to transfer amount
        System.out.println();
        a1.withdraw(50000); // call method to withdraw amount
    }

}
/* output:
Account Holder: Lina

Added Amount: 20000.0
Current Balance: 20000.0

Added Amount: 1000.0
Current Balance: 21000.0

Withdrawn Amount: 2000.0
Current Balance: 19000.0

Transferred Amount: 500.0
Current Balance: 18500.0

You have insufficient balance to withdraw amount
 */