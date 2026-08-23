//  toString()
// Create a Student class with name and age.
// Print the object directly:
// System.out.println(s1);
// First observe the default output like:
// Student@1b6d3586
// Then override toString() so the output becomes something readable, such as:
// Student{name='Ali', age=20}

class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class ToString {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rohan";
        s1.age = 21;

        System.out.println(s1);
    }

}
// Before toString method creation - Student@7344699f
// After toString method creation - Student{name='Rohan', age=21}