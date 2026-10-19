// Q4 — String to Integer Conversion
// ============================================================
//
// Convert a String into an integer using Integer.parseInt().
//
// Requirements:
// - Try converting "123" and "abc".
// - Handle NumberFormatException.
// - Display an appropriate message when conversion fails.
//
// Goal:
// Understand how to handle invalid number conversions.

public class StringToIntegerConversion {
    public static void main(String[] args) {
        String i = "123";

        try {
            // Converts a valid numeric String into an int.
            int k = Integer.parseInt(i);
            System.out.println(k);

            // "abc" is not a valid integer, so it throws an exception.
            int l = Integer.parseInt("abc");
            System.out.println(l);
        }
        catch (NumberFormatException e) {
            // Handles invalid String-to-integer conversion.
            System.out.println("Invalid Number Format: " + e.getMessage());
        }

        System.out.println("Program Ended");
    }
}

/*
Output:
123
Invalid Number Format: For input string: "abc"
Program Ended

Explanation:
- Integer.parseInt("123") successfully converts the String to 123.
- Integer.parseInt("abc") throws NumberFormatException.
- After the exception, the remaining statements in the try block are skipped.
- The catch block handles the exception, and the program continues.
*/