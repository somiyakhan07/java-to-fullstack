// Final Method
// Create a Parent class with a final display() method.
// Create a Child class that extends Parent.
// Try to override display().
// Observe the compiler error.

class University {

    private String universityName = "BAMU";

    // final method cannot be overridden by child class
    final public void display() {
        System.out.println("University Name: " + universityName);
    }
}

class College extends University {

    private String collegeName = "Sm Shetty College";

    // Cannot override final method from University
    public void display() {
        System.out.println("College Name: " + collegeName);
    }
}

public class FinalMethod {

    public static void main(String[] args) {

        University u1 = new University();
        u1.display();

        College c1 = new College();
        c1.display();
    }
}

/*
Output:

University Name: BAMU

Compiler Error:
display() in College cannot override display()
in University

Reason:
A final method cannot be overridden by a child class.
*/