
// Q6 — Interface + @Override
// ============================================================
//
// Create an interface Payment with pay().
// Implement it in a UPI class using @Override.
//
// Goal:
// Understand @Override with interfaces.

interface Payment {

    public void pay();
}

class UPI implements Payment {

    @Override
    public void pay() {
        // @Override confirms that pay() is implemented from Payment.
        System.out.println("Payment Successful through UPI");
    }
}

public class InterfaceAndOverride {

    public static void main(String[] args) {

        UPI p = new UPI();

        // Calls the pay() method implemented by UPI.
        p.pay();
    }
}

// Output:
// Payment Successful through UPI

/*
 * Important:
 *
 * @Override can be used when:
 * 1. A child class overrides a parent class method.
 * 2. A class implements an interface method.
 *
 * Here:
 * Payment -> interface
 * pay() -> interface method
 * UPI -> implements Payment
 * @Override -> confirms that UPI implements Payment's pay()
 */