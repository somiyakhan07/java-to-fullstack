/*
 * Q4 — Interface Reference
 *
 * Create an Animal interface with sound().
 * Create Dog that implements Animal.
 *
 * In main():
 * - Create an Animal reference.
 * - Store a Dog object in it.
 * - Call sound().
 *
 * Goal:
 * Understand interface reference + implementing class object.
 */

interface Animal {

    // Interface method
    void sound();
}

class Dog implements Animal {

    // Implement the interface method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceReference {

    public static void main(String[] args) {

        // Animal is the reference type
        // Dog is the actual object
        Animal a = new Dog();

        // Calls Dog's implemented sound() method
        a.sound();
    }
}

// Output:
// Dog barks

/*
 * Explanation:
 * Animal a → interface reference.
 * new Dog() → Dog object.
 *
 * The Animal reference can refer to an object of
 * a class that implements Animal.
 *
 * So a.sound() calls Dog's implementation of sound().
 */