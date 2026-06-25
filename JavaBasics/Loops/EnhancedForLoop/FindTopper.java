// Use Array of Objects and Enhanced For Loop
// Find Topper Student

class Student {
    String name;
    int rollno;
    int marks;
}

public class FindTopper {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "cutie";
        s1.rollno = 1;
        s1.marks = 78;

        Student s2 = new Student();
        s2.name = "Aditi";
        s2.rollno = 2;
        s2.marks = 86;

        Student s3 = new Student();
        s3.name = "Mahesg";
        s3.rollno = 3;
        s3.marks = 97;

        Student s4 = new Student();
        s4.name = "Pari";
        s4.rollno = 4;
        s4.marks = 99;

        Student students[] = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        Student topper = students[0];
        for (Student s : students) {
            if (s.marks > topper.marks) {
                topper = s;
            }

        }
        System.out.println("Topper Student is " + topper.name + " : Roll no - " + topper.rollno + " , Marks Obtained = "
                + topper.marks);

    }
}

// Topper Student is Pari : Roll no - 4 , Marks Obtained = 99