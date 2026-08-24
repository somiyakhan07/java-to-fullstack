// Create:
// Animal → eat()
// Dog → bark()
// In main():
// Create a Dog object.
// Store it in an Animal reference (upcasting).
// Call eat().
// Downcast the reference back to Dog.
// Call bark().
// Add comments showing where upcasting and downcasting happen.

class Animal {
    public void eat() {
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog Barks");
    }
}

public class AnimalDog {
    public static void main(String[] args) {

        // Upcasting: Dog reference is assigned to Animal reference
        Dog d1 = new Dog();
        Animal a = d1;

        // Calling inherited method using Animal reference
        a.eat();

        // Downcasting: Animal reference is converted back to Dog reference
        Dog d2 = (Dog) a;

        // Calling Dog-specific method
        d2.bark();

        // Calling inherited Animal method
        d2.eat();
    }
}

/*
Output:

Animal Eats
Dog Barks
Animal Eats
*/