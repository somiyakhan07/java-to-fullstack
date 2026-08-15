// Design an Electronic Device Management System.
// Create a system that represents different types of electronic devices using the most appropriate inheritance relationship.
// Organize the classes to maximize code reuse.(Multi-level chainning inheritance)

class Device { // Parent class
    private boolean switchON; // Common property of all devices

    public Device(boolean switchON) { // Parent class constructor
        this.switchON = switchON; // Initialize switch status
    }

    public void setSwitchON(boolean switchON) { // Set switch status
        this.switchON = switchON;
    }

    public boolean isSwitchON() { // Get switch status
        return switchON;
    }

}

class Mobile extends Device { // Mobile inherits Device
    private boolean basicFunctions; // Mobile-specific property

    public Mobile(boolean switchON, boolean basicFunctions) { // Mobile constructor
        super(switchON); // Call Device constructor
        this.basicFunctions = basicFunctions; // Initialize basic functions
    }

    public boolean isBasicFunctions() { // Get basic functions status
        return basicFunctions;
    }

    public void setBasicFunctions(boolean basicFunctions) { // Set basic functions status
        this.basicFunctions = basicFunctions;
    }

}

class Android extends Mobile { // Android inherits Mobile
    private String androidVersion; // Android-specific property

    public Android(boolean switchON, boolean basicFunctions, String androidVersion) { // Android constructor
        super(switchON, basicFunctions); // Call Mobile constructor
        this.androidVersion = androidVersion; // Initialize Android version
    }

    public String getAndroidVersion() { // Get Android version
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) { // Set Android version
        this.androidVersion = androidVersion;
    }

}

public class ElectronicsDeviceManagementSystem { // Main class

    public static void main(String[] args) { // Main method

        Mobile m1 = new Mobile(true, true); // Create Mobile object

        System.out.println("----Mobile Details----"); // Display Mobile details
        System.out.println("Switch On Device: " + m1.isSwitchON()); // Access Device feature
        System.out.println("Mobile has basic funtions: " + m1.isBasicFunctions()); // Access Mobile feature

        Android a1 = new Android( // Create Android object
                true,
                true,
                "ANDROID VERSION 16");

        System.out.println(); // Print blank line
        System.out.println("----Android Details----"); // Display Android details

        System.out.println("Switch On Device: " + a1.isSwitchON()); // Android uses Device method
        System.out.println("Android has basic funtions: " + a1.isBasicFunctions()); // Android uses Mobile method
        System.out.println("Android Version: " + a1.getAndroidVersion()); // Access Android-specific feature
    }
}

/*output:
----Mobile Details----
Switch On Device: true
Mobile has basic funtions: true

----Android Details----
Switch On Device: true
Android has basic funtions: true
Android Version: ANDROID VERSION 16
*/