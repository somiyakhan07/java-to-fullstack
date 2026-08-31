// Create an abstract class Vehicle.
// Add an abstract method start().
// Add a normal method stop() with a body.
// Create Car class.
// Implement start() in Car.
// Call both start() and stop().
// Covers: Abstract + normal methods

abstract class Vehicle {
    abstract public void start(); // No body -> abstract

    public void stop() {
        System.out.println("Stopping..."); // Body present -> normal
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car Starting...");
    }

}

public class VehicleAbstract {
    public static void main(String[] args) {

        // Cant create object of type abstract class
        // Vehicle v1 = new Vehicle();

        Vehicle v2 = new Car();
        v2.start();
        v2.stop();
        System.out.println();

        Car c1 = new Car();
        c1.start();
        c1.stop();

    }

}

/* output:
Car Starting...
Stopping...

Car Starting...
Stopping...
 */