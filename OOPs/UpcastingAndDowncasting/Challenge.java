// Given:

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Challenge {
    public static void main(String[] args) {

        // Predict before running:
        Animal a = new Dog();
        Dog d = (Dog) a;
        d.bark(); // Dog barks

        // Then try:
        // Animal a = new Cat(); // ClassCastException
        // Dog d = (Dog) a;
        // d.bark();

    }
}

/*
 * Answer in comments:
 *
 * 1. Which one works?
 * Animal a = new Dog();
 * This works because a Dog object can be stored in an Animal reference.
 *
 * 2. Which one gives a runtime error?
 * Animal a = new Cat();
 * Dog d = (Dog) a;
 * This gives ClassCastException.
 *
 * 3. Why?
 * The actual object is Cat, but we are trying to cast it to Dog.
 * Cat and Dog are different child classes, so the cast is invalid.
 *
 * 4. What is the reference type in both cases?
 * In both cases, Animal is the reference type.
 *
 * 5. What is the actual object type in both cases?
 * First case: Dog is the actual object type.
 * Second case: Cat is the actual object type.
 */