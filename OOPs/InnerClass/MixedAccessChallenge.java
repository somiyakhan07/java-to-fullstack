\// Q4 — Mixed Access Challenge
//
// Create a University class.
// - Add a non-static name variable with value "BAMU".
// - Add a static location variable with value "Aurangabad".
// - Create a non-static Inner Class named Student.
// - Create a static Inner Class named Course.
//
// Task:
// - From Student, access name and location.
// - From Course, access location.
// - Try to directly access name from Course.
// - Observe what can and cannot be accessed.
//
// Goal:
// Understand which members can be accessed by different
// types of Inner Classes and why.

class University {

    // Non-static variable
    String name = "BAMU";

    // Static variable
    static String location = "Aurangabad";

    // Non-static Inner Class
    class Student {

        void display() {

            // Non-static Inner Class can access
            // non-static members of Outer Class
            System.out.println(name);

            // It can also access static members
            // of the Outer Class
            System.out.println(location);
        }
    }

    // Static Inner Class
    static class Course {

        void display() {

            // Static Inner Class can access
            // static members of Outer Class
            System.out.println(location);

            // Cannot directly access non-static name
            // because no University object is available here
            // System.out.println(name); // Error
        }
    }
}

public class MixedAccessChallenge {

    public static void main(String[] args) {

        // Create University object
        University u1 = new University();

        // Create Non-static Inner Class object
        // Outer Class object is required
        University.Student s1 = u1.new Student();

        // Call Student display()
        s1.display();

        // Create Static Inner Class object
        // University object is NOT required
        University.Course c1 = new University.Course();

        // Call Course display()
        c1.display();
    }
}

// Output:
// BAMU
// Aurangabad
// Aurangabad

// Explanation:
// Non-static Inner Class -> can access both non-static and static
// members of the Outer Class.
//
// Static Inner Class -> can directly access only static members
// of the Outer Class.
//
// name is non-static, so Course cannot directly access it.
// location is static, so Course can access it.
//
// Important:
// Non-static member belongs to an object.
// Static member belongs to the class.
//
// That is why Student can access name,
// but Static Inner Class Course cannot directly access name.
//
// Error if name is accessed from Course:
// "non-static variable name cannot be referenced from a static context"