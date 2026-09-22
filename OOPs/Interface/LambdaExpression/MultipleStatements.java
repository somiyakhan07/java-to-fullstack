// Q6 — Lambda with Multiple Statements
// ============================================================
//
// Create a functional interface Calculator with:
// int calculate(int a, int b);
//
// Use a lambda expression with multiple statements
// to calculate the sum and print a message before returning it.
//
// Goal:
// Understand lambda expressions with a block body.

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class MultipleStatements {
    public static void main(String[] args) {

        // Lambda with block body: multiple statements are allowed
        Calculator c1 = (a, b) -> {
            int result = a + b;
            System.out.println("Addition: ");

            // return is required because calculate() returns int
            return result;
        };

        int result = c1.calculate(10, 5);
        System.out.println(result);
    }
}

// Output:
// Addition:
// 15