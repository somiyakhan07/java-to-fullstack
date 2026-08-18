// User-Defined Package

// Create a user-defined package named mypackage. 
// Create a Student class inside the package with a display() method. 
// Import the Student class into another Java program, create its object, and call the display() method.

import myPackages.Student;

public class UserDefinedPackages {

    public static void main(String[] args) {

        Student s1 = new Student(
                "Neha",
                2,
                "5th class",
                "A"
        );

        s1.studentDetails();
    }
}

/*output:
Student Name: Neha Student 
Roll no: 2 Student 
Class no: 5th class 
Student Division: A
 */