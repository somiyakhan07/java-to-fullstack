// Q2 — Array Index Exception
// ============================================================
//
// Create an array containing 5 numbers.
// Access an invalid array index.
//
// Requirements:
// - Handle ArrayIndexOutOfBoundsException.
// - Print a message when the index is invalid.
//
// Goal:
// Understand how to handle invalid array indexes.

public class ArrayIndexException {
    public static void main(String[] args) {

        try {
            // Array contains 5 elements with indexes 0 to 4.
            int[] arr = { 10, 20, 30, 40, 50 };

            // Index 5 is invalid because the last index is 4.
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // Handles the exception when an invalid index is accessed.
            System.out.println("Invalid Index: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
}

/*
Output:
Invalid Index: Index 5 out of bounds for length 5
Program ended

Explanation:
- try contains the code that might cause an exception.
- catch handles the invalid array index.
- The program continues after the exception is handled.
*/