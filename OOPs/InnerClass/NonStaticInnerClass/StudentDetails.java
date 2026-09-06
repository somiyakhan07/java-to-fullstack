// Q1 — Student Details
// Create an outer class College.
// Add String collegeName = "ABC College";
// Create a non-static inner class Student.
// Add a display() method inside Student.
// Access and print the outer class's collegeName inside display().
// Create the required object(s) in main() and print the output.

class College {

    String collegeName = "ABC College";

    // Non-static Inner Class
    class Student {

        public void display() {

            // Inner class can directly access outer class's instance variable
            System.out.println("college name: " + collegeName);
        }
    }
}

public class StudentDetails {

    public static void main(String[] args) {

        // Create object of Outer class
        College c1 = new College();

        // Create object of Non-static Inner class
        // Outer class object is required
        College.Student s1 = c1.new Student();

        // Call Inner class method
        s1.display();
    }
}

// Output:
// college name: ABC College