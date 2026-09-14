// Q9 — Interface Inheritance
// ============================================================
//
// Create an interface Animal with:
// - void eat();
//
// Create another interface Dog that extends Animal.
// - Add void bark();
//
// Create a class Puppy that implements Dog.
//
// Implement both eat() and bark().
//
// In main():
// - Create a Puppy object.
// - Call eat().
// - Call bark().
//
// Goal:
// Understand how one interface can extend another interface
// and how the implementing class must implement all methods.

interface Animal {

    // Method of Animal interface
    void eat();
}

interface Dog extends Animal {

    // Method of Dog interface
    void bark();
}

class Puppy implements Dog {

    // Implement eat() inherited from Animal
    @Override
    public void eat() {
        System.out.println("Animal eats");
    }

    // Implement bark() from Dog
    @Override
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class InterfaceInheritance {

    public static void main(String[] args) {

        // Create Puppy object
        Puppy p = new Puppy();

        // Call Animal method
        p.eat();

        // Call Dog method
        p.bark();
    }
}

// Output:
// Animal eats
// Dog barks

/*
 * Explanation:
 * Dog extends Animal, so Dog gets the eat() method.
 *
 * Puppy implements Dog, so Puppy must implement
 * both eat() and bark().
 *
 * Interface can extend another interface using
 * the 'extends' keyword.
 */