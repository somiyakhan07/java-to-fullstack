// Design an Electronic Device System.
// An Android Phone is a Mobile, and every Mobile is a Device.
// Create a multilevel inheritance program that demonstrates the inheritance chain.

// Parent class
class Device {
    private boolean switchOn;
    private boolean working;

    // Parameterized constructor
    public Device(boolean switchOn, boolean working) {
        this.switchOn = switchOn;
        this.working = working;
    }

    // Get switch status
    public boolean isSwitchOn() {
        return switchOn;
    }

    // Set switch status
    public void setSwitchOn(boolean switchOn) {
        this.switchOn = switchOn;
    }

    // Get working status
    public boolean isWorking() {
        return working;
    }

    // Set working status
    public void setWorking(boolean working) {
        this.working = working;
    }
}

// Child class of Device
class Mobile extends Device {

    private boolean battery;
    private boolean chargingPin;
    private boolean hasButtons;

    // Parameterized constructor
    public Mobile(boolean switchOn, boolean working, boolean battery,
            boolean chargingPin, boolean hasButtons) {

        super(switchOn, working); // Call Device constructor
        this.battery = battery;
        this.chargingPin = chargingPin;
        this.hasButtons = hasButtons;
    }

    // Get battery status
    public boolean isBattery() {
        return battery;
    }

    // Set battery status
    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    // Get charging pin status
    public boolean isChargingPin() {
        return chargingPin;
    }

    // Set charging pin status
    public void setChargingPin(boolean chargingPin) {
        this.chargingPin = chargingPin;
    }

    // Get button status
    public boolean isHasButtons() {
        return hasButtons;
    }

    // Set button status
    public void setHasButtons(boolean hasButtons) {
        this.hasButtons = hasButtons;
    }
}

// Child class of Mobile
class Android extends Mobile {

    private String name;
    private boolean apps;
    private boolean google;
    private boolean function;
    private boolean camera;
    private boolean screentouch;

    // Parameterized constructor
    public Android(String name, boolean switchOn, boolean working,
            boolean battery, boolean chargingPin, boolean hasButtons,
            boolean apps, boolean google, boolean function,
            boolean camera, boolean screentouch) {

        super(switchOn, working, battery, chargingPin, hasButtons); // Call Mobile constructor

        this.name = name;
        this.apps = apps;
        this.google = google;
        this.function = function;
        this.camera = camera;
        this.screentouch = screentouch;
    }

    // Get Android name
    public String getName() {
        return name;
    }

    // Set Android name
    public void setName(String name) {
        this.name = name;
    }

    // Get apps status
    public boolean isApps() {
        return apps;
    }

    // Set apps status
    public void setApps(boolean apps) {
        this.apps = apps;
    }

    // Get Google status
    public boolean isGoogle() {
        return google;
    }

    // Set Google status
    public void setGoogle(boolean google) {
        this.google = google;
    }

    // Get function status
    public boolean isFunction() {
        return function;
    }

    // Set function status
    public void setFunction(boolean function) {
        this.function = function;
    }

    // Get camera status
    public boolean isCamera() {
        return camera;
    }

    // Set camera status
    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    // Get screen touch status
    public boolean isScreentouch() {
        return screentouch;
    }

    // Set screen touch status
    public void setScreentouch(boolean screentouch) {
        this.screentouch = screentouch;
    }
}

// Main class
public class ElectronicDeviceSystem {

    // Main method
    public static void main(String[] args) {

        // Create Android object
        Android a1 = new Android(
                "Vivo",
                true,
                true,
                true,
                true,
                true,
                true,
                true,
                true,
                true,
                true
        );

        System.out.println("---- Mobile Details ----");

        // Device class methods inherited by Android
        // Device → isSwitchOn(), isWorking()
        System.out.println("Mobile Starting: " + a1.isSwitchOn());
        System.out.println("Is Working: " + a1.isWorking());

        // Mobile class methods inherited by Android
        // Mobile → isBattery(), isChargingPin(), isHasButtons()
        System.out.println("Has Battery: " + a1.isBattery());
        System.out.println("Has Charging Pin: " + a1.isChargingPin());
        System.out.println("Has Buttons: " + a1.isHasButtons());

        // Android class own methods
        // Android → isApps(), isGoogle(), isFunction(), isCamera(), isScreentouch()
        System.out.println("Android Name: " + a1.getName());
        System.out.println("Has Apps: " + a1.isApps());
        System.out.println("Has Google: " + a1.isGoogle());
        System.out.println("Has Functions: " + a1.isFunction());
        System.out.println("Has Camera: " + a1.isCamera());
        System.out.println("It is screen touch: " + a1.isScreentouch());
    }
}

/*
Output:

---- Mobile Details ----
Mobile Starting: true
Is Working: true
Has Battery: true
Has Charging Pin: true
Has Buttons: true
Android Name: Vivo
Has Apps: true
Has Google: true
Has Functions: true
Has Camera: true
It is screen touch: true
*/