// Q4 — Multiple Operations
// ============================================================
//
// Create a functional interface:
//
// interface Operation {
//     int calculate(int a, int b);
// }
//
// Use separate lambda expressions to perform:
//
// 1. Addition
// 2. Subtraction
// 3. Multiplication
//
// Example:
//
// Operation add = (a, b) -> a + b;
//
// Goal:
// Practice multiple lambda expressions using one functional interface.

@FunctionalInterface
interface Operation {

    int calculate(int a, int b);
}

public class MultipleOperations {

    public static void main(String[] args) {

        // Same functional interface, different lambda implementations.
        Operation add = (a, b) -> a + b;
        Operation minus = (a, b) -> a - b;
        Operation multi = (a, b) -> a * b;

        // Calling the calculate() method for each operation.
        System.out.println("Addition: " + add.calculate(10, 10));
        System.out.println("Subtraction: " + minus.calculate(10, 5));
        System.out.println("Multiplication: " + multi.calculate(2, 4));
    }
}

// Output:
// Addition: 20
// Subtraction: 5
// Multiplication: 8

/*
 * Important:
 *
 * Operation is one Functional Interface.
 *
 * We create three different implementations using lambdas:
 *
 * add   -> addition
 * minus -> subtraction
 * multi ->  multiplication
 *
 * Same method:
 * calculate(int a, int b)
 *
 * But each lambda provides different logic.
 */