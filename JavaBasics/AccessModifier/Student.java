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

public class Student {
    private String studentName = "Hena"; // Private variable
    int studentAge = 22; // Default variable
    public String classRoom = "5th B"; // Public variable
    protected int marks = 99; // Protected variable
}
