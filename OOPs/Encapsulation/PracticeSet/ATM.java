// ATM - create deposit() and withdraw() methods and dont allow withdraw more than balance  

class Account { // create account class
    private String name; // private variables
    private double balance;

    public Account() { // Default constructor with initialize values
        name = "Your name";
        balance = 0;
    }

    public Account(String name, double balance) { // Parameterized constructor with withdrawal validation
        this.name = name;
        this.balance = balance;
    }

    public String getName() { // fetch account name
        return name;
    }

    public void setName(String name) { // set name in private name variable
        this.name = name;
    }

    public double getBalance() { // Fetch current balance
        return balance;
    }

    public void deposit(double amount) { // Deposit money into account
        if (amount > 0) { // Check that deposit amount is positive
            balance += amount; // Add deposit amount to balance
            System.out.println("Amount Deposit: " + amount);
        } else {
            System.out.println("Insufficient amount");
        }
    }

    public void withdraw(double amount) { // Withdraw money from account
        if (amount > 0 && amount <= balance) { // Check withdrawal amount and balance
            balance = balance - amount; // Subtract withdrawal amount from balance
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class ATM { // main class
    public static void main(String[] args) { // main method
        Account a1 = new Account(); // Create Account Object a1
        a1.setName("Sonia"); // set name
        a1.deposit(100000); // Deposit amount into account
        a1.withdraw(80000); // Withdraw amount from account

        System.out.println("Account Name: " + a1.getName()); // display account name
        System.out.println("Current Amount: " + a1.getBalance()); // // display current balance

    }

}

/*
 * output:
 * Amount Deposit: 100000.0
 * Amount Withdrawn: 80000.0
 * Account Name: Sonia
 * Current Amount: 20000.0
 */