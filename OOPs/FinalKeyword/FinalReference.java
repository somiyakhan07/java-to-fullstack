// Final Reference Variable
// Create a Student object using a final reference.
// Change one of the object's normal variables.
// Then try to make the reference point to a new Student object.
// Observe what is allowed and what isn't.

class Student {

    private String name; // Private instance variable

    // Default constructor
    Student() {
        name = "name";
    }

    // Getter method to access the private variable
    public String getName() {
        return name;
    }

    // Setter method to change the private variable
    public void setName(String name) {
        this.name = name;
    }
}

public class FinalReference {

    public static void main(String[] args) {

        // final reference cannot point to another object
        final Student s1 = new Student();

        // Object's data can still be changed
        s1.setName("Sonam");
        System.out.println("Student Name: " + s1.getName());

        // Object's data can be changed again
        s1.setName("Aliya");
        System.out.println("Student Name: " + s1.getName());

        // Cannot make final reference point to a new object
        s1 = new Student();
    }
}

/*
Output:

Student Name: Sonam
Student Name: Aliya

Error:
cannot assign a value to final variable s1
*/