// Q5 — Payment System
// ============================================================
//
// Create an abstract class Payment.
//
// Create:
// - UPI
// - CreditCard
// - Cash
//
// Use:
// - Abstract Class
// - Abstract Method
// - Method Overriding
// - Polymorphism
// - Dynamic Method Dispatch

// 1. Abstract Class
abstract class Payment {

    // Static variable is shared by all child classes
    static int balance;

    // Abstract method must be overridden by child classes
    abstract public int pay(int amount);

    // Returns the shared balance
    public static int getBalance() {
        return balance;
    }

    // Adds money to the shared balance
    public void addBalance(int amount) {
        Payment.balance += amount;
    }
}

// 2. UPI Class
class UPI extends Payment {

    // UPI provides its own implementation of pay()
    @Override
    public int pay(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment successful through UPI: " + amount);
        } else {
            System.out.println("Insufficient balance for UPI payment of " + amount);
        }

        return balance;
    }
}

// 3. CreditCard Class
class CreditCard extends Payment {

    // CreditCard provides its own implementation of pay()
    @Override
    public int pay(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment successful through CreditCard: " + amount);
        } else {
            System.out.println("Insufficient balance for CreditCard payment of " + amount);
        }

        return balance;
    }
}

// 4. Cash Class
class Cash extends Payment {

    // Cash provides its own implementation of pay()
    @Override
    public int pay(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment successful through Cash: " + amount);
        } else {
            System.out.println("Insufficient balance for Cash payment of " + amount);
        }

        return balance;
    }
}

// 5. Main Execution Class
public class PaymentSystem {

    public static void main(String[] args) {

        // Polymorphism / Dynamic Method Dispatch:
        // Parent reference holds a child object
        Payment p = new UPI();

        // Add money to the shared balance
        p.addBalance(10000);

        // Runtime calls UPI's overridden pay() method
        p.pay(500);

        System.out.println("Current Shared Balance: " + Payment.getBalance());
        System.out.println();

        // Parent reference holds a CreditCard object
        Payment p1 = new CreditCard();

        // Runtime calls CreditCard's overridden pay() method
        p1.pay(1000);

        System.out.println("Current Shared Balance: " + Payment.getBalance());
        System.out.println();

        // Parent reference holds a Cash object
        Payment p2 = new Cash();

        // Payment fails because balance is only 8500
        p2.pay(10050);

        System.out.println("Final Shared Balance: " + Payment.getBalance());
    }
}

// Explanation:
// - Payment is an abstract class, so we cannot create its direct object.
// - pay() is an abstract method, so child classes must override it.
// - UPI, CreditCard, and Cash provide their own pay() implementation.
// - Payment p = new UPI(); is polymorphism.
// - The overridden method is selected at runtime, which is Dynamic Method Dispatch.
// - balance is static, so all Payment child objects share the same balance.
// - Therefore, a payment made through one child class affects the shared balance.