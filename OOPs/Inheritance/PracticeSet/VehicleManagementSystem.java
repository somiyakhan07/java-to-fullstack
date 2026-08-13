// Design a Vehicle Management System.
// An Electric Car is a type of Car, and every Car is a Vehicle.
// Organize the classes using multilevel inheritance and demonstrate
// that the last child class can use features from all levels.

import java.util.Scanner;

// Parent class
class Vehicle {
    private boolean start;
    private boolean engine;

    // Parameterized constructor
    public Vehicle(boolean start, boolean engine) {
        this.start = start;
        this.engine = engine;
    }

    // Get starting status
    public boolean isStarting() {
        return start;
    }

    // Set starting status
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
}

// Child class of Vehicle
class Car extends Vehicle {
    private String carName;
    private boolean fourWheels;
    private int seaters;

    // Parameterized constructor
    public Car(boolean start, boolean engine, String carName, boolean fourWheels, int seaters) {
        super(start, engine);
        this.carName = carName;
        this.fourWheels = fourWheels;
        this.seaters = seaters;
    }

    // Get car name
    public String getCarName() {
        return carName;
    }

    // Set car name
    public void setCarName(String carName) {
        this.carName = carName;
    }

    // Get four wheels status
    public boolean isFourWheels() {
        return fourWheels;
    }

    // Set four wheels status
    public void setFourWheels(boolean fourWheels) {
        this.fourWheels = fourWheels;
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

// Child class of Car
class ElectricCar extends Car {
    private boolean automateCar;
    private boolean driverLess;

    // Parameterized constructor
    public ElectricCar(boolean start, boolean engine, String carName, boolean fourWheels, int seaters,
            boolean automateCar, boolean driverless) {

        super(start, engine, carName, fourWheels, seaters);
        this.automateCar = automateCar;
        this.driverLess = driverless;
    }

    // Get automated car status
    public boolean isAutomateCar() {
        return automateCar;
    }

    // Set automated car status
    public void setAutomateCar(boolean automateCar) {
        this.automateCar = automateCar;
    }

    // Get driverless status
    public boolean isDriverLess() {
        return driverLess;
    }

    // Set driverless status
    public void setDriverLess(boolean driverLess) {
        this.driverLess = driverLess;
    }
}

// Main class
public class VehicleManagementSystem {

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take car name from user
        System.out.print("Enter car name: ");
        String carName = sc.nextLine();

        // Take vehicle information
        System.out.print("Enter true to start and false to stop: ");
        boolean start = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Does it have engine. Enter only true or false: ");
        boolean engine = sc.nextBoolean();
        sc.nextLine();

        // Take car information
        System.out.print("Does it have four wheels. Enter only true or false: ");
        boolean fourWheels = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Enter number of seats: ");
        int seaters = sc.nextInt();
        sc.nextLine();

        // Take electric car information
        System.out.print("Is it an automated car? Enter only true or false: ");
        boolean automateCar = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Is it a driverless car? Enter only true or false: ");
        boolean driverLess = sc.nextBoolean();
        sc.nextLine();

        // Create ElectricCar object
        ElectricCar ec1 = new ElectricCar(
                start, engine, carName, fourWheels, seaters, automateCar, driverLess
        );

        // Display all vehicle details
        System.out.println();
        System.out.println("---- Vehicle Details ----");

        System.out.println("Car Name: " + ec1.getCarName());
        System.out.println("Car starting: " + ec1.isStarting());
        System.out.println("Vehicle has engine: " + ec1.hasEngine());
        System.out.println("Vehicle has four wheels: " + ec1.isFourWheels());
        System.out.println("Number of seats: " + ec1.getSeaters());
        System.out.println("It is an automated car: " + ec1.isAutomateCar());
        System.out.println("It is a driverless car: " + ec1.isDriverLess());

        sc.close();
    }
}

/*output:
Enter car name: Tesla
Enter true to start and false to stop: true 
Does it have engine. Enter only true or false: true
Does it have four wheels. Enter only true or false: true
Enter number of seats: 4
Is it an automated car? Enter only true or false: true
Is it a driverless car? Enter only true or false: true

---- Vehicle Details ----
Car Name: Tesla
Car starting: true
Vehicle has engine: true
Vehicle has four wheels: true
Number of seats: 4
It is an automated car: true
It is a driverless car: true
 */