// Design a Banking Account System.
// Different account types share common account information but have different features.
// Create a parent class and multiple child classes to represent different bank accounts.

// Parent class
class Account {

    // Common properties of all bank accounts
    private String accountNumber;
    private String holderName;
    private double balance;

    // Parameterized constructor
    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Get account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Set account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Get account holder name
    public String getHolderName() {
        return holderName;
    }

    // Set account holder name
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    // Get account balance
    public double getBalance() {
        return balance;
    }

    // Set account balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}


// Child class of Account
class SavingsAccount extends Account {

    // Savings account-specific property
    private double interestRate;

    // Parameterized constructor
    public SavingsAccount(String accountNumber, String holderName,
            double balance, double interestRate) {

        super(accountNumber, holderName, balance); // call parent constructor
        this.interestRate = interestRate; // set interest rate
    }

    // Get interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Set interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}


// Child class of Account
class CurrentAccount extends Account {

    // Current account-specific properties
    private double overdraftLimit;

    // Parameterized constructor
    public CurrentAccount(String accountNumber, String holderName,
            double balance, double overdraftLimit) {

        super(accountNumber, holderName, balance); // call parent constructor
        this.overdraftLimit = overdraftLimit; // set overdraft limit
    }

    // Get overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Set overdraft limit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}


// Child class of Account
class FixedDepositAccount extends Account {

    // Fixed deposit-specific properties
    private int depositPeriod;
    private double interestRate;

    // Parameterized constructor
    public FixedDepositAccount(String accountNumber, String holderName,
            double balance, int depositPeriod, double interestRate) {

        super(accountNumber, holderName, balance); // call parent constructor
        this.depositPeriod = depositPeriod; // set deposit period
        this.interestRate = interestRate; // set interest rate
    }

    // Get deposit period
    public int getDepositPeriod() {
        return depositPeriod;
    }

    // Set deposit period
    public void setDepositPeriod(int depositPeriod) {
        this.depositPeriod = depositPeriod;
    }

    // Get interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Set interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}


// Main class
public class BankingAccountSystem {

    // Main method
    public static void main(String[] args) {

        // Create SavingsAccount object
        // It can access Account features + its own interest rate
        SavingsAccount s1 = new SavingsAccount(
                "S101",
                "Aliya",
                50000,
                4.5
        );

        System.out.println("----Savings Account Details----");
        System.out.println("Account Number: " + s1.getAccountNumber());
        System.out.println("Account Holder: " + s1.getHolderName());
        System.out.println("Balance: " + s1.getBalance());
        System.out.println("Interest Rate: " + s1.getInterestRate());


        // Create CurrentAccount object
        // It can access Account features + its own overdraft limit
        CurrentAccount c1 = new CurrentAccount(
                "C101",
                "Somiya",
                80000,
                25000
        );

        System.out.println();
        System.out.println("----Current Account Details----");
        System.out.println("Account Number: " + c1.getAccountNumber());
        System.out.println("Account Holder: " + c1.getHolderName());
        System.out.println("Balance: " + c1.getBalance());
        System.out.println("Overdraft Limit: " + c1.getOverdraftLimit());


        // Create FixedDepositAccount object
        // It can access Account features + its own FD features
        FixedDepositAccount f1 = new FixedDepositAccount(
                "F101",
                "Rahul",
                100000,
                2,
                7.0
        );

        System.out.println();
        System.out.println("----Fixed Deposit Account Details----");
        System.out.println("Account Number: " + f1.getAccountNumber());
        System.out.println("Account Holder: " + f1.getHolderName());
        System.out.println("Balance: " + f1.getBalance());
        System.out.println("Deposit Period: " + f1.getDepositPeriod() + " years");
        System.out.println("Interest Rate: " + f1.getInterestRate());
    }
}

/*
Output:

----Savings Account Details----
Account Number: S101
Account Holder: Aliya
Balance: 50000.0
Interest Rate: 4.5

----Current Account Details----
Account Number: C101
Account Holder: Somiya
Balance: 80000.0
Overdraft Limit: 25000.0

----Fixed Deposit Account Details----
Account Number: F101
Account Holder: Rahul
Balance: 100000.0
Deposit Period: 2 years
Interest Rate: 7.0
*/