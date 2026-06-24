// Array of Objects
// Create Student objects, store them in an array,
// and Find Student with Highest Marks

class Student {
    String name;
    int rollno;
    int marks;

}

public class FindStudentWithHighestMarks{
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Somiya";
        s1.rollno = 1;
        s1.marks = 98;

        Student s2 = new Student();
        s2.name = "Ali";
        s2.rollno = 2;
        s2.marks = 89;

        Student s3 = new Student();
        s3.name = "harsh";
        s3.rollno = 3;
        s3.marks = 97;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        Student topper = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
        }

        System.out.println("Topper: " + topper.name);
        System.out.println("Roll No: " + topper.rollno);
        System.out.println("Marks: " + topper.marks);

    }
}