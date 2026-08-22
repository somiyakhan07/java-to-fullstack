// Final Class
// Create a final Vehicle class.
// Create a Car class that tries to extend Vehicle.
// Observe the compiler error.

final class Vehicle {

    private String vehicleType = "Petrol";
    private int seater = 4;

    // Method to display vehicle details
    public void vehicleDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Total Seats: " + seater);
    }
}

// A final class cannot be inherited
class Car extends Vehicle {

}

public class FinalClass {

    public static void main(String[] args) {

        // Creating Vehicle object is allowed
        Vehicle v1 = new Vehicle();

        // Calling Vehicle method
        v1.vehicleDetails();
    }
}

/*
Compiler Error:

cannot inherit from final class Vehicle

Reason:
A final class cannot be extended/inherited by another class.

If the Car class is removed/commented,
the output will be:

Vehicle Type: Petrol
Total Seats: 4
*/