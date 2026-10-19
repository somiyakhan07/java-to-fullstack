// Q3 — Multiple Catch Blocks
// ============================================================
//
// Write a Java program that performs division and accesses an
// array element inside the same try block.
//
// Requirements:
// - Use multiple catch blocks.
// - Handle ArithmeticException.
// - Handle ArrayIndexOutOfBoundsException.
//
// Goal:
// Understand how to handle different exception types
// using multiple catch blocks.

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        int i = 2;
        int j = 0;

        try {
            j = 20 / i; // Division succeeds: 20 / 2 = 10

            int[] arr = { 10, 30, 50, 40, 30, 50 };

            // Valid indexes are 0 to 5, so index 7 throws an exception.
            System.out.println(arr[7]);
        }
        catch (ArithmeticException e) {
            System.out.println("Invalid Division: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index: " + e.getMessage());
        }

        System.out.println("Program Ended");
    }
}

/*
Output:
Invalid Index: Index 7 out of bounds for length 6
Program Ended

Explanation:
- Multiple catch blocks handle different exception types.
- When arr[7] throws an exception, the remaining try-block statements
  are skipped.
- The matching catch block handles the exception, and the program continues.
*/