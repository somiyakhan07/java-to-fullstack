// Q1 — Student Management System
// ============================================================
//
// Create a program to manage multiple students.
//
// Use:
// - Class & Object
// - Constructor
// - Encapsulation
// - Getter/Setter
// - Array of Objects
// - Methods
//
// Features:
// - Add student
// - Display student details
// - Search student by roll number

class Student {
    private String studentName;
    private int rollNo;

    public Student(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void studentDetails() {
        System.out.println(studentName);
        System.out.println(rollNo);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        // Array of Objects: creates space for 3 Student object references
        Student[] students = new Student[3];

        students[0] = new Student("Abhay", 1);
        students[1] = new Student("Mahi", 2);
        students[2] = new Student("Aliya", 3);

        // Roll number to search
        int searchRollNo = 1;

        // Keeps track of whether the student was found
        boolean foundStudent = false;

        // Check all Student objects and find the student using roll number
        for (Student student : students) {

            if (student.getRollNo() == searchRollNo) {
                System.out.println(student.getStudentName());
                System.out.println(student.getRollNo());

                foundStudent = true;
                break;
            }
        }

        // Check after the complete array has been searched
        if (!foundStudent) {
            System.out.println("Not Found");
        }
    }
}
// Output:
// Abhay
// 1

// Explanation:
// Student[] students = new Student[3] creates an array that
// can store references to 3 Student objects.

// Each new Student(...) creates a separate Student object.
// The for-each loop checks each Student object one by one.
// getRollNo() is used because rollNo is private.
// This follows Encapsulation.

// foundStudent is initially false.
// When the required roll number is found, it becomes true.
// break stops the loop because the required student is found.

// "Not Found" is checked AFTER the loop because we need to
// search the complete array before deciding that the student does not exist.