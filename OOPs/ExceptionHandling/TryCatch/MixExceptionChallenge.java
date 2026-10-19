// Q5 — Mixed Exception Challenge
// ============================================================
//
// Write a Java program that performs the following operations
// inside a try block:
//
// 1. Divide two numbers.
// 2. Access an array element.
// 3. Convert a String into an integer.
//
// Requirements:
// - Use multiple catch blocks.
// - Handle the possible exceptions.
// - Test different inputs to trigger each exception.
//
// Goal:
// Practise handling multiple exceptions in one program.

public class MixExceptionChallenge {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        String k = "abc";

        try {
            // Throws ArithmeticException when i is zero.
            j = 25 / i;

            int[] arr = { 1, 34, 43, 54 };

            // Throws ArrayIndexOutOfBoundsException for index 9.
            System.out.println(arr[9]);

            // Throws NumberFormatException because "abc" is not numeric.
            int l = Integer.parseInt(k);
        }
        catch (ArithmeticException e) {
            System.out.println("Invalid Division: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Number Format: " + e.getMessage());
        }

        System.out.println("Program Ended");
    }
}

/*
Output with i = 0:

Invalid Division: / by zero
Program Ended

Testing each exception:
1. ArithmeticException:
   Keep i = 0.

2. ArrayIndexOutOfBoundsException:
   Set i = 5 so division succeeds; index 9 is invalid.

3. NumberFormatException:
   Set i = 5 and use a valid array index, such as arr[1].
   Keep k = "abc".

Important:
When an exception occurs, the remaining statements in the try block
are skipped. Only the matching catch block executes.
*/