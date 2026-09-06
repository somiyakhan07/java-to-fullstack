// Q2 — Member Access Challenge
// Create an outer class:
//
// class Outer {
//     int x = 10;
//     static int y = 20;
// }
//
// Create a non-static inner class.
// Access both x and y from the non-static inner class.
// Create a static inner class.
// Access y from the static inner class.
// Check whether the static inner class can directly access x.
// Goal: Understand the relationship between static/non-static
// inner classes and the outer class object.

class Outer {

    int x = 10;
    static int y = 20;

    // Non-static Inner Class
    class Inner {

        public void display() {

            // Non-static Inner can access x
            System.out.println("x value in inner: " + x);

            // Non-static Inner can also access static y
            System.out.println("y value in inner: " + y);
        }
    }

    // Static Inner Class
    static class StaticInner {

        public void display() {

            // Static Inner Class cannot directly access non-static x
            // System.out.println("x value in static inner: " + x);

            // Static Inner can access static y
            System.out.println("y value in static inner: " + y);
        }
    }
}

public class MemberAccessChallenge {

    public static void main(String[] args) {

        // Create Outer class object
        Outer o1 = new Outer();

        // Create Non-static Inner object
        Outer.Inner oi1 = o1.new Inner();

        // Call display()
        oi1.display();

        System.out.println();

        // Create Static Inner object
        // No Outer object is required
        Outer.StaticInner soi1 = new Outer.StaticInner();

        // Call display()
        soi1.display();
    }
}

// Output:
// x value in inner: 10
// y value in inner: 20
// non-static variable x cannot be referenced from a static context or class methods
// y value in static inner: 20