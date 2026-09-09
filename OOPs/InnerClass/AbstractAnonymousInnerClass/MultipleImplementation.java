// Q4 — Multiple Implementations
//
// Create an abstract class Payment.
// - Add an abstract pay() method.
//
// Create 2 different Anonymous Inner Class objects.
//
// First object:
// - Implement pay().
// - Print "Payment successful using UPI".
//
// Second object:
// - Implement pay().
// - Print "Payment successful using Card".
//
// Goal:
// Understand how multiple Anonymous Inner Class objects
// can provide different implementations of the same
// abstract method.

abstract class Payment {

    // Abstract method, It must be implemented by the child class
    abstract void pay();
}

public class MultipleImplementation {

    public static void main(String[] args) {

        // Create first Anonymous Inner Class object
        Payment p1 = new Payment() {

            @Override
            void pay() {

                // Implement the abstract method with UPI payment behavior
                System.out.println("Payment successful using UPI");
            }
        };

        // Create second Anonymous Inner Class object
        Payment p2 = new Payment() {

            @Override
            void pay() {

                // Implement the abstract method with Card payment behavior
                System.out.println("Payment successful using Card");
            }
        };

        // Call pay() of first Anonymous object
        p1.pay();

        // Call pay() of second Anonymous object
        p2.pay();
    }
}

// Output:
// Payment successful using UPI
// Payment successful using Card

// Explanation:
// Payment is an abstract class, so we cannot create its direct object.
// We created two different Anonymous Inner Class objects from the same abstract Payment class.

// p1 -> UPI payment implementation
// p2 -> Card payment implementation

// Both objects have the same reference type: Payment,
// but both provide different implementations of pay().

// Important:
// new Payment() { ... } does NOT create a direct object of the abstract Payment class.
// It creates an object of the Anonymous Inner Class that extends Payment.
// Anonymous Inner Class is useful when we need a one-time implementation without creating a separate class.