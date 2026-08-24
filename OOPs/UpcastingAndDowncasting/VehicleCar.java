// Create:
// Vehicle → start()
// Car → drive(), playMusic()
// In main():
// Create Car object
// Store it in Vehicle reference
// Call start()
// Downcast Vehicle reference to Car
// Call drive()
// Call playMusic()
// Condition: Object sirf ek baar create karna hai.

class Vehicle {
    public void start() {
        System.out.println("Starting....");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car Drives");
    }

    public void playMusic() {
        System.out.println("Play Music...");
    }
}

public class VehicleCar {
    public static void main(String[] args) {
        // Upcasting: Car reference is assigned to Vehicle reference
        Car c1 = new Car();
        Vehicle v1 = c1;
        v1.start();

        // Downcasting: Vehicle reference is converted back to Car reference
        Car c2 = (Car) v1;
        c2.drive();
        c2.playMusic();

    }

}

/* output:
Starting....
Car Drives
Play Music...
 */