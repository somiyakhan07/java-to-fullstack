// Design a Home Appliance System.
// A Washing Machine is a type of Appliance.
// Create a parent class for common appliance details and extend it with washing machine features.
// Show how inheritance helps avoid duplicate code.

class Appliances { // parent, super, base class

    private boolean switchOn; // private variables
    private boolean working;

    public Appliances(boolean switchOn, boolean working) { // parameterized constructor
        this.switchOn = switchOn; // set switch status
        this.working = working; // set working status
    }

    public boolean isSwitchOn() { // fetch switch status
        return switchOn;
    }

    public void setSwitchOn(boolean switchOn) { // update switch status
        this.switchOn = switchOn;
    }

    public boolean isWorking() { // fetch working status
        return working;
    }

    public void setWorking(boolean working) { // update working status
        this.working = working;
    }
}

class WashingMachine extends Appliances { // child, sub, derived class

    private boolean startCleaning; // private variables
    private boolean startSteaming;

    public WashingMachine(boolean startCleaning, boolean startSteaming) { // parameterized constructor
        super(true, true); // calls the parent class constructor
        this.startCleaning = startCleaning; // set cleaning status
        this.startSteaming = startSteaming; // set steaming status
    }

    public boolean isCleaning() { // fetch cleaning status
        return startCleaning;
    }

    public void setCleaning(boolean startCleaning) { // update cleaning status
        this.startCleaning = startCleaning;
    }

    public boolean isSteaming() { // fetch steaming status
        return startSteaming;
    }

    public void setSteaming(boolean startSteaming) { // update steaming status
        this.startSteaming = startSteaming;
    }
}

public class HomeApplianceSystem { // main class

    public static void main(String[] args) { // main method

        // create WashingMachine object and set washing machine features
        WashingMachine w1 = new WashingMachine(true, true);

        System.out.println("Washing Machine Starting...");

        // display inherited appliance details
        System.out.println("Washing Machine appliance has switch On: " + w1.isSwitchOn());
        System.out.println("Washing Machine appliance has working: " + w1.isWorking());

        // display washing machine-specific details
        System.out.println("Washing Machine start cleaning clothes: " + w1.isCleaning());
        System.out.println("Washing Machine start steaming clothes: " + w1.isSteaming());

        System.out.println();

        System.out.println("Washing Machine Stopping...");

        // turn off the appliance
        w1.setSwitchOn(false);
        System.out.println("Washing Machine appliance has switch On: " + w1.isSwitchOn());

        // stop the machine from working
        w1.setWorking(false);
        System.out.println("Washing Machine appliance has working: " + w1.isWorking());

        // stop cleaning
        w1.setCleaning(false);
        System.out.println("Washing Machine start cleaning clothes: " + w1.isCleaning());

        // stop steaming
        w1.setSteaming(false);
        System.out.println("Washing Machine start steaming clothes: " + w1.isSteaming());
    }
}

/*Output:
Washing Machine starting...
Washing Machine appliance has switch On: true
Washing Machine appliance has working: true
Washing Machine start cleaning clothes: true
Washing Machine start steaming clothes: true

Washing Machine Stopping...
Washing Machine appliance has switch On: false
Washing Machine appliance has working: false
Washing Machine start cleaning clothes: false
Washing Machine start steaming clothes: false 
*/