// Q3 — @FunctionalInterface
// ============================================================
//
// Create a functional interface Greeting with one abstract method:
// void greet();
//
// Implement it using a lambda expression and print:
// Hello Java
//
// Then temporarily add a second abstract method
// and observe the compiler error.
//
// Goal:
// Understand the @FunctionalInterface annotation.

@FunctionalInterface
interface Greeting {

    void greet();

    // void hello();
    // If we add another abstract method,
    // Greeting will no longer be a functional interface.
    // @FunctionalInterface will show a compiler error.
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        // Lambda provides the implementation of greet().
        Greeting g1 = () -> System.out.println("Hello Java");

        g1.greet();
    }
}

// Output:
// Hello Java

/*
 * Important:
 *
 * @FunctionalInterface
 * → ensures that the interface has exactly ONE abstract method.
 *
 * If we add another abstract method:
 *
 * void hello();
 *
 * The compiler gives an error because the interface
 * now has two abstract methods.
 *
 * A functional interface can still have:
 * - default methods
 * - static methods
 *
 * Lambda expressions are used to implement the
 * single abstract method of a functional interface.
 */