// Create an abstract class Payment.
// Add an abstract method pay().
// Create UPI and CreditCard.
// Implement pay() differently in both classes.
// Create objects and call pay().
// Covers: Abstract class + abstract method + overriding

abstract class Payment {
    static double balance = 1000; // Shared account for all

    public double getBalance() {
        return balance;
    }

    abstract double pay();
}

class UPI extends Payment {
    double amount;

    public UPI(double amount) {
        this.amount = amount;
    }

    @Override
    public double pay() {
        if (amount >= 1 && balance >= amount) {
            balance -= amount;
            System.out.println("payment sucessful through UPI");
            return balance;

        } else {
            System.out.println("Insufficient Balance!");
            return balance;
        }

    }
}

class CreditCard extends Payment {
    double amount;

    public CreditCard(double amount) {
        this.amount = amount;
    }

    @Override
    public double pay() {
        if (amount >= 1 && balance >= amount) {
            balance -= amount;
            System.out.println("payment sucessful through CreditCard");
            return balance;
        } else {
            System.out.println("Insufficient Balance!");
            return balance;
        }

    }

}

public class PaymentAbstract {
    public static void main(String[] args) {
        Payment p1 = new UPI(245);
        p1.pay();
        System.out.println(p1.getBalance());
        System.out.println();

        Payment p2 = new CreditCard(200);
        p2.pay();
        System.out.println(p2.getBalance());
        System.out.println();

        UPI u1 = new UPI(100);
        u1.pay();
        System.out.println(u1.getBalance());
        System.out.println();

        CreditCard c1 = new CreditCard(300);
        c1.pay();
        System.out.println(c1.getBalance());
        System.out.println();

        CreditCard c2 = new CreditCard(1500);
        c2.pay();
        System.out.println(c2.getBalance());

    }

}

/*
output:
payment sucessful through UPI
755.0

payment sucessful through CreditCard
555.0

payment sucessful through UPI
455.0

payment sucessful through CreditCard
155.0

Insufficient Balance!
155.0
 */