// Q1 — @Override
// ============================================================
//
// Create a parent class Animal and a child class Dog.
// Override the sound() method in Dog using @Override.
//
// Goal:
// Understand @Override annotation.

class Animal { // Parent class

    public void sound() {
        System.out.println("Animal makes sounds");
    }
}

class Dog extends Animal { // Child class inherits from Animal

    @Override
    public void sound() { // Overrides the sound() method of Animal
        System.out.println("Dog barks");
    }
}

public class OverrideBasic {

    public static void main(String[] args) {

        // Animal reference pointing to a Dog object
        Animal a = new Dog();

        // Calls Dog's overridden sound() method
        a.sound();
    }
}

// Output:
// Dog barks

/*
 * Explanation:
 * 
 * @Override tells the compiler that sound() is overriding 
 * the sound() method of the parent class
 *
 * Animal a = new Dog();
 * → Reference type is Animal.
 * → Actual object is Dog.
 *
 * Because Dog overrides sound(), Dog's sound() method is called.
 *
 * Important:
 * @Override helps the compiler detect mistakes in method overriding.
 */