// Create an outer class Car.
// Add String brand = "BMW";
// Create a non-static inner class Engine.
// Add a start() method inside Engine.
// Access the outer class's brand inside start() and print it.

class Car {

    String brand = "BMW";

    // Non-static Inner Class
    class Engine {

        // Inner class can access outer class variable
        public void start() {
            System.out.println("Engine starting.... " + brand);
        }
    }
}

public class OuterInnerclass {

    public static void main(String[] args) {

        // Create Outer class object
        Car c1 = new Car();

        // Create Non-static Inner class object
        // Outer class object is required
        Car.Engine e1 = c1.new Engine();

        // Call start() method
        e1.start();
    }
}

// Output:
// Engine starting.... BMW