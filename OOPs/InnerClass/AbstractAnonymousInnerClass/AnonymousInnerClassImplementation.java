// Q3 — Shape
//
// Create an abstract class Shape.
// - Add an abstract draw() method.
//
// Use an Anonymous Inner Class to implement draw().
// - Print "Drawing Circle".
//
// Condition:
// Do not create a separate Circle class.

abstract class Shape {

    // Abstract method
    // It must be implemented by the child class
    abstract void draw();
}

public class AnonymousInnerClassImplementation {

    public static void main(String[] args) {

        // Create an Anonymous Inner Class object
        // that extends the abstract Shape class
        Shape s1 = new Shape() {

            // Implement the abstract draw() method
            @Override
            void draw() {
                System.out.println("Drawing Circle");
            }
        };

        // Call the implemented draw() method
        s1.draw();
    }
}

// Output:
// Drawing Circle

// Explanation:
// Shape is an abstract class, so we cannot create its direct object.
// The Anonymous Inner Class extends Shape and provides the implementation of the abstract draw() method.

// Shape s1 -> Shape reference
// new Shape() { ... } -> Anonymous Inner Class object

// Important:
// new Shape() does NOT create a direct object of the abstract Shape class.
// It creates an object of the Anonymous Inner Class that extends Shape.
// No separate Circle class is created.