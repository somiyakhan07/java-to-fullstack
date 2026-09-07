// Multiple Inner Objects
// Create an outer class School with:
// String schoolName = "ABC School"
// Non-static Inner class Student
// display() method school name print kare.

class School {

    String schoolName = "ABC School";

    // Non-static Inner Class
    class Student {

        void display() {
            System.out.println(schoolName);
        }
    }
}

public class MultipleInnerObjects {

    public static void main(String[] args) {

        // Create first School object
        School s1 = new School();

        // Create first Student object using s1
        School.Student ss1 = s1.new Student();
        ss1.display();

        // Create second Student object using the same School object
        School.Student ss2 = s1.new Student();
        ss2.display();

        // Create another School object
        School s3 = new School();

        // Create Student object using the second School object
        School.Student ss3 = s3.new Student();
        ss3.display();
    }
}


// Output:
// ABC School
// ABC School
// ABC School

// Explanation:
// A non-static Inner Class object is always associated with
// an object of the Outer Class.

// One Outer object can create multiple Inner Class objects:

// School.Student ss1 = s1.new Student();
// School.Student ss2 = s1.new Student();

// Here, ss1 and ss2 are two different Student objects,
// but both are associated with the same School object 's1'.

// We can also create another School object and create
// another Student object from it.

// Important:
// Non-static Inner Class -> Outer class object is required.
// One Outer object -> Multiple Inner objects can be created.