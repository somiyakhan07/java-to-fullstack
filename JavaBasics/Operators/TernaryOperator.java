// Demonstrates the ternary operator in Java.

// Syntax: condition ? value_if_true : value_if_false

public class TernaryOperator {
    public static void main(String args[]) {
        int n = 4;
        int result = 0;
        result = n % 2 == 0 ? 1 : 0; // Ternary Operator 
        System.out.println("n % 2 == 0 ? 1 : 0 = " + result);
    }

}

// n % 2 == 0 ? 1 : 0 = 1