// Student Details
// Create overloaded displayDetails() methods:
// Name
// Name + Age
// Name + Age + Course

class Student {
    public void displayDetails(String name) {
        System.out.println("Name: " + name);
    }

    public void displayDetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void displayDetails(String name, int age, String course) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course Name: " + course);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayDetails("Mahek");

        System.out.println();
        s1.displayDetails("Aliya", 21);

        System.out.println();
        s1.displayDetails("Mohan", 24, "BCS");
    }

}
/*output: 
Name: Mahek

Name: Aliya
Age: 21

Name: Mohan
Age: 24
Course Name: BCS
 */