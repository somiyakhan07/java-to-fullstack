// Q.3 Static Data Access
//
// Create:
//
// class Company {
//     static String companyName = "Google";
//
//     static class Employee {
//         void display() {
//             // Print companyName
//         }
//     }
// }
//
// In main():
// - Create an Employee object without creating a Company object.
// - Print the company name.
//
// Goal:
// Understand that a Static Inner Class does not require
// an object of the Outer Class.

class Company {

    static String companyName = "Google";

    // Static Inner Class
    static class Employee {

        void display() {
            // Static Inner Class can directly access
            // static members of the Outer Class
            System.out.println(companyName);
        }
    }
}

public class StaticDataAccess {

    public static void main(String[] args) {

        // Create Static Inner Class object
        // No Company object is required
        Company.Employee e1 = new Company.Employee();

        // Call display() method
        e1.display();
    }
}

// Output:
// Google

// Explanation:
// A Static Inner Class does NOT require an object
// of the Outer Class.

// Company.Employee e1 = new Company.Employee();
// We directly create the Employee object using the
// OuterClass.InnerClass syntax.

// companyName is static, so the Static Inner Class
// can access it directly.

// Important:
// Static Inner Class -> No Outer Class object required.
// Static Inner Class can directly access static members of the Outer Class.

// Note:
// "Non-static variable cannot be referenced from a static context"
// is a common Java error when we try to access a non-static member from a static context.