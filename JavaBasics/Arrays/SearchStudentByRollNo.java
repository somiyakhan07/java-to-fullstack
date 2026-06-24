class Student {
    String name;
    int rollno;
    int marks;
}

public class SearchStudentByRollNo {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Aditi";
        s1.rollno = 1;

        Student s2 = new Student();
        s2.name = "Alina";
        s2.rollno = 2;

        Student s3 = new Student();
        s3.name = "Cutie";
        s3.rollno = 3;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        int RollNo = 2;
        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].rollno == RollNo) {
                System.out.println("Name Of Student: " + students[i].name +
                        " , Roll no- " + students[i].rollno);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
    }
}
