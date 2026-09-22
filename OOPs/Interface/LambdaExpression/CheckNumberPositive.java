// Q8 — Lambda with Predicate-like Logic
// ============================================================
//
// Create a functional interface Check with:
// boolean test(int n);
//
// Use a lambda expression to check whether a number is positive.
//
// Goal:
// Practice boolean-returning lambda expressions.

@FunctionalInterface
interface Check {
    boolean test(int n);
}

public class CheckNumberPositive {
    public static void main(String[] args) {

        // Lambda returns true if the number is positive
        Check c1 = (n) -> n > 0;

        if (c1.test(57)) {
            System.out.println("Positive");
        } else {
            System.out.println("Not Positive");
        }
    }
}

// Output:
// Positive
//
// Explanation:
// Check is a functional interface because it has only one
// abstract method: boolean test(int n).
//
// (n) -> n > 0 is a boolean-returning lambda.
// It checks whether n is greater than 0.
//
// c1.test(57) checks 57 > 0, so it returns true
// and "Positive" is printed.