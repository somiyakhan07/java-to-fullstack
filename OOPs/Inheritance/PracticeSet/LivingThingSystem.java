// Design a Living Things System.
// A Dog is an Animal, and every Animal is a Living Thing. 
// Create a program where the final child class can access features inherited from both the parent and grandparent classes.

import java.util.Scanner;

class LivingThing {
    private boolean alive;

    public LivingThing(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}

class Animals extends LivingThing {
    private boolean eats;
    private String voice;

    public Animals(boolean alive, boolean eats, String voice) {
        super(alive);
        this.eats = eats;
        this.voice = voice;
    }

    public boolean itEats() {
        return eats;
    }

    public void setEats(boolean eats) {
        this.eats = eats;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}

class Dogs extends Animals {
    private String name;
    private boolean legs;
    private boolean strongSmellSense;

    public Dogs(boolean alive, boolean eats, String voice, String name, boolean legs, boolean strongSmellSense) {
        super(alive, eats, voice);
        this.name = name;
        this.legs = legs;
        this.strongSmellSense = strongSmellSense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasLegs() {
        return legs;
    }

    public void setLegs(boolean legs) {
        this.legs = legs;
    }

    public boolean haveStrongSmellSense() {
        return strongSmellSense;
    }

    public void setStrongSmellSense(boolean strongSmellSense) {
        this.strongSmellSense = strongSmellSense;
    }

}

public class LivingThingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("It is alive?. only enter true or false: ");
        boolean alive = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Does it eats?. only enter true or false: ");
        boolean eats = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Enter voice of animal: ");
        String voice = sc.nextLine();

        System.out.print("Enter animal name: ");
        String name = sc.nextLine();

        System.out.print("Does it have legs?. only enter true or false: ");
        boolean legs = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Does it have strong sense of smell?. only enter true or false: ");
        boolean strongSmellSense = sc.nextBoolean();
        sc.nextLine();

        Dogs d1 = new Dogs(alive, eats, voice, name, legs, strongSmellSense);

        System.out.println();
        System.out.println("----Animal Details----");
        System.out.println("It is alive: " + d1.isAlive());
        System.out.println("It eats: " + d1.itEats());
        System.out.println("Animal Voice: " + d1.getVoice());
        System.out.println("Animal name is: " + d1.getName());
        System.out.println("It have legs: " + d1.hasLegs());
        System.out.println("It has strong sense of smell: " + d1.haveStrongSmellSense());

        sc.close();
    }

}

/*output:
It is alive?. only enter true or false: true
Does it eats?. only enter true or false: true
Enter voice of animal: Barks
Enter animal name: Dog
Does it have legs?. only enter true or false: true
Does it have strong sense of smell?. only enter true or false: true

----Animal Details----
It is alive: true
It eats: true
Animal Voice: Barks
Animal name is: Dog
It have legs: true
It has strong sense of smell: true 
*/