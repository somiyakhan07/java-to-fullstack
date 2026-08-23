// hashCode()
// Create two Student objects.
// Call:
// System.out.println(s1.hashCode());
// System.out.println(s2.hashCode());
// Observe the hash values.
// Understand that hashCode() returns an integer hash value.

class Student {
    String name;
    int age;
}

public class HashCode {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Harsh";
        s1.age = 25;
        System.out.println(s1.hashCode());

        Student s2 = new Student();
        s2.name = "Uman";
        s2.age = 32;
        System.out.println(s2.hashCode());

    }

}
// Output:
// 1933863327
// 112810359