// Animal Sound
// Create Animal with sound().
// Override it in Dog and Cat.
// Use parent reference + child object to call the methods. (Dynamic Method Dispatch)
// Same name method in different classes

class Animal {
    public void sound() { // Parent class method
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal { // Dog inherits Animal
    @Override
    public void sound() { // Override parent sound() method
        System.out.println("Dog Sound");
    }
}

class Cat extends Animal { // Cat inherits Animal
    @Override
    public void sound() { // Override parent sound() method
        System.out.println("Cat Sound");
    }
}

public class AnimalSound {
    public static void main(String[] args) {

        Animal a1 = new Animal(); // Parent reference + parent object
        a1.sound();

        System.out.println();

        a1 = new Dog(); // Parent reference + Dog object
        a1.sound(); // Dog's sound() runs at runtime

        System.out.println();

        a1 = new Cat(); // Parent reference + Cat object
        a1.sound(); // Cat's sound() runs at runtime
    }

}

/* output:
Animal Sound

Dog Sound

Cat Sound
*/