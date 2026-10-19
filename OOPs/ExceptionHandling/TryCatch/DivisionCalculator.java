// Q1 — Division Calculator
// ============================================================
//
// Write a Java program that divides two numbers.
//
// Requirements:
// - Use try-catch.
// - Handle ArithmeticException when dividing by zero.
// - Print an appropriate error message.
//
// Goal:
// Understand how to handle exceptions using try-catch.

public class DivisionCalculator {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        try {
            // Put code here that might throw an exception.
            j = 18 / 0;
        }
        catch (ArithmeticException e) {
            // Executes when an ArithmeticException occurs in the try block.
            System.out.println("Something went wrong: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
}

/*
Output:
Something went wrong: / by zero
Program ended

Explanation:
- try: Contains code that might cause an exception.
- catch: Handles the exception so the program can continue.
- ArithmeticException: Occurs when an integer is divided by zero.
- Program ended: Prints because the exception was handled.
*/