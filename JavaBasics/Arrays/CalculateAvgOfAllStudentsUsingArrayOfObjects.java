class Student {
    String name;
    int rollno;
    int marks;
}

public class CalculateAvgOfAllStudentsUsingArrayOfObjects {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "rakesh";
        s1.rollno = 1;
        s1.marks = 96;

        Student s2 = new Student();
        s2.name = "virat";
        s2.rollno = 2;
        s2.marks = 89;

        Student s3 = new Student();
        s3.name = "don";
        s3.rollno = 3;
        s3.marks = 97;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        int sum = 0;
        int totalStudent = 0;
        for (int i = 0; i < student.length; i++) {
            sum += student[i].marks;
            totalStudent++;
        }

        System.out.println(" Average of all Students is: " + sum / totalStudent);
    }

}
