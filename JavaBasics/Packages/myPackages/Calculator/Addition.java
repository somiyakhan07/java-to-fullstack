// Create a user-defined package named calculator containing two classes: Addition and Subtraction. 
// Create methods to perform addition and subtraction. Import these classes into another Java program and display the results.

package myPackages.Calculator; // Define Calculator package

public class Addition { // Addition class

    private int n1; // First number
    private int n2; // Second number

    // Constructor to initialize numbers
    public Addition(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // Getter for first number
    public int getN1() {
        return n1;
    }

    // Getter for second number
    public int getN2() {
        return n2;
    }

    // Method to perform addition
    public int add() {
        return n1 + n2;
    }
}