// Q5 — Challenge — Check Even/Odd
// ============================================================
//
// Create a functional interface:
//
// interface CheckNumber {
//     boolean check(int n);
// }
//
// Use a lambda expression to check whether a number
// is even or odd.
//
// Example:
//
// Input: 10
// Output: Even
//
// Goal:
// Practice lambda expression with a boolean return value.

@FunctionalInterface
interface CheckNumber {

    boolean check(int n);
}

public class CheckOddOrEven {

    public static void main(String[] args) {

        // Lambda provides the implementation of check().
        CheckNumber n1 = (n) -> n % 2 == 0;

        int number = 10;

        if (n1.check(number)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

// Output:
// Even

/*
 * Important:
 * CheckNumber - Functional Interface
 * check()     - Single Abstract Method
 *
 * Lambda:
 * (n) -> n % 2 == 0
 *
 * If n % 2 == 0 -> true -> Even
 * else     -> false -> Odd
*/