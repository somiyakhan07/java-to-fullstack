// Use Array of Objects and Enhanced For Loop
// Print Student Details
class Student{
    String name;
    int rollno;
    int marks;
}
public class PrintStudentDetails {
    public static void main(String args[]){

        Student s1 = new Student();
        s1.name = "cutie";
        s1.rollno = 1;
        s1.marks = 78;

        Student s2 = new Student();
        s2.name = "Aditi";
        s2.rollno = 2;
        s2.marks = 86;

        Student students[] = new Student[2];
        students[0] = s1;
        students[1] = s2;

        for(Student s : students){
            System.out.println(s.name + " : " + s.rollno + " = " + s.marks);
        }
        
    }
    
}
// cutie : 1 = 78
// Aditi : 2 = 86