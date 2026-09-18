// Q2 — @Override Error
// ============================================================
//
// Create a parent class Vehicle and a child class Car.
// Use @Override incorrectly and observe the compiler error.
//
// Goal:
// Understand how @Override detects mistakes.

class Vehicle {
    public void start() {
        System.out.println("Vehicle Starting....");
    }
}

class Car extends Vehicle {
    @Override
    // method does not override or implement a method from a supertype @Override
    public void starts() { // here method name is starts() not start() hence the error
        System.out.println("Car starting....");
    }
}

public class OverrideError {
    public static void main(String[] args) {
        // Car reference type with car object
        Car c1 = new Car();
        c1.start(); // it will call parent start() method and print Vehicle Starting.... and not the
                    // car override starts() method
    }

}

/*
 * Output:
 * Vehicle Starting....
 * 
 * Explanation:
 *
 * Initially, we wrote:
 *
 * @Override
 * public void starts()
 *
 * This gives a compiler error because the parent class
 * has start(), not starts().
 *
 * @Override tells the compiler:
 * "This method must override a parent method."
 *
 * Since starts() does not match start(), the compiler
 * detects the mistake.
 */