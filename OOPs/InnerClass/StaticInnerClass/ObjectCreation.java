// Q2 — Object Creation
// Given:
//
// class Outer {
//     static class Inner {
//         void display() {
//             System.out.println("Static Inner");
//         }
//     }
// }
//
// In main():
// Create an object of the static Inner class using the correct syntax.
// Call the display() method.

class Outer {

    // Static Inner Class
    static class Inner {

        // Display message
        void display() {
            System.out.println("Static Inner");
        }
    }
}

public class ObjectCreation {

    public static void main(String[] args) {

        // Create Static Inner class object
        // No Outer class object is required
        Outer.Inner in1 = new Outer.Inner();

        // Call display() method
        in1.display();
    }
}

// Output:
// Static Inner