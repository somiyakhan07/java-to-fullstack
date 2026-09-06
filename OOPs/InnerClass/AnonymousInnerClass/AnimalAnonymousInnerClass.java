// Q1 — Animal
// Create the following class:
//
// class Animal {
//     void sound() {
//         System.out.println("Animal makes sound");
//     }
// }
//
// In main(), use an Anonymous Inner Class
// to override the sound() method.
// Output should be: Dog barks
// Condition: Do not create a separate Dog class.

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

public class AnimalAnonymousInnerClass {
    public static void main(String[] args) {
        Animal a = new Animal() {
            void sound() {
                System.out.println("Dog Barks");
            }
        };

        a.sound();
    }

}
// Dog Barks