// Q7 — Default Method
//
// Create an interface Animal with:
// - A default method sound()
// - Print "Animal makes sound"
//
// Create a class Dog that implements Animal.
//
// In main():
// - Create a Dog object.
// - Call sound().
//
// Then override sound() inside Dog and print:
// "Dog barks"
//
// Goal:
// Understand default methods in interfaces
// and how they can be overridden.

interface Animal {

    // Default method has a body
    // A class can use it directly or override it
    default void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog implements Animal {

    // Override the default method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class DefaultMethod {

    public static void main(String[] args) {

        // Create Dog object using Animal reference
        Animal a = new Dog();

        // Calls Dog's overridden sound() method
        a.sound();
    }
}

// Output:
// Dog barks

/*
 * Explanation:
 * A default method in an interface has a method body.
 *
 * The implementing class does not have to override it.
 * If the class overrides it, the class's implementation is used.
 *
 * Here, Animal provides the default sound(),
 * but Dog overrides it and prints "Dog barks".
 */