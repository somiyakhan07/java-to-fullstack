// Design a Fuel Tank system.
// The tank should allow fuel to be added, but it should never hold more fuel than its maximum capacity. 
// Invalid fuel amounts should not be accepted.

class Fuel { // create fuel class
    private double fuel;

    private boolean isValidFuel(double fuel) {
        return fuel > 0 && fuel <= 100;
    }

    public Fuel(double fuel) { // paremeterized constructor with fuel capacity validation
        if (isValidFuel(fuel)) {
            this.fuel = fuel;
        } else {
            System.out.println("Invalid fuel litre");
        }
    }

    public double getFuel() { // fetch fuel value
        return fuel;
    }

    public void addFuel(int addedFuel) { // method to addfuel in fuel tank system
        if (addedFuel > 0 && fuel + addedFuel <= 100) {
            fuel = fuel + addedFuel;
        } else {
            System.out.println("Invalid fuel litre");
        }

    }

}

public class FuelTankSystem { // main class
    public static void main(String[] args) { // main method
        Fuel f1 = new Fuel(101); // create fuel class object f1 and add fuel
        System.out.println("Fuel f1: " + f1.getFuel()); // display fuel of f1
        System.out.println();

        Fuel f2 = new Fuel(80); // create fuel class object f2 and add fuel
        System.out.println("Fuel f2: " + f2.getFuel()); // display fuel of f2

        f2.addFuel(10); // add fuel in f2
        System.out.println("Fuel f2: " + f2.getFuel()); // display fuel of f2
        System.out.println();

        Fuel f3 = new Fuel(70); // create fuel class object f3 and add fuel
        System.out.println("Fuel f3: " + f3.getFuel()); // display fuel of f3

        f3.addFuel(40); // add fuel in f3
        System.out.println("Fuel f3: " + f3.getFuel()); // display fuel of f3

    }

}
/*
Invalid fuel litre
Fuel f1: 0.0

Fuel f2: 80.0
Fuel f2: 90.0

Fuel f3: 70.0
Invalid fuel litre
Fuel f3: 70.0
 */