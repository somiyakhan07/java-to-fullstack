// Create two students with the same data.
// Check equals().
// Check their hashCode().
// Override toString() and print both objects.

class Student {
    String name;
    int age;

    // Override toString() to return readable object details
    @Override
    public String toString() {
        return "Student{name='" + name + "' , age=" + age + "}";
    }

    // Override hashCode() using name and age
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    // Override equals() to compare Student objects by their data
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;

        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;

        if (age != other.age)
            return false;

        return true;
    }
}

public class CombinedObjectClassMethod {
    public static void main(String[] args) {

        // Create first Student object
        Student s1 = new Student();
        s1.name = "Joy";
        s1.age = 44;

        // Create second Student object with same data
        Student s2 = new Student();
        s2.name = "Joy";
        s2.age = 44;

        // Compare both objects using equals()
        System.out.println(s1.equals(s2));

        // Print hashCode of both objects
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // Print objects - toString() is called automatically
        System.out.println(s1);
        System.out.println(s2);
    }
}

/*
Output:

true
2315961
2315961
Student{name='Joy' , age=44}
Student{name='Joy' , age=44}
 */