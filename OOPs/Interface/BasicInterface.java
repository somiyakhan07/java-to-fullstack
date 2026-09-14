// Q1 — Basic Interface
//
// Create an interface Animal with:
// - A sound() method.
//
// Create a class Dog that implements Animal.
// - Implement sound() inside Dog.
// - Print "Dog barks".

interface Animal {

    // Interface method
    // It must be implemented by the class
    void sound();
}

class Dog implements Animal {

    // Implement the interface method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class BasicInterface {

    public static void main(String[] args) {

        // Create Dog object
        Dog d = new Dog();

        // Call the implemented sound() method
        d.sound();
    }
}

// Output:
// Dog barks

// Explanation:
// Animal is an interface, and Dog implements that interface.
// The sound() method is declared in Animal and implemented inside Dog.

// Important:
// A class uses the 'implements' keyword to implement an interface method.
// The implemented interface method must be public.