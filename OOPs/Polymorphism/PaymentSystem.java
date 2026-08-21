// Payment System
// Create Payment → UPI, CreditCard.
// Use parent reference with child objects to demonstrate Dynamic Method Dispatch.

class Payment {
    public void pay() {
        System.out.println("Payment Successful!");
    }
}

class UPI extends Payment {
    @Override
    public void pay() { // Override parent method
        System.out.println("Payment Successful through UPI!");
    }
}

class CreditCard extends Payment {
    @Override
    public void pay() { // Override parent method
        System.out.println("Payment Successful through Credit Card!");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {

        Payment p1 = new Payment(); // Parent reference + parent object
        p1.pay();
        System.out.println();

        p1 = new UPI(); // Parent reference + UPI object
        p1.pay();
        System.out.println();

        p1 = new CreditCard(); // Parent reference + CreditCard object
        p1.pay();
    }
}

/* output:
Payment Successful!

Payment Successful through UPI!

Payment Successful through Credit Card!
*/