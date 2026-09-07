// Q2 — Static Inner + Non-Static Variable
//
// Create an Outer class.
// - Add a non-static variable x with value 10.
// - Add a static variable y with value 20.
// - Create a Static Inner Class named Inner.
// - Inside the display() method, try to access both x and y.
//
// Task:
// - Access y.
// - Try to directly access x.
// - Observe the error.

class Outer {

    int x = 10;
    static int y = 20;

    static class Inner {

        void display() {

            // x cannot be directly accessed because
            // x is a non-static variable.
            // System.out.println(x); // Error

            // y is static, so Static Inner Class can access it directly.
            System.out.println(y);
        }
    }
}

public class StaticInnerAndStaticVariable {

    public static void main(String[] args) {

        // Static Inner Class does not require
        // an Outer Class object.
        Outer.Inner i1 = new Outer.Inner();

        i1.display();
    }
}

// Output:
// 20

// Explanation:
// A Static Inner Class can directly access static members of the Outer Class.

// y is static -> accessible directly.
// x is non-static -> cannot be directly accessed.

// Important:
// "non-static variable x cannot be referenced from a static context"
// means x belongs to an object, but the Static Inner Class does not have an
// Outer Class object.

// Static Inner Class -> no Outer object required.
// Non-static variable -> belongs to an Outer object.