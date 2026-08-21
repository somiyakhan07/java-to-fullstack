// Payment
// Create a Pay parent class with a pay() method.
// Create UPI and CreditCard child classes and override or run time pay() with different implementations

class Pay {
    public void pay() { // Parent class method
        System.out.println("Payment successful through Pay!");
    }
}

class UPI extends Pay { // UPI inherits Pay
    @Override
    public void pay() { // Override parent pay() method
        System.out.println("Payment successful through UPI!");
    }
}

class CreditCard extends Pay { // CreditCard inherits Pay
    @Override
    public void pay() { // Override parent pay() method
        System.out.println("Payment successful through Credit Card!");
    }
}

public class Payment {
    public static void main(String[] args) {
        Pay p1 = new Pay(); // Parent reference + parent object
        p1.pay();

        Pay p2 = new UPI(); // Parent reference + UPI object
        p2.pay(); // UPI's overridden method runs

        p2 = new CreditCard(); // Same reference now refers to CreditCard
        p2.pay(); // CreditCard's overridden method runs

    }

}

/* output:
Payment successful through Pay!
Payment successful through UPI!
Payment successful through Credit Card!
*/