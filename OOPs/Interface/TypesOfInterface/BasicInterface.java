// Q1 — Normal Interface
// ============================================================
//
// Create a Vehicle interface with two methods:
// void start();
// void stop();
//
// Create a Car class that implements both methods.
// Create its object and test both methods.
//
// Goal:
// Understand a normal interface with multiple abstract methods.

interface Vehicle {

    void start();
    void stop();
}

class Car implements Vehicle {

    @Override
    public void start() {
        // Implements Vehicle's start() method.
        System.out.println("car starting...");
    }

    @Override
    public void stop() {
        // Implements Vehicle's stop() method.
        System.out.println("car stopped...");
    }
}

public class BasicInterface {

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.start();
        c1.stop();
    }
}

// Output:
// car starting...
// car stopped...

/*
 * Important:
 *
 * Vehicle -> normal interface
 * Car -> implements Vehicle
 *
 * A normal interface can have multiple abstract methods.
 */