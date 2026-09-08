// Q3 — Same Variable Names
//
// Create an Outer class with a variable x having value 10.
// - Create a non-static Inner Class inside it.
// - Add another variable x with value 20 inside the Inner Class.
// - Add a display() method.
//
// Inside display():
// - Print the x of the Inner Class.
// - Print the x of the Outer Class.
//
// Hint:
// Think about using this and Outer.this.

class Outer {

    int x = 10;

    // Non-static Inner Class
    class Inner {

        int x = 20;

        void display() {

            // this.x refers to the x of the Inner Class
            System.out.println(this.x);

            // Outer.this.x refers to the x of the Outer Class
            System.out.println(Outer.this.x);
        }
    }
}

public class SameVariableNames {

    public static void main(String[] args) {

        // Create Outer Class object
        Outer o1 = new Outer();

        // Create Non-static Inner Class object
        // using the Outer Class object
        Outer.Inner i1 = o1.new Inner();

        // Call display() method
        i1.display();
    }
}

// Output:
// 20
// 10

// Explanation:
// Both Outer and Inner classes have a variable named x.
//
// this.x → refers to the current Inner Class object's x.
// Outer.this.x → refers to the Outer Class object's x.
//
// So:
// this.x = 20
// Outer.this.x = 10
//
// Important:
// 'this' refers to the current Inner Class object.
// 'Outer.this' refers to the enclosing Outer Class object.