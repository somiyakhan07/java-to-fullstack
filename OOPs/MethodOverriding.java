class Animal {

    // Parent class method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Child class same method ko override kar raha hai
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        // Dog class ka object create kiya
        Dog d1 = new Dog();

        // Dog ka overridden sound() method call hoga
        d1.sound();
    }
}

// Output:
// Dog Barks