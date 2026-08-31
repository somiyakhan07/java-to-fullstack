// Understand the Object Rule
// Create an abstract class Animal and try:
// Animal a = new Animal();
// Observe the error.
// Then create:
// Dog d = new Dog();
// where Dog extends Animal and implements all abstract methods.
// Covers: Why we cannot create an object of an abstract class
// and what a concrete class is.

abstract class Animal { // Abstract class
    abstract public void sound(); // Abstract method without body
}

class Dog extends Animal { // Concrete class

    @Override
    public void sound() { // Implementing abstract method
        System.out.println("Dog Barks");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        // Cannot create an object of an abstract class
        // Animal a = new Animal(); // ❌ Compile-time error

        Dog d1 = new Dog(); // ✅ Dog is a concrete class
        d1.sound();

    }
}

/*
// Why can't we create an object of an abstract class?

Because an abstract class can have abstract methods
which are only declared without a body and don't have
implementation to perform any specific function.

That's why Java doesn't allow us to create an object of
an abstract class directly.

But we can create a reference variable of the abstract class
and use it with the child class object with the help of inheritance.

Example:
Animal a = new Dog();

Here Animal is the reference type and Dog is the actual object.




Concrete Class:

The class which extends an abstract class using the extends keyword
and implements all the abstract methods of the abstract class
is called a concrete class.

Here, Dog is a concrete class because it implements the
abstract sound() method.

But in an abstract class, it is not compulsory to have
an abstract method. It can also have normal methods.
*/