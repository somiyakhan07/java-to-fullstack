// Q1 — Two Inner Classes
// Create an outer class.
// Add one non-static inner class with a showInner() method.
// Add one static inner class with a showStaticInner() method.
// Print different messages from both methods.
// In main(), create both inner class objects correctly.
// Call both methods.

class Outer {

    // Non-static Inner Class
    class Inner {

        public void showInner() {
            System.out.println("in Inner Show");
        }
    }

    // Static Inner Class
    static class StaticInner {

        public void showStaticInner() {
            System.out.println("in Static Inner Show");
        }
    }
}

public class TwoInnerClass {

    public static void main(String[] args) {

        // Create Outer class object
        Outer o1 = new Outer();

        // Create Non-static Inner class object
        // Outer class object is required
        Outer.Inner i1 = o1.new Inner();

        // Call Non-static Inner method
        i1.showInner();

        // Create Static Inner class object
        // Outer class object is NOT required
        Outer.StaticInner si1 = new Outer.StaticInner();

        // Call Static Inner method
        si1.showStaticInner();
    }
}

// Output:
// in Inner Show
// in Static Inner Show