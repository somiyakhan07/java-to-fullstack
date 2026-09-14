/*
 * Q2 — Multiple Interfaces
 *
 * Create two interfaces:
 *
 * interface A {
 *     void show();
 * }
 *
 * interface B {
 *     void display();
 * }
 *
 * Create a class Demo that implements both A and B.
 *
 * Implement both methods and call them from main().
 *
 * Goal:
 * Practice multiple inheritance using interfaces.
 */

interface A {

    // Method declared in interface A
    void show();
}

interface B {

    // Method declared in interface B
    void display();
}

class Demo implements A, B {

    // Implement show() from interface A
    @Override
    public void show() {
        System.out.println("in show method");
    }

    // Implement display() from interface B
    @Override
    public void display() {
        System.out.println("in display method");
    }
}

public class MultipleInterface {

    public static void main(String[] args) {

        // Create Demo object
        Demo d = new Demo();

        // Call method from interface A
        d.show();

        // Call method from interface B
        d.display();
    }
}

/*
 * in show method
 * in display method
 * 
 * Explanation:
 * Demo implements both A and B, so it must implement the methods of both
 * interfaces.
 *
 * Java does not support multiple inheritance with classes,
 * but a class can implement multiple interfaces.
 *
 * Important:
 * implements A, B → Demo implements both interfaces.
 */