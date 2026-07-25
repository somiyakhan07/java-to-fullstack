// student name - private marks, allow setter only 0 - 100
class Student { // Student class
    private String name; // private variables
    private int marks;

    public Student() { // default construtor and initialized value
        name = "anonymous";
        marks = 0;
    }

    public Student(String name, int marks) { // Parameterized constructor with marks validation
        this.name = name;
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
            this.marks = 0;
        }
    }

    public String getName() { // fetch student name
        return name;
    }

    public void setName(String name) { // set student name in private name variable
        this.name = name;
    }

    public int getMarks() { // fetch student marks
        return marks;
    }

    public void setMarks(int marks) { // set student marks in private marks variable and added marks conditioning
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
            this.marks = 0;
        }

    }
}

public class StudentResult { // Main class
    public static void main(String[] args) { // main method
        Student s1 = new Student(); // create student object s1
        s1.setName("Hina"); // set student name hardcoded
        s1.setMarks(98); // set student marks hardcoded

        System.out.println("Name: " + s1.getName()); // display student name
        System.out.println("Marks: " + s1.getMarks()); // display student marks
    }

}
/*
output:
Name: Hina
Marks: 98
 */