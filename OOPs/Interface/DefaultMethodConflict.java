// Q10 — Default Method Conflict
// ============================================================
//
// Create two interfaces:
//
// Interface A:
// - Add a default method show()
// - Print "A show"
//
// Interface B:
// - Add a default method show()
// - Print "B show"
//
// Create a class Demo that implements both A and B.
//
// Task:
// - Try to compile the class without overriding show().
// - Observe the error.
// - Then override show() inside Demo.
// - Print "Demo show".
//
// In main():
// - Create a Demo object.
// - Call show().
//
// Goal:
// Understand the default method conflict when
// two interfaces have the same default method.

interface A {

    // Default method of interface A
    default void show() {
        System.out.println("A show");
    }
}

interface B {

    // Default method of interface B
    default void show() {
        System.out.println("B show");
    }
}

class Demo implements A, B {

    // Override show() to resolve the conflict
    @Override
    public void show() {
        System.out.println("Demo show");
    }
}

public class DefaultMethodConflict {

    public static void main(String[] args) {

        // Create Demo object
        Demo d = new Demo();

        // Calls Demo's show() method
        d.show();
    }
}

// Output:
// Demo show

/*
 * Explanation:
 * Both A and B have the same default show() method.
 *
 * Demo implements both interfaces, so Java gets confused
 * about which show() method should be used.
 *
 * Therefore, Demo must override show() to resolve the conflict.
 */