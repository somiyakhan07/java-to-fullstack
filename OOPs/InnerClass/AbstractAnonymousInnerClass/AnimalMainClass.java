// Q1 — Animal
// Create an abstract class Animal:
//
// abstract class Animal {
//     abstract void sound();
// }
//
// Use an Anonymous Inner Class to implement the sound() method.
// Output should be: Cat meows
// Condition: Do not create a separate Cat class.

abstract class Animal {

    abstract void sound(); // Abstract method
}

public class AnimalMainClass {

    public static void main(String[] args) {

        // Create an Anonymous Inner Class object
        // No separate Cat class is created
        Animal a = new Animal() {

            @Override
            void sound() {
                System.out.println("Cat meows");
            }
        };

        // Calls the implemented sound() method
        a.sound();
    }
}

// Output:
// Cat meows

// Explanation:
// Animal is abstract, so we cannot create its direct object.
// The Anonymous Inner Class extends Animal and implements sound().
// 'a' is an Animal reference pointing to that anonymous class object.
// So, a.sound() calls the implemented method and prints "Cat meows".

// Important:
// new Animal() does NOT create an object of the abstract Animal class.
// It creates an object of the Anonymous Inner Class that extends Animal.
// Animal 'a' is only the reference type.