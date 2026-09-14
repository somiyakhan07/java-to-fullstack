// Q8 — Static Method in Interface
//
// Create an interface Calculator with:
// - A static method add()
// - Print "Addition performed"
//
// Create a class MathCalculator that implements Calculator.
//
// In main():
// - Call the static add() method using the interface name.
//
// Goal:
// Understand static methods in interfaces
// and how they are accessed.

interface Calculator {

    // Static method of the interface
    static void add() {
        System.out.println("Addition performed");
    }
}

class MathCalculator implements Calculator {

}

public class StaticMethodInterference {

    public static void main(String[] args) {

        // Call the static interface method
        // using the interface name
        Calculator.add();
    }
}

// Output:
// Addition performed

/*
 * Explanation:
 * Static methods in an interface belong to the interface itself.
 *
 * So, we call them using:
 * Calculator.add();
 *
 * We do not call an interface static method using an object or reference.
 *
 * Important:
 * Interface static methods are not inherited by implementing classes.
 */