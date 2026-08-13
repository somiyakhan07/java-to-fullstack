// Design an Animal Information System.
// Different animals share some common characteristics, but each animal also has its own unique behavior. 
// Create a program where Hierarchical multiple child classes inherit from a single parent class and display their individual information.
// Parent class
class Animal {

    private String voice; // common variable for all animals
    private boolean domestic; // common variable for all animals

    // Parameterized constructor of Animal class
    Animal(String voice, boolean domestic) {
        this.voice = voice; // set voice
        this.domestic = domestic; // set domestic status
    }

    // Getter method to fetch animal voice
    public String getVoice() {
        return voice;
    }

    // Getter method to check whether animal is domestic or not
    public boolean isDomestic() {
        return domestic;
    }
}

// Dog is a child class of Animal
class Dog extends Animal {

    private boolean hasStrongSmellSense; // Dog-specific variable

    // Parameterized constructor of Dog class
    public Dog(String voice, boolean domestic, boolean hasStrongSmellSense) {

        super(voice, domestic); // call parent class constructor
        this.hasStrongSmellSense = hasStrongSmellSense; // set Dog-specific value
    }

    // Getter method to check Dog's smell sense
    public boolean isHasStrongSmellSense() {
        return hasStrongSmellSense;
    }

    // Setter method to change Dog's smell sense
    public void setHasStrongSmellSense(boolean hasStrongSmellSense) {
        this.hasStrongSmellSense = hasStrongSmellSense;
    }
}

// Cat is another child class of Animal
class Cat extends Animal {

    private boolean fastReflex; // Cat-specific variable

    // Parameterized constructor of Cat class
    public Cat(String voice, boolean domestic, boolean fastReflex) {

        super(voice, domestic); // call parent class constructor
        this.fastReflex = fastReflex; // set Cat-specific value
    }

    // Getter method to check Cat's reflex
    public boolean isFastReflex() {
        return fastReflex;
    }

    // Setter method to change Cat's reflex
    public void setFastReflex(boolean fastReflex) {
        this.fastReflex = fastReflex;
    }
}

// Main class
public class AnimalInformationSystem2 {

    // Main method
    public static void main(String[] args) {

        // Create Dog object and set Dog information
        Dog d1 = new Dog("Barks", true, true);

        System.out.println("----Dog Information----");

        // Dog can access common methods inherited from Animal
        System.out.println("Dog Voice: " + d1.getVoice());
        System.out.println("Dog is domestic animal: " + d1.isDomestic());

        // Dog accesses its own method
        System.out.println("Dog has strong smell sense: " + d1.isHasStrongSmellSense());


        // Create Cat object and set Cat information
        Cat c1 = new Cat("Meow", true, true);

        System.out.println();

        System.out.println("----Cat Information----");

        // Cat can access common methods inherited from Animal
        System.out.println("Cat Voice: " + c1.getVoice());
        System.out.println("Cat is domestic animal: " + c1.isDomestic());

        // Cat accesses its own method
        System.out.println("Cat has fast reflex: " + c1.isFastReflex());
    }
}

/*
Output:

----Dog Information----
Dog Voice: Barks
Dog is domestic animal: true
Dog has strong smell sense: true

----Cat Information----
Cat Voice: Meow
Cat is domestic animal: true
Cat has fast reflex: true

*/