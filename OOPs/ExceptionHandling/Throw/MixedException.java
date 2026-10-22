// Q6 — Mixed Exception Challenge
// ============================================================
//
// Write a program that converts a String into an integer,
// divides 100 by that number, and accesses an array element.
//
// Requirements:
// - Use throw if the converted number is less than or equal to 0.
// - Handle NumberFormatException.
// - Handle ArithmeticException.
// - Handle ArrayIndexOutOfBoundsException.
// - Use separate catch blocks.
// - Test different inputs to trigger different exceptions.
//
// Goal:
// Combine throw with multiple catch blocks in one program.

public class MixedException {
    public static void main(String[] args) {

        String i = "2";
        int arr[] = {19, 34, 50, 23, 78, 45};

        try {
            int j = Integer.parseInt(i);

            if (j <= 0) {
                // Throw an exception if the number is zero or negative.
                throw new IllegalArgumentException("Enter a number above 0");
            }

            int k = 100 / j;
            System.out.println(k);

            System.out.println(arr[10]);

        } catch (NumberFormatException e) {
            // Handle strings that cannot be converted to integers.
            System.out.println("Cannot convert to integer: " + e.getMessage());

        } catch (ArithmeticException e) {
            // Handle arithmetic errors such as division by zero.
            System.out.println("Arithmetic error: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle an array index that does not exist.
            System.out.println("Invalid Array Index: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            // Handle the exception thrown for a non-positive number.
            System.out.println(e.getMessage());
        }
    }
}


/*
o/p- when input of String is "abc"
Cannot convert to integer: For input string: "abc"

o/p- when input of String is "0"
Invalid number: Enter a number above 0

o/p- when input of array index is 10 and String is "2"
50
Invalid Array Index: Index 10 out of bounds for length 6

*/