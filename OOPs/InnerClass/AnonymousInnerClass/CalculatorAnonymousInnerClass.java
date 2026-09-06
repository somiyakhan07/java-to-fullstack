// Q2 — Calculator
// Create a Calculator class.
// Add a void calculate() method.
// Use an Anonymous Inner Class to override calculate().
// Print: 10 + 20 = 30

class Calculator {

    void calculate() {
        System.out.println("Calculator");
    }
}

public class CalculatorAnonymousInnerClass {

    public static void main(String[] args) {

        // Anonymous Inner Class
        Calculator c1 = new Calculator() {

            // Override calculate()
            void calculate() {
                System.out.println("10 + 20 = " + (10 + 20));
            }
        };

        // Call overridden method
        c1.calculate();
    }
}

// Output:
// 10 + 20 = 30

// c1 is an object of the Anonymous Inner Class. 
// When c1.calculate() runs, the overridden method runs instead of the original Calculator method.