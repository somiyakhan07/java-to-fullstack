// Q10 — Lambda Challenge
// ============================================================
//
// Create a functional interface Operation with:
// int calculate(int a, int b);
//
// Create lambda expressions for:
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
//
// Store the operations and test them with different values.
//
// Goal:
// Apply lambda expressions in a practical situation.

@FunctionalInterface
interface Operation {
    int calculate(int a, int b);
}

public class LambdaChallenge {
    public static void main(String[] args) {

        // Each lambda provides a different implementation
        Operation add = (a, b) -> a + b;
        Operation subtract = (a, b) -> a - b;
        Operation multiply = (a, b) -> a * b;
        Operation divide = (a, b) -> a / b;

        int addition = add.calculate(10, 7);
        int subtraction = subtract.calculate(2, 1);
        int multiplication = multiply.calculate(2, 4);
        int division = divide.calculate(8, 2);

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }
}

// Output:
// 17
// 1
// 8
// 4