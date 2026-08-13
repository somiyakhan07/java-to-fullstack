// Design a Transport Management System.
// Different vehicles have common properties but different functionalities.
// Create a parent class and multiple child classes to represent different types of vehicles.

// Parent class
class Vehicle {

    // Common properties of all vehicles
    private boolean start;
    private boolean engine;
    private int seaters;

    // Parameterized constructor
    public Vehicle(boolean start, boolean engine, int seaters) {
        this.start = start;
        this.engine = engine;
        this.seaters = seaters;
    }

    // Get vehicle starting status
    public boolean isStarting() {
        return start;
    }

    // Set vehicle starting status
    public void setStarting(boolean start) {
        this.start = start;
    }

    // Get engine status
    public boolean hasEngine() {
        return engine;
    }

    // Set engine status
    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    // Get number of seats
    public int getSeaters() {
        return seaters;
    }

    // Set number of seats
    public void setSeaters(int seaters) {
        this.seaters = seaters;
    }
}


// Car inherits common properties from Vehicle
class Car extends Vehicle {

    // Car-specific properties
    private String Carname;
    private boolean fourWheeler;
    private boolean hasDoors;

    // Parameterized constructor
    public Car(boolean start, boolean engine, int seaters,
            String carName, boolean fourWheeler, boolean hasDoors) {

        // Call parent class constructor
        super(start, engine, seaters);

        this.Carname = carName;
        this.fourWheeler = fourWheeler;
        this.hasDoors = hasDoors;
    }

    // Get four-wheeler status
    public boolean isFourWheeler() {
        return fourWheeler;
    }

    // Set four-wheeler status
    public void setFourWheeler(boolean fourWheeler) {
        this.fourWheeler = fourWheeler;
    }

    // Get car door status
    public boolean isHasDoors() {
        return hasDoors;
    }

    // Set car door status
    public void setHasDoors(boolean hasDoors) {
        this.hasDoors = hasDoors;
    }

    // Get car name
    public String getCarname() {
        return Carname;
    }

    // Set car name
    public void setCarname(String carname) {
        Carname = carname;
    }
}


// Bike inherits common properties from Vehicle
class Bike extends Vehicle {

    // Bike-specific properties
    private String bikeName;
    private boolean twoWheeler;
    private boolean handles;

    // Parameterized constructor
    public Bike(boolean start, boolean engine, int seaters,
            String bikeName, boolean twoWheeler, boolean handles) {

        // Call parent class constructor
        super(start, engine, seaters);

        this.bikeName = bikeName;
        this.twoWheeler = twoWheeler;
        this.handles = handles;
    }

    // Get bike name
    public String getBikeName() {
        return bikeName;
    }

    // Set bike name
    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    // Get two-wheeler status
    public boolean isTwoWheeler() {
        return twoWheeler;
    }

    // Set two-wheeler status
    public void setTwoWheeler(boolean twoWheeler) {
        this.twoWheeler = twoWheeler;
    }

    // Get handle status
    public boolean isHandles() {
        return handles;
    }

    // Set handle status
    public void setHandles(boolean handles) {
        this.handles = handles;
    }
}


// Main class
public class TransportManagementSystem {

    // Main method
    public static void main(String[] args) {

        // Create Car object
        Car c1 = new Car(
                true,
                true,
                4,
                "BMW",
                true,
                true);

        // Display Car details
        System.out.println("----Car Details----");
        System.out.println("Car name: " + c1.getCarname());
        System.out.println("Car starting...: " + c1.isStarting());
        System.out.println("Car has engine: " + c1.hasEngine());
        System.out.println("Car has number of seats: " + c1.getSeaters());
        System.out.println("Is Four Wheeler: " + c1.isFourWheeler());
        System.out.println("Car has doors: " + c1.isHasDoors());


        // Create Bike object
        Bike b1 = new Bike(
                true,
                true,
                2,
                "Honda",
                true,
                true);

        // Display Bike details
        System.out.println();
        System.out.println("----Bike Details----");
        System.out.println("Bike name: " + b1.getBikeName());
        System.out.println("Bike starting...: " + b1.isStarting());
        System.out.println("Bike has engine: " + b1.hasEngine());
        System.out.println("Bike has number of seats: " + b1.getSeaters());
        System.out.println("Is Two Wheeler: " + b1.isTwoWheeler());
        System.out.println("Bike has handles: " + b1.isHandles());
    }
}

/*
Output:

----Car Details----
Car name: BMW
Car starting...: true
Car has engine: true
Car has number of seats: 4
Is Four Wheeler: true
Car has doors: true

----Bike Details----
Bike name: Honda
Bike starting...: true
Bike has engine: true
Bike has number of seats: 2
Is Two Wheeler: true
Bike has handles: true
*/