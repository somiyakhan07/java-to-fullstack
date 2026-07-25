/*bank account - private account holder and balance
initialize construction
dont let balance set at negative
 */

import java.util.Scanner;

class Accounts {
    private String accountHolder; // Private variables
    private int balance;

    public Accounts() {
        accountHolder = "Your Name"; // Default constructor initializes default values
        balance = 0;
    }

    public Accounts(String accountHolder, int balance) { // parameterized constructor
        this.accountHolder = accountHolder;
        if (balance >= 0) { // prevent negative balance
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid Balance");
        }
    }

    public String getAccountHolder() { // fetch account holder name
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) { // set account holder name
        this.accountHolder = accountHolder;
    }

    public int getBalance() { // fetch balance
        return balance;
    }

    public void setBalance(int balance) { // set balance and prevent negative balance
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid Balance");
        }

    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Take user input

        System.out.print("Enter Your Name: ");
        String inputAccountHolder = sc.nextLine(); // Take name input

        System.out.print("Enter Balance: ");
        int inputBalance = sc.nextInt(); // Take balance input

        Accounts a1 = new Accounts(inputAccountHolder, inputBalance); // Create an account object a1

        System.out.println("Name: " + a1.getAccountHolder()); // display account holder name
        System.out.println("Balance: " + a1.getBalance()); // display account balance

        sc.close();
    }
}

/*
 * Output:
 * Enter Your Name: Hina
 * Enter Balance: 25000
 * Name: Hina
 * Balance: 25000
 */