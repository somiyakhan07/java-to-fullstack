// All in same package

// Private Access Modifier
// Default Access Modifier
// Public Access Modifier
// Protected Modifier

// Create a `Student` class with a **private** `name` variable. 
// 1. Create an object in the `main` method and try to access `name` directly. Observe what happens.
// 2. Create a `Student` class with a **default** `age` variable. Create another class in the **same package** and access the `age` variable.
// 3. Create a `Student` class with a **public** `classRoom` variable. Create another class and access the `classRoom` variable using an object.
// 4. Create a `Student` class with a **protected** `marks` variable. Create a `ExamSheet` class that extends `Student` and access `marks` from the child class.

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println(s1.studentName); // Private cannot access even in same
        // package (Access Modifier)
        System.out.println("Student Age: " + s1.studentAge); // Default is accessible because it is in same package (Access Modifier)
                                                             
        System.out.println("Student Class Room: " + s1.classRoom); // public is accessable from everywhere (Access Modifier)

        ExamSheet e1 = new ExamSheet();
        System.out.println("Student Marks: " + e1.marks); // protected is accessible because it is in same packages (Access Modifier)
                                                        
        System.out.println("Student Age: " + e1.studentAge);
    }

}
/*
 * Test.java:4: error: studentName has private access in Student
 * System.out.println(s1.studentName);
 * ^
 */

// Student Age: 22
// Student Class Room: 5th B
// Student Marks: 99
// Student Age: 22