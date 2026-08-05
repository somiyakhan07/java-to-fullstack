// Design an Animal Information System.
// A Lion is a type of Animal. 
// Store the common characteristics of an animal in the parent class and include lion-specific information in the child class. 
// Demonstrate how the child class can access the inherited members.

class Animal { // create animal class (Parent class)
    private String voice; // private variables
    private boolean domestic;

    Animal(String voice, boolean domestic) { // parameterized constructor of animal class
        this.voice = voice; // used this keyword to put user value in or set private variable
        this.domestic = domestic;
    }

    public String getVoice() { // fetch info of animal voice
        return voice;
    }

    public boolean isDomestic() { // fetch whether the animal is domestic or not
        return domestic;
    }
}

class Lion extends Animal { // create lion class (child class)
    private boolean fur; // private variables
    private boolean carnivorous;

    Lion(boolean fur, boolean carnivorous) { // parameterized  constructor of lion class
        super("Roar", false); // calls the animal(Parent) class constructor
        this.fur = fur; // used this keyword to put user value in or set private variable
        this.carnivorous = carnivorous;
    }

    public boolean hasFur() { // fetch information about lion's fur
        return fur;
    }

    public boolean isCarnivorous() { // fetch info about carnivorous
        return carnivorous;
    }

}

public class AnimalInformationSystem { // main class 
    public static void main(String[] args) { // main method
        Lion l1 = new Lion(true, true); //set lion info through constructor
        System.out.println("Lion Voice: " + l1.getVoice()); // display voice info
        System.out.println("Lion is domestic animal: " + l1.isDomestic()); // display whether the lion is domestic
        System.out.println("Lion has fur: " + l1.hasFur());  // display about fur info
        System.out.println("Lion is carnivorous: " + l1.isCarnivorous()); // display carnivorous info
    }

}
/*output:
Lion Voice: Roar
Lion is domestic animal: false
Lion has fur: true
Lion is carnivorous: true
 */