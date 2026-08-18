// User-Defined Package

// Create a user-defined package named mypackage. 
// Create a Student class inside the package with a display() method. 
// Import the Student class into another Java program, create its object, and call the display() method.

package myPackages;

public class Student {
    private String name;
    private int rollNo;
    private String classNo;
    private String division;

    public Student(String name, int rollNo, String classNo, String division) {
        this.name = name;
        this.rollNo = rollNo;
        this.classNo = classNo;
        this.division = division;
    }

    public void studentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll no: " + rollNo);
        System.out.println("Student Class no: " + classNo);
        System.out.println("Student Division: " + division);
    }
}