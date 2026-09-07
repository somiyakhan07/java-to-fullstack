// Inner Class Accessing Private Data
// Create an outer class Bank with:
// private String bankName = "SBI"
// Non-static Inner class Account
// displayBank() method se bankName print karo.

class Bank {

    private String bankName = "SBI";

    // Non-static Inner Class
    class Account {

        public void displayBank() {

            // Inner class can access private data of Outer class
            System.out.println(bankName);
        }
    }
}

public class InnerClassAccessingPrivateData {

    public static void main(String[] args) {

        // Create Outer class object
        Bank b = new Bank();

        // Create Non-static Inner class object
        // Outer class object is required
        Bank.Account bb1 = b.new Account();

        // Call Inner class method
        bb1.displayBank();
    }
}

// Output:
// SBI

// A non-static Inner Class can directly access the private members of its Outer Class

// first we create a outer class reference varibale or object of type Bank variable 
// Bank b = new Bank();

// then, create a non static inner class reference variable or object with Bank + Account type and 
// Bank.Account bb1 = b.new Account();

// creates inner class Account object with outer class Bank object

// Important:
// private does NOT stop the Inner Class from accessing
// the Outer Class's private data.
// The Inner Class has access to the members of its Outer Class.