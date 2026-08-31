// Create an abstract class Animal.
// Add an abstract method sound().
// Create Dog class.
// Implement sound() in Dog.
// Create a Dog object and call sound().
// Covers: Abstract class + Abstract method

abstract class Animal {

    abstract public void sound(); // Abstract method

}

class Dog extends Animal {

    @Override
    public void sound() { // Implementing abstract method
        System.out.println("Dog Barks");
    }

}

public class AnimalAbstract {

    public static void main(String[] args) {

        Dog d1 = new Dog(); // Create Dog object
        d1.sound(); // Call implemented sound() method

    }

}

// Output:
// Dog Barks