// Q2 — Functional Interface
// ============================================================
//
// Create a functional interface Calculator with:
// int calculate(int a, int b);
//
// Use a lambda expression to perform addition.
//
// Expected output:
// 30
//
// Goal:
// Understand functional interfaces and lambda expressions.

@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        // Calculator is the type of c1.
        // Lambda provides the implementation of calculate().
        Calculator c1 = (a, b) -> a + b;

        int result = c1.calculate(15, 15);

        System.out.println(result);
    }
}

// Output:
// 30

/*
 * Important:
 *
 * Functional Interface:
 * An interface that has exactly ONE abstract method.
 *
 * It can also have:
 * - default methods
 * - static methods
 *
 * @FunctionalInterface
 * tells the compiler that the interface must have exactly one abstract method.
 *
 * Lambda:
 * Calculator c1 = (a, b) -> a + b;
 *
 * Here:
 * Calculator → interface type
 * c1         → reference variable
 * (a, b) -> a + b → implementation of calculate()
 *
 * Important:
 * Lambda expression is NOT an anonymous inner class.
 * It provides a shorter way to implement a functional interface.
 */