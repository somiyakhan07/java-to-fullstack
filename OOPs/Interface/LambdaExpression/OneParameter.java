// Q2 — One Parameter
// ============================================================
//
// Create a functional interface Message with:
//
// void show(String name);
//
// Use a lambda expression to print a message with the name.
//
// Example:
//
// Hello Aliya
//
// Goal:
// Understand lambda expression with one parameter.

@FunctionalInterface
interface Message {

    // Single abstract method with one parameter.
    void show(String name);
}

public class OneParameter {

    public static void main(String[] args) {

        // Message -> Functional Interface type
        // m1 -> Reference variable
        // (name) -> ... Lambda provides implementation of show()
        Message m1 = (name) -> System.out.println("Hello " + name);

        // Calls the implemented show() method.
        m1.show("Aliya");
    }
}

// Output:
// Hello Aliya

/*
 * Important:
 *
 * Message - Functional Interface
 * show() - Single Abstract Method
 * name - Parameter of show()
 *
 * Lambda Expression
 * (name) -> System.out.println("Hello " + name)
 *
 * (name) - One parameter
 * ->     - Lambda operator
 * Right side - Implementation of show()
 */