// Q4 — Multiple Anonymous Objects
//
// Create an Animal class.
// - Add a sound() method.
//
// Create 2 different Anonymous Inner Class objects.
//
// First object:
// - Override sound().
// - Print "Dog barks".
//
// Second object:
// - Override sound().
// - Print "Cat meows".
//
// Goal:
// Understand how different Anonymous Inner Class objects
// can provide different implementations of the same method.

class Animal {

    // Normal method of Animal
    void sound() {
        System.out.println("Animal makes sound");
    }
}

public class MultipleAnonymousObjects {

    public static void main(String[] args) {

        // First Anonymous Inner Class object
        // Overrides sound() for Dog behavior
        Animal a1 = new Animal() {

            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        };

        // Second Anonymous Inner Class object
        // Overrides sound() for Cat behavior
        Animal a2 = new Animal() {

            @Override
            void sound() {
                System.out.println("Cat meows");
            }
        };

        // Calls the first object's overridden method
        a1.sound();

        // Calls the second object's overridden method
        a2.sound();
    }
}

// Output:
// Dog barks
// Cat meows

// Explanation:
// We created two different Anonymous Inner Class objects from the same Animal class.
// a1 -> provides Dog's implementation of sound()
// a2 -> provides Cat's implementation of sound()
// Both have the same reference type: Animal, but their actual implementations are different.

// Important:
// Anonymous Inner Class allows us to create an object
// and override a method without creating a separate named class. 
// Here, we did not create Dog or Cat classes.