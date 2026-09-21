// Q1 — No Parameter
// ============================================================
//
// Create a functional interface Greeting with:
//
// void sayHello();
//
// Use a lambda expression to print:
//
// Hello Java
//
// Goal:
// Understand lambda expression with no parameter.

@FunctionalInterface
interface Greeting {

    void sayHello();
}

public class NoParameter {

    public static void main(String[] args) {

        // Greeting is the interface type.
        // g1 is the reference variable.
        // Lambda provides the implementation of sayHello().
        Greeting g1 = () -> System.out.println("Hello Java");

        g1.sayHello();
    }
}

// Output:
// Hello Java

/*
 * Important:
 *
 * Greeting → Functional Interface
 * sayHello() → Single Abstract Method
 * g1 → Reference variable of Greeting type
 *
 * Lambda:
 *
 * () -> System.out.println("Hello Java")
 *
 * () - No parameters
 * -> - Lambda operator
 * System.out.println(...) -> Method implementation
 *
 * Lambda provides the implementation of the functional interface's single abstract method.
 */