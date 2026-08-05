// this() Constructor Call
// The this() keyword is used to call another constructor of the same class.
// It must always be the first statement inside a constructor.

class Student { // create Student class

    Student() { // default constructor
        System.out.println("Default Constructor");
    }

    Student(int age) { // parameterized constructor
        this(); // calls the current class default constructor
        System.out.println("Age: " + age);
    }
}

public class ThisConstructorCall { // main class

    public static void main(String[] args) { // main method
        Student a1 = new Student(20); // create object and call parameterized constructor
    }

}

/*output:
Default Constructor
Age: 20
 */