 // Q1 — Vehicle
 //
 // Create a Vehicle class.
 // - Add a start() method.
 // - Print a normal vehicle start message inside it.
 //
 // In main():
 // - Use an Anonymous Inner Class.
 // - Override the start() method.
 // - Print "Car starts with key".
 //
 // Condition:
 // Do not create a separate Car class.

class Vehicle {

    // Normal method of Vehicle
    void start() {
        System.out.println("Vehicle Starting");
    }
}

public class VehicleAnonymousInnerClass {

    public static void main(String[] args) {

        // Create an Anonymous Inner Class object
        // based on the Vehicle class
        Vehicle v1 = new Vehicle() {

            // Override the start() method
            // and provide new behavior
            @Override
            void start() {
                System.out.println("Car starts with key");
            }
        };

        // Calls the overridden start() method
        v1.start();
    }
}

// Output:
// Car starts with key

// Explanation:
// Anonymous Inner Class is used when we need a one-time
// implementation or modification of a class.

// Here, we did not create a separate Car class.
// Instead, we created an Anonymous Inner Class from Vehicle
// and overrode the start() method.

// Vehicle v1 -> Vehicle reference
// new Vehicle() { ... } -> Anonymous Inner Class object

// Important:
// The object created by new Vehicle() { ... } belongs to
// the Anonymous Inner Class, not directly to the Vehicle class.
// Since start() is overridden, v1.start() calls the overridden method.