// Create a Student class with name and age.
// Create two objects with the same values.
// Use equals() and observe the result.
// Then understand why overriding equals() is needed to compare object data.

class Student {
    String name;
    int age;
}

public class Equals {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Gohan";
        s1.age = 22;

        Student s2 = new Student();
        s2.name = "Gohan";
        s2.age = 22;

        System.out.println(s1.equals(s2));


    }
}

// false