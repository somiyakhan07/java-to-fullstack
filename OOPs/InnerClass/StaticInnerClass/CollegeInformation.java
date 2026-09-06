// Q1 — College Information
// Create an outer class College.
// Add static String name = "ABC College";
// Create a static inner class Student.
// Add a display() method inside Student.
// Print College.name inside display().
// Condition: Do not create an object of the College class.

class College {

    static String name = "ABC College";

    // Static Inner Class
    static class Student {

        // Display the static variable of Outer class
        public void display() {
            System.out.println("College Name: " + name);
        }
    }
}

public class CollegeInformation {

    public static void main(String[] args) {

        // Create Static Inner class object
        // No College object is required
        College.Student s1 = new College.Student();

        // Call display() method
        s1.display();
    }
}

// Output:
// College Name: ABC College