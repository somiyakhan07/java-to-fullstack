// Q6 — Interface + Abstract Class
//
// Create an interface Payment with:
// - void pay();
//
// Create an abstract class Transaction with:
// - void showTransaction()
// - Print "Transaction started"
//
// Create a class UPI that:
// - Extends Transaction
// - Implements Payment
// - Implement pay() and print "Payment through UPI"
//
// In main():
// - Create a UPI object.
// - Call showTransaction().
// - Call pay().
//
// Goal:
// Understand how a class can extend an abstract class
// and implement an interface at the same time.

interface Payment {

    // Interface method
    void pay();
}

abstract class Transaction {

    // Normal method of abstract class
    abstract void showTransaction();

}

class UPI extends Transaction implements Payment {

    // Implement pay() from Payment interface
    @Override
    public void pay() {
        System.out.println("Payment through UPI");
    }

    @Override
    void showTransaction() {
        System.out.println("Transaction started");
    }
}

public class InterfaceAndAbstract {

    public static void main(String[] args) {

        // Create UPI object
        UPI u = new UPI();

        // Call method inherited from Transaction
        u.showTransaction();

        // Call implemented interface method
        u.pay();
    }
}

// Output:
// Transaction started
// Payment through UPI

/*
 * Explanation:
 * UPI is doing two things:
 *
 * extends Transaction -> gets showTransaction()
 * implements Payment -> must implement pay()
 *
 * A class can extend one class and implement
 * multiple interfaces at the same time.
 */