 // Q2 — Payment
 // Create an abstract class Payment:
 //
 // abstract class Payment {
 //     abstract void pay();
 // }
 //
 // Use an Anonymous Inner Class to implement the pay() method.
 // Output should be: Payment successful

abstract class Payment {

    abstract void pay(); // Abstract method
}

public class PaymentMainClass {

    public static void main(String[] args) {

        // Create an Anonymous Inner Class object
        // No separate class is created
        Payment p = new Payment() {

            @Override
            void pay() {
                System.out.println("Payment successful");
            }
        };

        // Calls the implemented pay() method
        p.pay();
    }
}

// Output:
// Payment successful

// Payment is abstract, so we cannot create its direct object.
// The Anonymous Inner Class extends Payment and implements pay().
// 'p' is a Payment reference pointing to the Anonymous Inner Class object.

// Important:
// new Payment() does NOT create an object of the abstract Payment class.
// It creates an object of the Anonymous Inner Class that extends Payment.
// Since pay() is implemented, the Anonymous Inner Class is concrete.