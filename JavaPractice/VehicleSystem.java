// Q4 — Vehicle System
// ============================================================
//
// Create:
//
// Vehicle
//    ↑
// Car
// Bike
//
// Use:
// - Inheritance
// - Method Overriding
// - Upcasting
// - Dynamic Method Dispatch
//
// Create:
// Vehicle v = new Car();
//
// Call the overridden method.

class Vehicle {

    // Parent class method
    void show() {
        System.out.println("in Vehicle show");
    }
}

class Car extends Vehicle {

    // Car overrides the parent show() method
    @Override
    void show() {
        System.out.println("in Car show");
    }
}

class Bike extends Vehicle {

    // Bike overrides the parent show() method
    @Override
    void show() {
        System.out.println("in Bike show");
    }
}

public class VehicleSystem {

    public static void main(String[] args) {

        // Upcasting: Car object is stored in Vehicle reference
        Vehicle v = new Car();

        // Dynamic Method Dispatch:
        // Runtime calls Car's overridden show() method
        v.show();
    }
}

// Output:
// in Car show

// Explanation:
// - Car and Bike inherit from Vehicle.
// - Both classes override the show() method.
// - Vehicle v = new Car(); is upcasting.
// - v is a Vehicle reference, but the actual object is Car.
// - At runtime, Java sees the actual Car object and calls Car's show().
// - This runtime method selection is called Dynamic Method Dispatch.