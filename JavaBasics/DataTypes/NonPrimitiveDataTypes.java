// Demonstrates examples of non-primitive data types like String, Array, and Object.

class Student { // Create Class
    String name;
    int rollno;
}

public class NonPrimitiveDataTypes {
    public static void main(String args[]) {
        String name = "somiya"; // String

        int nums[] = { 10, 20, 30 }; // array

        Student s1 = new Student(); //create Student Object or referrence variable in s1
        s1.name = "Aditi";
        s1.rollno = 1;

        System.out.println(name); // print string value
        System.out.println();

        for (int n : nums) {  // Print all array elements
            System.out.println("Elements of nums: " + n);
        }
        System.out.println();

        System.out.println("name- " + s1.name + " : " + s1.rollno); // Print Student object details

    }

}
/*
 * somiya
 * 
 * Elements of nums: 10
 * Elements of nums: 20
 * Elements of nums: 30
 * 
 * name- Aditi : 1
 */